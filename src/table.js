class Table {
  constructor() {
    this.symbols = [];
  }

  insert(identifier) {
    const index = this.symbols.findIndex(el => el === identifier);
    return ~index ? index + 1: this.symbols.push(identifier);
  }

  get() {
    return this.symbols.map((symbol, index) => `${index + 1} - ${symbol}`).join('\n');
  }

}

const singleTonTable = new Table();

module.exports = singleTonTable;
