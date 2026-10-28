package s9;

import com.google.android.gms.internal.play_billing.s1;
public final class k {
    public final s f48039a;
    public final int f48040b;
    public final int f48041c;

    public k(int i10, int i11, Class cls) {
        this(s.a(cls), i10, i11);
    }

    public static k a(Class cls) {
        return new k(1, 0, cls);
    }

    public static k b(s sVar) {
        return new k(sVar, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f48039a.equals(kVar.f48039a) && this.f48040b == kVar.f48040b && this.f48041c == kVar.f48041c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f48039a.hashCode() ^ 1000003) * 1000003) ^ this.f48040b) * 1000003) ^ this.f48041c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f48039a);
        sb2.append(", type=");
        int i10 = this.f48040b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f48041c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(ic.a.i(i11, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return a1.g.s(sb2, str2, "}");
    }

    public k(s sVar, int i10, int i11) {
        s1.a(sVar, "Null dependency anInterface.");
        this.f48039a = sVar;
        this.f48040b = i10;
        this.f48041c = i11;
    }
}
