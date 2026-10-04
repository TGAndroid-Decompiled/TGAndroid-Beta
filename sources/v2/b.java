package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f47761a;
    public final long f47762b;
    public long f47763c;

    public b(long j3, long j10) {
        this.f47761a = j3;
        this.f47762b = j10;
        this.f47763c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f47763c;
        if (j3 >= this.f47761a && j3 <= this.f47762b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f47763c + 1;
        this.f47763c = j3;
        if (j3 > this.f47762b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
