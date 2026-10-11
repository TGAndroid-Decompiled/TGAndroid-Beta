package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f49155a;
    public final long f49156b;
    public long f49157c;

    public b(long j3, long j10) {
        this.f49155a = j3;
        this.f49156b = j10;
        this.f49157c = j3 - 1;
    }

    public final void a() {
        long j3 = this.f49157c;
        if (j3 >= this.f49155a && j3 <= this.f49156b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f49157c + 1;
        this.f49157c = j3;
        if (j3 > this.f49156b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
