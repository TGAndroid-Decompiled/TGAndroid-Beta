package x2;
public final class q1 {
    public static final q1 d = new q1(new e2.m1[0]);
    public static final String f59639e;
    public final int f59640a;
    public final h9.s1 f59641b;
    public int f59642c;

    static {
        String str = h2.l0.f13471a;
        f59639e = Integer.toString(0, 36);
    }

    public q1(e2.m1... m1VarArr) {
        h9.s1 r10 = h9.i0.r(m1VarArr);
        this.f59641b = r10;
        this.f59640a = m1VarArr.length;
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
        return (e2.m1) this.f59641b.get(i7);
    }

    public final int b(e2.m1 m1Var) {
        int indexOf = this.f59641b.indexOf(m1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && q1.class == obj.getClass()) {
                q1 q1Var = (q1) obj;
                if (this.f59640a == q1Var.f59640a && this.f59641b.equals(q1Var.f59641b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f59642c == 0) {
            this.f59642c = this.f59641b.hashCode();
        }
        return this.f59642c;
    }

    public final String toString() {
        return this.f59641b.toString();
    }
}
