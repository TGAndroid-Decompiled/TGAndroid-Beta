package rg;
public class e0 {
    public final int f47236a;
    public final int f47237b;
    public final String f47238c;
    public final String d;
    public final int f47239e;
    public boolean f47240f;

    public e0(int i10, int i11, int i12, String str, String str2) {
        this.f47236a = i10;
        this.f47237b = i11;
        this.f47238c = str;
        this.d = str2;
        this.f47239e = i12;
    }

    public static e0 a(int i10, int i11) {
        return new e0(i10, i11, -1, null, null);
    }

    public static e0 b(int i10, int i11, String str) {
        return new e0(i10, -1, i11, null, str);
    }
}
