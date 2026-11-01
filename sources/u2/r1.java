package u2;

import e9.x1;
public final class r1 {
    public static final r1 d = new r1(new b2.p1[0]);
    public static final String e;
    public final int f50007a;
    public final x1 f50008b;
    public int f50009c;

    static {
        String str = e2.l0.f6165a;
        e = Integer.toString(0, 36);
    }

    public r1(b2.p1... p1VarArr) {
        x1 v = e9.n0.v(p1VarArr);
        this.f50008b = v;
        this.f50007a = p1VarArr.length;
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
        return (b2.p1) this.f50008b.get(i10);
    }

    public final int b(b2.p1 p1Var) {
        int indexOf = this.f50008b.indexOf(p1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f50007a == r1Var.f50007a && this.f50008b.equals(r1Var.f50008b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f50009c == 0) {
            this.f50009c = this.f50008b.hashCode();
        }
        return this.f50009c;
    }

    public final String toString() {
        return this.f50008b.toString();
    }
}
