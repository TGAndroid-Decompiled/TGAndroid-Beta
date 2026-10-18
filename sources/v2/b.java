package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f47915a;
    public final long f47916b;
    public long f47917c;

    public b(long j10, long j11) {
        this.f47915a = j10;
        this.f47916b = j11;
        this.f47917c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f47917c;
        if (j10 >= this.f47915a && j10 <= this.f47916b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f47917c + 1;
        this.f47917c = j10;
        if (j10 > this.f47916b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
