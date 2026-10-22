package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f47878a;
    public final long f47879b;
    public long f47880c;

    public b(long j10, long j11) {
        this.f47878a = j10;
        this.f47879b = j11;
        this.f47880c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f47880c;
        if (j10 >= this.f47878a && j10 <= this.f47879b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f47880c + 1;
        this.f47880c = j10;
        if (j10 > this.f47879b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
