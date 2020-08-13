# Домашнее задание к занятию «Объектно-ориентированное программирование и проектирование»

## Задача №1 - "Кондиционер: теплее и холоднее"

### Легенда

В проект умного дома решили добавить возможность увеличивать температуру на один градус и уменьшать.

Создайте на базе проекта с лекции собственный проект, в котором:
1. Подключите плагин Surefire так, чтобы сборка падала в случае отсутсвия тестов
1. Подключите плагин JaCoCo в режиме генерации отчётов (обрушать сборку по покрытию не нужно)
1. Удалите `Conditioner` и тесты к нему
1. Переименуйте `ConditionerAdvanced` в `Conditioner` (Shift + F6 на имени класса)
1. Реализуйте методы `public void increaseCurrentTemperature()` и `public void decreaseCurrentTemperature()`
1. Напишите автотесты на методы из предыдущего пункта, добившись 100% покрытия по branch'ам
1. Подключите CI на базе Github Actions и выложите всё на Github

Как должны работать методы:
* `increaseCurrentTemperature` - увеличивает температуру на 1 до тех пор, пока не достигнута максимальная (`maxTemperature`), последующие (после достижения `maxTemperature`) вызовы метода не должны ничего менять в состоянии объекта
* `decreaseCurrentTemperature` - уменьшает температуру на 1 до тех пор, пока не достигнута минимальная (`minTemperature`), последующие (после достижения `minTemperature`) вызовы метода не должны ничего менять в состоянии объекта

Важно: используйте Early Exit.

**Важно**: один вызов метода должен приводить к переключению на один градус (если не достигнут min/max)!