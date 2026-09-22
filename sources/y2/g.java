package y2;
public final class g {
    public final int f46280a;
    public final int f46281b;
    public final int f46282c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46280a = i10;
        this.f46281b = i11;
        this.f46282c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46280a - this.f46281b <= 1) {
                return false;
            }
        } else if (this.f46282c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
