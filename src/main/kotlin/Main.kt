val employeeId = 6143
val firstName = "Joe"
val surname = "Soap"
val department = "Computer Services"
val jobTitle = "Technician"
val hourlyRate = 26.87
val hoursWorked = 39
val overtimeHoursWorked = 4
val bonusPercentage = 4.5
val taxRate = 23.5
val pensionPercentage = 6.7

fun printPayslip(){
    val normalPay = hoursWorked * hourlyRate
    val overtimePay = overtimeHoursWorked * hourlyRate * 1.5
    val grossPay = normalPay + overtimePay
    val bonus = grossPay * bonusPercentage / 100
    val tax = grossPay * taxRate / 100
    val pension = grossPay * pensionPercentage / 100
    val netPay = grossPay + bonus - tax - pension

    println()
    println("==================================================")
    println("                     PAYSLIP")
    println("==================================================")
    println("Employee ID        : $employeeId")
    println("Employee           : ${firstName.replaceFirstChar {it.uppercase()}} ${surname.replaceFirstChar {it.uppercase()}} ($employeeId)", )
    println("Job / Dept         : $jobTitle ($department)")
    println("--------------------------------------------------")
    println("Hourly Rate        : €%.2f".format(hourlyRate))
    println("Hours Worked       : $hoursWorked")
    println("Overtime Hours     : $overtimeHoursWorked")
    println("--------------------------------------------------")
    println("Normal Pay         : €%.2f".format(normalPay))
    println("Overtime Pay       : €%.2f".format(overtimePay))
    println("Gross Pay          : €%.2f".format(grossPay))
    println("Bonus              : €%.2f".format(bonus))
    println("Tax Deduction      : €%.2f".format(tax))
    println("Pension Deduction  : €%.2f".format(pension))
    println("--------------------------------------------------")
    println("Net Pay            : €%.2f".format(netPay))
    println("==================================================")
}

fun main() {
    println("Pay Slip Printer")
    printPayslip()
}