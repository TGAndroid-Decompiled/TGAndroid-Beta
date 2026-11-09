package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f58885a;
    public final long f58886b;
    public long f58887c;

    public b(long j3, long j10) {
        this.f58885a = j3;
        this.f58886b = j10;
        this.f58887c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f58887c;
        if (j3 >= this.f58885a && j3 <= this.f58886b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z9;
        long j3 = this.f58887c + 1;
        this.f58887c = j3;
        if (j3 > this.f58886b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}
