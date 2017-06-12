import java.util.Arrays;

public class GAMain {

	public static void main(String[] args) {
		Population population = new Population(GeneticAlgorithm.populationSize).initializePopublation();
		GeneticAlgorithm geneticAlgorithm = new GeneticAlgorithm(); 
		int generationNumber = 0;
		System.out.println("-------------------------");
		System.out.println("Generation No.  " + generationNumber + " | Fittest Chromosome fitness:" + population.getChromosomes()[0].getFitness());
		printPopulation(population, "Target Chromosome: "+ Arrays.toString(GeneticAlgorithm.TARGET_CHROMOSOME));
		
//		 while(population.getChromosomes()[0].getFitness() < GeneticAlgorithm.TARGET_CHROMOSOME.length){
//			 generationNumber++;
//			 System.out.println("\n--------------------------");
//			 population = geneticAlgorithm.evolve(population);
//		 }
	}
public static void printPopulation(Population population, String heading){
	System.out.println(heading);
	System.out.println("-------------------------");
	for (int x = 0; x < population.getChromosomes().length; x++){
		System.out.println("Chromosome No. " + x + " : " + Arrays.toString(population.getChromosomes()[x].getGenes())+ 
				" |  Fitness: " + population.getChromosomes()[x].getFitness());
	}
}
}
