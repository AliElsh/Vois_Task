import pandas as pd

df = pd.read_csv('path/to/yourfile.csv')

df.drop_duplicates(inplace=True)

df['Age'] = df['Age'].astype(int)

conversion_rate = 31
df['Salary_EGP'] = df['Salary_USD'] * conversion_rate

print("Average Age: ", df['Age'].mean())
print("Median Salary (EGP): ", df['Salary_EGP'].median())
print("Ratio M/F: ", df['Gender'].value_counts(normalize=True))

df.to_csv('path/to/newfile.csv', index=False)
