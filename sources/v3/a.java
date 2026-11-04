package v3;

import b8.od;
import b8.xb;
import d2.p0;
import d2.r0;
import d2.v;
public final class a implements r0 {
    public final String f56440a;
    public final String f56441b;

    public a(String str, String str2) {
        this.f56440a = xb.d(str);
        this.f56441b = str2;
    }

    @Override
    public final void a(p0 p0Var) {
        String str = this.f56440a;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c2 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c2 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c2 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c2 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c2 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c2 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c2 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c2 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c2 = '\t';
                    break;
                }
                break;
        }
        String str2 = this.f56441b;
        switch (c2) {
            case 0:
                Integer g7 = od.g(str2);
                if (g7 != null) {
                    p0Var.f8273p = g7;
                    return;
                }
                return;
            case 1:
                Integer g10 = od.g(str2);
                if (g10 != null) {
                    p0Var.D = g10;
                    return;
                }
                return;
            case 2:
                Integer g11 = od.g(str2);
                if (g11 != null) {
                    p0Var.f8272o = g11;
                    return;
                }
                return;
            case 3:
                p0Var.f8262c = str2;
                return;
            case 4:
                p0Var.E = str2;
                return;
            case 5:
                p0Var.f8260a = str2;
                return;
            case 6:
                p0Var.f8265g = str2;
                return;
            case 7:
                Integer g12 = od.g(str2);
                if (g12 != null) {
                    p0Var.C = g12;
                    return;
                }
                return;
            case '\b':
                p0Var.d = str2;
                return;
            case '\t':
                p0Var.f8261b = str2;
                return;
            default:
                return;
        }
    }

    @Override
    public final v b() {
        return null;
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f56440a.equals(aVar.f56440a) && this.f56441b.equals(aVar.f56441b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f56441b.hashCode() + com.google.android.recaptcha.internal.a.g(527, 31, this.f56440a);
    }

    public final String toString() {
        return "VC: " + this.f56440a + "=" + this.f56441b;
    }
}
