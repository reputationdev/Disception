# Disception
Bad uncaught exception webhook thingy that i made in like 5 minutes (i dont reccomend using this, ever)
<br><br>
![image](https://user-images.githubusercontent.com/89894310/202869463-89a59d4a-cb4e-4b14-9302-6ba365353271.png)
<br>
## HOW 2 USE
Just add this to the start of your app
```java
Disception.start("<webhook url>");
```

For try/catch thingys do this:
```java
 } catch (Exception e) {
    Disception.exception(e);
}
```
