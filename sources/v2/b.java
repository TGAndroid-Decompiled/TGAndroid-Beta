package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f50288a;
    public final long f50289b;
    public long f50290c;

    public b(long j10, long j11) {
        this.f50288a = j10;
        this.f50289b = j11;
        this.f50290c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f50290c;
        if (j10 >= this.f50288a && j10 <= this.f50289b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f50290c + 1;
        this.f50290c = j10;
        if (j10 > this.f50289b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
