package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f47879a;
    public final long f47880b;
    public long f47881c;

    public b(long j10, long j11) {
        this.f47879a = j10;
        this.f47880b = j11;
        this.f47881c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f47881c;
        if (j10 >= this.f47879a && j10 <= this.f47880b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f47881c + 1;
        this.f47881c = j10;
        if (j10 > this.f47880b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
