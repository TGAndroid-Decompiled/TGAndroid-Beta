package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f49121a;
    public final long f49122b;
    public long f49123c;

    public b(long j3, long j10) {
        this.f49121a = j3;
        this.f49122b = j10;
        this.f49123c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f49123c;
        if (j3 >= this.f49121a && j3 <= this.f49122b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f49123c + 1;
        this.f49123c = j3;
        if (j3 > this.f49122b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
