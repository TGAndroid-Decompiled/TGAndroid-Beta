package r1;
public final class e {
    public final long f41854a;
    public final long f41855b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f41854a = 0L;
            this.f41855b = 1L;
            return;
        }
        this.f41854a = j3;
        this.f41855b = j10;
    }

    public final String toString() {
        return this.f41854a + "/" + this.f41855b;
    }
}
