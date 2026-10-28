package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f50025a;
    public final long f50026b;
    public long f50027c;

    public b(long j10, long j11) {
        this.f50025a = j10;
        this.f50026b = j11;
        this.f50027c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f50027c;
        if (j10 >= this.f50025a && j10 <= this.f50026b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f50027c + 1;
        this.f50027c = j10;
        if (j10 > this.f50026b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
