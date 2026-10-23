package r1;
public final class e {
    public final long f44884a;
    public final long f44885b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f44884a = 0L;
            this.f44885b = 1L;
            return;
        }
        this.f44884a = j10;
        this.f44885b = j11;
    }

    public final String toString() {
        return this.f44884a + "/" + this.f44885b;
    }
}
