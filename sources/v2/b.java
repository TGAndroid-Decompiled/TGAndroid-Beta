package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f42848a;
    public final long f42849b;
    public long f42850c;

    public b(long j3, long j10) {
        this.f42848a = j3;
        this.f42849b = j10;
        this.f42850c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f42850c;
        if (j3 >= this.f42848a && j3 <= this.f42849b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f42850c + 1;
        this.f42850c = j3;
        if (j3 > this.f42849b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
