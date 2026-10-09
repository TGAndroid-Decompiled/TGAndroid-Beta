package q9;

import w7.r6;
public final class j {
    public final r f46025a;
    public final int f46026b;
    public final int f46027c;

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
            if (this.f46025a.equals(jVar.f46025a) && this.f46026b == jVar.f46026b && this.f46027c == jVar.f46027c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f46025a.hashCode() ^ 1000003) * 1000003) ^ this.f46026b) * 1000003) ^ this.f46027c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f46025a);
        sb2.append(", type=");
        int i10 = this.f46026b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f46027c;
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
        this.f46025a = rVar;
        this.f46026b = i10;
        this.f46027c = i11;
    }
}
