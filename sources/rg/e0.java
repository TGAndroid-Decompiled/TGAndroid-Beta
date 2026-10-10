package rg;
public class e0 {
    public final int f47280a;
    public final int f47281b;
    public final String f47282c;
    public final String d;
    public final int f47283e;
    public boolean f47284f;

    public e0(int i10, int i11, int i12, String str, String str2) {
        this.f47280a = i10;
        this.f47281b = i11;
        this.f47282c = str;
        this.d = str2;
        this.f47283e = i12;
    }

    public static e0 a(int i10, int i11) {
        return new e0(i10, i11, -1, null, null);
    }

    public static e0 b(int i10, int i11, String str) {
        return new e0(i10, -1, i11, null, str);
    }
}
