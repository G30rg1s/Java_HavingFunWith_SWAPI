package Entities_Utility_Classes.Expected_Entities;

import java.util.List;

public class PaginatedResponse<T> {
    private int count;
    private String next;
    private String previous;
    private List<T> results;

    public PaginatedResponse(int count, String next, String previous, List<T> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    public int getCount() { return count; }
    public void setCount(int count) { this.count = count; }

    public String getNext() { return next; }
    public void setNext(String next) { this.next = next; }

    public String getPrevious() { return previous; }
    public void setPrevious(String previous) { this.previous = previous; }

    public List<T> getResults() { return results; }
    public void setResults(List<T> results) { this.results = results; }
}

