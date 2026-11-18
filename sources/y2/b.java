package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f60661a;
    public final long f60662b;
    public long f60663c;

    public b(long j3, long j10) {
        this.f60661a = j3;
        this.f60662b = j10;
        this.f60663c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f60663c;
        if (j3 >= this.f60661a && j3 <= this.f60662b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f60663c + 1;
        this.f60663c = j3;
        if (j3 > this.f60662b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
