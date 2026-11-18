package u1;
public final class e {
    public final long f58270a;
    public final long f58271b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f58270a = 0L;
            this.f58271b = 1L;
            return;
        }
        this.f58270a = j3;
        this.f58271b = j10;
    }

    public final String toString() {
        return this.f58270a + "/" + this.f58271b;
    }
}
