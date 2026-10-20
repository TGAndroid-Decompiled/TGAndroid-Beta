package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f47875a;
    public final long f47876b;
    public long f47877c;

    public b(long j10, long j11) {
        this.f47875a = j10;
        this.f47876b = j11;
        this.f47877c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f47877c;
        if (j10 >= this.f47875a && j10 <= this.f47876b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f47877c + 1;
        this.f47877c = j10;
        if (j10 > this.f47876b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
