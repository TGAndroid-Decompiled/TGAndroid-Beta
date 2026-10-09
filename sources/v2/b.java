package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f49034a;
    public final long f49035b;
    public long f49036c;

    public b(long j3, long j10) {
        this.f49034a = j3;
        this.f49035b = j10;
        this.f49036c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f49036c;
        if (j3 >= this.f49034a && j3 <= this.f49035b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f49036c + 1;
        this.f49036c = j3;
        if (j3 > this.f49035b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
