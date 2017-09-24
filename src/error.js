class ErrorList {
  constructor() {
    this.list = [];
  }

  insert(index) {
    this.list.push(index + 1);
  }

  get() {
    const separatedByCommas = this.list.join(', ');
    return separatedByCommas.replace(/,(?=[^,]*$)/, ' e');
  }

}

const singleTonErrorList = new ErrorList();

module.exports = singleTonErrorList;
