fun getRpNominal(nominal:String): String{
        var value = ""
    	var k=3
        if(nominal.length%6==4||nominal.length==4||nominal.length%6==1){
                var x=0
                var iterasi=(nominal.length/3).toInt()
                var y=x+1
                value=doiterasiToaddPoint(x,y,k,iterasi,nominal)
            }else if(nominal.length%3==0){
                var x=0
                var iterasi=(nominal.length/3).toInt()-1
                var y=x+k
                value=doiterasiToaddPoint(x,y,k,iterasi,nominal)
            }else if(nominal.length%6==2 ||nominal.length%6==5||nominal.length==5){
                var x=0
                var iterasi=(nominal.length/3).toInt()
                var y=x+2
                value=doiterasiToaddPoint(x,y,k,iterasi,nominal)
            }else{
            value=nominal
        }
        return value
    }

fun doiterasiToaddPoint(x_:Int,y_:Int,k:Int,iterasi:Int,nominal:String):String{
    var value:String=""
    var x:Int=x_
    var y:Int=y_
    for(i in 0..iterasi){
        value=value+nominal.substring(x,y)
        if(i!=iterasi){
            value=value+"."
        }
        x=y
        y+=k
    }
    return value
}


fun main(){
    var str="1"
    for (i in 0..30){
        str=str+"1"
        println(getRpNominal(str))
    }
    
}
