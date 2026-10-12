package r1;
public final class e {
    public final long f47052a;
    public final long f47053b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f47052a = 0L;
            this.f47053b = 1L;
            return;
        }
        this.f47052a = j3;
        this.f47053b = j10;
    }

    public final String toString() {
        return this.f47052a + "/" + this.f47053b;
    }
}
