package q9;

import w7.r6;
public final class j {
    public final s f46136a;
    public final int f46137b;
    public final int f46138c;

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
            if (this.f46136a.equals(jVar.f46136a) && this.f46137b == jVar.f46137b && this.f46138c == jVar.f46138c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46136a.hashCode() ^ 1000003) * 1000003) ^ this.f46137b) * 1000003) ^ this.f46138c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f46136a);
        sb2.append(", type=");
        int i10 = this.f46137b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f46138c;
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

    public j(s sVar, int i10, int i11) {
        r6.a(sVar, "Null dependency anInterface.");
        this.f46136a = sVar;
        this.f46137b = i10;
        this.f46138c = i11;
    }
}
