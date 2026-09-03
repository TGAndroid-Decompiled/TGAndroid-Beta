package q4;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44488a;
    public final long f44489b;
    public long f44490c;

    public b(long j10, long j11) {
        this.f44488a = j10;
        this.f44489b = j11;
        this.f44490c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f44490c;
        if (j10 >= this.f44488a && j10 <= this.f44489b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z4;
        long j10 = this.f44490c + 1;
        this.f44490c = j10;
        if (j10 > this.f44489b) {
            z4 = true;
        } else {
            z4 = false;
        }
        return !z4;
    }
}
