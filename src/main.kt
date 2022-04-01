fun main(){
    var car=Car("subaru","legacy","white",4)
    car.carry(4)
    car.carry(8)
    car.identity()
    println(car.calculateParkingFees(5))

    var pickUp=Bus("Toyota", "Corolla","White",24)
    pickUp.carry(20)
    pickUp.carry(60)
    pickUp.identity()
    println(pickUp.calculateParkingFees(7))
    println(pickUp.maxTripFare(100.50))



}
open class Car(var make:String,var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        var x=people-capacity
        if(people<=capacity){
            println("Carrying $people passengers")
        }
        else
            println("Over capacity by $x")
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees (hours:Int):Int{
        return hours*20
    }

}
class Bus(make: String, model: String, color: String,capacity: Int):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        return fare*capacity
    }

    override fun calculateParkingFees(hours: Int): Int {
        return hours*capacity
    }
}