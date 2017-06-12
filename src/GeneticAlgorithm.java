
public class GeneticAlgorithm {

public static final int populationSize =10;
public static final int[] TARGET_CHROMOSOME ={1,1,0,1,0,0,1,1,1,0};

public Population evolve(Population population){
	return mutatePopulation(crossoverPopulation(population));
}

private Population mutatePopulation(Population population) {
	
	return population;
}

private Population crossoverPopulation(Population population){
	return population;
}
}
