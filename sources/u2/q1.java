package u2;

import e9.x1;
public final class q1 {
    public static final q1 d = new q1(new b2.p1[0]);
    public static final String e;
    public final int f47460a;
    public final x1 f47461b;
    public int f47462c;

    static {
        String str = e2.m0.f8255a;
        e = Integer.toString(0, 36);
    }

    public q1(b2.p1... p1VarArr) {
        x1 v = e9.n0.v(p1VarArr);
        this.f47461b = v;
        this.f47460a = p1VarArr.length;
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
        return (b2.p1) this.f47461b.get(i10);
    }

    public final int b(b2.p1 p1Var) {
        int indexOf = this.f47461b.indexOf(p1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && q1.class == obj.getClass()) {
                q1 q1Var = (q1) obj;
                if (this.f47460a == q1Var.f47460a && this.f47461b.equals(q1Var.f47461b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f47462c == 0) {
            this.f47462c = this.f47461b.hashCode();
        }
        return this.f47462c;
    }

    public final String toString() {
        return this.f47461b.toString();
    }
}
