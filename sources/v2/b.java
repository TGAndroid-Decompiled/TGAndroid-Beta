package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f47311a;
    public final long f47312b;
    public long f47313c;

    public b(long j3, long j10) {
        this.f47311a = j3;
        this.f47312b = j10;
        this.f47313c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f47313c;
        if (j3 >= this.f47311a && j3 <= this.f47312b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f47313c + 1;
        this.f47313c = j3;
        if (j3 > this.f47312b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
