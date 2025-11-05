# Tutorial Basico de NukkitJS
basicamente es igual a java pero aqui hay un tutorial:

Para usarlos en un evento usa event.getPlayer().getName(); cambia getName() por la función que quieras de las siguientes:

Y para comandos usa sender.getName(); cambia getName() por la función que quieras de las siguientes:

    getName() : devuelve el nombre del jugador.
    getDisplayName() : devuelve el nombre que se muestra del jugador, que puede tener colores o formatos especiales.
    sendMessage("String message") : envía un mensaje al jugador.
    teleport(Location location) : teletransporta al jugador a una ubicación determinada.
    kick("String reason") : expulsa al jugador del servidor con una razón opcional.
    setGamemode(int gamemode) : cambia el modo de juego del jugador (0 = supervivencia, 1 = creativo, 2 = aventura, 3 = espectador).
    getGamemode() : devuelve el modo de juego del jugador (0 = supervivencia, 1 = creativo, 2 = aventura, 3 = espectador).
    getInventory() : devuelve el inventario del jugador.
    getHealth() : devuelve la salud del jugador.
    setHealth(double health) : cambia la salud del jugador.
    addEffect(Effect effect) : añade un efecto al jugador, como velocidad, fuerza o invisibilidad.
    removeEffect(int effectId) : elimina un efecto del jugador por su identificador.
    setFood(int food) : cambia el nivel de hambre del jugador.
    getFood() : devuelve el nivel de hambre del jugador.
    setAllowFlight(boolean allowFlight) : permite o no al jugador volar en modo supervivencia o aventura.
    isFlying() : devuelve si el jugador está volando o no.
    setFlying(boolean flying) : hace que el jugador vuele o no.
    getLevel() : devuelve el nivel en el que está el jugador.
    getExp() : devuelve la experiencia del jugador.
    setExp(float exp) : cambia la experiencia del jugador.
    getAddress() : devuelve la dirección IP del jugador.
    getPort() : devuelve el puerto del jugador.
    isOp() : devuelve si el jugador es operador o no.
    setOp(boolean op) : hace que el jugador sea operador o no.
    hasPermission("String permission") : devuelve si el jugador tiene un permiso determinado o no.
    addPermission(String permission) : añade un permiso al jugador.
    removePermission(String permission) : elimina un permiso del jugador.
    getSkin() : devuelve la apariencia del jugador.
    setSkin(Skin skin) : cambia la apariencia del jugador.
    isSneaking() : devuelve si el jugador está agachado o no.
    isSprinting() : devuelve si el jugador está corriendo o no.
    setSprinting(boolean sprinting) : hace que el jugador corra o no.
    getArmorInventory() : devuelve el inventario de armadura del jugador.
    getEnderChestInventory() : devuelve el inventario del cofre del ender del jugador.
    getCursorInventory() : devuelve el inventario del cursor del jugador.
    getCraftingGrid() : devuelve la cuadrícula de crafteo del jugador.
    dropItem(Item item) : hace que el jugador suelte un objeto.
    getServer() : devuelve el servidor al que está conectado el jugador.
    sendPopup(String message) : envía un mensaje emergente al jugador.
    sendTip(String message) : envía un mensaje de consejo al jugador.
    sendTitle(String title, String subtitle) : envía un mensaje de título y subtítulo al jugador.
    sendActionBar(String message) : envía un mensaje en la barra de acción al jugador.
    getPing() : devuelve el ping del jugador en milisegundos.
    isSleeping() : devuelve si el jugador está durmiendo o no.
    getBedLocation() : devuelve la ubicación de la cama del jugador.
    getUniqueId() : devuelve el identificador único del jugador.
    getDisplayName() : devuelve el nombre que se muestra del jugador, que puede tener colores o formatos especiales.
    sleep(Location location) : hace que el jugador duerma en una ubicación determinada.

También hay muchas más funciones para los Jugadores puedes verlos en la documentación de la API de Nukkit en el archivo Player.class o solo Player!


Funciones que funcionan en ModLoader para el servidor y que hacen:

Para usarlos en comandos, eventos tareas y más usa server.getLogger(); cambia getLogger() por las funciones que nesesites de las siguientes:

    getVersion() : devuelve la versión de Nukkit que está usando el servidor.
    getOnlinePlayers() : devuelve un mapa con los jugadores que están conectados al servidor.
    getMaxPlayers() : devuelve el número máximo de jugadores que puede tener el servidor.
    getPluginManager() : devuelve el gestor de plugins del servidor.
    getLogger() : devuelve el registrador del servidor, que se usa para enviar mensajes al archivo de registro o a la consola.
    broadcastMessage("String message") : envía un mensaje a todos los jugadores del servidor.
    dispatchCommand(CommandSender sender, String commandLine) : ejecuta un comando como si lo hubiera enviado un jugador o la consola.
    getWorlds() : devuelve una lista con los mundos que tiene el servidor.
    loadLevel(String name) : carga un mundo en el servidor.
    getMotd() : devuelve el mensaje del día del servidor.
    setMotd(String motd) : cambia el mensaje del día del servidor.
    getIp() : devuelve la dirección IP del servidor.
    getPort() : devuelve el puerto del servidor.
    getTick() : devuelve el número de ticks que ha transcurrido desde que se inició el servidor.
    getTicksPerSecond() : devuelve el número de ticks por segundo que está ejecutando el servidor.
    getScheduler() : devuelve el programador de tareas del servidor.
    getCommandMap() : devuelve el mapa de comandos del servidor, que se usa para registrar o desregistrar comandos.
    isRunning() : devuelve si el servidor está funcionando o no.
    shutdown() : apaga el servidor.
    getDifficulty() : devuelve la dificultad del servidor (0 = pacífico, 1 = fácil, 2 = normal, 3 = difícil).
    setDifficulty(int difficulty) : cambia la dificultad del servidor.
    getDefaultLevel() : devuelve el mundo por defecto del servidor.
    setDefaultLevel(Level level) : cambia el mundo por defecto del servidor.
    getLevelByName(String name) : devuelve un mundo por su nombre, o null si no existe.
    getLevelByFolderName(String name) : devuelve un mundo por su nombre de carpeta, o null si no existe.
    isLevelLoaded(String name) : devuelve si un mundo está cargado o no por su nombre.
    isLevelGenerated(String name) : devuelve si un mundo está generado o no por su nombre.
    generateLevel(String name) : genera un mundo con el nombre dado y las opciones por defecto.
    unloadLevel(Level level) : descarga un mundo del servidor.
    getName() : devuelve el nombre del software del servidor, que es Nukkit.
    getNukkitVersion() : devuelve la versión de Nukkit que está usando el servidor.
    getApiVersion() : devuelve la versión de la API de Nukkit que está usando el servidor.
    getNetwork() : devuelve el objeto de red del servidor, que se usa para manejar las conexiones y los paquetes.
    getPluginManager() : devuelve el gestor de plugins del servidor, que se usa para cargar, descargar o activar plugins.
    getScheduler() : devuelve el programador de tareas del servidor, que se usa para ejecutar tareas asíncronas o repetitivas.
    getConsoleSender() : devuelve el objeto que representa a la consola del servidor, que puede enviar o recibir comandos o mensajes.
    isPrimaryThread() : devuelve si el hilo actual es el hilo principal del servidor.

Puedes ver la lista completa de métodos de server en la documentación de Nukkit!


También puedes usar varias cosas de la variable global manager de ModLoader!

Ejemplos:

    manager.createCommand("String name", "String description", "String function") : crea un comando personalizado que llama a una función de JavaScript cuando se ejecuta tambien se puede cambiar el string de function por callback js.
    manager.createTask("String name", "int delay") : crea una tarea que se ejecuta una vez después de un cierto retraso en ticks.
    manager.createLoopTask("String name", "int period") : crea una tarea que se ejecuta repetidamente cada cierto periodo en ticks.
    manager.cancelTask("id") : cancela una tarea con su ID.
    manager.getPlugin("plugin Name") : devuelve null si NO está el plugin indicado en el servidor o la clase main de el.
    manager.time(seconds) : no se que hace xd pero existe la función.
    manager.plugin() : no se que hace pero existe.
    manager.createConfig("File file", "int type") : crea un archivo de configuración de un tipo determinado (0 = JSON, 1 = PROPERTIES, 2 = YAML).
    manager.getFile("String folder", "String file") : devuelve un objeto file de un archivo dentro de una carpeta del plugin.
    manager.format("String message", Object… args) : devuelve un mensaje formateado con los argumentos dados.

También en JSEngine puedes usar los eventos que hay en Nukkit!

Para ejecutar un código cuando pase el evento usa el nombre exacto de la clase del evento

Cambie "PlayerJoinEvent" por el evento que desea usar!

Ejemplos de eventos: 

    PlayerJoinEvent : para hacer algo cuando un jugador se une al servidor.
    BlockBreakEvent : se activa cuando un jugador rompe un bloque.
    PlayerChatEvent : se activa cuando un jugador envía un mensaje en el chat.
    PlayerDeathEvent : se activa cuando un jugador muere.
    PlayerMoveEvent : se activa cuando un jugador se mueve.
    ServerCommandEvent : se activa cuando se ejecuta un comando en la consola del servidor.

Y hay muchos más eventos!

Cómo Utilizar Clases de Java en tu Script de JSEngineNK:
Para utilizar clases de Java en tu Plugin de JavaScript puedes utilizar estos métodos:

    Cómo Usar Clases de Java Vanila:

Esto es la forma más fácil de utilizar el Código de Java en JavaScript! Obviamente solo funcionan los archivos de Java Vanila no funciona Librerías externas ni Clases de Nukkit solo Clases de Java Vanila aquí un ejemplo de como importar la Clase:

var File = java.io.File;

    Usar Clases Nukkit y todo Java:

Esto También es fácil Esto es Para Importar Clases de Nukkit y Java Vanila!
Solo añade Java.type("package")
Aquí un ejemplo:

var Block = Java.type('cn.nukkit.block.Block');

Ahora Sabes como Hacer un script o Plugin en JavaScript con JSEngineNK!

Aclaremos que Ejecuta JS ES5.1 con algunas cosas de ES6 como:
let, const, y poco mas
clases con Class polyfill que no se puede pasar a funciones java ni extenderlas