package u2;

import e9.x1;
public final class t1 {
    public static final t1 d = new t1(new b2.p1[0]);
    public static final String e;
    public final int f47887a;
    public final x1 f47888b;
    public int f47889c;

    static {
        String str = e2.m0.f8259a;
        e = Integer.toString(0, 36);
    }

    public t1(b2.p1... p1VarArr) {
        x1 v = e9.n0.v(p1VarArr);
        this.f47888b = v;
        this.f47887a = p1VarArr.length;
        int i10 = 0;
        while (i10 < v.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < v.d; i12++) {
                if (((b2.p1) v.get(i10)).equals(v.get(i12))) {
                    e2.a.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final b2.p1 a(int i10) {
        return (b2.p1) this.f47888b.get(i10);
    }

    public final int b(b2.p1 p1Var) {
        int indexOf = this.f47888b.indexOf(p1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && t1.class == obj.getClass()) {
                t1 t1Var = (t1) obj;
                if (this.f47887a == t1Var.f47887a && this.f47888b.equals(t1Var.f47888b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f47889c == 0) {
            this.f47889c = this.f47888b.hashCode();
        }
        return this.f47889c;
    }

    public final String toString() {
        return this.f47888b.toString();
    }
}
