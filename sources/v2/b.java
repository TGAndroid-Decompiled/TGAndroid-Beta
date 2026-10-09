package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f49032a;
    public final long f49033b;
    public long f49034c;

    public b(long j3, long j10) {
        this.f49032a = j3;
        this.f49033b = j10;
        this.f49034c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f49034c;
        if (j3 >= this.f49032a && j3 <= this.f49033b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f49034c + 1;
        this.f49034c = j3;
        if (j3 > this.f49033b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
