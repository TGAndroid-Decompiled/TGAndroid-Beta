package ug;
public class f0 {
    public final int f58660a;
    public final int f58661b;
    public final String f58662c;
    public final String d;
    public final int f58663e;
    public boolean f58664f;

    public f0(int i7, int i10, int i11, String str, String str2) {
        this.f58660a = i7;
        this.f58661b = i10;
        this.f58662c = str;
        this.d = str2;
        this.f58663e = i11;
    }

    public static f0 a(int i7, int i10) {
        return new f0(i7, i10, -1, null, null);
    }

    public static f0 b(int i7, int i10, String str) {
        return new f0(i7, -1, i10, null, str);
    }
}
