package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f58781a;
    public final long f58782b;
    public long f58783c;

    public b(long j3, long j10) {
        this.f58781a = j3;
        this.f58782b = j10;
        this.f58783c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f58783c;
        if (j3 >= this.f58781a && j3 <= this.f58782b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z9;
        long j3 = this.f58783c + 1;
        this.f58783c = j3;
        if (j3 > this.f58782b) {
            z9 = true;
        } else {
            z9 = false;
        }
        return !z9;
    }
}
