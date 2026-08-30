package q4;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f42715a;
    public final long f42716b;
    public long f42717c;

    public b(long j10, long j11) {
        this.f42715a = j10;
        this.f42716b = j11;
        this.f42717c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f42717c;
        if (j10 >= this.f42715a && j10 <= this.f42716b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z4;
        long j10 = this.f42717c + 1;
        this.f42717c = j10;
        if (j10 > this.f42716b) {
            z4 = true;
        } else {
            z4 = false;
        }
        return !z4;
    }
}
