package u2;
public final class n1 {
    public static final n1 d = new n1(new b2.l1[0]);
    public static final String f48737e;
    public final int f48738a;
    public final e9.a1 f48739b;
    public int f48740c;

    static {
        String str = e2.d0.f8531a;
        f48737e = Integer.toString(0, 36);
    }

    public n1(b2.l1... l1VarArr) {
        e9.a1 w10 = e9.i0.w(l1VarArr);
        this.f48739b = w10;
        this.f48738a = l1VarArr.length;
        int i10 = 0;
        while (i10 < w10.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < w10.d; i12++) {
                if (((b2.l1) w10.get(i10)).equals(w10.get(i12))) {
                    e2.a.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final b2.l1 a(int i10) {
        return (b2.l1) this.f48739b.get(i10);
    }

    public final int b(b2.l1 l1Var) {
        int indexOf = this.f48739b.indexOf(l1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && n1.class == obj.getClass()) {
                n1 n1Var = (n1) obj;
                if (this.f48738a == n1Var.f48738a && this.f48739b.equals(n1Var.f48739b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f48740c == 0) {
            this.f48740c = this.f48739b.hashCode();
        }
        return this.f48740c;
    }

    public final String toString() {
        return this.f48739b.toString();
    }
}
