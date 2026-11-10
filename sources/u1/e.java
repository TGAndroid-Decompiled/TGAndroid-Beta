package u1;
public final class e {
    public final long f56204a;
    public final long f56205b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f56204a = 0L;
            this.f56205b = 1L;
            return;
        }
        this.f56204a = j3;
        this.f56205b = j10;
    }

    public final String toString() {
        return this.f56204a + "/" + this.f56205b;
    }
}
