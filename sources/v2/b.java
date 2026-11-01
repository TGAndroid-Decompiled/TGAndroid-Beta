package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f50302a;
    public final long f50303b;
    public long f50304c;

    public b(long j10, long j11) {
        this.f50302a = j10;
        this.f50303b = j11;
        this.f50304c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f50304c;
        if (j10 >= this.f50302a && j10 <= this.f50303b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f50304c + 1;
        this.f50304c = j10;
        if (j10 > this.f50303b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
