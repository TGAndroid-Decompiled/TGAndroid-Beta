package s3;

import b8.od;
import b8.zb;
import d2.p0;
import g2.n0;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.util.ArrayList;
public final class n extends i {
    public final String f54634b;
    public final i0 f54635c;

    public n(String str, String str2, s1 s1Var) {
        super(str);
        zb.f(!s1Var.isEmpty());
        this.f54634b = str2;
        i0 q10 = i0.q(s1Var);
        this.f54635c = q10;
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
    public final void a(p0 p0Var) {
        char c2;
        Integer num;
        String str = this.f54624a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        i0 i0Var = this.f54635c;
        try {
            switch (c2) {
                case 0:
                case '\n':
                    p0Var.f8262c = (CharSequence) i0Var.get(0);
                    return;
                case 1:
                case 11:
                    p0Var.A = (CharSequence) i0Var.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) i0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    p0Var.f8278u = Integer.valueOf(parseInt);
                    p0Var.v = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 18:
                    p0Var.f8261b = (CharSequence) i0Var.get(0);
                    return;
                case 4:
                case 19:
                    p0Var.d = (CharSequence) i0Var.get(0);
                    return;
                case 5:
                case 20:
                    p0Var.B = (CharSequence) i0Var.get(0);
                    return;
                case 6:
                case 21:
                    String str3 = n0.f11873a;
                    String[] split = ((String) i0Var.get(0)).split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    p0Var.f8272o = Integer.valueOf(parseInt3);
                    p0Var.f8273p = num;
                    return;
                case 7:
                case 17:
                    p0Var.f8260a = (CharSequence) i0Var.get(0);
                    return;
                case '\b':
                case 16:
                    p0Var.f8282z = (CharSequence) i0Var.get(0);
                    return;
                case '\t':
                case 22:
                    p0Var.f8277t = Integer.valueOf(Integer.parseInt((String) i0Var.get(0)));
                    return;
                case '\f':
                    Integer g7 = od.g((String) i0Var.get(0));
                    if (g7 == null) {
                        p0Var.E = (CharSequence) i0Var.get(0);
                        return;
                    }
                    String a10 = j.a(g7.intValue());
                    if (a10 != null) {
                        p0Var.E = a10;
                        return;
                    }
                    return;
                case 14:
                    ArrayList d = d((String) i0Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                p0Var.v = (Integer) d.get(2);
                            } else {
                                return;
                            }
                        }
                        p0Var.f8278u = (Integer) d.get(1);
                    }
                    p0Var.f8277t = (Integer) d.get(0);
                    return;
                case 15:
                    ArrayList d10 = d((String) i0Var.get(0));
                    int size2 = d10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                p0Var.f8281y = (Integer) d10.get(2);
                            } else {
                                return;
                            }
                        }
                        p0Var.f8280x = (Integer) d10.get(1);
                    }
                    p0Var.f8279w = (Integer) d10.get(0);
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
            if (Objects.equals(this.f54624a, nVar.f54624a) && Objects.equals(this.f54634b, nVar.f54634b) && this.f54635c.equals(nVar.f54635c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3;
        int g7 = com.google.android.recaptcha.internal.a.g(527, 31, this.f54624a);
        String str = this.f54634b;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        return this.f54635c.hashCode() + ((g7 + i3) * 31);
    }

    @Override
    public final String toString() {
        return this.f54624a + ": description=" + this.f54634b + ": values=" + this.f54635c;
    }
}
