package r1;
public final class e {
    public final long f41924a;
    public final long f41925b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f41924a = 0L;
            this.f41925b = 1L;
            return;
        }
        this.f41924a = j3;
        this.f41925b = j10;
    }

    public final String toString() {
        return this.f41924a + "/" + this.f41925b;
    }
}
