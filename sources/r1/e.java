package r1;
public final class e {
    public final long f44880a;
    public final long f44881b;

    public e(long j10, long j11) {
        if (j11 == 0) {
            this.f44880a = 0L;
            this.f44881b = 1L;
            return;
        }
        this.f44880a = j10;
        this.f44881b = j11;
    }

    public final String toString() {
        return this.f44880a + "/" + this.f44881b;
    }
}
