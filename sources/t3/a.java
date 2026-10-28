package t3;

import a1.g;
import a8.ed;
import a8.wb;
import b2.r0;
import b2.t0;
import b2.x;
public final class a implements t0 {
    public final String f48728a;
    public final String f48729b;

    public a(String str, String str2) {
        this.f48728a = wb.d(str);
        this.f48729b = str2;
    }

    @Override
    public final x a() {
        return null;
    }

    @Override
    public final void b(r0 r0Var) {
        String str = this.f48728a;
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
        String str2 = this.f48729b;
        switch (c10) {
            case 0:
                Integer g7 = ed.g(str2);
                if (g7 != null) {
                    r0Var.f3374p = g7;
                    return;
                }
                return;
            case 1:
                Integer g10 = ed.g(str2);
                if (g10 != null) {
                    r0Var.D = g10;
                    return;
                }
                return;
            case 2:
                Integer g11 = ed.g(str2);
                if (g11 != null) {
                    r0Var.f3373o = g11;
                    return;
                }
                return;
            case 3:
                r0Var.f3364c = str2;
                return;
            case 4:
                r0Var.E = str2;
                return;
            case 5:
                r0Var.f3362a = str2;
                return;
            case 6:
                r0Var.f3366g = str2;
                return;
            case 7:
                Integer g12 = ed.g(str2);
                if (g12 != null) {
                    r0Var.C = g12;
                    return;
                }
                return;
            case '\b':
                r0Var.d = str2;
                return;
            case '\t':
                r0Var.f3363b = str2;
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
            if (this.f48728a.equals(aVar.f48728a) && this.f48729b.equals(aVar.f48729b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f48729b.hashCode() + g.f(527, 31, this.f48728a);
    }

    public final String toString() {
        return "VC: " + this.f48728a + "=" + this.f48729b;
    }
}
