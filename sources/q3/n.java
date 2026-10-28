package q3;

import a8.ed;
import a8.yb;
import b2.r0;
import e2.n0;
import f9.i0;
import f9.s1;
import j$.util.Objects;
import java.util.ArrayList;
public final class n extends i {
    public final String f46987b;
    public final i0 f46988c;

    public n(String str, String str2, s1 s1Var) {
        super(str);
        yb.g(!s1Var.isEmpty());
        this.f46987b = str2;
        i0 u10 = i0.u(s1Var);
        this.f46988c = u10;
        String str3 = (String) u10.get(0);
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
    public final void b(r0 r0Var) {
        char c10;
        Integer num;
        String str = this.f46978a;
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
        i0 i0Var = this.f46988c;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    r0Var.f3364c = (CharSequence) i0Var.get(0);
                    return;
                case 1:
                case 11:
                    r0Var.A = (CharSequence) i0Var.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) i0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    r0Var.f3379u = Integer.valueOf(parseInt);
                    r0Var.v = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 18:
                    r0Var.f3363b = (CharSequence) i0Var.get(0);
                    return;
                case 4:
                case 19:
                    r0Var.d = (CharSequence) i0Var.get(0);
                    return;
                case 5:
                case 20:
                    r0Var.B = (CharSequence) i0Var.get(0);
                    return;
                case 6:
                case 21:
                    String str3 = n0.f9691a;
                    String[] split = ((String) i0Var.get(0)).split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    r0Var.f3373o = Integer.valueOf(parseInt3);
                    r0Var.f3374p = num;
                    return;
                case 7:
                case 17:
                    r0Var.f3362a = (CharSequence) i0Var.get(0);
                    return;
                case '\b':
                case 16:
                    r0Var.f3383z = (CharSequence) i0Var.get(0);
                    return;
                case '\t':
                case 22:
                    r0Var.f3378t = Integer.valueOf(Integer.parseInt((String) i0Var.get(0)));
                    return;
                case '\f':
                    Integer g7 = ed.g((String) i0Var.get(0));
                    if (g7 == null) {
                        r0Var.E = (CharSequence) i0Var.get(0);
                        return;
                    }
                    String a2 = j.a(g7.intValue());
                    if (a2 != null) {
                        r0Var.E = a2;
                        return;
                    }
                    return;
                case 14:
                    ArrayList d = d((String) i0Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                r0Var.v = (Integer) d.get(2);
                            } else {
                                return;
                            }
                        }
                        r0Var.f3379u = (Integer) d.get(1);
                    }
                    r0Var.f3378t = (Integer) d.get(0);
                    return;
                case 15:
                    ArrayList d10 = d((String) i0Var.get(0));
                    int size2 = d10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                r0Var.f3382y = (Integer) d10.get(2);
                            } else {
                                return;
                            }
                        }
                        r0Var.f3381x = (Integer) d10.get(1);
                    }
                    r0Var.f3380w = (Integer) d10.get(0);
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
            if (Objects.equals(this.f46978a, nVar.f46978a) && Objects.equals(this.f46987b, nVar.f46987b) && this.f46988c.equals(nVar.f46988c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f7 = a1.g.f(527, 31, this.f46978a);
        String str = this.f46987b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f46988c.hashCode() + ((f7 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f46978a + ": description=" + this.f46987b + ": values=" + this.f46988c;
    }
}
