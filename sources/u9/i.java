package u9;

import a8.p0;
import c8.wc;
public final class i {
    public final q f58592a;
    public final int f58593b;
    public final int f58594c;

    public i(int i7, int i10, Class cls) {
        this(q.a(cls), i7, i10);
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public static i b(q qVar) {
        return new i(qVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f58592a.equals(iVar.f58592a) && this.f58593b == iVar.f58593b && this.f58594c == iVar.f58594c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f58592a.hashCode() ^ 1000003) * 1000003) ^ this.f58593b) * 1000003) ^ this.f58594c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f58592a);
        sb2.append(", type=");
        int i7 = this.f58593b;
        if (i7 == 1) {
            str = "required";
        } else if (i7 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f58594c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(i5.c.i(i10, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return p0.s(sb2, str2, "}");
    }

    public i(q qVar, int i7, int i10) {
        wc.a(qVar, "Null dependency anInterface.");
        this.f58592a = qVar;
        this.f58593b = i7;
        this.f58594c = i10;
    }
}
