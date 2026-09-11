package u2;
public final class o1 {
    public static final o1 d = new o1(new b2.l1[0]);
    public static final String f46772e;
    public final int f46773a;
    public final e9.a1 f46774b;
    public int f46775c;

    static {
        String str = e2.d0.f8737a;
        f46772e = Integer.toString(0, 36);
    }

    public o1(b2.l1... l1VarArr) {
        e9.a1 w10 = e9.i0.w(l1VarArr);
        this.f46774b = w10;
        this.f46773a = l1VarArr.length;
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
        return (b2.l1) this.f46774b.get(i10);
    }

    public final int b(b2.l1 l1Var) {
        int indexOf = this.f46774b.indexOf(l1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && o1.class == obj.getClass()) {
                o1 o1Var = (o1) obj;
                if (this.f46773a == o1Var.f46773a && this.f46774b.equals(o1Var.f46774b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f46775c == 0) {
            this.f46775c = this.f46774b.hashCode();
        }
        return this.f46775c;
    }

    public final String toString() {
        return this.f46774b.toString();
    }
}
