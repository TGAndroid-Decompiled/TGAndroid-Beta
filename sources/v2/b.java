package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f47870a;
    public final long f47871b;
    public long f47872c;

    public b(long j10, long j11) {
        this.f47870a = j10;
        this.f47871b = j11;
        this.f47872c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f47872c;
        if (j10 >= this.f47870a && j10 <= this.f47871b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f47872c + 1;
        this.f47872c = j10;
        if (j10 > this.f47871b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
