package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f43856a;
    public final long f43857b;
    public long f43858c;

    public b(long j3, long j10) {
        this.f43856a = j3;
        this.f43857b = j10;
        this.f43858c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f43858c;
        if (j3 >= this.f43856a && j3 <= this.f43857b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f43858c + 1;
        this.f43858c = j3;
        if (j3 > this.f43857b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
