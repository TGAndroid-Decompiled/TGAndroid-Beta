package r9;

import w7.g7;
public final class j {
    public final r f46450a;
    public final int f46451b;
    public final int f46452c;

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
            if (this.f46450a.equals(jVar.f46450a) && this.f46451b == jVar.f46451b && this.f46452c == jVar.f46452c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46450a.hashCode() ^ 1000003) * 1000003) ^ this.f46451b) * 1000003) ^ this.f46452c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f46450a);
        sb2.append(", type=");
        int i10 = this.f46451b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f46452c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(i0.a.i(i11, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return a1.g.r(sb2, str2, "}");
    }

    public j(r rVar, int i10, int i11) {
        g7.a(rVar, "Null dependency anInterface.");
        this.f46450a = rVar;
        this.f46451b = i10;
        this.f46452c = i11;
    }
}
