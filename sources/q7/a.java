package q7;

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
public abstract class a {
    public static volatile ab.a0 f53866b;
    public static final Object f53865a = new Object();
    public static final a1 f53867c = new a1("id");
    public static final a1 d = new a1("type");

    public static int a(int i7, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 != 0) {
            int i11 = i7 / i10;
            int i12 = i7 - (i10 * i11);
            if (i12 != 0) {
                int i13 = ((i7 ^ i10) >> 31) | 1;
                switch (n0.f53915a[roundingMode.ordinal()]) {
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
        int i7;
        int i10 = 0;
        for (Object obj : oVar) {
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i10 += i7;
        }
        return i10;
    }

    public static String c(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m10;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj == null) {
                m10 = "null";
            } else {
                try {
                    m10 = obj.toString();
                } catch (Exception e10) {
                    String D = a8.p0.D(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(D), (Throwable) e10);
                    m10 = org.telegram.ui.Cells.f1.m("<", D, " threw ", e10.getClass().getName(), ">");
                }
            }
            objArr[i10] = m10;
            i10++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i11 = 0;
        while (true) {
            length2 = objArr.length;
            if (i7 >= length2 || (indexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, indexOf);
            sb2.append(objArr[i7]);
            i7++;
            i11 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i7 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i7]);
            for (int i12 = i7 + 1; i12 < objArr.length; i12++) {
                sb2.append(", ");
                sb2.append(objArr[i12]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static String d(s0 s0Var) {
        StringBuilder sb2 = new StringBuilder(s0Var.k());
        for (int i7 = 0; i7 < s0Var.k(); i7++) {
            byte f10 = s0Var.f(i7);
            if (f10 != 34) {
                if (f10 != 39) {
                    if (f10 != 92) {
                        switch (f10) {
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
                                if (f10 >= 32 && f10 <= 126) {
                                    sb2.append((char) f10);
                                    continue;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((f10 >>> 6) & 3) + 48));
                                    sb2.append((char) (((f10 >>> 3) & 7) + 48));
                                    sb2.append((char) ((f10 & 7) + 48));
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

    public static void e(int i7, int i10) {
        String c10;
        if (i7 >= 0 && i7 < i10) {
            return;
        }
        if (i7 >= 0) {
            if (i10 < 0) {
                throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
            }
            c10 = c("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
        } else {
            c10 = c("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        }
        throw new IndexOutOfBoundsException(c10);
    }

    public static void f(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException(a8.p0.p("null value in entry: ", obj.toString(), "=null"));
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }

    public static final void g(StringBuilder sb2, Iterator it, nb.a aVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(nb.a.t0(entry.getKey()));
            sb2.append(" : ");
            sb2.append(nb.a.t0(entry.getValue()));
            while (it.hasNext()) {
                sb2.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(nb.a.t0(entry2.getKey()));
                sb2.append(" : ");
                sb2.append(nb.a.t0(entry2.getValue()));
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
                obj = v.f53936b;
            }
        } else if (collection instanceof c0) {
            obj = ((s) ((c0) collection)).d;
        } else {
            return false;
        }
        return comparator.equals(obj);
    }

    public static byte[] j(byte[]... bArr) {
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i7 >= bArr.length) {
                break;
            }
            i10 += bArr[i7].length;
            i7++;
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
        long j3;
        try {
            d1 d2 = e1Var.d();
            if (d2 != null) {
                try {
                    try {
                        byte b10 = d2.f53871a;
                        byte b11 = d2.f53872b;
                        int i7 = 0;
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
                                            byte[] j10 = e1Var.j();
                                            int length = j10.length;
                                            l(b11, length);
                                            return new w0(s0.o(length, j10));
                                        }
                                        long b12 = e1Var.b();
                                        if (b12 > 0) {
                                            j3 = b12;
                                        } else {
                                            j3 = ~b12;
                                        }
                                        l(b11, j3);
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
                                m4.d0[] d0VarArr = new m4.d0[i10];
                                c1 c1Var = null;
                                int i11 = 0;
                                while (i11 < c10) {
                                    c1 k10 = k(e1Var);
                                    if (c1Var != null && k10.compareTo(c1Var) <= 0) {
                                        throw new IOException("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + c1Var.toString() + "\nCurrent key: " + k10.toString());
                                    }
                                    d0VarArr[i11] = new m4.d0(k10, k(e1Var));
                                    i11++;
                                    c1Var = k10;
                                }
                                TreeMap treeMap = new TreeMap();
                                while (i7 < i10) {
                                    m4.d0 d0Var = d0VarArr[i7];
                                    if (!treeMap.containsKey((c1) d0Var.f19608a)) {
                                        treeMap.put((c1) d0Var.f19608a, (c1) d0Var.f19609b);
                                        i7++;
                                    } else {
                                        throw new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                    }
                                }
                                return new z0(r.c(treeMap));
                            }
                            throw new IOException("Parser being asked to read a large CBOR map");
                        }
                        long a10 = e1Var.a();
                        if (a10 <= 1000) {
                            l(b11, a10);
                            c1[] c1VarArr = new c1[(int) a10];
                            while (i7 < a10) {
                                c1VarArr[i7] = k(e1Var);
                                i7++;
                            }
                            return new u0(m.p(c1VarArr));
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

    public static final void l(byte b10, long j3) {
        switch (b10) {
            case 24:
                if (j3 >= 24) {
                    return;
                }
                throw new IOException(rf.b.h(j3, "Integer value ", " after add info could have been represented in 0 additional bytes, but used 1"));
            case 25:
                if (j3 < 256) {
                    throw new IOException(rf.b.h(j3, "Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2"));
                }
                return;
            case 26:
                if (j3 < 65536) {
                    throw new IOException(rf.b.h(j3, "Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4"));
                }
                return;
            case 27:
                if (j3 < 4294967296L) {
                    throw new IOException(rf.b.h(j3, "Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8"));
                }
                return;
            default:
                return;
        }
    }

    public static void m(int i7, int i10, int i11) {
        String n10;
        if (i7 >= 0 && i10 >= i7 && i10 <= i11) {
            return;
        }
        if (i7 >= 0 && i7 <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                n10 = c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7));
            } else {
                n10 = n(i10, i11, "end index");
            }
        } else {
            n10 = n(i7, i11, "start index");
        }
        throw new IndexOutOfBoundsException(n10);
    }

    public static String n(int i7, int i10, String str) {
        if (i7 < 0) {
            return c("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(jg.g.j(i10, "negative size: "));
    }
}
