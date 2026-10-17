package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f47890a;
    public final long f47891b;
    public long f47892c;

    public b(long j10, long j11) {
        this.f47890a = j10;
        this.f47891b = j11;
        this.f47892c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f47892c;
        if (j10 >= this.f47890a && j10 <= this.f47891b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f47892c + 1;
        this.f47892c = j10;
        if (j10 > this.f47891b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
