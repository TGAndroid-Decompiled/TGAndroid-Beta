package u1;
public final class e {
    public final long f58316a;
    public final long f58317b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f58316a = 0L;
            this.f58317b = 1L;
            return;
        }
        this.f58316a = j3;
        this.f58317b = j10;
    }

    public final String toString() {
        return this.f58316a + "/" + this.f58317b;
    }
}
