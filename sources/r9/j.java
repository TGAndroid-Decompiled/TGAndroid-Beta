package r9;

import w7.b7;
public final class j {
    public final r f45136a;
    public final int f45137b;
    public final int f45138c;

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
            if (this.f45136a.equals(jVar.f45136a) && this.f45137b == jVar.f45137b && this.f45138c == jVar.f45138c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f45136a.hashCode() ^ 1000003) * 1000003) ^ this.f45137b) * 1000003) ^ this.f45138c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f45136a);
        sb2.append(", type=");
        int i10 = this.f45137b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f45138c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(i2.d.j(i11, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return a1.g.s(sb2, str2, "}");
    }

    public j(r rVar, int i10, int i11) {
        b7.a(rVar, "Null dependency anInterface.");
        this.f45136a = rVar;
        this.f45137b = i10;
        this.f45138c = i11;
    }
}
