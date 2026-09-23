package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f43777a;
    public final long f43778b;
    public long f43779c;

    public b(long j3, long j10) {
        this.f43777a = j3;
        this.f43778b = j10;
        this.f43779c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f43779c;
        if (j3 >= this.f43777a && j3 <= this.f43778b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f43779c + 1;
        this.f43779c = j3;
        if (j3 > this.f43778b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
