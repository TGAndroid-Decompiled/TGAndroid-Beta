package r1;
public final class e {
    public final long f46873a;
    public final long f46874b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f46873a = 0L;
            this.f46874b = 1L;
            return;
        }
        this.f46873a = j3;
        this.f46874b = j10;
    }

    public final String toString() {
        return this.f46873a + "/" + this.f46874b;
    }
}
