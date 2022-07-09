function miniMaxSum(arr) {
    // Write your code here
    let min = 0;
    let max = 0;
    let sum = arr.reduce((x, partial)=> partial + x, 0)
    min = sum - Math.max(...arr)
    max = sum - Math.min(...arr)
    return [min, max];
}

module.exports = miniMaxSum;


