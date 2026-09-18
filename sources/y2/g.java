package y2;
public final class g {
    public final int f46312a;
    public final int f46313b;
    public final int f46314c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46312a = i10;
        this.f46313b = i11;
        this.f46314c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46312a - this.f46313b <= 1) {
                return false;
            }
        } else if (this.f46314c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
