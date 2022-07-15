const gradingStudents = require('../src/index')

test('should be round the score corectly', ()=>{
    expect(gradingStudents([73,67,38,33])).toEqual([75,67,40,33])
})