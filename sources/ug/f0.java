package ug;
public class f0 {
    public final int f58695a;
    public final int f58696b;
    public final String f58697c;
    public final String d;
    public final int f58698e;
    public boolean f58699f;

    public f0(int i7, int i10, int i11, String str, String str2) {
        this.f58695a = i7;
        this.f58696b = i10;
        this.f58697c = str;
        this.d = str2;
        this.f58698e = i11;
    }

    public static f0 a(int i7, int i10) {
        return new f0(i7, i10, -1, null, null);
    }

    public static f0 b(int i7, int i10, String str) {
        return new f0(i7, -1, i10, null, str);
    }
}
