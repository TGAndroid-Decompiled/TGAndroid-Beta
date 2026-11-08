package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f58875a;
    public final long f58876b;
    public long f58877c;

    public b(long j3, long j10) {
        this.f58875a = j3;
        this.f58876b = j10;
        this.f58877c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f58877c;
        if (j3 >= this.f58875a && j3 <= this.f58876b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z9;
        long j3 = this.f58877c + 1;
        this.f58877c = j3;
        if (j3 > this.f58876b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}
