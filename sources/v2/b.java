package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44082a;
    public final long f44083b;
    public long f44084c;

    public b(long j3, long j10) {
        this.f44082a = j3;
        this.f44083b = j10;
        this.f44084c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f44084c;
        if (j3 >= this.f44082a && j3 <= this.f44083b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f44084c + 1;
        this.f44084c = j3;
        if (j3 > this.f44083b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
