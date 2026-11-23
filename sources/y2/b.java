package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f60707a;
    public final long f60708b;
    public long f60709c;

    public b(long j3, long j10) {
        this.f60707a = j3;
        this.f60708b = j10;
        this.f60709c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f60709c;
        if (j3 >= this.f60707a && j3 <= this.f60708b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f60709c + 1;
        this.f60709c = j3;
        if (j3 > this.f60708b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
