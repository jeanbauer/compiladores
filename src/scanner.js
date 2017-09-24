const automato = require('./automato');
const Table = require('./Table');
const ErrorList = require('./error');
const types = require('./types.json');

const joinAll = (arrayFormated) => {
  return `${arrayFormated}

Tabela de Símbolos
${Table.get()}

O programa possui erros nas linhas: ${ErrorList.get()}`;
};

const format = (tokensArray, textArray) => {
  const formatedArray = [];

  tokensArray.forEach((line, index) => {
    if (line === types.error) {
      ErrorList.insert(index);
    } else {

      if (line === types.id || line === types.int || line === types.real) {
        const identifierNumber = Table.insert(textArray[index]);

        formatedArray.push(`[${index + 1}] ${line} ${identifierNumber}`);
      } else {

        formatedArray.push(`[${index + 1}] ${line}`);
      }
    }
  });

  return formatedArray.join('\n');
};

module.exports = (inputFile) => {
  const separatedLinesArray = inputFile.split('\n');
  const tokenized = separatedLinesArray.map(line => automato(line));
  const formated = format(tokenized, separatedLinesArray);
  return joinAll(formated);
};
