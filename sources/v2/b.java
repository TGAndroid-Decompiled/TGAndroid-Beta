package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f43828a;
    public final long f43829b;
    public long f43830c;

    public b(long j3, long j10) {
        this.f43828a = j3;
        this.f43829b = j10;
        this.f43830c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f43830c;
        if (j3 >= this.f43828a && j3 <= this.f43829b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f43830c + 1;
        this.f43830c = j3;
        if (j3 > this.f43829b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
