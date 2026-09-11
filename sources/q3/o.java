package q3;

import b2.m0;
import e2.d0;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import v7.x7;
public final class o extends j {
    public final String f44165b;
    public final i0 f44166c;

    public o(String str, String str2, a1 a1Var) {
        super(str);
        e2.d.b(!a1Var.isEmpty());
        this.f44165b = str2;
        i0 v = i0.v(a1Var);
        this.f44166c = v;
        String str3 = (String) v.get(0);
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
    public final void b(m0 m0Var) {
        char c10;
        Integer num;
        String str = this.f44155a;
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
        i0 i0Var = this.f44166c;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    m0Var.f2149c = (CharSequence) i0Var.get(0);
                    return;
                case 1:
                case 11:
                    m0Var.f2169z = (CharSequence) i0Var.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) i0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    m0Var.f2164t = Integer.valueOf(parseInt);
                    m0Var.f2165u = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 18:
                    m0Var.f2148b = (CharSequence) i0Var.get(0);
                    return;
                case 4:
                case 19:
                    m0Var.d = (CharSequence) i0Var.get(0);
                    return;
                case 5:
                case 20:
                    m0Var.A = (CharSequence) i0Var.get(0);
                    return;
                case 6:
                case 21:
                    String str3 = d0.f8737a;
                    String[] split = ((String) i0Var.get(0)).split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    m0Var.f2158n = Integer.valueOf(parseInt3);
                    m0Var.f2159o = num;
                    return;
                case 7:
                case 17:
                    m0Var.f2147a = (CharSequence) i0Var.get(0);
                    return;
                case '\b':
                case 16:
                    m0Var.f2168y = (CharSequence) i0Var.get(0);
                    return;
                case '\t':
                case 22:
                    m0Var.f2163s = Integer.valueOf(Integer.parseInt((String) i0Var.get(0)));
                    return;
                case '\f':
                    Integer g10 = x7.g((String) i0Var.get(0));
                    if (g10 == null) {
                        m0Var.D = (CharSequence) i0Var.get(0);
                        return;
                    }
                    String a2 = k.a(g10.intValue());
                    if (a2 != null) {
                        m0Var.D = a2;
                        return;
                    }
                    return;
                case 14:
                    ArrayList d = d((String) i0Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                m0Var.f2165u = (Integer) d.get(2);
                            } else {
                                return;
                            }
                        }
                        m0Var.f2164t = (Integer) d.get(1);
                    }
                    m0Var.f2163s = (Integer) d.get(0);
                    return;
                case 15:
                    ArrayList d10 = d((String) i0Var.get(0));
                    int size2 = d10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                m0Var.f2167x = (Integer) d10.get(2);
                            } else {
                                return;
                            }
                        }
                        m0Var.f2166w = (Integer) d10.get(1);
                    }
                    m0Var.v = (Integer) d10.get(0);
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
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (Objects.equals(this.f44155a, oVar.f44155a) && Objects.equals(this.f44165b, oVar.f44165b) && this.f44166c.equals(oVar.f44166c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int h = a4.a.h(527, 31, this.f44155a);
        String str = this.f44165b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f44166c.hashCode() + ((h + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f44155a + ": description=" + this.f44165b + ": values=" + this.f44166c;
    }
}
