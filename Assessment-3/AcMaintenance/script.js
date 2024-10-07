document.getElementById('appointmentForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const customerName = document.getElementById('customerName').value;
    const email = document.getElementById('email').value;
    const acType = document.getElementById('acType').value;
    const serviceType = document.getElementById('serviceType').value;
    const yearlyMaintenance = document.getElementById('yearlyMaintenance').checked;
 
    
    let serviceCharge = 0;
    if (serviceType === 'Gas Refill') {
        serviceCharge = 1500;
    } else if (serviceType === 'Cleaning') {
        serviceCharge = 1000;
    } else if (serviceType === 'Repair') {
        serviceCharge = 2000;
    }
 
    if (yearlyMaintenance) {
        serviceCharge += 1000;
    }
    let resultMessage = `Hello ${customerName}, your service appointment for ${acType} AC ${serviceType} `;
    resultMessage += yearlyMaintenance ? 'with yearly maintenance' : 'without yearly maintenance';
    resultMessage += ` will be sent to your email ID ${email} and the estimated service charge will be Rs ${serviceCharge}.`;
 
    document.getElementById('result').innerText = resultMessage;
});