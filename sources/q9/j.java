package q9;

import w7.q6;
public final class j {
    public final r f45972a;
    public final int f45973b;
    public final int f45974c;

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
            if (this.f45972a.equals(jVar.f45972a) && this.f45973b == jVar.f45973b && this.f45974c == jVar.f45974c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f45972a.hashCode() ^ 1000003) * 1000003) ^ this.f45973b) * 1000003) ^ this.f45974c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f45972a);
        sb2.append(", type=");
        int i10 = this.f45973b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f45974c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(hg.c.i(i11, "Unsupported injection: "));
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
        q6.a(rVar, "Null dependency anInterface.");
        this.f45972a = rVar;
        this.f45973b = i10;
        this.f45974c = i11;
    }
}
