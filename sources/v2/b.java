package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f49990a;
    public final long f49991b;
    public long f49992c;

    public b(long j10, long j11) {
        this.f49990a = j10;
        this.f49991b = j11;
        this.f49992c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f49992c;
        if (j10 >= this.f49990a && j10 <= this.f49991b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f49992c + 1;
        this.f49992c = j10;
        if (j10 > this.f49991b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
