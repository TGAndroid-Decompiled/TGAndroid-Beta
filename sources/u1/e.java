package u1;
public final class e {
    public final long f56079a;
    public final long f56080b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f56079a = 0L;
            this.f56080b = 1L;
            return;
        }
        this.f56079a = j3;
        this.f56080b = j10;
    }

    public final String toString() {
        return this.f56079a + "/" + this.f56080b;
    }
}
