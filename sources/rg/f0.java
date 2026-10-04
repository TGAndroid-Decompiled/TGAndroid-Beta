package rg;
public class f0 {
    public final int f46102a;
    public final int f46103b;
    public final String f46104c;
    public final String d;
    public final int f46105e;
    public boolean f46106f;

    public f0(int i10, int i11, int i12, String str, String str2) {
        this.f46102a = i10;
        this.f46103b = i11;
        this.f46104c = str;
        this.d = str2;
        this.f46105e = i12;
    }

    public static f0 a(int i10, int i11) {
        return new f0(i10, i11, -1, null, null);
    }

    public static f0 b(int i10, int i11, String str) {
        return new f0(i10, -1, i11, null, str);
    }
}
