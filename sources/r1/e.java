package r1;
public final class e {
    public final long f41929a;
    public final long f41930b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f41929a = 0L;
            this.f41930b = 1L;
            return;
        }
        this.f41929a = j3;
        this.f41930b = j10;
    }

    public final String toString() {
        return this.f41929a + "/" + this.f41930b;
    }
}
