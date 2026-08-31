package r1;
public final class e {
    public final long f46503a;
    public final long f46504b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f46503a = 0L;
            this.f46504b = 1L;
            return;
        }
        this.f46503a = j10;
        this.f46504b = j11;
    }

    public final String toString() {
        return this.f46503a + "/" + this.f46504b;
    }
}
