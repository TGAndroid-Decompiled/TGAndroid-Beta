package t3;

import a1.g;
import b2.q0;
import b2.s0;
import b2.w;
import v7.b8;
import v7.s6;
public final class a implements s0 {
    public final String f46867a;
    public final String f46868b;

    public a(String str, String str2) {
        this.f46867a = s6.d(str);
        this.f46868b = str2;
    }

    @Override
    public final w a() {
        return null;
    }

    @Override
    public final void b(q0 q0Var) {
        String str = this.f46867a;
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
        String str2 = this.f46868b;
        switch (c10) {
            case 0:
                Integer g10 = b8.g(str2);
                if (g10 != null) {
                    q0Var.f3918p = g10;
                    return;
                }
                return;
            case 1:
                Integer g11 = b8.g(str2);
                if (g11 != null) {
                    q0Var.D = g11;
                    return;
                }
                return;
            case 2:
                Integer g12 = b8.g(str2);
                if (g12 != null) {
                    q0Var.f3917o = g12;
                    return;
                }
                return;
            case 3:
                q0Var.f3908c = str2;
                return;
            case 4:
                q0Var.E = str2;
                return;
            case 5:
                q0Var.f3906a = str2;
                return;
            case 6:
                q0Var.f3910g = str2;
                return;
            case 7:
                Integer g13 = b8.g(str2);
                if (g13 != null) {
                    q0Var.C = g13;
                    return;
                }
                return;
            case '\b':
                q0Var.d = str2;
                return;
            case '\t':
                q0Var.f3907b = str2;
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
            if (this.f46867a.equals(aVar.f46867a) && this.f46868b.equals(aVar.f46868b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46868b.hashCode() + g.g(527, 31, this.f46867a);
    }

    public final String toString() {
        return "VC: " + this.f46867a + "=" + this.f46868b;
    }
}
