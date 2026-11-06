package u1;
public final class e {
    public final long f56104a;
    public final long f56105b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f56104a = 0L;
            this.f56105b = 1L;
            return;
        }
        this.f56104a = j3;
        this.f56105b = j10;
    }

    public final String toString() {
        return this.f56104a + "/" + this.f56105b;
    }
}
