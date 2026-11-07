package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f58786a;
    public final long f58787b;
    public long f58788c;

    public b(long j3, long j10) {
        this.f58786a = j3;
        this.f58787b = j10;
        this.f58788c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f58788c;
        if (j3 >= this.f58786a && j3 <= this.f58787b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z9;
        long j3 = this.f58788c + 1;
        this.f58788c = j3;
        if (j3 > this.f58787b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}
