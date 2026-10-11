package rg;
public class e0 {
    public final int f47326a;
    public final int f47327b;
    public final String f47328c;
    public final String d;
    public final int f47329e;
    public boolean f47330f;

    public e0(int i10, int i11, int i12, String str, String str2) {
        this.f47326a = i10;
        this.f47327b = i11;
        this.f47328c = str;
        this.d = str2;
        this.f47329e = i12;
    }

    public static e0 a(int i10, int i11) {
        return new e0(i10, i11, -1, null, null);
    }

    public static e0 b(int i10, int i11, String str) {
        return new e0(i10, -1, i11, null, str);
    }
}
