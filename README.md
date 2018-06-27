# TestHomework00
## Trying to test the homework 00

I have added some printing in methods trying to understand if there is acctually a single passthrou a collection of meals a double one.  

```
getDateTime(): 2015-05-30T10:00
getDate(): 2015-05-30
getDateTime(): 2015-05-30T10:00
getDateTime(): 2015-05-30T13:00
getDate(): 2015-05-30
getDateTime(): 2015-05-30T13:00
getDateTime(): 2015-05-30T20:00
getDate(): 2015-05-30
getDateTime(): 2015-05-30T20:00
getDateTime(): 2015-05-31T10:00
getDate(): 2015-05-31
getDateTime(): 2015-05-31T10:00
getDateTime(): 2015-05-31T13:00
getDate(): 2015-05-31
getDateTime(): 2015-05-31T13:00
getDateTime(): 2015-05-31T20:00
getDate(): 2015-05-31
getDateTime(): 2015-05-31T20:00
getCalories(): 500
getCalories(): 1000
getCalories(): 500
getDateTime(): 2015-05-30T10:00
Create UserMealWithExceeInstance : UserMeal{dateTime=2015-05-30T10:00, description='Завтрак', calories=500}Exceeded = false
getDateTime(): 2015-05-30T10:00
getCalories(): 500
getDateTime(): 2015-05-30T13:00
getDateTime(): 2015-05-30T20:00
getCalories(): 1000
getCalories(): 500
getCalories(): 510
getDateTime(): 2015-05-31T10:00
Create UserMealWithExceeInstance : UserMeal{dateTime=2015-05-31T10:00, description='Завтрак', calories=1000}Exceeded = true
getDateTime(): 2015-05-31T10:00
getCalories(): 1000
getDateTime(): 2015-05-31T13:00
getDateTime(): 2015-05-31T20:00
[UserMealWithExceed{dateTime=2015-05-30T10:00, description='Завтрак', calories=500, exceed=false}, UserMealWithExceed{dateTime=2015-05-31T10:00, description='Завтрак', calories=1000, exceed=true}]
```

