package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44156a;
    public final long f44157b;
    public long f44158c;

    public b(long j3, long j10) {
        this.f44156a = j3;
        this.f44157b = j10;
        this.f44158c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f44158c;
        if (j3 >= this.f44156a && j3 <= this.f44157b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f44158c + 1;
        this.f44158c = j3;
        if (j3 > this.f44157b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
