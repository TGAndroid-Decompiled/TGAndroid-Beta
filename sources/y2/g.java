package y2;
public final class g {
    public final int f46552a;
    public final int f46553b;
    public final int f46554c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46552a = i10;
        this.f46553b = i11;
        this.f46554c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46552a - this.f46553b <= 1) {
                return false;
            }
        } else if (this.f46554c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
