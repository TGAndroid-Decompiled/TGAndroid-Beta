package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f47770a;
    public final long f47771b;
    public long f47772c;

    public b(long j3, long j10) {
        this.f47770a = j3;
        this.f47771b = j10;
        this.f47772c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f47772c;
        if (j3 >= this.f47770a && j3 <= this.f47771b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f47772c + 1;
        this.f47772c = j3;
        if (j3 > this.f47771b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
