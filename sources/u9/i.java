package u9;

import a8.p0;
import c8.wc;
public final class i {
    public final q f58546a;
    public final int f58547b;
    public final int f58548c;

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
            if (this.f58546a.equals(iVar.f58546a) && this.f58547b == iVar.f58547b && this.f58548c == iVar.f58548c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f58546a.hashCode() ^ 1000003) * 1000003) ^ this.f58547b) * 1000003) ^ this.f58548c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f58546a);
        sb2.append(", type=");
        int i7 = this.f58547b;
        if (i7 == 1) {
            str = "required";
        } else if (i7 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f58548c;
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
        this.f58546a = qVar;
        this.f58547b = i7;
        this.f58548c = i10;
    }
}
