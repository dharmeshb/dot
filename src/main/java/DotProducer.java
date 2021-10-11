
public class DotProducer {

	public DotProducer() {
		Graph g = new Graph("participant-management");
	    g.addNodes(
	            new Node().setShape(Shape.record),
	            new Node("study_response").setShape(Shape.record).setLabel("<f0> left|<f1> middle|<f2> right"),
	            new Node("struct2").setShape(Shape.record).setLabel("<f0> one|<f1> two"),
	            new Node("struct3").setShape(Shape.record).setLabel("hello\\nworld |{ b |{c|<here> d|e}| f}| g | h"));
	    g.addEdges(
	            new Edge().addNode("struct1", "f1").addNode("struct2", "f0"),
	            new Edge().addNode("struct1", "f2").addNode("struct3", "here"));
	    return g;
	}
	
	public void fileData() {
		//TODO .dot file with a timestmap, branch, whatever else you can put to indetify
	}
	
	public void exportJpeg() {
		// TODO .png
	}
}
