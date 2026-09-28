package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44111a;
    public final long f44112b;
    public long f44113c;

    public b(long j3, long j10) {
        this.f44111a = j3;
        this.f44112b = j10;
        this.f44113c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f44113c;
        if (j3 >= this.f44111a && j3 <= this.f44112b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f44113c + 1;
        this.f44113c = j3;
        if (j3 > this.f44112b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
