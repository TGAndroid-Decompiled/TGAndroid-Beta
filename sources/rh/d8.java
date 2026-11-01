package rh;
public final class d8 implements Runnable {
    public final long f46779a;
    public final int f46780b;
    public final int f46781c;
    public final boolean d;

    public d8(int i10, int i11, long j10, boolean z10) {
        this.f46779a = j10;
        this.f46780b = i10;
        this.f46781c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j10 = this.f46779a;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f46780b;
        int i12 = this.f46781c;
        if (i10 != 0) {
            r.g(i11).p(i12, j10);
        } else {
            e6.y(i11, this.d).W(i12);
        }
    }
}
