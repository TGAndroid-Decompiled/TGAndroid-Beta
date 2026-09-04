package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f47282a;
    public final long f47283b;
    public long f47284c;

    public b(long j3, long j10) {
        this.f47282a = j3;
        this.f47283b = j10;
        this.f47284c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f47284c;
        if (j3 >= this.f47282a && j3 <= this.f47283b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f47284c + 1;
        this.f47284c = j3;
        if (j3 > this.f47283b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
