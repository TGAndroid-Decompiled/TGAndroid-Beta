package u1;
public final class e {
    public final long f56192a;
    public final long f56193b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f56192a = 0L;
            this.f56193b = 1L;
            return;
        }
        this.f56192a = j3;
        this.f56193b = j10;
    }

    public final String toString() {
        return this.f56192a + "/" + this.f56193b;
    }
}
