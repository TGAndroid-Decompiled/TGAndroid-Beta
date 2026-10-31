package u2;

import e9.x1;
public final class r1 {
    public static final r1 d = new r1(new b2.p1[0]);
    public static final String e;
    public final int f49993a;
    public final x1 f49994b;
    public int f49995c;

    static {
        String str = e2.l0.f6165a;
        e = Integer.toString(0, 36);
    }

    public r1(b2.p1... p1VarArr) {
        x1 v = e9.n0.v(p1VarArr);
        this.f49994b = v;
        this.f49993a = p1VarArr.length;
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
        return (b2.p1) this.f49994b.get(i10);
    }

    public final int b(b2.p1 p1Var) {
        int indexOf = this.f49994b.indexOf(p1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f49993a == r1Var.f49993a && this.f49994b.equals(r1Var.f49994b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f49995c == 0) {
            this.f49995c = this.f49994b.hashCode();
        }
        return this.f49995c;
    }

    public final String toString() {
        return this.f49994b.toString();
    }
}
