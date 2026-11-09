package u1;
public final class e {
    public final long f56205a;
    public final long f56206b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f56205a = 0L;
            this.f56206b = 1L;
            return;
        }
        this.f56205a = j3;
        this.f56206b = j10;
    }

    public final String toString() {
        return this.f56205a + "/" + this.f56206b;
    }
}
