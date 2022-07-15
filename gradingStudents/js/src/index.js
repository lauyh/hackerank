const gradingStudents = (arr) => {return arr.map((x)=> x < 37 ? x : x%5 < 3 ? x : x + (5 - x%5))};

module.exports = gradingStudents