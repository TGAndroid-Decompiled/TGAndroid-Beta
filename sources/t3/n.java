package t3;

import a8.ia;
import c8.e1;
import e2.n0;
import h2.m0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
public final class n extends i {
    public final String f55296b;
    public final i0 f55297c;

    public n(String str, String str2, t1 t1Var) {
        super(str);
        ia.f(!t1Var.isEmpty());
        this.f55296b = str2;
        i0 q10 = i0.q(t1Var);
        this.f55297c = q10;
        String str3 = (String) q10.get(0);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            } else {
                if (str.length() >= 4) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                }
                return arrayList;
            }
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override
    public final void b(n0 n0Var) {
        char c10;
        Integer num;
        String str = this.f55286a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        i0 i0Var = this.f55297c;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    n0Var.f10379c = (CharSequence) i0Var.get(0);
                    return;
                case 1:
                case 11:
                    n0Var.A = (CharSequence) i0Var.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) i0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    n0Var.f10395u = Integer.valueOf(parseInt);
                    n0Var.v = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 18:
                    n0Var.f10378b = (CharSequence) i0Var.get(0);
                    return;
                case 4:
                case 19:
                    n0Var.d = (CharSequence) i0Var.get(0);
                    return;
                case 5:
                case 20:
                    n0Var.B = (CharSequence) i0Var.get(0);
                    return;
                case 6:
                case 21:
                    String str3 = m0.f14112a;
                    String[] split = ((String) i0Var.get(0)).split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    n0Var.f10389o = Integer.valueOf(parseInt3);
                    n0Var.f10390p = num;
                    return;
                case 7:
                case 17:
                    n0Var.f10377a = (CharSequence) i0Var.get(0);
                    return;
                case '\b':
                case 16:
                    n0Var.f10399z = (CharSequence) i0Var.get(0);
                    return;
                case '\t':
                case 22:
                    n0Var.f10394t = Integer.valueOf(Integer.parseInt((String) i0Var.get(0)));
                    return;
                case '\f':
                    Integer g10 = e1.g((String) i0Var.get(0));
                    if (g10 == null) {
                        n0Var.E = (CharSequence) i0Var.get(0);
                        return;
                    }
                    String a10 = j.a(g10.intValue());
                    if (a10 != null) {
                        n0Var.E = a10;
                        return;
                    }
                    return;
                case 14:
                    ArrayList d = d((String) i0Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                n0Var.v = (Integer) d.get(2);
                            } else {
                                return;
                            }
                        }
                        n0Var.f10395u = (Integer) d.get(1);
                    }
                    n0Var.f10394t = (Integer) d.get(0);
                    return;
                case 15:
                    ArrayList d2 = d((String) i0Var.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                n0Var.f10398y = (Integer) d2.get(2);
                            } else {
                                return;
                            }
                        }
                        n0Var.f10397x = (Integer) d2.get(1);
                    }
                    n0Var.f10396w = (Integer) d2.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f55286a, nVar.f55286a) && Objects.equals(this.f55296b, nVar.f55296b) && this.f55297c.equals(nVar.f55297c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int h = com.google.android.recaptcha.internal.a.h(527, 31, this.f55286a);
        String str = this.f55296b;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        return this.f55297c.hashCode() + ((h + i7) * 31);
    }

    @Override
    public final String toString() {
        return this.f55286a + ": description=" + this.f55296b + ": values=" + this.f55297c;
    }
}
