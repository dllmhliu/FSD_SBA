export class SignUpInfo {
    username: string;
    password: string;
    role: string[];
    firstname: string;
    lastname: string;
    contactNumber: number;
    linkedinUrl: string;
    yearsOfExperience: string;
    active: boolean;
    confirmedSignUp: boolean;
    resetPassword: boolean;
    resetPasswordDate: Date;
//this.role = ['user'];
    constructor(username: string, password: string, firstname: string, lastname: string,     contactNumber: number，    linkedinUrl: string,
    yearsOfExperience: string) {
        this.username = username;
        this.password = password;
        this.role = 'user';
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactNumber =contactNumber;
        this.linkedinUrl = linkedinUrl;
        this.yearsOfExperience = yearsOfExperience;
        this.active = false;
        this.confirmedSignUp = false;
        this.resetPassword = false;
        this.resetPasswordDate = new Date();
    }
}
