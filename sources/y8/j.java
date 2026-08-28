package y8;

import g7.t8;
import j3.r0;
public final class j {
    public final r f49642a;
    public final int f49643b;
    public final int f49644c;

    public j(int i9, int i10, Class cls) {
        this(r.a(cls), i9, i10);
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
            if (this.f49642a.equals(jVar.f49642a) && this.f49643b == jVar.f49643b && this.f49644c == jVar.f49644c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f49642a.hashCode() ^ 1000003) * 1000003) ^ this.f49643b) * 1000003) ^ this.f49644c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f49642a);
        sb2.append(", type=");
        int i9 = this.f49643b;
        if (i9 == 1) {
            str = "required";
        } else if (i9 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i10 = this.f49644c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(r0.l(i10, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return aa.d.r(sb2, str2, "}");
    }

    public j(r rVar, int i9, int i10) {
        t8.a(rVar, "Null dependency anInterface.");
        this.f49642a = rVar;
        this.f49643b = i9;
        this.f49644c = i10;
    }
}
