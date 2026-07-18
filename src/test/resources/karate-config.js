function fn() {
  var env = karate.env;
  if (!env) {
    env = 'dev';
  }

  var isCI = (karate.properties['ci'] == 'true') || (karate.os.name.contains('Linux'));

  var config = {
    webUrl: 'https://www.saucedemo.com/',
    apiUrl: 'https://reqres.in/'
  };

  var rootDir = karate.properties['user.dir'];
  var localAppData = java.lang.System.getenv('LOCALAPPDATA');
  var chromePath = isCI ? null : localAppData + '\\Google\\Chrome\\Application\\chrome.exe';

  karate.configure('driver', {
    type: 'chrome',
    executable: chromePath,
    driverExecutable: isCI ? null : rootDir + '/drivers/chromedriver.exe',
    headless: isCI,
    showDriverLog: true
  });

  return config;
}