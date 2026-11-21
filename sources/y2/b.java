package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f60703a;
    public final long f60704b;
    public long f60705c;

    public b(long j3, long j10) {
        this.f60703a = j3;
        this.f60704b = j10;
        this.f60705c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f60705c;
        if (j3 >= this.f60703a && j3 <= this.f60704b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f60705c + 1;
        this.f60705c = j3;
        if (j3 > this.f60704b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
