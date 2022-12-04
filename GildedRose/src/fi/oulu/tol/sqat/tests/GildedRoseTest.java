package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

	@Test
	public void testTheTruth() {
		assertTrue(true);
	}
	@Test
	public void exampleTest() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 19, quality);
	}
	
	@Test
	public void exampleTest2() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 2, 0));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Aged Brie", 1, quality);
	}
	
	@Test
	public void exampleTest3() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Elixir of the Mongoose", 5, 7));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Elixir of the Mongoose", 6, quality);
	}
	
	@Test
	public void exampleTest4() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		inn.oneDay();

		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Sulfuras, Hand of Ragnaros", 80, quality);
	}
	
	@Test
	public void exampleTest5() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Backstage passes to a TAFKAL80ETC concert", 21, quality);
	}
	
	@Test
	public void exampleTest6() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", 3, 6));
		inn.oneDay();

		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();

		assertEquals("Failed quality for Conjured Mana Cake", 5, quality);
	}
	@Test
	public void exampleTest7() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int sellIn = items.get(0).getSellIn();
		
		assertEquals("Failed sell in for +5 Dexterity Vest", 9, sellIn);
	}
	
	@Test
	public void exampleTest8() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 2, 0));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int sellIn = items.get(0).getSellIn();
		
		assertEquals("Failed quality for Aged Brie", 1, sellIn);
	}
	
	@Test
	public void exampleTest9() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", 3, 6));
		inn.oneDay();
		
		
		List<Item> items = inn.getItems();
		int sellIn = items.get(0).getSellIn();
		
		
		assertEquals("Failed quality for Conjured Mana Cake", 2, sellIn);
	}
	
	@Test
	public void exampleTest10() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Elixir of the Mongoose", 5, 7));
		for(int i = 0; i <= 5; i++) {
		inn.oneDay();
		}
		
		List<Item> items = inn.getItems();
		int sellIn = items.get(0).getSellIn();
		
		
		assertEquals("Failed quality for Elixir of the Mongoose", -1, sellIn);
	}
	
	@Test
	public void exampleTest11() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		inn.oneDay();
		
		
		List<Item> items = inn.getItems();
		int sellIn = items.get(0).getSellIn();
		
		
		assertEquals("Failed quality for Sulfuras, Hand of Ragnaros", 0, sellIn);
	}

	@Test
	public void exampleTest12() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		
		
		for(int i = 0; i <= 10; i++) {
			inn.oneDay();
		}
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		
		assertEquals("Backstage passes to a TAFKAL80ETC concert", 38, quality);
	}
	
	@Test
	public void exampleTest13() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 1, 49));
		inn.oneDay();
		
		
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		
		assertEquals("Backstage passes to a TAFKAL80ETC concert", 50, quality);
	}
	
	@Test
	public void exampleTest14() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", 3, 80));
		inn.oneDay();
		
		
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		
		assertEquals("Backstage passes to a TAFKAL80ETC concert", 80, quality);
	}
	
	@Test
	public void exampleTest15() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", -1, 10));
		inn.oneDay();
		
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		
		assertEquals("Failed quality for Aged Brie", 12, quality);
	}
	
	@Test
	public void exampleTest16() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 49));
		inn.oneDay();
		
		
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		
		assertEquals("Backstage passes to a TAFKAL80ETC concert", 0, quality);
	}
	
	@Test
	public void exampleTest17() {
		
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", -1, 20));
		inn.oneDay();
		
		
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
	
		assertEquals("Backstage passes to a TAFKAL80ETC concert", 18, quality);
	}
	
	@Test
	public void exampleTest18() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Sulfuras, Hand of Ragnaros", 80, quality);
	}
	
	@Test
	public void exampleTest19() {
		GildedRose inn = new GildedRose();
		GildedRose.main(null);
		
		List<Item> items = inn.getItems();
		int count = items.size();
		assertEquals(6, count);
	}
	@Test
	public void exampleTest20() {
		GildedRose inn = new GildedRose();
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int count = items.size();
		assertEquals("", 0, count);
	}
	@Test
	public void exampleTest21() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", -1, 10));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Failed quality for Conjured Mana Cake", 8, quality);
	}
	
	@Test (expected = AssertionError.class)
	public void exceptions() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", -6, 0));
		
		inn.oneDay();
		List<Item> items = inn.getItems();
		
		assertEquals("Failed quality for +5 Dexterity Vest",-2, items.get(0).getQuality());
		
	}
	
	@Test (expected = AssertionError.class)
    public void testi() {
        GildedRose inn = new GildedRose();

        inn.setItem(new Item("Aged Brie", -24, 50));

        inn.oneDay();
        List<Item> items = inn.getItems();

        assertEquals("Wrong quality value", 51, items.get(0).getQuality());

    }
	
	
	
	
	
}
	