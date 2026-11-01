package r1;
public final class e {
    public final long f46190a;
    public final long f46191b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f46190a = 0L;
            this.f46191b = 1L;
            return;
        }
        this.f46190a = j10;
        this.f46191b = j11;
    }

    public final String toString() {
        return this.f46190a + "/" + this.f46191b;
    }
}
