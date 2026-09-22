package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f43824a;
    public final long f43825b;
    public long f43826c;

    public b(long j3, long j10) {
        this.f43824a = j3;
        this.f43825b = j10;
        this.f43826c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f43826c;
        if (j3 >= this.f43824a && j3 <= this.f43825b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f43826c + 1;
        this.f43826c = j3;
        if (j3 > this.f43825b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
