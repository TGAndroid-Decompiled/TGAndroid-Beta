package q9;

import hg.k0;
import w7.s6;
public final class j {
    public final s f41515a;
    public final int f41516b;
    public final int f41517c;

    public j(int i10, int i11, Class cls) {
        this(s.a(cls), i10, i11);
    }

    public static j a(Class cls) {
        return new j(1, 0, cls);
    }

    public static j b(s sVar) {
        return new j(sVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f41515a.equals(jVar.f41515a) && this.f41516b == jVar.f41516b && this.f41517c == jVar.f41517c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f41515a.hashCode() ^ 1000003) * 1000003) ^ this.f41516b) * 1000003) ^ this.f41517c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f41515a);
        sb2.append(", type=");
        int i10 = this.f41516b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f41517c;
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

    public j(s sVar, int i10, int i11) {
        s6.a(sVar, "Null dependency anInterface.");
        this.f41515a = sVar;
        this.f41516b = i10;
        this.f41517c = i11;
    }
}
