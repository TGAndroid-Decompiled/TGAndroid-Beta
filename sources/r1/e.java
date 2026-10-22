package r1;
public final class e {
    public final long f44883a;
    public final long f44884b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f44883a = 0L;
            this.f44884b = 1L;
            return;
        }
        this.f44883a = j10;
        this.f44884b = j11;
    }

    public final String toString() {
        return this.f44883a + "/" + this.f44884b;
    }
}
