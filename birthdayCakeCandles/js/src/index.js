
function birthdayCakeCandles(arr){
    let tmp = arr;
    let max = Math.max(...arr);
    tmp = tmp.filter(x => x==max);
    return tmp.length;
}

module.exports = birthdayCakeCandles