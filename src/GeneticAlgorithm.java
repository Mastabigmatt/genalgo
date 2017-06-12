
public class GeneticAlgorithm {

public static final int populationSize =10;
public static final int[] TARGET_CHROMOSOME ={1,1,0,1,0,0,1,1,1,0};
public static final int NUMB_OFELITE_CHROMOSOMES = 1;
public static final int TOURNAMENT_SELECTION_SIZE = 4;

public Population evolve(Population population){
	return mutatePopulation(crossoverPopulation(population));
}
private Population crossoverPopulation(Population population){
	Population crossoverPopulation = new Population(population.getChromosomes().length);
	for(int x = 0; x < NUMB_OFELITE_CHROMOSOMES;x++){
		crossoverPopulation.getChromosomes()[x] = population.getChromosomes()[x];
	}
	return crossoverPopulation;
}
private Population mutatePopulation(Population population) {
	Population mutatePopulation = new Population(population.getChromosomes().length);
	for(int x = 0; x < NUMB_OFELITE_CHROMOSOMES;x++){
		mutatePopulation.getChromosomes()[x] = population.getChromosomes()[x];
	}
	return mutatePopulation;
}
private Chromosome crossoverChromosome(Chromosome chromosome1, Chromosome chromosome2){
	Chromosome crossoverChromosome = new Chromosome(TARGET_CHROMOSOME.length);
	for(int x = 0; x <chromosome1.getGenes().length;x++){
		if (Math.random()<0.5)
			crossoverChromosome.getGenes()[x] = chromosome1.getGenes()[x];
		else crossoverChromosome.getGenes()[x]=chromosome2.getGenes()[x];
	}
	return crossoverChromosome;
	
}

}
