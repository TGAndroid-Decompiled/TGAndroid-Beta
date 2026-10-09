package q9;

import w7.r6;
public final class j {
    public final r f46027a;
    public final int f46028b;
    public final int f46029c;

    public j(int i10, int i11, Class cls) {
        this(r.a(cls), i10, i11);
    }

    public static j a(Class cls) {
        return new j(1, 0, cls);
    }

    public static j b(r rVar) {
        return new j(rVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f46027a.equals(jVar.f46027a) && this.f46028b == jVar.f46028b && this.f46029c == jVar.f46029c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46027a.hashCode() ^ 1000003) * 1000003) ^ this.f46028b) * 1000003) ^ this.f46029c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f46027a);
        sb2.append(", type=");
        int i10 = this.f46028b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f46029c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(hg.c.h(i11, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return a1.g.t(sb2, str2, "}");
    }

    public j(r rVar, int i10, int i11) {
        r6.a(rVar, "Null dependency anInterface.");
        this.f46027a = rVar;
        this.f46028b = i10;
        this.f46029c = i11;
    }
}
