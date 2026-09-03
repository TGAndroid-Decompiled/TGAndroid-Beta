package q4;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f42745a;
    public final long f42746b;
    public long f42747c;

    public b(long j10, long j11) {
        this.f42745a = j10;
        this.f42746b = j11;
        this.f42747c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f42747c;
        if (j10 >= this.f42745a && j10 <= this.f42746b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z4;
        long j10 = this.f42747c + 1;
        this.f42747c = j10;
        if (j10 > this.f42746b) {
            z4 = true;
        } else {
            z4 = false;
        }
        return !z4;
    }
}
