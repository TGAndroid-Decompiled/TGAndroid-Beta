package r1;
public final class e {
    public final long f46919a;
    public final long f46920b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f46919a = 0L;
            this.f46920b = 1L;
            return;
        }
        this.f46919a = j3;
        this.f46920b = j10;
    }

    public final String toString() {
        return this.f46919a + "/" + this.f46920b;
    }
}
