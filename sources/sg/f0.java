package sg;
public class f0 {
    public final int f46254a;
    public final int f46255b;
    public final String f46256c;
    public final String d;
    public final int e;
    public boolean f46257f;

    public f0(int i10, int i11, int i12, String str, String str2) {
        this.f46254a = i10;
        this.f46255b = i11;
        this.f46256c = str;
        this.d = str2;
        this.e = i12;
    }

    public static f0 a(int i10, int i11) {
        return new f0(i10, i11, -1, null, null);
    }

    public static f0 b(int i10, int i11, String str) {
        return new f0(i10, -1, i11, null, str);
    }
}
