import java.util.ArrayList;
public class Database 
{
	
	static ArrayList<Element> singles = new ArrayList<Element>();
	static ArrayList<Element> doubles = new ArrayList<Element>();
	static ArrayList<Element> leftovers = new ArrayList<Element>();
	static ArrayList<ArrayList<Element>> elementList = new ArrayList<ArrayList<Element>>();
	
	public static void createElements()
	{
		
		leftovers.add(new Element("g", "g"));
		leftovers.add(new Element("l", "l"));
		leftovers.add(new Element("d", "d"));
		leftovers.add(new Element("q", "q"));
		leftovers.add(new Element("e", "e"));
		leftovers.add(new Element("t", "t"));
		leftovers.add(new Element("j", "j"));
		leftovers.add(new Element("m", "m"));
		leftovers.add(new Element("x", "x"));
		leftovers.add(new Element("r", "r"));
		leftovers.add(new Element("z", "z"));
		leftovers.add(new Element("a", "a"));
		leftovers.add(new Element(".", "."));
		leftovers.add(new Element(",", ","));
		leftovers.add(new Element("!", "!"));
		leftovers.add(new Element("?", "?"));
		leftovers.add(new Element("-", "-"));
		leftovers.add(new Element("'", "'"));
		leftovers.add(new Element(" ", " "));
		leftovers.add(new Element("", " "));
		leftovers.add(new Element("(", "("));
		leftovers.add(new Element(")", ")"));
		
		singles.add(new Element("hydrogen", "h"));
		singles.add(new Element("boron", "b"));
		singles.add(new Element("carbon", "c"));
		singles.add(new Element("nitrogen", "n"));
		singles.add(new Element("oxygen", "o"));
		singles.add(new Element("fluorine", "f"));
		singles.add(new Element("phosphorus", "p"));
		singles.add(new Element("sulfur", "s"));
		singles.add(new Element("potassium", "k"));
		singles.add(new Element("vanadium", "v"));
		singles.add(new Element("yttrium", "y"));
		singles.add(new Element("iodine", "i"));
		singles.add(new Element("tungsten", "w"));
		singles.add(new Element("uranium", "u"));
	
		
		
		doubles.add(new Element("helium", "he"));
		doubles.add(new Element("lithium", "li"));
		doubles.add(new Element("beryllium", "be"));
		doubles.add(new Element("neon", "ne"));
		doubles.add(new Element("sodium", "na"));
		doubles.add(new Element("magnesium", "mg"));
		doubles.add(new Element("aluminum", "al"));
		doubles.add(new Element("silicon", "si"));
		doubles.add(new Element("chlorine", "cl"));
		doubles.add(new Element("argon", "ar"));
		doubles.add(new Element("calcium", "ca"));
		doubles.add(new Element("scandium", "sc"));
		doubles.add(new Element("titanium", "ti"));
		doubles.add(new Element("chromium", "cr"));
		doubles.add(new Element("manganese", "mn"));
		doubles.add(new Element("iron", "fe"));
		doubles.add(new Element("cobalt", "co"));
		doubles.add(new Element("nickle", "ni"));
		doubles.add(new Element("copper", "cu"));
		doubles.add(new Element("zinc", "zn"));
		doubles.add(new Element("gallium", "ga"));
		doubles.add(new Element("germanium", "ge"));
		doubles.add(new Element("arsenic", "as"));
		doubles.add(new Element("selenium", "se"));
		doubles.add(new Element("bromine", "br"));
		doubles.add(new Element("krypton", "kr"));
		doubles.add(new Element("rubidium", "rb"));
		doubles.add(new Element("strontium", "sr"));
		doubles.add(new Element("zirconium", "zr"));
		doubles.add(new Element("niobium", "nb"));
		doubles.add(new Element("molybdenum", "mo"));
		doubles.add(new Element("technetium", "tc"));
		doubles.add(new Element("ruthenium", "ru"));
		doubles.add(new Element("rhodium", "rh"));
		doubles.add(new Element("palladium", "pd"));
		doubles.add(new Element("silver", "ag"));
		doubles.add(new Element("cadmium", "cd"));
		doubles.add(new Element("indium", "in"));
		doubles.add(new Element("tin", "sn"));
		doubles.add(new Element("antimony", "sb"));
		doubles.add(new Element("tellurium", "te"));
		doubles.add(new Element("xenon", "xe"));
		doubles.add(new Element("cesium", "cs"));
		doubles.add(new Element("barium", "ba"));
		doubles.add(new Element("lanthanum", "la"));
		doubles.add(new Element("cerium", "ce"));
		doubles.add(new Element("praseodymium", "pr"));
		doubles.add(new Element("neodymium", "nd"));
		doubles.add(new Element("promethium", "pm"));
		doubles.add(new Element("samarium", "sm"));
		doubles.add(new Element("europium", "eu"));
		doubles.add(new Element("gadolinium", "gd"));
		doubles.add(new Element("terbium", "tb"));
		doubles.add(new Element("dysprosium", "dy"));
		doubles.add(new Element("holmium", "ho"));
		doubles.add(new Element("erbium", "er"));
		doubles.add(new Element("thulium", "tm"));
		doubles.add(new Element("ytterbium", "yb"));
		doubles.add(new Element("lutetium", "lu"));
		doubles.add(new Element("hafnium", "hf"));
		doubles.add(new Element("tantalum", "ta"));
		doubles.add(new Element("rhenium", "re"));
		doubles.add(new Element("osmium", "os"));
		doubles.add(new Element("iridium", "ir"));
		doubles.add(new Element("platinum", "pt"));
		doubles.add(new Element("gold", "au"));
		doubles.add(new Element("mercury", "hg"));
		doubles.add(new Element("thallium", "tl"));
		doubles.add(new Element("lead", "pb"));
		doubles.add(new Element("bismuth", "bi"));
		doubles.add(new Element("polonium", "po"));
		doubles.add(new Element("astatine", "at"));
		doubles.add(new Element("radon", "rn"));
		doubles.add(new Element("francium", "fr"));
		doubles.add(new Element("radium", "ra"));
		doubles.add(new Element("actinium", "ac"));
		doubles.add(new Element("thorium", "th"));
		doubles.add(new Element("protactinium", "pa"));
		doubles.add(new Element("neptunium", "np"));
		doubles.add(new Element("plutonium", "pu"));
		doubles.add(new Element("americium", "am"));
		doubles.add(new Element("curium", "cm"));
		doubles.add(new Element("berkelium", "bk"));
		doubles.add(new Element("californium", "cf"));
		doubles.add(new Element("einsteinium", "es"));
		doubles.add(new Element("fermium", "fm"));
		doubles.add(new Element("mendelevium", "md"));
		doubles.add(new Element("nobelium", "no"));
		doubles.add(new Element("lawrencium", "lr"));
		doubles.add(new Element("rutherfordium", "rf"));
		doubles.add(new Element("dubnium", "db"));
		doubles.add(new Element("seaborgium", "sg"));
		doubles.add(new Element("bohrium", "bh"));
		doubles.add(new Element("hassium", "hs"));
		doubles.add(new Element("meitnerium", "mt"));
		doubles.add(new Element("darmstadtium", "ds"));
		doubles.add(new Element("roentgenium", "rg"));
		doubles.add(new Element("copernicium", "cn"));
		doubles.add(new Element("nihonium", "nh"));
		doubles.add(new Element("flerovium", "fl"));
		doubles.add(new Element("moscovium", "mc"));
		doubles.add(new Element("livermorium", "lv"));
		doubles.add(new Element("tennessine", "ts"));
		doubles.add(new Element("oganesson", "og"));
		
		
		elementList.add(doubles);
		elementList.add(singles);
		elementList.add(leftovers);
	}
	
}
