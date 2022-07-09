const timeConversion = require('../src/index');

test('should be able to convert PM to 24 hrs format', ()=>{
    expect(timeConversion('07:05:45PM')).toEqual('19:05:45')
})

test('should be able to convert AM to 24 hrs format', ()=>{
    expect(timeConversion('06:40:03AM')).toEqual('06:40:03')
})

test('should be able to convert 12 AM to 24 hrs format', ()=>{
    expect(timeConversion('12:35:03AM')).toEqual('00:35:03')
})

test('should be able to convert 12 PM to 24 hrs format', ()=>{
    expect(timeConversion('12:35:03PM')).toEqual('12:35:03')
})