package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f47777a;
    public final long f47778b;
    public long f47779c;

    public b(long j3, long j10) {
        this.f47777a = j3;
        this.f47778b = j10;
        this.f47779c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f47779c;
        if (j3 >= this.f47777a && j3 <= this.f47778b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f47779c + 1;
        this.f47779c = j3;
        if (j3 > this.f47778b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
