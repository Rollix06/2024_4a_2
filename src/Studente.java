
public class Studente {
private String nome;
private String classe;
private Attivita[] vAtt;
private int nA;
public Studente(String no,String cl,int maxA) {
	nome=no;
	classe=cl;
	nA=0;
	vAtt = new Attivita[maxA];
}
public boolean addAttivita(Attivita a1) {
	vAtt[nA] = a1;
	nA++;
	if (nA<vAtt.length)
		return true;
	return false;
}
public void setCredito(String no,float cr) {
	for(int i=0;i<nA;i++)
		if(vAtt[i].getNome()==no)
			vAtt[i].setCredito(cr);
}
public int numAttCr() {
	int conta=0;
	for(int i=0;i<nA;i++) {
		if(vAtt[i].getCredito()!=0)
			conta++;}
	return conta;
}
public float totCrediti() {
	float conta=0;
	for(int i=0;i<nA;i++) {
		conta+=vAtt[i].getCredito();
}
	return conta;
}
public String attMaxCr() {
	float conta=0;
	String nome="";
	for(int i=0;i<nA;i++) {
		if(vAtt[i].getCredito()>conta) {
		conta=vAtt[i].getCredito();
		nome=vAtt[i].getNome();
		}
}
	return nome;
}
public boolean attInfo() {
	for(int i=0;i<nA;i++) {
		if(vAtt[i].isInf()) {
			return true;
		}
}
	return false;
}
public String toString() {
	String s="";
	s+=nome+" classe: "+classe+" Attivita con crediti:"+ numAttCr()+"\n" ; 
	s+="crediti totali: "+totCrediti()+" Attivita con maggiori crediti:"+attMaxCr()+"\n";
	if(attInfo()) {
	s+="sono presenti attivita riguardanti l informatica"+"\n"; 
	
	}  else {
		s+="non sono presenti attivita riguardanti l informatica"+"\n"; 

	}
    s+="Attivita :"+"\n";
	for(int i=0;i<nA;i++) {
	s+=vAtt[i].toString();
	s+="\n";
	}
	return s;
}
public static void main(String[] args) {
	Attivita a1= new Attivita("gioco","25/7/2022",30);
	a1.setMateria("informatica");
	a1.setMateria("italiano");
	Attivita a2= new Attivita("ponte","20/7/2019",20);
	
	a2.setMateria("geografia");
	a2.setMateria("latino");
	Attivita a3= new Attivita("fieno","2/4/2026",50);
	
	a3.setMateria("mate");
	a3.setMateria("tpsit");
	Studente s1=new Studente("gigi","4ai",5);
	s1.addAttivita(a1);
	s1.addAttivita(a2);
	s1.addAttivita(a3);
	s1.setCredito("gioco", 4);
	s1.setCredito("ponte", 0);
	s1.setCredito("fieno", 2);
	System.out.println(s1);
	
}





}