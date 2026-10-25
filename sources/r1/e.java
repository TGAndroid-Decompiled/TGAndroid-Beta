package r1;
public final class e {
    public final long f47160a;
    public final long f47161b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f47160a = 0L;
            this.f47161b = 1L;
            return;
        }
        this.f47160a = j10;
        this.f47161b = j11;
    }

    public final String toString() {
        return this.f47160a + "/" + this.f47161b;
    }
}
