package r1;
public final class e {
    public final long f44870a;
    public final long f44871b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f44870a = 0L;
            this.f44871b = 1L;
            return;
        }
        this.f44870a = j10;
        this.f44871b = j11;
    }

    public final String toString() {
        return this.f44870a + "/" + this.f44871b;
    }
}
