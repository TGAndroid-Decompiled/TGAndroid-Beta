package u2;

import e9.x1;
public final class r1 {
    public static final r1 d = new r1(new b2.q1[0]);
    public static final String e;
    public final int f46033a;
    public final x1 f46034b;
    public int f46035c;

    static {
        String str = e2.m0.f8375a;
        e = Integer.toString(0, 36);
    }

    public r1(b2.q1... q1VarArr) {
        x1 v = e9.n0.v(q1VarArr);
        this.f46034b = v;
        this.f46033a = q1VarArr.length;
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
        return (b2.q1) this.f46034b.get(i10);
    }

    public final int b(b2.q1 q1Var) {
        int indexOf = this.f46034b.indexOf(q1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f46033a == r1Var.f46033a && this.f46034b.equals(r1Var.f46034b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f46035c == 0) {
            this.f46035c = this.f46034b.hashCode();
        }
        return this.f46035c;
    }

    public final String toString() {
        return this.f46034b.toString();
    }
}
