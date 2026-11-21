package x2;
public final class r1 {
    public static final r1 d = new r1(new e2.m1[0]);
    public static final String f60253e;
    public final int f60254a;
    public final h9.t1 f60255b;
    public int f60256c;

    static {
        String str = h2.l0.f13812a;
        f60253e = Integer.toString(0, 36);
    }

    public r1(e2.m1... m1VarArr) {
        h9.t1 r10 = h9.i0.r(m1VarArr);
        this.f60255b = r10;
        this.f60254a = m1VarArr.length;
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
        return (e2.m1) this.f60255b.get(i7);
    }

    public final int b(e2.m1 m1Var) {
        int indexOf = this.f60255b.indexOf(m1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f60254a == r1Var.f60254a && this.f60255b.equals(r1Var.f60255b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f60256c == 0) {
            this.f60256c = this.f60255b.hashCode();
        }
        return this.f60256c;
    }

    public final String toString() {
        return this.f60255b.toString();
    }
}
