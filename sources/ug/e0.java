package ug;
public class e0 {
    public final int f58066a;
    public final int f58067b;
    public final String f58068c;
    public final String d;
    public final int f58069e;
    public boolean f58070f;

    public e0(int i7, int i10, int i11, String str, String str2) {
        this.f58066a = i7;
        this.f58067b = i10;
        this.f58068c = str;
        this.d = str2;
        this.f58069e = i11;
    }

    public static e0 a(int i7, int i10) {
        return new e0(i7, i10, -1, null, null);
    }

    public static e0 b(int i7, int i10, String str) {
        return new e0(i7, -1, i10, null, str);
    }
}
