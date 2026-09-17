package sg;
public class f0 {
    public final int f46092a;
    public final int f46093b;
    public final String f46094c;
    public final String d;
    public final int f46095e;
    public boolean f46096f;

    public f0(int i10, int i11, int i12, String str, String str2) {
        this.f46092a = i10;
        this.f46093b = i11;
        this.f46094c = str;
        this.d = str2;
        this.f46095e = i12;
    }

    public static f0 a(int i10, int i11) {
        return new f0(i10, i11, -1, null, null);
    }

    public static f0 b(int i10, int i11, String str) {
        return new f0(i10, -1, i11, null, str);
    }
}
