const miniMaxSum = require('../src/index');

test('should able to calculate the min and max sum of a given array', ()=>{
    expect(miniMaxSum([1, 2, 3, 4, 5])).toEqual([10, 14])
})