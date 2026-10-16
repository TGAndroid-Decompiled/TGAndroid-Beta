package t3;

import a1.g;
import b2.r0;
import b2.t0;
import b2.x;
import v7.b8;
import v7.s6;
public final class a implements t0 {
    public final String f45506a;
    public final String f45507b;

    public a(String str, String str2) {
        this.f45506a = s6.d(str);
        this.f45507b = str2;
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final void b(r0 r0Var) {
        String str = this.f45506a;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c10 = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c10 = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c10 = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c10 = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c10 = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c10 = 6;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c10 = '\t';
                    break;
                }
                break;
        }
        String str2 = this.f45507b;
        switch (c10) {
            case 0:
                Integer g10 = b8.g(str2);
                if (g10 != null) {
                    r0Var.f2311p = g10;
                    return;
                }
                return;
            case 1:
                Integer g11 = b8.g(str2);
                if (g11 != null) {
                    r0Var.D = g11;
                    return;
                }
                return;
            case 2:
                Integer g12 = b8.g(str2);
                if (g12 != null) {
                    r0Var.f2310o = g12;
                    return;
                }
                return;
            case 3:
                r0Var.f2301c = str2;
                return;
            case 4:
                r0Var.E = str2;
                return;
            case 5:
                r0Var.f2299a = str2;
                return;
            case 6:
                r0Var.f2303g = str2;
                return;
            case 7:
                Integer g13 = b8.g(str2);
                if (g13 != null) {
                    r0Var.C = g13;
                    return;
                }
                return;
            case '\b':
                r0Var.d = str2;
                return;
            case '\t':
                r0Var.f2300b = str2;
                return;
            default:
                return;
        }
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
            if (this.f45506a.equals(aVar.f45506a) && this.f45507b.equals(aVar.f45507b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f45507b.hashCode() + g.g(527, 31, this.f45506a);
    }

    public final String toString() {
        return "VC: " + this.f45506a + "=" + this.f45507b;
    }
}
