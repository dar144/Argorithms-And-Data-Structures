import java.io.IOException;
import java.nio.CharBuffer;

public final class RandomWordAdapter extends RandomWord implements Readable{
    private int n;
    public RandomWordAdapter(int length, int n) {
        super(length);
        this.n = n;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {

        for(int i = 0; i < n; i++) {
            cb.append(super.rand()+" ");
            if(i == n-1)
                return -1;
        }
        return n*super.getLength()+n;
    }
}


