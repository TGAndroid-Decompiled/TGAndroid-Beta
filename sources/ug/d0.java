package ug;
public class d0 {
    public final int f56554a;
    public final int f56555b;
    public final String f56556c;
    public final String d;
    public final int f56557e;
    public boolean f56558f;

    public d0(int i7, int i10, int i11, String str, String str2) {
        this.f56554a = i7;
        this.f56555b = i10;
        this.f56556c = str;
        this.d = str2;
        this.f56557e = i11;
    }

    public static d0 a(int i7, int i10) {
        return new d0(i7, i10, -1, null, null);
    }

    public static d0 b(int i7, int i10, String str) {
        return new d0(i7, -1, i10, null, str);
    }
}
