package y2;
public final class g {
    public final int f46284a;
    public final int f46285b;
    public final int f46286c;
    public final int d;

    public g(int i10, int i11, int i12, int i13) {
        this.f46284a = i10;
        this.f46285b = i11;
        this.f46286c = i12;
        this.d = i13;
    }

    public final boolean a(int i10) {
        if (i10 == 1) {
            if (this.f46284a - this.f46285b <= 1) {
                return false;
            }
        } else if (this.f46286c - this.d <= 1) {
            return false;
        }
        return true;
    }
}
