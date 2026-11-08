package u9;

import a8.p0;
import c8.tc;
public final class j {
    public final r f56474a;
    public final int f56475b;
    public final int f56476c;

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
            if (this.f56474a.equals(jVar.f56474a) && this.f56475b == jVar.f56475b && this.f56476c == jVar.f56476c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f56474a.hashCode() ^ 1000003) * 1000003) ^ this.f56475b) * 1000003) ^ this.f56476c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f56474a);
        sb2.append(", type=");
        int i7 = this.f56475b;
        if (i7 == 1) {
            str = "required";
        } else if (i7 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f56476c;
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
        this.f56474a = rVar;
        this.f56475b = i7;
        this.f56476c = i10;
    }
}
