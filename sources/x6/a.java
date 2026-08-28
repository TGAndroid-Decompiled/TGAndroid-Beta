package x6;

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
import org.telegram.ui.Cells.j2;
public abstract class a {
    public static volatile com.google.firebase.messaging.s f48995b;
    public static final Object f48994a = new Object();
    public static final a1 f48996c = new a1("id");
    public static final a1 d = new a1("type");

    public static int a(int i9, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 != 0) {
            int i11 = i9 / i10;
            int i12 = i9 - (i10 * i11);
            if (i12 != 0) {
                int i13 = ((i9 ^ i10) >> 31) | 1;
                switch (n0.f49044a[roundingMode.ordinal()]) {
                    case 1:
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    case 2:
                        return i11;
                    case 3:
                        if (i13 >= 0) {
                            return i11;
                        }
                        break;
                    case 4:
                        break;
                    case 5:
                        if (i13 <= 0) {
                            return i11;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int abs = Math.abs(i12);
                        int abs2 = abs - (Math.abs(i10) - abs);
                        if (abs2 == 0) {
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                            return i11;
                        } else if (abs2 <= 0) {
                            return i11;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                return i11 + i13;
            }
            return i11;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static int b(o oVar) {
        int i9;
        int i10 = 0;
        for (Object obj : oVar) {
            if (obj != null) {
                i9 = obj.hashCode();
            } else {
                i9 = 0;
            }
            i10 += i9;
        }
        return i10;
    }

    public static String c(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String h;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                h = "null";
            } else {
                try {
                    h = obj.toString();
                } catch (Exception e10) {
                    String z10 = aa.d.z(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(z10), (Throwable) e10);
                    h = j2.h("<", z10, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i10] = h;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i9 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i9]);
            i9++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i9 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String d(s0 s0Var) {
        StringBuilder sb2 = new StringBuilder(s0Var.p());
        for (int i9 = 0; i9 < s0Var.p(); i9++) {
            byte i10 = s0Var.i(i9);
            if (i10 != 34) {
                if (i10 != 39) {
                    if (i10 != 92) {
                        switch (i10) {
                            case 7:
                                sb2.append("\\a");
                                continue;
                            case 8:
                                sb2.append("\\b");
                                continue;
                            case 9:
                                sb2.append("\\t");
                                continue;
                            case 10:
                                sb2.append("\\n");
                                continue;
                            case 11:
                                sb2.append("\\v");
                                continue;
                            case 12:
                                sb2.append("\\f");
                                continue;
                            case 13:
                                sb2.append("\\r");
                                continue;
                            default:
                                if (i10 >= 32 && i10 <= 126) {
                                    sb2.append((char) i10);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((i10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((i10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((i10 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }

    public static void e(int i9, int i10) {
        String c10;
        if (i9 >= 0 && i9 < i10) {
            return;
        }
        if (i9 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(j3.r0.l(i10, "negative size: "));
            }
            c10 = c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
        } else {
            c10 = c("%s (%s) must not be negative", "index", Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException(c10);
    }

    public static void f(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException(aa.d.o("null value in entry: ", obj.toString(), "=null"));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    public static final void g(StringBuilder sb2, Iterator it, d7.u uVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(d7.u.m2(entry.getKey()));
            sb2.append(" : ");
            sb2.append(d7.u.m2(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(d7.u.m2(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(d7.u.m2(entry2.getValue()));
            }
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static boolean i(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = v.f49065b;
            }
        } else if (collection instanceof c0) {
            obj = ((s) ((c0) collection)).d;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static byte[] j(byte[]... bArr) {
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= bArr.length) {
                break;
            }
            i10 += bArr[i9].length;
            i9++;
        }
        byte[] bArr2 = new byte[i10];
        int i11 = 0;
        for (byte[] bArr3 : bArr) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i11, length);
            i11 += length;
        }
        return bArr2;
    }

    public static final c1 k(e1 e1Var) {
        long j10;
        try {
            d1 d9 = e1Var.d();
            if (d9 != null) {
                try {
                    try {
                        byte b10 = d9.f49000a;
                        byte b11 = d9.f49001b;
                        int i9 = 0;
                        if (b10 != Byte.MIN_VALUE) {
                            if (b10 != -96) {
                                if (b10 != -64) {
                                    if (b10 != -32) {
                                        if (b10 != 0 && b10 != 32) {
                                            if (b10 != 64) {
                                                if (b10 == 96) {
                                                    e1Var.h((byte) 96);
                                                    String str = new String(e1Var.j(), StandardCharsets.UTF_8);
                                                    l(b11, str.length());
                                                    return new a1(str);
                                                }
                                                throw new IOException("Unidentifiable major type: " + ((b10 >> 5) & 7));
                                            }
                                            e1Var.h((byte) 64);
                                            byte[] j11 = e1Var.j();
                                            int length = j11.length;
                                            l(b11, length);
                                            return new w0(s0.t(length, j11));
                                        }
                                        long b12 = e1Var.b();
                                        if (b12 > 0) {
                                            j10 = b12;
                                        } else {
                                            j10 = ~b12;
                                        }
                                        l(b11, j10);
                                        return new y0(b12);
                                    }
                                    return new v0(e1Var.e());
                                }
                                throw new IOException("Tags are currently unsupported");
                            }
                            long c10 = e1Var.c();
                            if (c10 <= 1000) {
                                l(b11, c10);
                                int i10 = (int) c10;
                                w4.e[] eVarArr = new w4.e[i10];
                                c1 c1Var = null;
                                int i11 = 0;
                                while (i11 < c10) {
                                    c1 k10 = k(e1Var);
                                    if (c1Var != null && k10.compareTo(c1Var) <= 0) {
                                        String obj = c1Var.toString();
                                        String obj2 = k10.toString();
                                        throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + obj + "\nCurrent key: " + obj2);
                                    }
                                    eVarArr[i11] = new w4.e(7, k10, k(e1Var));
                                    i11++;
                                    c1Var = k10;
                                }
                                TreeMap treeMap = new TreeMap();
                                while (i9 < i10) {
                                    w4.e eVar = eVarArr[i9];
                                    if (!treeMap.containsKey((c1) eVar.f48761b)) {
                                        treeMap.put((c1) eVar.f48761b, (c1) eVar.f48762c);
                                        i9++;
                                    } else {
                                        throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                    }
                                }
                                return new z0(r.b(treeMap));
                            }
                            throw new IOException("Parser being asked to read a large CBOR map");
                        }
                        long a2 = e1Var.a();
                        if (a2 <= 1000) {
                            l(b11, a2);
                            c1[] c1VarArr = new c1[(int) a2];
                            while (i9 < a2) {
                                c1VarArr[i9] = k(e1Var);
                                i9++;
                            }
                            return new u0(m.u(c1VarArr));
                        }
                        throw new IOException("Parser being asked to read a large CBOR array");
                    } catch (IOException | RuntimeException e10) {
                        e = e10;
                        throw new x0(e);
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    throw new x0(e);
                }
            }
            throw new IOException("Parser being asked to parse an empty input stream");
        } catch (IOException e12) {
            throw new x0(e12);
        }
    }

    public static final void l(byte b10, long j10) {
        switch (b10) {
            case 24:
                if (j10 >= 24) {
                    return;
                }
                throw new IOException(aa.d.n(j10, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
            case 25:
                if (j10 < 256) {
                    throw new IOException(aa.d.n(j10, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j10 < 65536) {
                    throw new IOException(aa.d.n(j10, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j10 < 4294967296L) {
                    throw new IOException(aa.d.n(j10, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static void m(int i9, int i10, int i11) {
        String n10;
        if (i9 >= 0 && i10 >= i9 && i10 <= i11) {
            return;
        }
        if (i9 >= 0 && i9 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                n10 = c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9));
            } else {
                n10 = n(i10, i11, "end index");
            }
        } else {
            n10 = n(i9, i11, "start index");
        }
        throw new IndexOutOfBoundsException(n10);
    }

    public static String n(int i9, int i10, String str) {
        if (i9 < 0) {
            return c("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(j3.r0.l(i10, "negative size: "));
    }
}
