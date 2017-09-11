package worker;

public class Metric implements MetricMBean {
  int dogs;
  int cats;
  int votes;

  public Metric() {
    this.dogs = 0;
    this.cats = 0;
    this.votes = 0;
  }

  @Override
  public int getCats() {
    return this.cats;
  }

  @Override
  public int getDogs() {
    return this.dogs;
  }

  @Override
  public int getVotes() {
    return this.votes;
  }

  public void incDogs() {
    this.dogs++;
  }

  public void incCats() {
    this.cats++;
  }

  public void incVotes() {
    this.votes++;
  }

}
