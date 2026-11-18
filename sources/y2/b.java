package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f60662a;
    public final long f60663b;
    public long f60664c;

    public b(long j3, long j10) {
        this.f60662a = j3;
        this.f60663b = j10;
        this.f60664c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f60664c;
        if (j3 >= this.f60662a && j3 <= this.f60663b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f60664c + 1;
        this.f60664c = j3;
        if (j3 > this.f60663b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
