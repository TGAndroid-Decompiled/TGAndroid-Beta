package u1;
public final class e {
    public final long f56193a;
    public final long f56194b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f56193a = 0L;
            this.f56194b = 1L;
            return;
        }
        this.f56193a = j3;
        this.f56194b = j10;
    }

    public final String toString() {
        return this.f56193a + "/" + this.f56194b;
    }
}
