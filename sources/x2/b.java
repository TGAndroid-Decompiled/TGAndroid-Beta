package x2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f58129a;
    public final long f58130b;
    public long f58131c;

    public b(long j10, long j11) {
        this.f58129a = j10;
        this.f58130b = j11;
        this.f58131c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f58131c;
        if (j10 >= this.f58129a && j10 <= this.f58130b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f58131c + 1;
        this.f58131c = j10;
        if (j10 > this.f58130b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
