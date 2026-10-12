package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f46482a;
    public final long f46483b;
    public long f46484c;

    public b(long j10, long j11) {
        this.f46482a = j10;
        this.f46483b = j11;
        this.f46484c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f46484c;
        if (j10 >= this.f46482a && j10 <= this.f46483b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f46484c + 1;
        this.f46484c = j10;
        if (j10 > this.f46483b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
