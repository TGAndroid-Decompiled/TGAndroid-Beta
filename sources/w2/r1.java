package w2;
public final class r1 {
    public static final r1 d = new r1(new d2.o1[0]);
    public static final String f57205e;
    public final int f57206a;
    public final g9.s1 f57207b;
    public int f57208c;

    static {
        String str = g2.n0.f11873a;
        f57205e = Integer.toString(0, 36);
    }

    public r1(d2.o1... o1VarArr) {
        g9.s1 r5 = g9.i0.r(o1VarArr);
        this.f57207b = r5;
        this.f57206a = o1VarArr.length;
        int i3 = 0;
        while (i3 < r5.d) {
            int i10 = i3 + 1;
            for (int i11 = i10; i11 < r5.d; i11++) {
                if (((d2.o1) r5.get(i3)).equals(r5.get(i11))) {
                    g2.a.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i3 = i10;
        }
    }

    public final d2.o1 a(int i3) {
        return (d2.o1) this.f57207b.get(i3);
    }

    public final int b(d2.o1 o1Var) {
        int indexOf = this.f57207b.indexOf(o1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r1.class == obj.getClass()) {
                r1 r1Var = (r1) obj;
                if (this.f57206a == r1Var.f57206a && this.f57207b.equals(r1Var.f57207b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f57208c == 0) {
            this.f57208c = this.f57207b.hashCode();
        }
        return this.f57208c;
    }

    public final String toString() {
        return this.f57207b.toString();
    }
}
