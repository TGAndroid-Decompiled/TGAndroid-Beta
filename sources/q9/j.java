package q9;

import w7.s6;
public final class j {
    public final r f41480a;
    public final int f41481b;
    public final int f41482c;

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
            if (this.f41480a.equals(jVar.f41480a) && this.f41481b == jVar.f41481b && this.f41482c == jVar.f41482c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f41480a.hashCode() ^ 1000003) * 1000003) ^ this.f41481b) * 1000003) ^ this.f41482c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f41480a);
        sb2.append(", type=");
        int i10 = this.f41481b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f41482c;
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
        return a4.a.t(sb2, str2, "}");
    }

    public j(r rVar, int i10, int i11) {
        s6.a(rVar, "Null dependency anInterface.");
        this.f41480a = rVar;
        this.f41481b = i10;
        this.f41482c = i11;
    }
}
