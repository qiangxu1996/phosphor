package edu.columbia.cs.psl.test.phosphor;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaIntTagITCase {

	@Test
	public void testDoubleConsumer() throws Exception{
		ObjDoubleConsumer<double[]> consumer = (ll, l) -> {
			ll[0] += l;
		};
		consumer.accept(new double[1], 1.0);

		BiConsumer<double[], double[]> consumer2 = (ll, rr) -> {
			ll[0] += rr[0];
		};
		consumer2.accept(new double[1], new double[1]);
	}

	@Test
	public void testCollectors() throws Exception{
		List<String> givenList = Arrays.asList("a", "bb", "ccc", "dd");
		givenList.stream().collect(Collectors.toList());

	}
	@Test
	public void testEmptyLambda() throws Exception {
		Runnable r = () -> {
		};
	}

	@Test
	public void testIntStreamsDontCrash() throws Exception {
		int sum = IntStream.of(1, 2, 3, 4, 5).sum(); //creates a bunch of lambdas
	}

	@Test
	public void testSupplier() throws Exception {
		Supplier<double[]> supplier = () -> new double[3];
		double[] d = supplier.get();
	}
}
