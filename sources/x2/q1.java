package x2;

import h9.t1;
public final class q1 {
    public static final q1 d = new q1(new e2.m1[0]);
    public static final String f58353e;
    public final int f58354a;
    public final t1 f58355b;
    public int f58356c;

    static {
        String str = h2.m0.f14112a;
        f58353e = Integer.toString(0, 36);
    }

    public q1(e2.m1... m1VarArr) {
        t1 r10 = h9.i0.r(m1VarArr);
        this.f58355b = r10;
        this.f58354a = m1VarArr.length;
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
        return (e2.m1) this.f58355b.get(i7);
    }

    public final int b(e2.m1 m1Var) {
        int indexOf = this.f58355b.indexOf(m1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && q1.class == obj.getClass()) {
                q1 q1Var = (q1) obj;
                if (this.f58354a == q1Var.f58354a && this.f58355b.equals(q1Var.f58355b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f58356c == 0) {
            this.f58356c = this.f58355b.hashCode();
        }
        return this.f58356c;
    }

    public final String toString() {
        return this.f58355b.toString();
    }
}
