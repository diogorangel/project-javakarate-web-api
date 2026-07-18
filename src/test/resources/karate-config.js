function fn() {
  var env = karate.env; 
  if (!env) {
    env = 'dev'; 
  }
  

  var rootDir = karate.properties['user.dir'];
  var isCI = karate.properties['ci'] == 'true'; 

  var config = {
    webUrl: 'https://www.saucedemo.com/',
    apiUrl: 'https://reqres.in/'
  };


  var localAppData = java.lang.System.getenv('LOCALAPPDATA');
  var chromePath = isCI ? null : localAppData + '\\Google\\Chrome\\Application\\chrome.exe';

  karate.configure('driver', {
    type: 'chrome',
    executable: chromePath,
    driverExecutable: rootDir + '/drivers/chromedriver.exe',
    headless: isCI,
    showDriverLog: true
  });

  return config;
}