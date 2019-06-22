# Tasks

## Please complete the following test scenarios using Java and any frameworks.
1. Open https://www.rbc.ru , search news by “РОС";
2. Check if you get search result page with news on it.
3. Open https://www.rbc.ru , search news by “йййй";
4. Check if proper appears on a search result page

Use page object pattern (Home and Search Result Pages).

This test for Google Chrome 75.0

## Run tests

Clone repository
`git clone git@github.com:x1ff/rbc.git`

Download [chromedriver](https://chromedriver.storage.googleapis.com/index.html) for your Google Chrome to root dirextory of repository

Compile the tests
`mvn compile`

Run tests
`mvn test`
