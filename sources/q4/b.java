package q4;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44457a;
    public final long f44458b;
    public long f44459c;

    public b(long j10, long j11) {
        this.f44457a = j10;
        this.f44458b = j11;
        this.f44459c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f44459c;
        if (j10 >= this.f44457a && j10 <= this.f44458b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z4;
        long j10 = this.f44459c + 1;
        this.f44459c = j10;
        if (j10 > this.f44458b) {
            z4 = true;
        } else {
            z4 = false;
        }
        return !z4;
    }
}
