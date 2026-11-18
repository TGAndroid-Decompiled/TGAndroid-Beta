package x2;
public final class r1 {
    public static final r1 d = new r1(new e2.m1[0]);
    public static final String f60211e;
    public final int f60212a;
    public final h9.t1 f60213b;
    public int f60214c;

    static {
        String str = h2.l0.f13786a;
        f60211e = Integer.toString(0, 36);
    }

    public r1(e2.m1... m1VarArr) {
        h9.t1 r10 = h9.i0.r(m1VarArr);
        this.f60213b = r10;
        this.f60212a = m1VarArr.length;
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
        return (e2.m1) this.f60213b.get(i7);
    }

    public final int b(e2.m1 m1Var) {
        int indexOf = this.f60213b.indexOf(m1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f60212a == r1Var.f60212a && this.f60213b.equals(r1Var.f60213b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f60214c == 0) {
            this.f60214c = this.f60213b.hashCode();
        }
        return this.f60214c;
    }

    public final String toString() {
        return this.f60213b.toString();
    }
}
