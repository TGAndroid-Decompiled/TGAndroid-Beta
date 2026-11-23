package x2;
public final class r1 {
    public static final r1 d = new r1(new e2.m1[0]);
    public static final String f60257e;
    public final int f60258a;
    public final h9.t1 f60259b;
    public int f60260c;

    static {
        String str = h2.l0.f13815a;
        f60257e = Integer.toString(0, 36);
    }

    public r1(e2.m1... m1VarArr) {
        h9.t1 r10 = h9.i0.r(m1VarArr);
        this.f60259b = r10;
        this.f60258a = m1VarArr.length;
        int i7 = 0;
        while (i7 < r10.d) {
            int i10 = i7 + 1;
            for (int i11 = i10; i11 < r10.d; i11++) {
                if (((e2.m1) r10.get(i7)).equals(r10.get(i11))) {
                    h2.a.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i10;
        }
    }

    public final e2.m1 a(int i7) {
        return (e2.m1) this.f60259b.get(i7);
    }

    public final int b(e2.m1 m1Var) {
        int indexOf = this.f60259b.indexOf(m1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f60258a == r1Var.f60258a && this.f60259b.equals(r1Var.f60259b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f60260c == 0) {
            this.f60260c = this.f60259b.hashCode();
        }
        return this.f60260c;
    }

    public final String toString() {
        return this.f60259b.toString();
    }
}
