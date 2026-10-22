package q3;

import b2.q0;
import e2.m0;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import v7.b8;
import v7.u6;
public final class n extends i {
    public final String f44387b;
    public final n0 f44388c;

    public n(String str, String str2, x1 x1Var) {
        super(str);
        u6.g(!x1Var.isEmpty());
        this.f44387b = str2;
        n0 u10 = n0.u(x1Var);
        this.f44388c = u10;
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
    public final void b(q0 q0Var) {
        char c10;
        Integer num;
        String str = this.f44378a;
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
        n0 n0Var = this.f44388c;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    q0Var.f3906c = (CharSequence) n0Var.get(0);
                    return;
                case 1:
                case 11:
                    q0Var.A = (CharSequence) n0Var.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) n0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    q0Var.f3921u = Integer.valueOf(parseInt);
                    q0Var.v = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 18:
                    q0Var.f3905b = (CharSequence) n0Var.get(0);
                    return;
                case 4:
                case 19:
                    q0Var.d = (CharSequence) n0Var.get(0);
                    return;
                case 5:
                case 20:
                    q0Var.B = (CharSequence) n0Var.get(0);
                    return;
                case 6:
                case 21:
                    String str3 = m0.f8252a;
                    String[] split = ((String) n0Var.get(0)).split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    q0Var.f3915o = Integer.valueOf(parseInt3);
                    q0Var.f3916p = num;
                    return;
                case 7:
                case 17:
                    q0Var.f3904a = (CharSequence) n0Var.get(0);
                    return;
                case '\b':
                case 16:
                    q0Var.f3925z = (CharSequence) n0Var.get(0);
                    return;
                case '\t':
                case 22:
                    q0Var.f3920t = Integer.valueOf(Integer.parseInt((String) n0Var.get(0)));
                    return;
                case '\f':
                    Integer g10 = b8.g((String) n0Var.get(0));
                    if (g10 == null) {
                        q0Var.E = (CharSequence) n0Var.get(0);
                        return;
                    }
                    String a2 = j.a(g10.intValue());
                    if (a2 != null) {
                        q0Var.E = a2;
                        return;
                    }
                    return;
                case 14:
                    ArrayList d = d((String) n0Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                q0Var.v = (Integer) d.get(2);
                            } else {
                                return;
                            }
                        }
                        q0Var.f3921u = (Integer) d.get(1);
                    }
                    q0Var.f3920t = (Integer) d.get(0);
                    return;
                case 15:
                    ArrayList d10 = d((String) n0Var.get(0));
                    int size2 = d10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                q0Var.f3924y = (Integer) d10.get(2);
                            } else {
                                return;
                            }
                        }
                        q0Var.f3923x = (Integer) d10.get(1);
                    }
                    q0Var.f3922w = (Integer) d10.get(0);
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
            if (Objects.equals(this.f44378a, nVar.f44378a) && Objects.equals(this.f44387b, nVar.f44387b) && this.f44388c.equals(nVar.f44388c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int g10 = a1.g.g(527, 31, this.f44378a);
        String str = this.f44387b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f44388c.hashCode() + ((g10 + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44378a + ": description=" + this.f44387b + ": values=" + this.f44388c;
    }
}
