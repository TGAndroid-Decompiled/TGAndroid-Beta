package p7;

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
import k2.p1;
public abstract class a {
    public static volatile l6.m f53336b;
    public static final Object f53335a = new Object();
    public static final b1 f53337c = new b1("id");
    public static final b1 d = new b1("type");

    public static int a(int i3, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 != 0) {
            int i11 = i3 / i10;
            int i12 = i3 - (i10 * i11);
            if (i12 != 0) {
                int i13 = ((i3 ^ i10) >> 31) | 1;
                switch (o0.f53391a[roundingMode.ordinal()]) {
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

    public static int b(p pVar) {
        int i3;
        int i10 = 0;
        for (Object obj : pVar) {
            if (obj != null) {
                i3 = obj.hashCode();
            } else {
                i3 = 0;
            }
            i10 += i3;
        }
        return i10;
    }

    public static String c(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String q10;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                q10 = "null";
            } else {
                try {
                    q10 = obj.toString();
                } catch (Exception e10) {
                    String C = a1.g.C(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(C), (Throwable) e10);
                    q10 = org.telegram.ui.Cells.f1.q("<", C, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i10] = q10;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i3 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i3]);
            i3++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i3 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i3]);
            for (int i12 = i3 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String d(t0 t0Var) {
        StringBuilder sb2 = new StringBuilder(t0Var.k());
        for (int i3 = 0; i3 < t0Var.k(); i3++) {
            byte h = t0Var.h(i3);
            if (h != 34) {
                if (h != 39) {
                    if (h != 92) {
                        switch (h) {
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
                                if (h >= 32 && h <= 126) {
                                    sb2.append((char) h);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((h >>> 6) & 3) + 48));
                                    sb2.append((char) (((h >>> 3) & 7) + 48));
                                    sb2.append((char) ((h & 7) + 48));
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

    public static void e(int i3, int i10) {
        String c2;
        if (i3 >= 0 && i3 < i10) {
            return;
        }
        if (i3 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(p1.i(i10, "negative size: "));
            }
            c2 = c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i10));
        } else {
            c2 = c("%s (%s) must not be negative", "index", Integer.valueOf(i3));
        }
        throw new IndexOutOfBoundsException(c2);
    }

    public static void f(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException(a1.g.q("null value in entry: ", obj.toString(), "=null"));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    public static final void g(StringBuilder sb2, Iterator it, nb.a aVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(nb.a.D(entry.getKey()));
            sb2.append(" : ");
            sb2.append(nb.a.D(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(nb.a.D(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(nb.a.D(entry2.getValue()));
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
                obj = w.f53412b;
            }
        } else if (collection instanceof d0) {
            obj = ((t) ((d0) collection)).d;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static byte[] j(byte[]... bArr) {
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i3 >= bArr.length) {
                break;
            }
            i10 += bArr[i3].length;
            i3++;
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

    public static final d1 k(f1 f1Var) {
        long j10;
        try {
            e1 d10 = f1Var.d();
            if (d10 != null) {
                try {
                    try {
                        byte b10 = d10.f53347a;
                        byte b11 = d10.f53348b;
                        int i3 = 0;
                        if (b10 != Byte.MIN_VALUE) {
                            if (b10 != -96) {
                                if (b10 != -64) {
                                    if (b10 != -32) {
                                        if (b10 != 0 && b10 != 32) {
                                            if (b10 != 64) {
                                                if (b10 == 96) {
                                                    f1Var.h((byte) 96);
                                                    String str = new String(f1Var.j(), StandardCharsets.UTF_8);
                                                    l(b11, str.length());
                                                    return new b1(str);
                                                }
                                                throw new IOException("Unidentifiable major type: " + ((b10 >> 5) & 7));
                                            }
                                            f1Var.h((byte) 64);
                                            byte[] j11 = f1Var.j();
                                            int length = j11.length;
                                            l(b11, length);
                                            return new x0(t0.o(length, j11));
                                        }
                                        long b12 = f1Var.b();
                                        if (b12 > 0) {
                                            j10 = b12;
                                        } else {
                                            j10 = ~b12;
                                        }
                                        l(b11, j10);
                                        return new z0(b12);
                                    }
                                    return new w0(f1Var.e());
                                }
                                throw new IOException("Tags are currently unsupported");
                            }
                            long c2 = f1Var.c();
                            if (c2 <= 1000) {
                                l(b11, c2);
                                int i10 = (int) c2;
                                mi.h0[] h0VarArr = new mi.h0[i10];
                                d1 d1Var = null;
                                int i11 = 0;
                                while (i11 < c2) {
                                    d1 k10 = k(f1Var);
                                    if (d1Var != null && k10.compareTo(d1Var) <= 0) {
                                        throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + d1Var.toString() + "\nCurrent key: " + k10.toString());
                                    }
                                    h0VarArr[i11] = new mi.h0(k10, k(f1Var), false, 19);
                                    i11++;
                                    d1Var = k10;
                                }
                                TreeMap treeMap = new TreeMap();
                                while (i3 < i10) {
                                    mi.h0 h0Var = h0VarArr[i3];
                                    if (!treeMap.containsKey((d1) h0Var.f19644b)) {
                                        treeMap.put((d1) h0Var.f19644b, (d1) h0Var.f19645c);
                                        i3++;
                                    } else {
                                        throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                    }
                                }
                                return new a1(s.c(treeMap));
                            }
                            throw new IOException("Parser being asked to read a large CBOR map");
                        }
                        long a10 = f1Var.a();
                        if (a10 <= 1000) {
                            l(b11, a10);
                            d1[] d1VarArr = new d1[(int) a10];
                            while (i3 < a10) {
                                d1VarArr[i3] = k(f1Var);
                                i3++;
                            }
                            return new v0(n.p(d1VarArr));
                        }
                        throw new IOException("Parser being asked to read a large CBOR array");
                    } catch (IOException | RuntimeException e10) {
                        e = e10;
                        throw new y0(e);
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    throw new y0(e);
                }
            }
            throw new IOException("Parser being asked to parse an empty input stream");
        } catch (IOException e12) {
            throw new y0(e12);
        }
    }

    public static final void l(byte b10, long j10) {
        switch (b10) {
            case 24:
                if (j10 >= 24) {
                    return;
                }
                throw new IOException(t4.c.e(j10, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
            case 25:
                if (j10 < 256) {
                    throw new IOException(t4.c.e(j10, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j10 < 65536) {
                    throw new IOException(t4.c.e(j10, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j10 < 4294967296L) {
                    throw new IOException(t4.c.e(j10, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static void m(int i3, int i10, int i11) {
        String n4;
        if (i3 >= 0 && i10 >= i3 && i10 <= i11) {
            return;
        }
        if (i3 >= 0 && i3 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                n4 = c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i3));
            } else {
                n4 = n(i10, i11, "end index");
            }
        } else {
            n4 = n(i3, i11, "start index");
        }
        throw new IndexOutOfBoundsException(n4);
    }

    public static String n(int i3, int i10, String str) {
        if (i3 < 0) {
            return c("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i10 >= 0) {
            return c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(p1.i(i10, "negative size: "));
    }
}
