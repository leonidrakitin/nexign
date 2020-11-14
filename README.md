## class Users - пользователи
    private int id;                       - первичный идентификатор
    private String name;                  - имя владельца
    private LocalDateTime dateCreated;    - дата создания

## get
#### api/users
- получение списка всех пользователей
#### api/users/{userId}
- получение всей информации по пользователю

## post
#### api/new/user
- @RequestBody - String {name}
- создание нового пользователя

## delete
#### api/user/{userId}
- удаление пользователя


## class Cards - пластиковые карты
    private int id;           - первичный идентификатор
    private int ownerId;      - владелец
    private String number;    - номера карты
    private int money;        - деньги
    private int limit;        - лимит
    private boolean done;     - выпущена / нет
    
## get
### api/cards
- получение списка всех карт
### api/cards/{cardId}
- получение всей информации по карте

## post
### api/new/card
- @RequestBody - int {ownerID}
- создание новой карты

## put
### api/changestatus/{cardId}
- @RequestBody - Bool {status}
- смена статуса карты (готова / нет)
### api/limitcard/{cardId}
- @RequestBody - int {limit}
- смена лимита карты
### api/money/{cardId}
- @RequestBody - int {money}
- изменение кол-во денег на карте

## delete
### api/card/{cardId}
- удаление карты


## class History - история транзакций *[in development]*
    private int id;                - первичный идентификатор
    private int cardId;            - идентификатор карты
    private int price;             - цена
    private String name;           - Получатель
    private LocalDateTime date;    - дата транзакции
    
## get
- dev

## post
- dev

## put
- dev

## delete
- dev


## class Bonus - история начисления бонусов *[in development]*
    private int id;                - первичный идентификатор
    private int cardId;            - идентификатор карты
    private int amount;            - количество
    private String name;           - за что
    private LocalDateTime date;    - дата получения

## get
- dev

## post
- dev

## put
- dev

## delete
- dev
