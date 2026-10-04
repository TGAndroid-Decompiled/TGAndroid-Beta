package rg;
public class f0 {
    public final int f46110a;
    public final int f46111b;
    public final String f46112c;
    public final String d;
    public final int f46113e;
    public boolean f46114f;

    public f0(int i10, int i11, int i12, String str, String str2) {
        this.f46110a = i10;
        this.f46111b = i11;
        this.f46112c = str;
        this.d = str2;
        this.f46113e = i12;
    }

    public static f0 a(int i10, int i11) {
        return new f0(i10, i11, -1, null, null);
    }

    public static f0 b(int i10, int i11, String str) {
        return new f0(i10, -1, i11, null, str);
    }
}
