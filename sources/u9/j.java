package u9;

import a8.p0;
import c8.tc;
public final class j {
    public final r f56473a;
    public final int f56474b;
    public final int f56475c;

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
            if (this.f56473a.equals(jVar.f56473a) && this.f56474b == jVar.f56474b && this.f56475c == jVar.f56475c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f56473a.hashCode() ^ 1000003) * 1000003) ^ this.f56474b) * 1000003) ^ this.f56475c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f56473a);
        sb2.append(", type=");
        int i7 = this.f56474b;
        if (i7 == 1) {
            str = "required";
        } else if (i7 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f56475c;
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
        this.f56473a = rVar;
        this.f56474b = i7;
        this.f56475c = i10;
    }
}
