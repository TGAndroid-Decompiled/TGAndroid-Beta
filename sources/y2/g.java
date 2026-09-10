package y2;
public final class g {
    public final int f46433a;
    public final int f46434b;
    public final int f46435c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46433a = i10;
        this.f46434b = i11;
        this.f46435c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46433a - this.f46434b <= 1) {
                return false;
            }
        } else if (this.f46435c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
