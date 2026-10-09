package r1;
public final class e {
    public final long f46829a;
    public final long f46830b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f46829a = 0L;
            this.f46830b = 1L;
            return;
        }
        this.f46829a = j3;
        this.f46830b = j10;
    }

    public final String toString() {
        return this.f46829a + "/" + this.f46830b;
    }
}
