package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f43851a;
    public final long f43852b;
    public long f43853c;

    public b(long j3, long j10) {
        this.f43851a = j3;
        this.f43852b = j10;
        this.f43853c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f43853c;
        if (j3 >= this.f43851a && j3 <= this.f43852b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f43853c + 1;
        this.f43853c = j3;
        if (j3 > this.f43852b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
