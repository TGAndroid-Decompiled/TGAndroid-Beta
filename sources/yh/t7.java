package yh;
public final class t7 implements Runnable {
    public final long f47834a;
    public final int f47835b;
    public final int f47836c;
    public final boolean d;

    public t7(long j3, int i10, int i11, boolean z10) {
        this.f47834a = j3;
        this.f47835b = i10;
        this.f47836c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f47834a;
        int i10 = this.f47835b;
        int i11 = this.f47836c;
        if (j3 != 0) {
            o.g(i10).p(i11, j3);
        } else {
            v5.y(i10, this.d).X(i11);
        }
    }
}
