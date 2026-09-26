package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44110a;
    public final long f44111b;
    public long f44112c;

    public b(long j3, long j10) {
        this.f44110a = j3;
        this.f44111b = j10;
        this.f44112c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f44112c;
        if (j3 >= this.f44110a && j3 <= this.f44111b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f44112c + 1;
        this.f44112c = j3;
        if (j3 > this.f44111b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
