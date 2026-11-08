package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f58876a;
    public final long f58877b;
    public long f58878c;

    public b(long j3, long j10) {
        this.f58876a = j3;
        this.f58877b = j10;
        this.f58878c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f58878c;
        if (j3 >= this.f58876a && j3 <= this.f58877b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z9;
        long j3 = this.f58878c + 1;
        this.f58878c = j3;
        if (j3 > this.f58877b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}
