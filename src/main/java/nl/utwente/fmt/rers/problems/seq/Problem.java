package nl.utwente.fmt.rers.problems.seq;

public interface Problem {

     public void reset();
     
     public void calculateOutput(String input);
     
     public String getOutput();
     
     public String[] getInputs();


}
