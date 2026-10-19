package u2;

import e9.x1;
public final class r1 {
    public static final r1 d = new r1(new b2.p1[0]);
    public static final String e;
    public final int f47419a;
    public final x1 f47420b;
    public int f47421c;

    static {
        String str = e2.m0.f8252a;
        e = Integer.toString(0, 36);
    }

    public r1(b2.p1... p1VarArr) {
        x1 v = e9.n0.v(p1VarArr);
        this.f47420b = v;
        this.f47419a = p1VarArr.length;
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
        return (b2.p1) this.f47420b.get(i10);
    }

    public final int b(b2.p1 p1Var) {
        int indexOf = this.f47420b.indexOf(p1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f47419a == r1Var.f47419a && this.f47420b.equals(r1Var.f47420b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f47421c == 0) {
            this.f47421c = this.f47420b.hashCode();
        }
        return this.f47421c;
    }

    public final String toString() {
        return this.f47420b.toString();
    }
}
