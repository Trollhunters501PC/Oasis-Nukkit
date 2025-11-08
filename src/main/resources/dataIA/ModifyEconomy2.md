# Documentacion de LlamaEconomyAPI Nukkit
Primero importa el Main de LlamaEconomyAPI:
```js
const LlamaEconomy = manager.getPlugin("LlamaEconomy");
```
Despues aqui hay unos ejemplos
```js
//Importar instancia API
const APIL = LlamaEconomy.getAPI();
//Obtener el dinero que tienen los jugadores al iniciar:
let moneyDef = APIL.getDefaultMoney()
//si existe la cuenta?
//en player son instancias cn.nukkit.Player por ejemplo sender o en eventos event.getPlayer() o el array players(obteniendo alguno) o en server(obteniendo alguno con su API)...
APIL.hasAccount(player);
//crear cuenta a un jugador
APIL.createAccount(player, money);
//Obtener dinero del jugador(en double)
APIL.getMoney(player);
//Establecer dinero
APIL.setMoney(player, money);
//Añadir dinero
APIL.addMoney(player, money);
//Quitar dinero
APIL.reduceMoney(player, money);
...
```