package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f58756a;
    public final long f58757b;
    public long f58758c;

    public b(long j3, long j10) {
        this.f58756a = j3;
        this.f58757b = j10;
        this.f58758c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f58758c;
        if (j3 >= this.f58756a && j3 <= this.f58757b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z9;
        long j3 = this.f58758c + 1;
        this.f58758c = j3;
        if (j3 > this.f58757b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}
