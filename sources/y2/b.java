package y2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f60096a;
    public final long f60097b;
    public long f60098c;

    public b(long j3, long j10) {
        this.f60096a = j3;
        this.f60097b = j10;
        this.f60098c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f60098c;
        if (j3 >= this.f60096a && j3 <= this.f60097b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f60098c + 1;
        this.f60098c = j3;
        if (j3 > this.f60097b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
