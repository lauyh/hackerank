const birthdayCakeCandles = require('../src/index');

test('should be able calculate the count of highest candle based on given array', () => {
    expect(birthdayCakeCandles([3, 2, 1, 3])).toEqual(2);
})