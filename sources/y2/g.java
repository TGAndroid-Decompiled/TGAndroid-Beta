package y2;
public final class g {
    public final int f46307a;
    public final int f46308b;
    public final int f46309c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46307a = i10;
        this.f46308b = i11;
        this.f46309c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46307a - this.f46308b <= 1) {
                return false;
            }
        } else if (this.f46309c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
