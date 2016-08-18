export class Organization {

	constructor(
	public id: number,
	public organizationName: string,
	public registerNumber: string,
	public registrationDate: string,
	public ownerName: string,
	public organizationAddress: string,
	public organizationPostCode: string,
	public organizationOccupation: string,
	public occupationDescription: string
	)
}