package u1;
public final class e {
    public final long f58271a;
    public final long f58272b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f58271a = 0L;
            this.f58272b = 1L;
            return;
        }
        this.f58271a = j3;
        this.f58272b = j10;
    }

    public final String toString() {
        return this.f58271a + "/" + this.f58272b;
    }
}
