package t3;

import b2.m0;
import b2.o0;
import b2.s;
import v7.r6;
import v7.x7;
public final class a implements o0 {
    public final String f46454a;
    public final String f46455b;

    public a(String str, String str2) {
        this.f46454a = r6.c(str);
        this.f46455b = str2;
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        String str = this.f46454a;
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
        String str2 = this.f46455b;
        switch (c10) {
            case 0:
                Integer g10 = x7.g(str2);
                if (g10 != null) {
                    m0Var.f2186o = g10;
                    return;
                }
                return;
            case 1:
                Integer g11 = x7.g(str2);
                if (g11 != null) {
                    m0Var.C = g11;
                    return;
                }
                return;
            case 2:
                Integer g12 = x7.g(str2);
                if (g12 != null) {
                    m0Var.f2185n = g12;
                    return;
                }
                return;
            case 3:
                m0Var.f2176c = str2;
                return;
            case 4:
                m0Var.D = str2;
                return;
            case 5:
                m0Var.f2174a = str2;
                return;
            case 6:
                m0Var.f2179g = str2;
                return;
            case 7:
                Integer g13 = x7.g(str2);
                if (g13 != null) {
                    m0Var.B = g13;
                    return;
                }
                return;
            case '\b':
                m0Var.d = str2;
                return;
            case '\t':
                m0Var.f2175b = str2;
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
            if (this.f46454a.equals(aVar.f46454a) && this.f46455b.equals(aVar.f46455b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f46455b.hashCode() + a4.a.h(527, 31, this.f46454a);
    }

    public final String toString() {
        return "VC: " + this.f46454a + "=" + this.f46455b;
    }
}
