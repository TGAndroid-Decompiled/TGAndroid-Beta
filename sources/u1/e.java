package u1;
public final class e {
    public final long f58396a;
    public final long f58397b;

    public e(long j3, long j10) {
        if (j10 == 0) {
            this.f58396a = 0L;
            this.f58397b = 1L;
            return;
        }
        this.f58396a = j3;
        this.f58397b = j10;
    }

    public final String toString() {
        return this.f58396a + "/" + this.f58397b;
    }
}
