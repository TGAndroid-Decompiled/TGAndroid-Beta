package ug;
public class f0 {
    public final int f58775a;
    public final int f58776b;
    public final String f58777c;
    public final String d;
    public final int f58778e;
    public boolean f58779f;

    public f0(int i7, int i10, int i11, String str, String str2) {
        this.f58775a = i7;
        this.f58776b = i10;
        this.f58777c = str;
        this.d = str2;
        this.f58778e = i11;
    }

    public static f0 a(int i7, int i10) {
        return new f0(i7, i10, -1, null, null);
    }

    public static f0 b(int i7, int i10, String str) {
        return new f0(i7, -1, i10, null, str);
    }
}
