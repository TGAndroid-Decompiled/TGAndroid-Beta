package y6;

import com.google.android.gms.internal.cast.x4;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.ui.Cells.pa;

public abstract class a {

    public static volatile com.google.firebase.messaging.s f49712b;

    public static final Object f49711a = new Object();

    public static final a1 f49713c = new a1("id");
    public static final a1 d = new a1("type");

    public static int a(int i10, int i11) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i11 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i12 = i10 / i11;
        int i13 = i10 - (i11 * i12);
        if (i13 == 0) {
            return i12;
        }
        int i14 = ((i10 ^ i11) >> 31) | 1;
        switch (n0.f49761a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return i12;
            case 3:
                if (i14 >= 0) {
                    return i12;
                }
                break;
            case 4:
                break;
            case 5:
                if (i14 <= 0) {
                    return i12;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i13);
                int iAbs2 = iAbs - (Math.abs(i11) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i12;
                }
                if (iAbs2 <= 0) {
                    return i12;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i12 + i14;
    }

    public static int b(o oVar) {
        Iterator it = oVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static String c(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strJ;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                strJ = "null";
            } else {
                try {
                    strJ = obj.toString();
                } catch (Exception e9) {
                    String strW = a9.p.w(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strW), (Throwable) e9);
                    strJ = pa.j("<", strW, " threw ", e9.getClass().getName(), ">");
                }
            }
            objArr[i11] = strJ;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, iIndexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String d(s0 s0Var) {
        StringBuilder sb2 = new StringBuilder(s0Var.p());
        for (int i10 = 0; i10 < s0Var.p(); i10++) {
            byte bI = s0Var.i(i10);
            if (bI == 34) {
                sb2.append("\\\"");
            } else if (bI == 39) {
                sb2.append("\\'");
            } else if (bI != 92) {
                switch (bI) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bI < 32 || bI > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bI >>> 6) & 3) + 48));
                            sb2.append((char) (((bI >>> 3) & 7) + 48));
                            sb2.append((char) ((bI & 7) + 48));
                        } else {
                            sb2.append((char) bI);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static void e(int i10, int i11) {
        String strC;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strC = c("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(i0.a.k(i11, "negative size: "));
                }
                strC = c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strC);
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(a9.p.m("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void g(StringBuilder sb2, Iterator it, za.b bVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(za.b.C(entry.getKey()));
            sb2.append(" : ");
            sb2.append(za.b.C(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(za.b.C(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(za.b.C(entry2.getValue()));
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = v.f49782b;
            }
        } else {
            if (!(collection instanceof c0)) {
                return false;
            }
            objComparator = ((s) ((c0) collection)).d;
        }
        return comparator.equals(objComparator);
    }

    public static byte[] j(byte[]... bArr) {
        int i10 = 0;
        int length = 0;
        while (true) {
            if (i10 >= bArr.length) {
                break;
            }
            length += bArr[i10].length;
            i10++;
        }
        byte[] bArr2 = new byte[length];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length2);
            i11 += length2;
        }
        return bArr2;
    }

    public static final c1 k(e1 e1Var) throws x0 {
        try {
            d1 d1VarD = e1Var.d();
            if (d1VarD == null) {
                throw new x0("Parser being asked to parse an empty input stream");
            }
            try {
                try {
                    byte b10 = d1VarD.f49717a;
                    byte b11 = d1VarD.f49718b;
                    int i10 = 0;
                    if (b10 == -128) {
                        long jA = e1Var.a();
                        if (jA > 1000) {
                            throw new x0("Parser being asked to read a large CBOR array");
                        }
                        l(b11, jA);
                        c1[] c1VarArr = new c1[(int) jA];
                        while (i10 < jA) {
                            c1VarArr[i10] = k(e1Var);
                            i10++;
                        }
                        return new u0(m.u(c1VarArr));
                    }
                    if (b10 != -96) {
                        if (b10 == -64) {
                            throw new x0("Tags are currently unsupported");
                        }
                        if (b10 == -32) {
                            return new v0(e1Var.e());
                        }
                        if (b10 == 0 || b10 == 32) {
                            long jB = e1Var.b();
                            l(b11, jB > 0 ? jB : ~jB);
                            return new y0(jB);
                        }
                        if (b10 == 64) {
                            e1Var.h((byte) 64);
                            byte[] bArrJ = e1Var.j();
                            int length = bArrJ.length;
                            l(b11, length);
                            return new w0(s0.t(length, bArrJ));
                        }
                        if (b10 == 96) {
                            e1Var.h((byte) 96);
                            String str = new String(e1Var.j(), StandardCharsets.UTF_8);
                            l(b11, str.length());
                            return new a1(str);
                        }
                        throw new x0("Unidentifiable major type: " + ((b10 >> 5) & 7));
                    }
                    long jC = e1Var.c();
                    if (jC > 1000) {
                        throw new x0("Parser being asked to read a large CBOR map");
                    }
                    l(b11, jC);
                    int i11 = (int) jC;
                    w3.b0[] b0VarArr = new w3.b0[i11];
                    c1 c1Var = null;
                    int i12 = 0;
                    while (i12 < jC) {
                        c1 c1VarK = k(e1Var);
                        if (c1Var != null && c1VarK.compareTo(c1Var) <= 0) {
                            throw new x4("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + c1Var.toString() + "\nCurrent key: " + c1VarK.toString());
                        }
                        b0VarArr[i12] = new w3.b0(9, c1VarK, k(e1Var));
                        i12++;
                        c1Var = c1VarK;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i10 < i11) {
                        w3.b0 b0Var = b0VarArr[i10];
                        if (treeMap.containsKey((c1) b0Var.f48998b)) {
                            throw new x4("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((c1) b0Var.f48998b, (c1) b0Var.f48999c);
                        i10++;
                    }
                    return new z0(r.b(treeMap));
                } catch (IOException | RuntimeException e9) {
                    e = e9;
                    throw new x0(e);
                }
            } catch (RuntimeException e10) {
                e = e10;
                throw new x0(e);
            }
        } catch (IOException e11) {
            throw new x0(e11);
        }
    }

    public static final void l(byte b10, long j10) throws x4 {
        switch (b10) {
            case 24:
                if (j10 < 24) {
                    throw new x4(com.google.android.recaptcha.internal.a.m(j10, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
                }
                return;
            case 25:
                if (j10 < 256) {
                    throw new x4(com.google.android.recaptcha.internal.a.m(j10, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j10 < 65536) {
                    throw new x4(com.google.android.recaptcha.internal.a.m(j10, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j10 < 4294967296L) {
                    throw new x4(com.google.android.recaptcha.internal.a.m(j10, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static void m(int i10, int i11, int i12) {
        String strN;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strN = n(i10, i12, "start index");
            } else {
                strN = (i11 < 0 || i11 > i12) ? n(i11, i12, "end index") : c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strN);
        }
    }

    public static String n(int i10, int i11, String str) {
        if (i10 < 0) {
            return c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(i0.a.k(i11, "negative size: "));
    }
}
