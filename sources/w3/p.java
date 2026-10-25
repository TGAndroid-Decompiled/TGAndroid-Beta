package w3;

import b2.t0;
import b2.u0;
import b2.w;
import b2.w0;
import d5.z;
import di.b7;
import e2.x;
import f9.f0;
import f9.g0;
import f9.i0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.UUID;
public abstract class p {
    public static final int[] f50738a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i10;
        int i11;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        int i12 = i10 + 32;
        if (uuidArr != null) {
            i12 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i12);
        allocate.putInt(i12);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i11 = 16777216;
        } else {
            i11 = 0;
        }
        allocate.putInt(i11);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        } else {
            allocate.putInt(0);
        }
        return allocate.array();
    }

    public static String b(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z10 = false;
        String str = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = ((t) obj).f50765a.f50743g.f3586s;
            if (w0.m(str2)) {
                return "video/mp4";
            }
            if (w0.i(str2)) {
                z10 = true;
            } else if (w0.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z10) {
            return "audio/mp4";
        }
        if (str != null) {
            return str;
        }
        return "application/mp4";
    }

    public static boolean c(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 = 0; i11 < 29; i11++) {
            if (f50738a[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public static q3.e d(int i10, x xVar) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            xVar.O(8);
            String w10 = xVar.w(m10 - 16);
            return new q3.e("und", w10, w10);
        }
        e2.a.l("MetadataUtil", "Failed to parse comment attribute: " + f2.f.a(i10));
        return null;
    }

    public static q3.a e(x xVar) {
        String str;
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            int m11 = xVar.m();
            byte[] bArr = c.f50660a;
            int i10 = m11 & 16777215;
            if (i10 == 13) {
                str = "image/jpeg";
            } else if (i10 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                a1.g.z(i10, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            xVar.O(4);
            int i11 = m10 - 16;
            byte[] bArr2 = new byte[i11];
            xVar.k(0, i11, bArr2);
            return new q3.a(3, str, null, bArr2);
        }
        e2.a.l("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static q3.n f(int i10, x xVar, String str) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385 && m10 >= 22) {
            xVar.O(10);
            int H = xVar.H();
            if (H > 0) {
                String i11 = ic.a.i(H, "");
                int H2 = xVar.H();
                if (H2 > 0) {
                    i11 = i11 + "/" + H2;
                }
                return new q3.n(str, null, i0.y(i11));
            }
        }
        e2.a.l("MetadataUtil", "Failed to parse index/count attribute: " + f2.f.a(i10));
        return null;
    }

    public static int g(x xVar) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            xVar.O(8);
            int i10 = m10 - 16;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (xVar.j() & 128) == 0) {
                            return xVar.E();
                        }
                    } else {
                        return xVar.D();
                    }
                } else {
                    return xVar.H();
                }
            } else {
                return xVar.A();
            }
        }
        e2.a.l("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static q3.i h(int i10, String str, x xVar, boolean z10, boolean z11) {
        int g7 = g(xVar);
        if (z11) {
            g7 = Math.min(1, g7);
        }
        if (g7 >= 0) {
            if (z10) {
                return new q3.n(str, null, i0.y(Integer.toString(g7)));
            }
            return new q3.e("und", str, Integer.toString(g7));
        }
        e2.a.l("MetadataUtil", "Failed to parse uint8 attribute: " + f2.f.a(i10));
        return null;
    }

    public static k6.m i(byte[] bArr) {
        UUID[] uuidArr;
        x xVar = new x(bArr);
        if (xVar.f9734c < 32) {
            return null;
        }
        xVar.N(0);
        int a2 = xVar.a();
        int m10 = xVar.m();
        if (m10 != a2) {
            e2.a.l("PsshAtomUtil", "Advertised atom size (" + m10 + ") does not match buffer size: " + a2);
            return null;
        }
        int m11 = xVar.m();
        if (m11 != 1886614376) {
            a1.g.z(m11, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e = c.e(xVar.m());
        if (e > 1) {
            a1.g.z(e, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(xVar.u(), xVar.u());
        if (e == 1) {
            int E = xVar.E();
            uuidArr = new UUID[E];
            for (int i10 = 0; i10 < E; i10++) {
                uuidArr[i10] = new UUID(xVar.u(), xVar.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = xVar.E();
        int a10 = xVar.a();
        if (E2 != a10) {
            e2.a.l("PsshAtomUtil", "Atom data size (" + E2 + ") does not match the bytes left: " + a10);
            return null;
        }
        byte[] bArr2 = new byte[E2];
        xVar.k(0, E2, bArr2);
        ?? obj = new Object();
        obj.f16424b = uuid;
        obj.f16423a = e;
        obj.f16425c = bArr2;
        obj.d = uuidArr;
        return obj;
    }

    public static byte[] j(UUID uuid, byte[] bArr) {
        k6.m i10 = i(bArr);
        if (i10 == null) {
            return null;
        }
        UUID uuid2 = (UUID) i10.f16424b;
        if (!uuid.equals(uuid2)) {
            e2.a.l("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) i10.f16425c;
    }

    public static q3.n k(int i10, x xVar, String str) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            xVar.O(8);
            return new q3.n(str, null, i0.y(xVar.w(m10 - 16)));
        }
        e2.a.l("MetadataUtil", "Failed to parse text attribute: " + f2.f.a(i10));
        return null;
    }

    public static void l(int i10, u0 u0Var, w wVar, u0 u0Var2, u0... u0VarArr) {
        t0[] t0VarArr;
        if (u0Var2 == null) {
            u0Var2 = new u0(new t0[0]);
        }
        if (u0Var != null) {
            f0 t10 = i0.t();
            for (t0 t0Var : u0Var.f3465a) {
                if (f2.b.class.isAssignableFrom(t0Var.getClass())) {
                    t10.c((t0) f2.b.class.cast(t0Var));
                }
            }
            g0 listIterator = t10.f().listIterator(0);
            while (listIterator.hasNext()) {
                f2.b bVar = (f2.b) listIterator.next();
                if (!bVar.f10056a.equals("com.android.capture.fps") || i10 == 2) {
                    u0Var2 = u0Var2.a(bVar);
                }
            }
        }
        for (u0 u0Var3 : u0VarArr) {
            u0Var2 = u0Var2.b(u0Var3);
        }
        if (u0Var2.f3465a.length > 0) {
            wVar.f3526k = u0Var2;
        }
    }

    public static c3.f0 m(c3.p pVar, boolean z10, boolean z11) {
        c3.f0 f0Var;
        int i10;
        long j10;
        int i11;
        int i12;
        int i13;
        long j11;
        int i14;
        int[] iArr;
        long length = pVar.getLength();
        long j12 = -1;
        int i15 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j13 = 4096;
        if (i15 != 0 && length <= 4096) {
            j13 = length;
        }
        int i16 = (int) j13;
        x xVar = new x(64);
        int i17 = 0;
        int i18 = 0;
        boolean z12 = false;
        while (i18 < i16) {
            xVar.K(8);
            if (!pVar.h(xVar.f9732a, i17, 8, true)) {
                break;
            }
            long C = xVar.C();
            int m10 = xVar.m();
            if (C == 1) {
                j10 = j12;
                pVar.b(8, 8, xVar.f9732a);
                i12 = 16;
                xVar.M(16);
                C = xVar.u();
                i11 = i18;
            } else {
                j10 = j12;
                if (C == 0) {
                    long length2 = pVar.getLength();
                    if (length2 != j10) {
                        i11 = i18;
                        C = (length2 - pVar.i()) + 8;
                        i12 = 8;
                    }
                }
                i11 = i18;
                i12 = 8;
            }
            long j14 = C;
            long j15 = i12;
            if (j14 < j15) {
                f0Var = null;
                if (m10 == 1718773093 && i12 == 8) {
                    j14 = j15;
                } else {
                    return new b7(m10, j14, i12);
                }
            } else {
                f0Var = null;
            }
            int i19 = i11 + i12;
            if (m10 != 1836019574 && m10 != 1970628964) {
                i13 = i15;
            } else {
                i16 += (int) j14;
                i13 = i15;
                if (i15 != 0 && i16 > length) {
                    i16 = (int) length;
                }
                if (m10 == 1836019574) {
                    i18 = i19;
                    i15 = i13;
                    j12 = j10;
                    i17 = 0;
                }
            }
            if (m10 == 1953653099 || m10 == 1835297121 || m10 == 1835626086) {
                j11 = length;
                i14 = 0;
                i18 = i19;
            } else if (m10 != 1836019558 && m10 != 1836475768) {
                if (m10 == 1835295092) {
                    z12 = true;
                }
                if (m10 != 1937007212 || j14 <= 1000000) {
                    j11 = length;
                    if ((i19 + j14) - j15 < i16) {
                        int i20 = (int) (j14 - j15);
                        i18 = i19 + i20;
                        if (m10 == 1718909296) {
                            if (i20 < 8) {
                                return new b7(m10, i20, 8);
                            }
                            xVar.K(i20);
                            i14 = 0;
                            pVar.b(0, i20, xVar.f9732a);
                            int m11 = xVar.m();
                            if (c(m11, z11)) {
                                z12 = true;
                            }
                            xVar.O(4);
                            int a2 = xVar.a() / 4;
                            if (!z12 && a2 > 0) {
                                iArr = new int[a2];
                                int i21 = 0;
                                while (true) {
                                    if (i21 >= a2) {
                                        break;
                                    }
                                    int m12 = xVar.m();
                                    iArr[i21] = m12;
                                    if (c(m12, z11)) {
                                        z12 = true;
                                        break;
                                    }
                                    i21++;
                                }
                            } else {
                                iArr = f0Var;
                            }
                            if (!z12) {
                                return new z(m11, iArr);
                            }
                        } else {
                            i14 = 0;
                            if (i20 != 0) {
                                pVar.j(i20);
                            }
                        }
                    }
                }
                i10 = 0;
                break;
            } else {
                i10 = 1;
                break;
            }
            i17 = i14;
            i15 = i13;
            j12 = j10;
            length = j11;
        }
        f0Var = null;
        i10 = i17;
        if (!z12) {
            return m.f50732a;
        }
        if (z10 != i10) {
            if (i10 != 0) {
                return i.f50700b;
            }
            return i.f50701c;
        }
        return f0Var;
    }
}
