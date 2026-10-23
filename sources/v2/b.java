package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f48317a;
    public final long f48318b;
    public long f48319c;

    public b(long j10, long j11) {
        this.f48317a = j10;
        this.f48318b = j11;
        this.f48319c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f48319c;
        if (j10 >= this.f48317a && j10 <= this.f48318b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f48319c + 1;
        this.f48319c = j10;
        if (j10 > this.f48318b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
