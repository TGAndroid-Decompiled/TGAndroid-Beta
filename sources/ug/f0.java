package ug;
public class f0 {
    public final int f58691a;
    public final int f58692b;
    public final String f58693c;
    public final String d;
    public final int f58694e;
    public boolean f58695f;

    public f0(int i7, int i10, int i11, String str, String str2) {
        this.f58691a = i7;
        this.f58692b = i10;
        this.f58693c = str;
        this.d = str2;
        this.f58694e = i11;
    }

    public static f0 a(int i7, int i10) {
        return new f0(i7, i10, -1, null, null);
    }

    public static f0 b(int i7, int i10, String str) {
        return new f0(i7, -1, i10, null, str);
    }
}
