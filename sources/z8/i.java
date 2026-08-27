package z8;

import h7.v8;

public final class i {

    public final q f50238a;

    public final int f50239b;

    public final int f50240c;

    public i(int i10, int i11, Class cls) {
        this(q.a(cls), i10, i11);
    }

    public static i a(Class cls) {
        return new i(1, 0, cls);
    }

    public static i b(q qVar) {
        return new i(qVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f50238a.equals(iVar.f50238a) && this.f50239b == iVar.f50239b && this.f50240c == iVar.f50240c;
    }

    public final int hashCode() {
        return ((((this.f50238a.hashCode() ^ 1000003) * 1000003) ^ this.f50239b) * 1000003) ^ this.f50240c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f50238a);
        sb2.append(", type=");
        int i10 = this.f50239b;
        if (i10 == 1) {
            str = "required";
        } else {
            str = i10 == 0 ? "optional" : "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f50240c;
        if (i11 == 0) {
            str2 = "direct";
        } else if (i11 == 1) {
            str2 = "provider";
        } else {
            if (i11 != 2) {
                throw new AssertionError(i0.a.k(i11, "Unsupported injection: "));
            }
            str2 = "deferred";
        }
        return a9.p.p(sb2, str2, "}");
    }

    public i(q qVar, int i10, int i11) {
        v8.a(qVar, "Null dependency anInterface.");
        this.f50238a = qVar;
        this.f50239b = i10;
        this.f50240c = i11;
    }
}
