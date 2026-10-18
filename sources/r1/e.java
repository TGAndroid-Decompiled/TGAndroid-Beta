package r1;
public final class e {
    public final long f44872a;
    public final long f44873b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f44872a = 0L;
            this.f44873b = 1L;
            return;
        }
        this.f44872a = j10;
        this.f44873b = j11;
    }

    public final String toString() {
        return this.f44872a + "/" + this.f44873b;
    }
}
