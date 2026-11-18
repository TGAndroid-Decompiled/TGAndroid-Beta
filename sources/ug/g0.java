package ug;
public class g0 {
    public final int f58659a;
    public final int f58660b;
    public final String f58661c;
    public final String d;
    public final int f58662e;
    public boolean f58663f;

    public g0(int i7, int i10, int i11, String str, String str2) {
        this.f58659a = i7;
        this.f58660b = i10;
        this.f58661c = str;
        this.d = str2;
        this.f58662e = i11;
    }

    public static g0 a(int i7, int i10) {
        return new g0(i7, i10, -1, null, null);
    }

    public static g0 b(int i7, int i10, String str) {
        return new g0(i7, -1, i10, null, str);
    }
}
