package s9;

import com.google.android.gms.internal.play_billing.s1;
public final class j {
    public final r f47998a;
    public final int f47999b;
    public final int f48000c;

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
            if (this.f47998a.equals(jVar.f47998a) && this.f47999b == jVar.f47999b && this.f48000c == jVar.f48000c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f47998a.hashCode() ^ 1000003) * 1000003) ^ this.f47999b) * 1000003) ^ this.f48000c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f47998a);
        sb2.append(", type=");
        int i10 = this.f47999b;
        if (i10 == 1) {
            str = "required";
        } else if (i10 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i11 = this.f48000c;
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

    public j(r rVar, int i10, int i11) {
        s1.a(rVar, "Null dependency anInterface.");
        this.f47998a = rVar;
        this.f47999b = i10;
        this.f48000c = i11;
    }
}
