package r1;
public final class e {
    public final long f44918a;
    public final long f44919b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f44918a = 0L;
            this.f44919b = 1L;
            return;
        }
        this.f44918a = j10;
        this.f44919b = j11;
    }

    public final String toString() {
        return this.f44918a + "/" + this.f44919b;
    }
}
