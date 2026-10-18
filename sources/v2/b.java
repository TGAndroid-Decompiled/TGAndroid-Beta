package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f47868a;
    public final long f47869b;
    public long f47870c;

    public b(long j10, long j11) {
        this.f47868a = j10;
        this.f47869b = j11;
        this.f47870c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f47870c;
        if (j10 >= this.f47868a && j10 <= this.f47869b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f47870c + 1;
        this.f47870c = j10;
        if (j10 > this.f47869b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
