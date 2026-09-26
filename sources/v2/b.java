package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44109a;
    public final long f44110b;
    public long f44111c;

    public b(long j3, long j10) {
        this.f44109a = j3;
        this.f44110b = j10;
        this.f44111c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f44111c;
        if (j3 >= this.f44109a && j3 <= this.f44110b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f44111c + 1;
        this.f44111c = j3;
        if (j3 > this.f44110b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
