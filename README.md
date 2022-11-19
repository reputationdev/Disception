# Disception
Bad uncaught exception webhook thingy (dont reccomend using)
<br>
![image](https://user-images.githubusercontent.com/89894310/202869463-89a59d4a-cb4e-4b14-9302-6ba365353271.png)
<br>
## HOW 2 USE
Just add this to the start of your app
```java
Disception.start("<webhook url>");
```

For try/catch thingys do this:
```java
 try {
    ArrayList<String> list = new ArrayList<>();
    list.get(-1);
 } catch (Exception e) {
    Disception.exception(e);
}
```
