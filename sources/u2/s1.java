package u2;

import e9.x1;
public final class s1 {
    public static final s1 d = new s1(new b2.p1[0]);
    public static final String e;
    public final int f47430a;
    public final x1 f47431b;
    public int f47432c;

    static {
        String str = e2.m0.f8252a;
        e = Integer.toString(0, 36);
    }

    public s1(b2.p1... p1VarArr) {
        x1 v = e9.n0.v(p1VarArr);
        this.f47431b = v;
        this.f47430a = p1VarArr.length;
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
        return (b2.p1) this.f47431b.get(i10);
    }

    public final int b(b2.p1 p1Var) {
        int indexOf = this.f47431b.indexOf(p1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s1.class == obj.getClass()) {
                s1 s1Var = (s1) obj;
                if (this.f47430a == s1Var.f47430a && this.f47431b.equals(s1Var.f47431b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f47432c == 0) {
            this.f47432c = this.f47431b.hashCode();
        }
        return this.f47432c;
    }

    public final String toString() {
        return this.f47431b.toString();
    }
}
