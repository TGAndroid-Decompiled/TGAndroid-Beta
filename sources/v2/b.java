package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f49078a;
    public final long f49079b;
    public long f49080c;

    public b(long j3, long j10) {
        this.f49078a = j3;
        this.f49079b = j10;
        this.f49080c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f49080c;
        if (j3 >= this.f49078a && j3 <= this.f49079b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f49080c + 1;
        this.f49080c = j3;
        if (j3 > this.f49079b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
