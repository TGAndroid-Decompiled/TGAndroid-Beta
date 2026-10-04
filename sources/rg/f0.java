package rg;
public class f0 {
    public final int f46103a;
    public final int f46104b;
    public final String f46105c;
    public final String d;
    public final int f46106e;
    public boolean f46107f;

    public f0(int i10, int i11, int i12, String str, String str2) {
        this.f46103a = i10;
        this.f46104b = i11;
        this.f46105c = str;
        this.d = str2;
        this.f46106e = i12;
    }

    public static f0 a(int i10, int i11) {
        return new f0(i10, i11, -1, null, null);
    }

    public static f0 b(int i10, int i11, String str) {
        return new f0(i10, -1, i11, null, str);
    }
}
