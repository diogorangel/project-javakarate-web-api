function fn() {
  var rootDir = karate.properties['user.dir'];
  
  var config = {
    webUrl: 'https://www.saucedemo.com/',
    apiUrl: 'https://reqres.in/'
  };

  karate.configure('driver', {
    type: 'chrome',
    // Chrome
    executable: 'C:\\Users\\doeg\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe',
    // Driver no Projeto
    driverExecutable: rootDir + '\\chromedriver.exe'
  });

  return config;
}