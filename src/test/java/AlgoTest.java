package test.java;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	SortDemoData dataArray = new SortDemoData();
	SortDemoData solutionArray = new SortDemoData();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void bubbleSortTest() {
		dataArray.initializeArray("5 21 3 7 2 8 34");
		solutionArray.initializeArray("2 3 5 7 8 21 34");
		dataArray.runAlgo(0);
		assertTrue(dataArray.myArray.length == solutionArray.myArray.length);
		for (int i = 0; i<dataArray.myArray.length; i++){
			assertTrue(dataArray.myArray[i].key == solutionArray.myArray[i].key);
		}	
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyBubbleSort() {
		SortAlgos.bubbleSort(null);
	}
	
	@Test
	public void selectionSortTest() {
		dataArray.initializeArray("5 21 3 7 2 8 34");
		solutionArray.initializeArray("2 3 5 7 8 21 34");
		dataArray.runAlgo(1);
		assertTrue(dataArray.myArray.length == solutionArray.myArray.length);
		for (int i = 0; i<dataArray.myArray.length; i++){
			assertTrue(dataArray.myArray[i].key == solutionArray.myArray[i].key);
		}	
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptySelectionSort() {
		SortAlgos.selectionSort(null);
	}
	
	@Test
	public void insertionSortTest() {
		dataArray.initializeArray("5 21 3 7 2 8 34");
		solutionArray.initializeArray("2 3 5 7 8 21 34");
		dataArray.runAlgo(2);
		assertTrue(dataArray.myArray.length == solutionArray.myArray.length);
		for (int i = 0; i<dataArray.myArray.length; i++){
			assertTrue(dataArray.myArray[i].key == solutionArray.myArray[i].key);
		}	
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyInsertionSort() {
		SortAlgos.insertionSort(null);
	}
	
	@Test
	public void mergeSortTest() {
		dataArray.initializeArray("5 21 3 7 2 8 34");
		solutionArray.initializeArray("2 3 5 7 8 21 34");
		dataArray.runAlgo(3);
		assertTrue(dataArray.myArray.length == solutionArray.myArray.length);
		for (int i = 0; i<dataArray.myArray.length; i++){
			assertTrue(dataArray.myArray[i].key == solutionArray.myArray[i].key);
		}	
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyMergeSort() {
		SortAlgos.mergeSort(null);
	}
	
	@Test
	public void quickSortTest() {
		dataArray.initializeArray("5 21 3 7 2 8 34");
		solutionArray.initializeArray("2 3 5 7 8 21 34");
		dataArray.runAlgo(4);
		assertTrue(dataArray.myArray.length == solutionArray.myArray.length);
		for (int i = 0; i<dataArray.myArray.length; i++){
			assertTrue(dataArray.myArray[i].key == solutionArray.myArray[i].key);
		}	
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyQuickSort() {
		SortAlgos.quickSort(null);
	}
	
	@Test
	public void heapSortTest() {
		dataArray.initializeArray("5 21 3 7 2 8 34");
		solutionArray.initializeArray("2 3 5 7 8 21 34");
		dataArray.runAlgo(5);
		assertTrue(dataArray.myArray.length == solutionArray.myArray.length);
		for (int i = 0; i<dataArray.myArray.length; i++){
			assertTrue(dataArray.myArray[i].key == solutionArray.myArray[i].key);
		}	
	}
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyHeapSort() {
		SortAlgos.heapSort(null);
	}
}