package q9;

import w7.r6;
public final class j {
    public final r f46071a;
    public final int f46072b;
    public final int f46073c;

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
            if (this.f46071a.equals(jVar.f46071a) && this.f46072b == jVar.f46072b && this.f46073c == jVar.f46073c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46071a.hashCode() ^ 1000003) * 1000003) ^ this.f46072b) * 1000003) ^ this.f46073c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f46071a);
        sb2.append(", type=");
        int i10 = this.f46072b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f46073c;
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
        this.f46071a = rVar;
        this.f46072b = i10;
        this.f46073c = i11;
    }
}
