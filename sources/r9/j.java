package r9;

import i2.o1;
import w7.a7;
public final class j {
    public final r f45560a;
    public final int f45561b;
    public final int f45562c;

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
            if (this.f45560a.equals(jVar.f45560a) && this.f45561b == jVar.f45561b && this.f45562c == jVar.f45562c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f45560a.hashCode() ^ 1000003) * 1000003) ^ this.f45561b) * 1000003) ^ this.f45562c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f45560a);
        sb2.append(", type=");
        int i10 = this.f45561b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f45562c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(o1.k(i11, "Unsupported injection: "));
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
        a7.a(rVar, "Null dependency anInterface.");
        this.f45560a = rVar;
        this.f45561b = i10;
        this.f45562c = i11;
    }
}
