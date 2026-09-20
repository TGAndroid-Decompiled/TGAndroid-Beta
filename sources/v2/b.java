package v2;

import java.util.NoSuchElementException;
public abstract class b implements l {
    public final long f44126a;
    public final long f44127b;
    public long f44128c;

    public b(long j3, long j10) {
        this.f44126a = j3;
        this.f44127b = j10;
        this.f44128c = j3 - 1;
    }

    public final void b() {
        long j3 = this.f44128c;
        if (j3 >= this.f44126a && j3 <= this.f44127b) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final boolean next() {
        boolean z10;
        long j3 = this.f44128c + 1;
        this.f44128c = j3;
        if (j3 > this.f44127b) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }
}
