package u2;

import e9.x1;
public final class s1 {
    public static final s1 d = new s1(new b2.p1[0]);
    public static final String e;
    public final int f47433a;
    public final x1 f47434b;
    public int f47435c;

    static {
        String str = e2.m0.f8252a;
        e = Integer.toString(0, 36);
    }

    public s1(b2.p1... p1VarArr) {
        x1 v = e9.n0.v(p1VarArr);
        this.f47434b = v;
        this.f47433a = p1VarArr.length;
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
        return (b2.p1) this.f47434b.get(i10);
    }

    public final int b(b2.p1 p1Var) {
        int indexOf = this.f47434b.indexOf(p1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s1.class == obj.getClass()) {
                s1 s1Var = (s1) obj;
                if (this.f47433a == s1Var.f47433a && this.f47434b.equals(s1Var.f47434b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f47435c == 0) {
            this.f47435c = this.f47434b.hashCode();
        }
        return this.f47435c;
    }

    public final String toString() {
        return this.f47434b.toString();
    }
}
