const { readFileSync } = require('fs');
const inputPath = process.argv[2];
const outputPath = process.argv[3];

const response = (inputPath, outputPath) => ({
  'inputFile': inputPath && readFileSync(inputPath, 'utf-8'),
  'outputFile': outputPath && readFileSync(outputPath, 'utf-8')
});

new Promise((resolve, reject) => {
  if (!inputPath) reject('Informe o caminho do arquivo de teste');
  resolve(response(inputPath, outputPath));
});
