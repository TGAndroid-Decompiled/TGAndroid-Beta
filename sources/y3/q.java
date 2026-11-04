package y3;

import d2.r0;
import d2.s0;
import d2.u0;
import ei.t6;
import g2.y;
import g9.f0;
import g9.g0;
import g9.i0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.UUID;
import k2.p1;
public abstract class q {
    public static final int[] f58993a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i3;
        int i10;
        if (bArr != null) {
            i3 = bArr.length;
        } else {
            i3 = 0;
        }
        int i11 = i3 + 32;
        if (uuidArr != null) {
            i11 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i11);
        allocate.putInt(i11);
        allocate.putInt(1886614376);
        if (uuidArr != null) {
            i10 = 16777216;
        } else {
            i10 = 0;
        }
        allocate.putInt(i10);
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
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            String str2 = ((u) obj).f59023a.f58999g.f8489s;
            if (u0.m(str2)) {
                return "video/mp4";
            }
            if (u0.i(str2)) {
                z10 = true;
            } else if (u0.k(str2)) {
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

    public static boolean c(int i3, boolean z10) {
        if ((i3 >>> 8) == 3368816) {
            return true;
        }
        if (i3 == 1751476579 && z10) {
            return true;
        }
        for (int i10 = 0; i10 < 29; i10++) {
            if (f58993a[i10] == i3) {
                return true;
            }
        }
        return false;
    }

    public static s3.e d(int i3, y yVar) {
        int m10 = yVar.m();
        if (yVar.m() == 1684108385) {
            yVar.O(8);
            String w10 = yVar.w(m10 - 16);
            return new s3.e("und", w10, w10);
        }
        g2.a.l("MetadataUtil", "Failed to parse comment attribute: " + ad.l.a(i3));
        return null;
    }

    public static s3.a e(y yVar) {
        String str;
        int m10 = yVar.m();
        if (yVar.m() == 1684108385) {
            int m11 = yVar.m();
            byte[] bArr = d.f58910a;
            int i3 = m11 & 16777215;
            if (i3 == 13) {
                str = "image/jpeg";
            } else if (i3 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                com.google.android.recaptcha.internal.a.o(i3, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            yVar.O(4);
            int i10 = m10 - 16;
            byte[] bArr2 = new byte[i10];
            yVar.k(0, i10, bArr2);
            return new s3.a(3, str, null, bArr2);
        }
        g2.a.l("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static s3.n f(int i3, y yVar, String str) {
        int m10 = yVar.m();
        if (yVar.m() == 1684108385 && m10 >= 22) {
            yVar.O(10);
            int H = yVar.H();
            if (H > 0) {
                String i10 = p1.i(H, "");
                int H2 = yVar.H();
                if (H2 > 0) {
                    i10 = i10 + "/" + H2;
                }
                return new s3.n(str, null, i0.u(i10));
            }
        }
        g2.a.l("MetadataUtil", "Failed to parse index/count attribute: " + ad.l.a(i3));
        return null;
    }

    public static int g(y yVar) {
        int m10 = yVar.m();
        if (yVar.m() == 1684108385) {
            yVar.O(8);
            int i3 = m10 - 16;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4 && (yVar.j() & 128) == 0) {
                            return yVar.E();
                        }
                    } else {
                        return yVar.D();
                    }
                } else {
                    return yVar.H();
                }
            } else {
                return yVar.A();
            }
        }
        g2.a.l("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static s3.i h(int i3, String str, y yVar, boolean z10, boolean z11) {
        int g7 = g(yVar);
        if (z11) {
            g7 = Math.min(1, g7);
        }
        if (g7 >= 0) {
            if (z10) {
                return new s3.n(str, null, i0.u(Integer.toString(g7)));
            }
            return new s3.e("und", str, Integer.toString(g7));
        }
        g2.a.l("MetadataUtil", "Failed to parse uint8 attribute: " + ad.l.a(i3));
        return null;
    }

    public static l6.n i(byte[] bArr) {
        UUID[] uuidArr;
        y yVar = new y(bArr);
        if (yVar.f11925c < 32) {
            return null;
        }
        yVar.N(0);
        int a10 = yVar.a();
        int m10 = yVar.m();
        if (m10 != a10) {
            g2.a.l("PsshAtomUtil", "Advertised atom size (" + m10 + ") does not match buffer size: " + a10);
            return null;
        }
        int m11 = yVar.m();
        if (m11 != 1886614376) {
            com.google.android.recaptcha.internal.a.o(m11, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e10 = d.e(yVar.m());
        if (e10 > 1) {
            com.google.android.recaptcha.internal.a.o(e10, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(yVar.u(), yVar.u());
        if (e10 == 1) {
            int E = yVar.E();
            uuidArr = new UUID[E];
            for (int i3 = 0; i3 < E; i3++) {
                uuidArr[i3] = new UUID(yVar.u(), yVar.u());
            }
        } else {
            uuidArr = null;
        }
        int E2 = yVar.E();
        int a11 = yVar.a();
        if (E2 != a11) {
            g2.a.l("PsshAtomUtil", "Atom data size (" + E2 + ") does not match the bytes left: " + a11);
            return null;
        }
        byte[] bArr2 = new byte[E2];
        yVar.k(0, E2, bArr2);
        ?? obj = new Object();
        obj.f18089b = uuid;
        obj.f18088a = e10;
        obj.f18090c = bArr2;
        obj.d = uuidArr;
        return obj;
    }

    public static byte[] j(UUID uuid, byte[] bArr) {
        l6.n i3 = i(bArr);
        if (i3 == null) {
            return null;
        }
        UUID uuid2 = (UUID) i3.f18089b;
        if (!uuid.equals(uuid2)) {
            g2.a.l("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) i3.f18090c;
    }

    public static s3.n k(int i3, y yVar, String str) {
        int m10 = yVar.m();
        if (yVar.m() == 1684108385) {
            yVar.O(8);
            return new s3.n(str, null, i0.u(yVar.w(m10 - 16)));
        }
        g2.a.l("MetadataUtil", "Failed to parse text attribute: " + ad.l.a(i3));
        return null;
    }

    public static void l(int i3, s0 s0Var, d2.u uVar, s0 s0Var2, s0... s0VarArr) {
        r0[] r0VarArr;
        if (s0Var2 == null) {
            s0Var2 = new s0(new r0[0]);
        }
        if (s0Var != null) {
            f0 p10 = i0.p();
            for (r0 r0Var : s0Var.f8366a) {
                if (h2.a.class.isAssignableFrom(r0Var.getClass())) {
                    p10.c((r0) h2.a.class.cast(r0Var));
                }
            }
            g0 listIterator = p10.f().listIterator(0);
            while (listIterator.hasNext()) {
                h2.a aVar = (h2.a) listIterator.next();
                if (!aVar.f14100a.equals("com.android.capture.fps") || i3 == 2) {
                    s0Var2 = s0Var2.a(aVar);
                }
            }
        }
        for (s0 s0Var3 : s0VarArr) {
            s0Var2 = s0Var2.b(s0Var3);
        }
        if (s0Var2.f8366a.length > 0) {
            uVar.f8424k = s0Var2;
        }
    }

    public static e3.f0 m(e3.p pVar, boolean z10, boolean z11) {
        e3.f0 f0Var;
        int i3;
        long j10;
        int i10;
        int i11;
        int i12;
        long j11;
        int i13;
        int[] iArr;
        long length = pVar.getLength();
        long j12 = -1;
        int i14 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j13 = 4096;
        if (i14 != 0 && length <= 4096) {
            j13 = length;
        }
        int i15 = (int) j13;
        y yVar = new y(64);
        int i16 = 0;
        int i17 = 0;
        boolean z12 = false;
        while (i17 < i15) {
            yVar.K(8);
            if (!pVar.h(yVar.f11923a, i16, 8, true)) {
                break;
            }
            long C = yVar.C();
            int m10 = yVar.m();
            if (C == 1) {
                j10 = j12;
                pVar.c(8, 8, yVar.f11923a);
                i11 = 16;
                yVar.M(16);
                C = yVar.u();
                i10 = i17;
            } else {
                j10 = j12;
                if (C == 0) {
                    long length2 = pVar.getLength();
                    if (length2 != j10) {
                        i10 = i17;
                        C = (length2 - pVar.k()) + 8;
                        i11 = 8;
                    }
                }
                i10 = i17;
                i11 = 8;
            }
            long j14 = C;
            long j15 = i11;
            if (j14 < j15) {
                f0Var = null;
                if (m10 == 1718773093 && i11 == 8) {
                    j14 = j15;
                } else {
                    return new t6(m10, j14, i11);
                }
            } else {
                f0Var = null;
            }
            int i18 = i10 + i11;
            if (m10 != 1836019574 && m10 != 1970628964) {
                i12 = i14;
            } else {
                i15 += (int) j14;
                i12 = i14;
                if (i14 != 0 && i15 > length) {
                    i15 = (int) length;
                }
                if (m10 == 1836019574) {
                    i17 = i18;
                    i14 = i12;
                    j12 = j10;
                    i16 = 0;
                }
            }
            if (m10 == 1953653099 || m10 == 1835297121 || m10 == 1835626086) {
                j11 = length;
                i13 = 0;
                i17 = i18;
            } else if (m10 != 1836019558 && m10 != 1836475768) {
                if (m10 == 1835295092) {
                    z12 = true;
                }
                if (m10 != 1937007212 || j14 <= 1000000) {
                    j11 = length;
                    if ((i18 + j14) - j15 < i15) {
                        int i19 = (int) (j14 - j15);
                        i17 = i18 + i19;
                        if (m10 == 1718909296) {
                            if (i19 < 8) {
                                return new t6(m10, i19, 8);
                            }
                            yVar.K(i19);
                            i13 = 0;
                            pVar.c(0, i19, yVar.f11923a);
                            int m11 = yVar.m();
                            if (c(m11, z11)) {
                                z12 = true;
                            }
                            yVar.O(4);
                            int a10 = yVar.a() / 4;
                            if (!z12 && a10 > 0) {
                                iArr = new int[a10];
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= a10) {
                                        break;
                                    }
                                    int m12 = yVar.m();
                                    iArr[i20] = m12;
                                    if (c(m12, z11)) {
                                        z12 = true;
                                        break;
                                    }
                                    i20++;
                                }
                            } else {
                                iArr = f0Var;
                            }
                            if (!z12) {
                                return new e5.u(iArr, m11);
                            }
                        } else {
                            i13 = 0;
                            if (i19 != 0) {
                                pVar.n(i19);
                            }
                        }
                    }
                }
                i3 = 0;
                break;
            } else {
                i3 = 1;
                break;
            }
            i16 = i13;
            i14 = i12;
            j12 = j10;
            length = j11;
        }
        f0Var = null;
        i3 = i16;
        if (!z12) {
            return n.f58986a;
        }
        if (z10 != i3) {
            if (i3 != 0) {
                return j.f58952b;
            }
            return j.f58953c;
        }
        return f0Var;
    }
}
