package vg;
public class d0 {
    public final int f56588a;
    public final int f56589b;
    public final String f56590c;
    public final String d;
    public final int f56591e;
    public boolean f56592f;

    public d0(int i3, int i10, int i11, String str, String str2) {
        this.f56588a = i3;
        this.f56589b = i10;
        this.f56590c = str;
        this.d = str2;
        this.f56591e = i11;
    }

    public static d0 a(int i3, int i10) {
        return new d0(i3, i10, -1, null, null);
    }

    public static d0 b(int i3, int i10, String str) {
        return new d0(i3, -1, i10, null, str);
    }
}
