package u2;
public final class p1 {
    public static final p1 d = new p1(new b2.l1[0]);
    public static final String e;
    public final int f43749a;
    public final e9.a1 f43750b;
    public int f43751c;

    static {
        String str = e2.d0.f7870a;
        e = Integer.toString(0, 36);
    }

    public p1(b2.l1... l1VarArr) {
        e9.a1 w10 = e9.i0.w(l1VarArr);
        this.f43750b = w10;
        this.f43749a = l1VarArr.length;
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
        return (b2.l1) this.f43750b.get(i10);
    }

    public final int b(b2.l1 l1Var) {
        int indexOf = this.f43750b.indexOf(l1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p1.class == obj.getClass()) {
                p1 p1Var = (p1) obj;
                if (this.f43749a == p1Var.f43749a && this.f43750b.equals(p1Var.f43750b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f43751c == 0) {
            this.f43751c = this.f43750b.hashCode();
        }
        return this.f43751c;
    }

    public final String toString() {
        return this.f43750b.toString();
    }
}
