package u1;
public final class e {
    public final long f58281a;
    public final long f58282b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f58281a = 0L;
            this.f58282b = 1L;
            return;
        }
        this.f58281a = j3;
        this.f58282b = j10;
    }

    public final String toString() {
        return this.f58281a + "/" + this.f58282b;
    }
}
