package u1;
public final class e {
    public final long f56103a;
    public final long f56104b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f56103a = 0L;
            this.f56104b = 1L;
            return;
        }
        this.f56103a = j3;
        this.f56104b = j10;
    }

    public final String toString() {
        return this.f56103a + "/" + this.f56104b;
    }
}
