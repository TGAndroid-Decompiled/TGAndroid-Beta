package r1;
public final class e {
    public final long f41121a;
    public final long f41122b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f41121a = 0L;
            this.f41122b = 1L;
            return;
        }
        this.f41121a = j3;
        this.f41122b = j10;
    }

    public final String toString() {
        return this.f41121a + "/" + this.f41122b;
    }
}
