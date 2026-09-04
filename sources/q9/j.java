package q9;

import w7.o6;
public final class j {
    public final r f44229a;
    public final int f44230b;
    public final int f44231c;

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
            if (this.f44229a.equals(jVar.f44229a) && this.f44230b == jVar.f44230b && this.f44231c == jVar.f44231c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f44229a.hashCode() ^ 1000003) * 1000003) ^ this.f44230b) * 1000003) ^ this.f44231c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f44229a);
        sb2.append(", type=");
        int i10 = this.f44230b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f44231c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(i2.g.i(i11, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return a4.a.s(sb2, str2, "}");
    }

    public j(r rVar, int i10, int i11) {
        o6.a(rVar, "Null dependency anInterface.");
        this.f44229a = rVar;
        this.f44230b = i10;
        this.f44231c = i11;
    }
}
