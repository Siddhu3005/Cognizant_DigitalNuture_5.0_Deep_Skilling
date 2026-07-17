class Cohort {
    constructor(cohortCode,
        startDate,
        technology,
        trainerName,
        coachName,
        currentStatus) {
        this.cohortCode = cohortCode;
        this.coachName = coachName;
        this.trainerName = trainerName;
        this.technology = technology;
        this.startDate = startDate;
        this.currentStatus = currentStatus;
    }
}
const CohortsData = [
    new Cohort('ADM24JF001', '15-Jan-2024', 'Java FSD', 'John Doe', 'Apoorv', 'Ongoing'),
    new Cohort('ADM24DF002', '20-Feb-2024', '.NET FSD', 'Emma Watson', 'Ibrahim', 'Scheduled'),
    new Cohort('ADM24PY003', '10-Mar-2024', 'Python Full Stack', 'David Miller', 'Aathma', 'Completed'),
    new Cohort('ADM24CC004', '05-Apr-2024', 'Cloud Computing', 'Sophia Brown', 'Rahul', 'Ongoing')
];
export {Cohort, CohortsData};