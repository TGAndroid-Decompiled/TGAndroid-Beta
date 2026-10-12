package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f49270a;
    public final long f49271b;
    public long f49272c;

    public b(long j3, long j10) {
        this.f49270a = j3;
        this.f49271b = j10;
        this.f49272c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f49272c;
        if (j3 >= this.f49270a && j3 <= this.f49271b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f49272c + 1;
        this.f49272c = j3;
        if (j3 > this.f49271b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
