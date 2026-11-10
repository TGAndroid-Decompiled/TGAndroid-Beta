package u9;

import a8.p0;
import c8.tc;
public final class j {
    public final r f56485a;
    public final int f56486b;
    public final int f56487c;

    public j(int i7, int i10, Class cls) {
        this(r.a(cls), i7, i10);
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
            if (this.f56485a.equals(jVar.f56485a) && this.f56486b == jVar.f56486b && this.f56487c == jVar.f56487c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f56485a.hashCode() ^ 1000003) * 1000003) ^ this.f56486b) * 1000003) ^ this.f56487c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f56485a);
        sb2.append(", type=");
        int i7 = this.f56486b;
        if (i7 == 1) {
            str = "required";
        } else if (i7 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f56487c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(jg.g.j(i10, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return p0.s(sb2, str2, "}");
    }

    public j(r rVar, int i7, int i10) {
        tc.a(rVar, "Null dependency anInterface.");
        this.f56485a = rVar;
        this.f56486b = i7;
        this.f56487c = i10;
    }
}
