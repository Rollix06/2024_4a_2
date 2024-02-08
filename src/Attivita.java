public class Attivita {
private String nome;
private String[] materia;
private float credito;
private String data;
private int nOre;
private int posMat;
public Attivita(String no, String da, int nOr) {
	super();
	nome = no;
	materia = new String[10];
	credito = 0;
	data = da;
	nOre = nOr;
	posMat=0;
	for(int i=0;i<10;i++) {
		materia[i]=" ";
	}
}
public String getMateria(int pos) {
	return materia[pos];
}
public String getNome() {
	return nome;
}

public float getCredito() {
	return credito;
}
public void setCredito(float credito) {
	this.credito = credito;
}
public String getData() {
	return data;
}

public int getnOre() {
	return nOre;
}
public boolean isInf() {
	for(int i=0;i<posMat;i++) {
		if(getMateria(i).compareToIgnoreCase("informatica")==0) {
			return true;}
	}
	return false;
	
}
public void setMateria(String s) {
materia[posMat]=s;
posMat++;
}
public String toString(){
String s=nome+"  crediti: "+credito+" data inizio: "+data+" numero ore:"+nOre+"\n";
s+=" materie inerenti all' attivita:"+"\n";
for(int i=0;i<posMat;i++) 
s+=materia[i]+"\n";
return s;
}
public static void main(String[] args) {
	Attivita a1= new Attivita("Gioco","25/7/2022",30);
a1.setCredito(2);
a1.setMateria("informatica");
a1.setMateria("italiano");
System.out.println(a1);
boolean prova=false;
 prova=a1.isInf();
 System.out.println(prova);
}

}
