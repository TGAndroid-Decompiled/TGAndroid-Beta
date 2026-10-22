package w3;

import b2.s0;
import b2.t0;
import b2.v;
import b2.v0;
import c3.g0;
import c5.c0;
import ci.c7;
import e2.x;
import e9.k0;
import e9.l0;
import e9.n0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.UUID;
public abstract class p {
    public static final int[] f48556a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

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
            String str2 = ((t) obj).f48583a.f48561g.f4128s;
            if (v0.m(str2)) {
                return "video/mp4";
            }
            if (v0.i(str2)) {
                z10 = true;
            } else if (v0.k(str2)) {
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
            if (f48556a[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public static q3.e d(int i10, x xVar) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            xVar.O(8);
            String w9 = xVar.w(m10 - 16);
            return new q3.e("und", w9, w9);
        }
        e2.a.l("MetadataUtil", "Failed to parse comment attribute: " + f2.f.a(i10));
        return null;
    }

    public static q3.a e(x xVar) {
        String str;
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            int m11 = xVar.m();
            byte[] bArr = c.f48478a;
            int i10 = m11 & 16777215;
            if (i10 == 13) {
                str = "image/jpeg";
            } else if (i10 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                a1.g.x(i10, "Unrecognized cover art flags: ", "MetadataUtil");
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
                String j10 = i2.e.j(H, "");
                int H2 = xVar.H();
                if (H2 > 0) {
                    j10 = j10 + "/" + H2;
                }
                return new q3.n(str, null, n0.y(j10));
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
        int g10 = g(xVar);
        if (z11) {
            g10 = Math.min(1, g10);
        }
        if (g10 >= 0) {
            if (z10) {
                return new q3.n(str, null, n0.y(Integer.toString(g10)));
            }
            return new q3.e("und", str, Integer.toString(g10));
        }
        e2.a.l("MetadataUtil", "Failed to parse uint8 attribute: " + f2.f.a(i10));
        return null;
    }

    public static j6.l i(byte[] bArr) {
        UUID[] uuidArr;
        x xVar = new x(bArr);
        if (xVar.f8293c < 32) {
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
            a1.g.x(m11, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e = c.e(xVar.m());
        if (e > 1) {
            a1.g.x(e, "Unsupported pssh version: ", "PsshAtomUtil");
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
        obj.f14289b = uuid;
        obj.f14288a = e;
        obj.f14290c = bArr2;
        obj.d = uuidArr;
        return obj;
    }

    public static byte[] j(UUID uuid, byte[] bArr) {
        j6.l i10 = i(bArr);
        if (i10 == null) {
            return null;
        }
        UUID uuid2 = (UUID) i10.f14289b;
        if (!uuid.equals(uuid2)) {
            e2.a.l("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) i10.f14290c;
    }

    public static q3.n k(int i10, x xVar, String str) {
        int m10 = xVar.m();
        if (xVar.m() == 1684108385) {
            xVar.O(8);
            return new q3.n(str, null, n0.y(xVar.w(m10 - 16)));
        }
        e2.a.l("MetadataUtil", "Failed to parse text attribute: " + f2.f.a(i10));
        return null;
    }

    public static void l(int i10, t0 t0Var, v vVar, t0 t0Var2, t0... t0VarArr) {
        s0[] s0VarArr;
        if (t0Var2 == null) {
            t0Var2 = new t0(new s0[0]);
        }
        if (t0Var != null) {
            k0 t10 = n0.t();
            for (s0 s0Var : t0Var.f4007a) {
                if (f2.b.class.isAssignableFrom(s0Var.getClass())) {
                    t10.c((s0) f2.b.class.cast(s0Var));
                }
            }
            l0 listIterator = t10.f().listIterator(0);
            while (listIterator.hasNext()) {
                f2.b bVar = (f2.b) listIterator.next();
                if (!bVar.f10280a.equals("com.android.capture.fps") || i10 == 2) {
                    t0Var2 = t0Var2.a(bVar);
                }
            }
        }
        for (t0 t0Var3 : t0VarArr) {
            t0Var2 = t0Var2.b(t0Var3);
        }
        if (t0Var2.f4007a.length > 0) {
            vVar.f4068k = t0Var2;
        }
    }

    public static g0 m(c3.p pVar, boolean z10, boolean z11) {
        g0 g0Var;
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
            if (!pVar.j(xVar.f8291a, i17, 8, true)) {
                break;
            }
            long C = xVar.C();
            int m10 = xVar.m();
            if (C == 1) {
                j10 = j12;
                pVar.b(8, 8, xVar.f8291a);
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
                        C = (length2 - pVar.k()) + 8;
                        i12 = 8;
                    }
                }
                i11 = i18;
                i12 = 8;
            }
            long j14 = C;
            long j15 = i12;
            if (j14 < j15) {
                g0Var = null;
                if (m10 == 1718773093 && i12 == 8) {
                    j14 = j15;
                } else {
                    return new c7(m10, j14, i12);
                }
            } else {
                g0Var = null;
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
                                return new c7(m10, i20, 8);
                            }
                            xVar.K(i20);
                            i14 = 0;
                            pVar.b(0, i20, xVar.f8291a);
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
                                iArr = g0Var;
                            }
                            if (!z12) {
                                return new c0(m11, iArr);
                            }
                        } else {
                            i14 = 0;
                            if (i20 != 0) {
                                pVar.l(i20);
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
        g0Var = null;
        i10 = i17;
        if (!z12) {
            return m.f48550a;
        }
        if (z10 != i10) {
            if (i10 != 0) {
                return i.f48518b;
            }
            return i.f48519c;
        }
        return g0Var;
    }
}
