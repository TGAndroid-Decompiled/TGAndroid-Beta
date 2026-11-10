package w3;

import a8.ga;
import c8.e1;
import e2.n0;
import e2.p0;
import e2.u;
public final class a implements p0 {
    public final String f57588a;
    public final String f57589b;

    public a(String str, String str2) {
        this.f57588a = ga.d(str);
        this.f57589b = str2;
    }

    @Override
    public final u a() {
        return null;
    }

    @Override
    public final void b(n0 n0Var) {
        String str = this.f57588a;
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
        String str2 = this.f57589b;
        switch (c10) {
            case 0:
                Integer g10 = e1.g(str2);
                if (g10 != null) {
                    n0Var.f10395p = g10;
                    return;
                }
                return;
            case 1:
                Integer g11 = e1.g(str2);
                if (g11 != null) {
                    n0Var.D = g11;
                    return;
                }
                return;
            case 2:
                Integer g12 = e1.g(str2);
                if (g12 != null) {
                    n0Var.f10394o = g12;
                    return;
                }
                return;
            case 3:
                n0Var.f10384c = str2;
                return;
            case 4:
                n0Var.E = str2;
                return;
            case 5:
                n0Var.f10382a = str2;
                return;
            case 6:
                n0Var.f10387g = str2;
                return;
            case 7:
                Integer g13 = e1.g(str2);
                if (g13 != null) {
                    n0Var.C = g13;
                    return;
                }
                return;
            case '\b':
                n0Var.d = str2;
                return;
            case '\t':
                n0Var.f10383b = str2;
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
            if (this.f57588a.equals(aVar.f57588a) && this.f57589b.equals(aVar.f57589b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f57589b.hashCode() + com.google.android.recaptcha.internal.a.h(527, 31, this.f57588a);
    }

    public final String toString() {
        return "VC: " + this.f57588a + "=" + this.f57589b;
    }
}
