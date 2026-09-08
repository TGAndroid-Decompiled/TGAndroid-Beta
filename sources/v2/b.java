package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f47310a;
    public final long f47311b;
    public long f47312c;

    public b(long j3, long j10) {
        this.f47310a = j3;
        this.f47311b = j10;
        this.f47312c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f47312c;
        if (j3 >= this.f47310a && j3 <= this.f47311b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f47312c + 1;
        this.f47312c = j3;
        if (j3 > this.f47311b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
