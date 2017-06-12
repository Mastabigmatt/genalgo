import java.util.Arrays;

public class Population {
private Chromosome[] chromosomes;
public Population(int length){
	chromosomes = new Chromosome[length];
}
public Population initializePopublation(){
	for(int i = 0; i<chromosomes.length;i++){
		chromosomes[i] = new Chromosome(GeneticAlgorithm.TARGET_CHROMOSOME.length).initializeChromosome();
		
	}
	sortChromosomesbyFitness();
	return this;
	
}
public Chromosome[] getChromosomes(){
	return chromosomes;
}
public void sortChromosomesbyFitness(){
	Arrays.sort(chromosomes,(chromosome1,chromosome2)->{
		int flag =0;
		if (chromosome1.getFitness() > chromosome2.getFitness())
			flag = -1;
		else if (chromosome1.getFitness() < chromosome2.getFitness())
			flag = 1;
		return flag;
		
	});
}
}
