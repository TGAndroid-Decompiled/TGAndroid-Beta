package x2;

import h9.t1;
public final class p1 {
    public static final p1 d = new p1(new e2.m1[0]);
    public static final String f58454e;
    public final int f58455a;
    public final t1 f58456b;
    public int f58457c;

    static {
        String str = h2.m0.f14114a;
        f58454e = Integer.toString(0, 36);
    }

    public p1(e2.m1... m1VarArr) {
        t1 r10 = h9.i0.r(m1VarArr);
        this.f58456b = r10;
        this.f58455a = m1VarArr.length;
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
        return (e2.m1) this.f58456b.get(i7);
    }

    public final int b(e2.m1 m1Var) {
        int indexOf = this.f58456b.indexOf(m1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p1.class == obj.getClass()) {
                p1 p1Var = (p1) obj;
                if (this.f58455a == p1Var.f58455a && this.f58456b.equals(p1Var.f58456b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f58457c == 0) {
            this.f58457c = this.f58456b.hashCode();
        }
        return this.f58457c;
    }

    public final String toString() {
        return this.f58456b.toString();
    }
}
