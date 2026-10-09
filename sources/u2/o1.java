package u2;
public final class o1 {
    public static final o1 d = new o1(new b2.l1[0]);
    public static final String f48673e;
    public final int f48674a;
    public final e9.a1 f48675b;
    public int f48676c;

    static {
        String str = e2.d0.f8532a;
        f48673e = Integer.toString(0, 36);
    }

    public o1(b2.l1... l1VarArr) {
        e9.a1 w10 = e9.i0.w(l1VarArr);
        this.f48675b = w10;
        this.f48674a = l1VarArr.length;
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
        return (b2.l1) this.f48675b.get(i10);
    }

    public final int b(b2.l1 l1Var) {
        int indexOf = this.f48675b.indexOf(l1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o1.class == obj.getClass()) {
                o1 o1Var = (o1) obj;
                if (this.f48674a == o1Var.f48674a && this.f48675b.equals(o1Var.f48675b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f48676c == 0) {
            this.f48676c = this.f48675b.hashCode();
        }
        return this.f48676c;
    }

    public final String toString() {
        return this.f48675b.toString();
    }
}
