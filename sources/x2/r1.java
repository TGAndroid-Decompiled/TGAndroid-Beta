package x2;
public final class r1 {
    public static final r1 d = new r1(new e2.m1[0]);
    public static final String f60340e;
    public final int f60341a;
    public final h9.s1 f60342b;
    public int f60343c;

    static {
        String str = h2.l0.f13778a;
        f60340e = Integer.toString(0, 36);
    }

    public r1(e2.m1... m1VarArr) {
        h9.s1 r10 = h9.i0.r(m1VarArr);
        this.f60342b = r10;
        this.f60341a = m1VarArr.length;
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
        return (e2.m1) this.f60342b.get(i7);
    }

    public final int b(e2.m1 m1Var) {
        int indexOf = this.f60342b.indexOf(m1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f60341a == r1Var.f60341a && this.f60342b.equals(r1Var.f60342b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f60343c == 0) {
            this.f60343c = this.f60342b.hashCode();
        }
        return this.f60343c;
    }

    public final String toString() {
        return this.f60342b.toString();
    }
}
