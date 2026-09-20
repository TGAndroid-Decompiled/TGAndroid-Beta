package r1;
public final class e {
    public final long f42201a;
    public final long f42202b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f42201a = 0L;
            this.f42202b = 1L;
            return;
        }
        this.f42201a = j3;
        this.f42202b = j10;
    }

    public final String toString() {
        return this.f42201a + "/" + this.f42202b;
    }
}
