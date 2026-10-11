package q9;

import w7.r6;
public final class j {
    public final s f46102a;
    public final int f46103b;
    public final int f46104c;

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
            if (this.f46102a.equals(jVar.f46102a) && this.f46103b == jVar.f46103b && this.f46104c == jVar.f46104c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46102a.hashCode() ^ 1000003) * 1000003) ^ this.f46103b) * 1000003) ^ this.f46104c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f46102a);
        sb2.append(", type=");
        int i10 = this.f46103b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f46104c;
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
        this.f46102a = sVar;
        this.f46103b = i10;
        this.f46104c = i11;
    }
}
