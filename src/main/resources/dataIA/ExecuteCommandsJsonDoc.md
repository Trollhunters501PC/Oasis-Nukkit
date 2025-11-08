# Documentacion de executeCommands del JSON
la opcion executeCommands del json se usa para ejecutar comandos al instante despues de ejecutar el codigo que mandas, con su instancia de sender
ejemplo de uso:
```json
{
    ...
    "executeCommands": ["help 2"...],
    ...
}
```
es un array de comandos que se ejecutaran.