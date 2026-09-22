package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44148a;
    public final long f44149b;
    public long f44150c;

    public b(long j3, long j10) {
        this.f44148a = j3;
        this.f44149b = j10;
        this.f44150c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f44150c;
        if (j3 >= this.f44148a && j3 <= this.f44149b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f44150c + 1;
        this.f44150c = j3;
        if (j3 > this.f44149b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
