package r1;
public final class e {
    public final long f41898a;
    public final long f41899b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f41898a = 0L;
            this.f41899b = 1L;
            return;
        }
        this.f41898a = j3;
        this.f41899b = j10;
    }

    public final String toString() {
        return this.f41898a + "/" + this.f41899b;
    }
}
