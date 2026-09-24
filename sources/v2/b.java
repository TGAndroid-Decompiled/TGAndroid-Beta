package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44096a;
    public final long f44097b;
    public long f44098c;

    public b(long j3, long j10) {
        this.f44096a = j3;
        this.f44097b = j10;
        this.f44098c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f44098c;
        if (j3 >= this.f44096a && j3 <= this.f44097b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f44098c + 1;
        this.f44098c = j3;
        if (j3 > this.f44097b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
