package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f60790a;
    public final long f60791b;
    public long f60792c;

    public b(long j3, long j10) {
        this.f60790a = j3;
        this.f60791b = j10;
        this.f60792c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f60792c;
        if (j3 >= this.f60790a && j3 <= this.f60791b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f60792c + 1;
        this.f60792c = j3;
        if (j3 > this.f60791b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
