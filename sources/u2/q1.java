package u2;
public final class q1 {
    public static final q1 d = new q1(new b2.l1[0]);
    public static final String e;
    public final int f42436a;
    public final e9.a1 f42437b;
    public int f42438c;

    static {
        String str = e2.d0.f7188a;
        e = Integer.toString(0, 36);
    }

    public q1(b2.l1... l1VarArr) {
        e9.a1 w10 = e9.i0.w(l1VarArr);
        this.f42437b = w10;
        this.f42436a = l1VarArr.length;
        int i10 = 0;
        while (i10 < w10.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < w10.d; i12++) {
                if (((b2.l1) w10.get(i10)).equals(w10.get(i12))) {
                    e2.a.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final b2.l1 a(int i10) {
        return (b2.l1) this.f42437b.get(i10);
    }

    public final int b(b2.l1 l1Var) {
        int indexOf = this.f42437b.indexOf(l1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && q1.class == obj.getClass()) {
                q1 q1Var = (q1) obj;
                if (this.f42436a == q1Var.f42436a && this.f42437b.equals(q1Var.f42437b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f42438c == 0) {
            this.f42438c = this.f42437b.hashCode();
        }
        return this.f42438c;
    }

    public final String toString() {
        return this.f42437b.toString();
    }
}
