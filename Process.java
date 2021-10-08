public class Process {

  private int processId;
  private int totalInstructions;
  private int executedInstructions;
  private String processName;

  public Process(int processId, int totalInstructions, String processName) {
    this.processId = processId;
    this.totalInstructions = totalInstructions;
    this.processName = processName;
  }

  public void execute() {
    this.totalInstructions -= 5;
    this.executedInstructions += 5;
  }

  public int getProcessId() {
    return this.processId;
  }

  public int getTotalInstructions() {
    return this.totalInstructions;
  }

  public int getExecutedIntructions() {
    return this.executedInstructions;
  }

  public String getProcessName() {
    return this.processName;
  }

}
