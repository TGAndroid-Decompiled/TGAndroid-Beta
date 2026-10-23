package sg;
public class e0 {
    public final int f46671a;
    public final int f46672b;
    public final String f46673c;
    public final String d;
    public final int e;
    public boolean f46674f;

    public e0(int i10, int i11, int i12, String str, String str2) {
        this.f46671a = i10;
        this.f46672b = i11;
        this.f46673c = str;
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
