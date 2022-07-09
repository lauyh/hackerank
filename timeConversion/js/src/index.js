function timeConversion(str) {
    const isNoon = str.slice(-2) === 'AM' ? false : true;
    const isTwelve = str.substring(0,2) === '12' ? true : false;

    let hour = '';

    let tmp = str.replace(/AM|PM/, '').split(':')
    let minute = tmp[1];
    let sec = tmp[2];
    if(!isNoon && isTwelve){
        hour = '00'
    }else if(isNoon && !isTwelve){
        hour = (parseInt(tmp[0]) + 12).toString()
    }else if(isNoon && isTwelve){
        hour = '12'
    }else{
        hour = tmp[0].toString();
    }

    return `${hour}:${minute}:${sec}`
}

module.exports = timeConversion;


