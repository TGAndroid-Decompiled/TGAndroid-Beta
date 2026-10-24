package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f48316a;
    public final long f48317b;
    public long f48318c;

    public b(long j10, long j11) {
        this.f48316a = j10;
        this.f48317b = j11;
        this.f48318c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f48318c;
        if (j10 >= this.f48316a && j10 <= this.f48317b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f48318c + 1;
        this.f48318c = j10;
        if (j10 > this.f48317b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
