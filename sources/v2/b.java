package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44112a;
    public final long f44113b;
    public long f44114c;

    public b(long j3, long j10) {
        this.f44112a = j3;
        this.f44113b = j10;
        this.f44114c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f44114c;
        if (j3 >= this.f44112a && j3 <= this.f44113b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f44114c + 1;
        this.f44114c = j3;
        if (j3 > this.f44113b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
