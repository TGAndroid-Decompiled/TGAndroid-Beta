package w3;
public final class d0 {
    public final String f48525a;
    public final int f48526b;
    public final int f48527c;
    public int d;
    public String f48528e;

    public d0(int i9, int i10) {
        this(Integer.MIN_VALUE, i9, i10);
    }

    public final void a() {
        int i9;
        int i10 = this.d;
        if (i10 == Integer.MIN_VALUE) {
            i9 = this.f48526b;
        } else {
            i9 = i10 + this.f48527c;
        }
        this.d = i9;
        this.f48528e = this.f48525a + this.d;
    }

    public final void b() {
        if (this.d != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public d0(int i9, int i10, int i11) {
        String str;
        if (i9 == Integer.MIN_VALUE) {
            str = "";
        } else {
            str = ta.b.c(i9, "/");
        }
        this.f48525a = str;
        this.f48526b = i10;
        this.f48527c = i11;
        this.d = Integer.MIN_VALUE;
        this.f48528e = "";
    }
}
