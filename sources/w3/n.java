package w3;

import b2.o0;
import b2.p0;
import b2.r0;
import c3.f0;
import com.google.android.gms.internal.vision.e2;
import e2.v;
import e9.i0;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
public abstract class n {
    public static final int[] f43518a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

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

    public static f2.a b(p0 p0Var, String str) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f1871a;
            if (i10 < o0VarArr.length) {
                o0 o0Var = o0VarArr[i10];
                if (o0Var instanceof f2.a) {
                    f2.a aVar = (f2.a) o0Var;
                    if (aVar.f7679a.equals(str)) {
                        return aVar;
                    }
                }
                i10++;
            } else {
                return null;
            }
        }
    }

    public static String c(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z10 = false;
        String str = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str2 = ((r) obj).f43545a.f43523g.f2002r;
            if (r0.m(str2)) {
                return "video/mp4";
            }
            if (r0.i(str2)) {
                z10 = true;
            } else if (r0.k(str2)) {
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

    public static boolean d(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 = 0; i11 < 29; i11++) {
            if (f43518a[i11] == i10) {
                return true;
            }
        }
        return false;
    }

    public static q3.e e(int i10, v vVar) {
        int j3 = vVar.j();
        if (vVar.j() == 1684108385) {
            vVar.K(8);
            String t10 = vVar.t(j3 - 16);
            return new q3.e("und", t10, t10);
        }
        e2.a.n("MetadataUtil", "Failed to parse comment attribute: " + dd.k.a(i10));
        return null;
    }

    public static q3.a f(v vVar) {
        String str;
        int j3 = vVar.j();
        if (vVar.j() == 1684108385) {
            int j10 = vVar.j();
            byte[] bArr = c.f43445a;
            int i10 = j10 & 16777215;
            if (i10 == 13) {
                str = "image/jpeg";
            } else if (i10 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                e2.l(i10, "Unrecognized cover art flags: ", "MetadataUtil");
                return null;
            }
            vVar.K(4);
            int i11 = j3 - 16;
            byte[] bArr2 = new byte[i11];
            vVar.h(0, i11, bArr2);
            return new q3.a(3, str, null, bArr2);
        }
        e2.a.n("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static q3.o g(int i10, v vVar, String str) {
        int j3 = vVar.j();
        if (vVar.j() == 1684108385 && j3 >= 22) {
            vVar.K(10);
            int D = vVar.D();
            if (D > 0) {
                String j10 = hc.b.j(D, "");
                int D2 = vVar.D();
                if (D2 > 0) {
                    j10 = j10 + "/" + D2;
                }
                return new q3.o(str, null, i0.z(j10));
            }
        }
        e2.a.n("MetadataUtil", "Failed to parse index/count attribute: " + dd.k.a(i10));
        return null;
    }

    public static int h(v vVar) {
        int j3 = vVar.j();
        if (vVar.j() == 1684108385) {
            vVar.K(8);
            int i10 = j3 - 16;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && (vVar.f7234a[vVar.f7235b] & 128) == 0) {
                            return vVar.B();
                        }
                    } else {
                        return vVar.A();
                    }
                } else {
                    return vVar.D();
                }
            } else {
                return vVar.x();
            }
        }
        e2.a.n("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static q3.j i(int i10, String str, v vVar, boolean z10, boolean z11) {
        int h = h(vVar);
        if (z11) {
            h = Math.min(1, h);
        }
        if (h >= 0) {
            if (z10) {
                return new q3.o(str, null, i0.z(Integer.toString(h)));
            }
            return new q3.e("und", str, Integer.toString(h));
        }
        e2.a.n("MetadataUtil", "Failed to parse uint8 attribute: " + dd.k.a(i10));
        return null;
    }

    public static j6.l j(byte[] bArr) {
        UUID[] uuidArr;
        v vVar = new v(bArr);
        if (vVar.f7236c < 32) {
            return null;
        }
        vVar.J(0);
        int a2 = vVar.a();
        int j3 = vVar.j();
        if (j3 != a2) {
            e2.a.n("PsshAtomUtil", "Advertised atom size (" + j3 + ") does not match buffer size: " + a2);
            return null;
        }
        int j10 = vVar.j();
        if (j10 != 1886614376) {
            e2.l(j10, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e = c.e(vVar.j());
        if (e > 1) {
            e2.l(e, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(vVar.r(), vVar.r());
        if (e == 1) {
            int B = vVar.B();
            uuidArr = new UUID[B];
            for (int i10 = 0; i10 < B; i10++) {
                uuidArr[i10] = new UUID(vVar.r(), vVar.r());
            }
        } else {
            uuidArr = null;
        }
        int B2 = vVar.B();
        int a10 = vVar.a();
        if (B2 != a10) {
            e2.a.n("PsshAtomUtil", "Atom data size (" + B2 + ") does not match the bytes left: " + a10);
            return null;
        }
        byte[] bArr2 = new byte[B2];
        vVar.h(0, B2, bArr2);
        ?? obj = new Object();
        obj.f11802b = uuid;
        obj.f11801a = e;
        obj.f11803c = bArr2;
        obj.d = uuidArr;
        return obj;
    }

    public static byte[] k(UUID uuid, byte[] bArr) {
        j6.l j3 = j(bArr);
        if (j3 == null) {
            return null;
        }
        UUID uuid2 = (UUID) j3.f11802b;
        if (!uuid.equals(uuid2)) {
            e2.a.n("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) j3.f11803c;
    }

    public static q3.o l(int i10, v vVar, String str) {
        int j3 = vVar.j();
        if (vVar.j() == 1684108385) {
            vVar.K(8);
            return new q3.o(str, null, i0.z(vVar.t(j3 - 16)));
        }
        e2.a.n("MetadataUtil", "Failed to parse text attribute: " + dd.k.a(i10));
        return null;
    }

    public static void m(int i10, p0 p0Var, b2.r rVar, p0 p0Var2, p0... p0VarArr) {
        if (p0Var2 == null) {
            p0Var2 = new p0(new o0[0]);
        }
        if (p0Var != null) {
            int i11 = 0;
            while (true) {
                o0[] o0VarArr = p0Var.f1871a;
                if (i11 >= o0VarArr.length) {
                    break;
                }
                o0 o0Var = o0VarArr[i11];
                if (o0Var instanceof f2.a) {
                    f2.a aVar = (f2.a) o0Var;
                    if (aVar.f7679a.equals("com.android.capture.fps")) {
                        if (i10 == 2) {
                            p0Var2 = p0Var2.a(aVar);
                        }
                    } else {
                        p0Var2 = p0Var2.a(aVar);
                    }
                }
                i11++;
            }
        }
        for (p0 p0Var3 : p0VarArr) {
            p0Var2 = p0Var2.b(p0Var3);
        }
        if (p0Var2.f1871a.length > 0) {
            rVar.f1940k = p0Var2;
        }
    }

    public static f0 n(c3.p pVar, boolean z10, boolean z11) {
        f0 f0Var;
        boolean z12;
        long j3;
        int i10;
        long j10;
        int i11;
        int[] iArr;
        long length = pVar.getLength();
        long j11 = 4096;
        long j12 = -1;
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i12 != 0 && length <= 4096) {
            j11 = length;
        }
        int i13 = (int) j11;
        v vVar = new v(64);
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (i15 < i13) {
            vVar.G(8);
            boolean z14 = true;
            if (!pVar.g(vVar.f7234a, i14, 8, true)) {
                break;
            }
            long z15 = vVar.z();
            int j13 = vVar.j();
            if (z15 == 1) {
                j3 = j12;
                pVar.b(8, 8, vVar.f7234a);
                i11 = 16;
                vVar.I(16);
                i10 = i15;
                j10 = vVar.r();
            } else {
                j3 = j12;
                if (z15 == 0) {
                    long length2 = pVar.getLength();
                    if (length2 != j3) {
                        i10 = i15;
                        z15 = (length2 - pVar.h()) + 8;
                        j10 = z15;
                        i11 = 8;
                    }
                }
                i10 = i15;
                j10 = z15;
                i11 = 8;
            }
            long j14 = i11;
            if (j10 < j14) {
                return new Object();
            }
            int i16 = i10 + i11;
            f0Var = null;
            if (j13 == 1836019574) {
                i13 += (int) j10;
                if (i12 != 0 && i13 > length) {
                    i13 = (int) length;
                }
                i15 = i16;
                j12 = j3;
            } else if (j13 != 1836019558 && j13 != 1836475768) {
                if (j13 == 1835295092) {
                    z13 = true;
                }
                long j15 = length;
                if ((i16 + j10) - j14 >= i13) {
                    break;
                }
                int i17 = (int) (j10 - j14);
                i15 = i16 + i17;
                if (j13 == 1718909296) {
                    if (i17 < 8) {
                        return new Object();
                    }
                    vVar.G(i17);
                    pVar.b(0, i17, vVar.f7234a);
                    if (d(vVar.j(), z11)) {
                        z13 = true;
                    }
                    vVar.K(4);
                    int a2 = vVar.a() / 4;
                    if (!z13 && a2 > 0) {
                        iArr = new int[a2];
                        int i18 = 0;
                        while (true) {
                            if (i18 < a2) {
                                int j16 = vVar.j();
                                iArr[i18] = j16;
                                if (d(j16, z11)) {
                                    break;
                                }
                                i18++;
                            } else {
                                z14 = z13;
                                break;
                            }
                        }
                    } else {
                        z14 = z13;
                        iArr = null;
                    }
                    if (!z14) {
                        ?? obj = new Object();
                        if (iArr != null) {
                            int i19 = h9.a.f9269c;
                            if (iArr.length == 0) {
                                return obj;
                            }
                            new h9.a(Arrays.copyOf(iArr, iArr.length));
                            return obj;
                        }
                        int i20 = h9.a.f9269c;
                        return obj;
                    }
                    z13 = z14;
                } else if (i17 != 0) {
                    pVar.j(i17);
                }
                j12 = j3;
                length = j15;
            } else {
                z12 = true;
                break;
            }
            i14 = 0;
        }
        f0Var = null;
        z12 = false;
        if (!z13) {
            return i.f43487c;
        }
        if (z10 != z12) {
            if (z12) {
                return i.f43485a;
            }
            return i.f43486b;
        }
        return f0Var;
    }
}
