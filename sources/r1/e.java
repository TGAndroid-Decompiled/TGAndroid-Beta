package r1;
public final class e {
    public final long f46953a;
    public final long f46954b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f46953a = 0L;
            this.f46954b = 1L;
            return;
        }
        this.f46953a = j3;
        this.f46954b = j10;
    }

    public final String toString() {
        return this.f46953a + "/" + this.f46954b;
    }
}
