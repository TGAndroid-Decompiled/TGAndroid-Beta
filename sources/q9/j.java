package q9;

import hg.k0;
import w7.t6;
public final class j {
    public final r f44856a;
    public final int f44857b;
    public final int f44858c;

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
            if (this.f44856a.equals(jVar.f44856a) && this.f44857b == jVar.f44857b && this.f44858c == jVar.f44858c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f44856a.hashCode() ^ 1000003) * 1000003) ^ this.f44857b) * 1000003) ^ this.f44858c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f44856a);
        sb2.append(", type=");
        int i10 = this.f44857b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f44858c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(k0.h(i11, "Unsupported injection: "));
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
        t6.a(rVar, "Null dependency anInterface.");
        this.f44856a = rVar;
        this.f44857b = i10;
        this.f44858c = i11;
    }
}
