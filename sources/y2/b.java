package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f58883a;
    public final long f58884b;
    public long f58885c;

    public b(long j3, long j10) {
        this.f58883a = j3;
        this.f58884b = j10;
        this.f58885c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f58885c;
        if (j3 >= this.f58883a && j3 <= this.f58884b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z9;
        long j3 = this.f58885c + 1;
        this.f58885c = j3;
        if (j3 > this.f58884b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}
