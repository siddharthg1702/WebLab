import requests
from bs4 import BeautifulSoup

try:
    out = open('output6.txt', 'w')
    page = requests.get('https://www.nytimes.com/')
    soup = BeautifulSoup(page.text, 'html.parser')

    headlineItems = soup.find_all('title')
    for item in headlineItems:
        print(item.string)
        out.write(item.string+'\n')

    print()
    out.write('\n')

    headlineItems = soup.find_all('article')
    for item in headlineItems:
        print(item.h2.string)
        out.write(item.h2.string + '\n')

except ValueError:
    print('Value Error')
except IOError:
    print('IOError')