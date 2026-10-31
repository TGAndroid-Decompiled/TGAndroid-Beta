package r1;
public final class e {
    public final long f46179a;
    public final long f46180b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f46179a = 0L;
            this.f46180b = 1L;
            return;
        }
        this.f46179a = j10;
        this.f46180b = j11;
    }

    public final String toString() {
        return this.f46179a + "/" + this.f46180b;
    }
}
