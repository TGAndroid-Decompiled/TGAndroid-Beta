package zf;
public class e0 {
    public final int f50492a;
    public final int f50493b;
    public final String f50494c;
    public final String d;
    public final int f50495e;
    public boolean f50496f;

    public e0(int i9, int i10, int i11, String str, String str2) {
        this.f50492a = i9;
        this.f50493b = i10;
        this.f50494c = str;
        this.d = str2;
        this.f50495e = i11;
    }

    public static e0 a(int i9, int i10) {
        return new e0(i9, i10, -1, null, null);
    }

    public static e0 b(int i9, int i10, String str) {
        return new e0(i9, -1, i10, null, str);
    }
}
