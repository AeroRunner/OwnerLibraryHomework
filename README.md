## Команды для запуска тестов 
* <code>gradle clean homeTest</code> - запуск теста на главной страницы GitHub
* <code>gradle clean loginTest</code> - запуск теста страницы входа Github
* <code>gradle clean blogTest</code> - запуск теста страницы блога GitHub
* <code>gradle clean homeTest loginTest blogTest</code> - запуск всех 3х тестов(так же можно запустить любые 2 вместе)
* <code>gradle clean $команда для теста страницы(страниц)$ -Dhost=local</code> - запуск тестов локально
* <code>gradle clean $команда для теста страницы(страниц)$ -Dhost=remote </code> - запуск тестов удаленно в Selenide

## Пример команды запуска всех тестов удаленно
<code>gradle clean homeTest loginTest blogTest -Dhost=remote</code>
## Пример команды запуска теста  локально
<code>gradle clean blogTest -Dhost=local</code>