package v2;

import java.util.NoSuchElementException;
public abstract class b implements m {
    public final long f49987a;
    public final long f49988b;
    public long f49989c;

    public b(long j10, long j11) {
        this.f49987a = j10;
        this.f49988b = j11;
        this.f49989c = j10 - 1;
    }

    public final void a() {
        long j10 = this.f49989c;
        if (j10 >= this.f49987a && j10 <= this.f49988b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j10 = this.f49989c + 1;
        this.f49989c = j10;
        if (j10 > this.f49988b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
