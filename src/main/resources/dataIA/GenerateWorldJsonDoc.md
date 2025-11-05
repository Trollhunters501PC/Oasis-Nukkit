# Documentacion de worldGen del JSON
la opcion "worldGen" del json se usa para generar mundos!
ejemplo de uso:
```json
{
    ...
    "worldGen": [{"name": "NombreSinEspaciosNiSignos", "generator": "normal"}...],
    ...
}
```
es un array de mundos que debas generar:
en name debes poner el nombre del mundo que vaz a generar sin Espacios ni signos ni comas, puntos, etc. solo Letrar y numeros
en generator debes especificar el generador como: normal, void, flat, nether o the_end