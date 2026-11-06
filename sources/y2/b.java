package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f58780a;
    public final long f58781b;
    public long f58782c;

    public b(long j3, long j10) {
        this.f58780a = j3;
        this.f58781b = j10;
        this.f58782c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f58782c;
        if (j3 >= this.f58780a && j3 <= this.f58781b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z9;
        long j3 = this.f58782c + 1;
        this.f58782c = j3;
        if (j3 > this.f58781b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}
