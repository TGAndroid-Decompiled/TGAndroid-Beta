package u2;
public final class r1 {
    public static final r1 d = new r1(new b2.q1[0]);
    public static final String e;
    public final int f49450a;
    public final f9.s1 f49451b;
    public int f49452c;

    static {
        String str = e2.n0.f9691a;
        e = Integer.toString(0, 36);
    }

    public r1(b2.q1... q1VarArr) {
        f9.s1 v = f9.i0.v(q1VarArr);
        this.f49451b = v;
        this.f49450a = q1VarArr.length;
        int i10 = 0;
        while (i10 < v.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < v.d; i12++) {
                if (((b2.q1) v.get(i10)).equals(v.get(i12))) {
                    e2.a.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final b2.q1 a(int i10) {
        return (b2.q1) this.f49451b.get(i10);
    }

    public final int b(b2.q1 q1Var) {
        int indexOf = this.f49451b.indexOf(q1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f49450a == r1Var.f49450a && this.f49451b.equals(r1Var.f49451b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f49452c == 0) {
            this.f49452c = this.f49451b.hashCode();
        }
        return this.f49452c;
    }

    public final String toString() {
        return this.f49451b.toString();
    }
}
