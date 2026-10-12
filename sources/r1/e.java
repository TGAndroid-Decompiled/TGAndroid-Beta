package r1;
public final class e {
    public final long f47044a;
    public final long f47045b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f47044a = 0L;
            this.f47045b = 1L;
            return;
        }
        this.f47044a = j3;
        this.f47045b = j10;
    }

    public final String toString() {
        return this.f47044a + "/" + this.f47045b;
    }
}
