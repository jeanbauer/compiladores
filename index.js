const main = new Promise((resolve, reject) => {
  require('./src/read')
    .then(({ inputFile, outputFile }) => {
      const scannerOutput = require('./src/scanner')(inputFile);

        if (outputFile)
          resolve(scannerOutput === outputFile ? 'Test passed' : 'Test failed');
        else
          resolve(scannerOutput);
      })
      .catch(reject);
});

main
  .then(output => {
    console.log(output);
    process.exit();
  })
  .catch(err => console.log(err));
