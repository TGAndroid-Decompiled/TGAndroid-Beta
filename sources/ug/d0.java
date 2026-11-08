package ug;
public class d0 {
    public final int f56543a;
    public final int f56544b;
    public final String f56545c;
    public final String d;
    public final int f56546e;
    public boolean f56547f;

    public d0(int i7, int i10, int i11, String str, String str2) {
        this.f56543a = i7;
        this.f56544b = i10;
        this.f56545c = str;
        this.d = str2;
        this.f56546e = i11;
    }

    public static d0 a(int i7, int i10) {
        return new d0(i7, i10, -1, null, null);
    }

    public static d0 b(int i7, int i10, String str) {
        return new d0(i7, -1, i10, null, str);
    }
}
