package rg;
public class e0 {
    public final int f47360a;
    public final int f47361b;
    public final String f47362c;
    public final String d;
    public final int f47363e;
    public boolean f47364f;

    public e0(int i10, int i11, int i12, String str, String str2) {
        this.f47360a = i10;
        this.f47361b = i11;
        this.f47362c = str;
        this.d = str2;
        this.f47363e = i12;
    }

    public static e0 a(int i10, int i11) {
        return new e0(i10, i11, -1, null, null);
    }

    public static e0 b(int i10, int i11, String str) {
        return new e0(i10, -1, i11, null, str);
    }
}
