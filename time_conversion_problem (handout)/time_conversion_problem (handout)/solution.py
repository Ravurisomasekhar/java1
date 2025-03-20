s  = input()
def time_conversion(s):
    
    hours, minutes, seconds_am_pm = s.split(":")
    seconds = seconds_am_pm[:2]  
    # print(seconds)
    period = seconds_am_pm[2:]
    # print(period)   

    
    hours = int(hours)

    
    if period == "AM":
        if hours == 12:
            hours = 0  
    else:  
        if hours != 12:
            hours += 12 

   
    return f"{hours:02}:{minutes}:{seconds}"


print(time_conversion(s)) 
