package yh;
public final class k7 implements Runnable {
    public final long f53015a;
    public final int f53016b;
    public final int f53017c;
    public final boolean d;

    public k7(long j3, int i10, int i11, boolean z10) {
        this.f53015a = j3;
        this.f53016b = i10;
        this.f53017c = i11;
        this.d = z10;
    }

    @Override
    public final void run() {
        long j3 = this.f53015a;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f53016b;
        int i12 = this.f53017c;
        if (i10 != 0) {
            o.g(i11).p(i12, j3);
        } else {
            n5.y(i11, this.d).X(i12);
        }
    }
}
