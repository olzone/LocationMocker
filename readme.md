# Localization Mocker

It allows you to change the location of the android device through websocket 

### Usage
    1. Run application
    2. Run these command 'adb forward tcp:36969 tcp:36969' in terminal
    3. Connect to websocket 'ws://localhost:36969/'
    4. Send reguests
    
Example reguest:
```sh
{"latitude": 15.387653, "longitude": 73.872585, "accuracy": 5}
```
### Author
Aleksander Surman