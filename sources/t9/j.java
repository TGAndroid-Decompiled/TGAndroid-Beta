package t9;

import k2.p1;
import x7.b0;
public final class j {
    public final r f55061a;
    public final int f55062b;
    public final int f55063c;

    public j(int i3, int i10, Class cls) {
        this(r.a(cls), i3, i10);
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
            if (this.f55061a.equals(jVar.f55061a) && this.f55062b == jVar.f55062b && this.f55063c == jVar.f55063c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f55061a.hashCode() ^ 1000003) * 1000003) ^ this.f55062b) * 1000003) ^ this.f55063c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f55061a);
        sb2.append(", type=");
        int i3 = this.f55062b;
        if (i3 == 1) {
            str = "required";
        } else if (i3 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f55063c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(p1.i(i10, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return a1.g.s(sb2, str2, "}");
    }

    public j(r rVar, int i3, int i10) {
        b0.a(rVar, "Null dependency anInterface.");
        this.f55061a = rVar;
        this.f55062b = i3;
        this.f55063c = i10;
    }
}
