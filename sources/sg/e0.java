package sg;
public class e0 {
    public final int f46244a;
    public final int f46245b;
    public final String f46246c;
    public final String d;
    public final int e;
    public boolean f46247f;

    public e0(int i10, int i11, int i12, String str, String str2) {
        this.f46244a = i10;
        this.f46245b = i11;
        this.f46246c = str;
        this.d = str2;
        this.e = i12;
    }

    public static e0 a(int i10, int i11) {
        return new e0(i10, i11, -1, null, null);
    }

    public static e0 b(int i10, int i11, String str) {
        return new e0(i10, -1, i11, null, str);
    }
}
