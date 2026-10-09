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
public abstract class p {
    public static final int[] f49846a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

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

    public static f2.b b(p0 p0Var, String str) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f3507a;
            if (i10 < o0VarArr.length) {
                o0 o0Var = o0VarArr[i10];
                if (o0Var instanceof f2.b) {
                    f2.b bVar = (f2.b) o0Var;
                    if (bVar.f9559a.equals(str)) {
                        return bVar;
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
            String str2 = ((t) obj).f49876a.f49852g.f3643r;
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
            if (f49846a[i11] == i10) {
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
        e2.a.n("MetadataUtil", "Failed to parse comment attribute: " + ed.k.a(i10));
        return null;
    }

    public static q3.a f(v vVar) {
        String str;
        int j3 = vVar.j();
        if (vVar.j() == 1684108385) {
            int j10 = vVar.j();
            byte[] bArr = e.f49768a;
            int i10 = j10 & 16777215;
            if (i10 == 13) {
                str = "image/jpeg";
            } else if (i10 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                e2.m(i10, "Unrecognized cover art flags: ", "MetadataUtil");
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
                String h = hg.c.h(D, "");
                int D2 = vVar.D();
                if (D2 > 0) {
                    h = h + "/" + D2;
                }
                return new q3.o(str, null, i0.z(h));
            }
        }
        e2.a.n("MetadataUtil", "Failed to parse index/count attribute: " + ed.k.a(i10));
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
                        if (i10 == 4 && (vVar.f8584a[vVar.f8585b] & 128) == 0) {
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
        e2.a.n("MetadataUtil", "Failed to parse uint8 attribute: " + ed.k.a(i10));
        return null;
    }

    public static j6.l j(byte[] bArr) {
        UUID[] uuidArr;
        v vVar = new v(bArr);
        if (vVar.f8586c < 32) {
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
            e2.m(j10, "Atom type is not pssh: ", "PsshAtomUtil");
            return null;
        }
        int e7 = e.e(vVar.j());
        if (e7 > 1) {
            e2.m(e7, "Unsupported pssh version: ", "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(vVar.r(), vVar.r());
        if (e7 == 1) {
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
        obj.f14062b = uuid;
        obj.f14061a = e7;
        obj.f14063c = bArr2;
        obj.d = uuidArr;
        return obj;
    }

    public static byte[] k(UUID uuid, byte[] bArr) {
        j6.l j3 = j(bArr);
        if (j3 == null) {
            return null;
        }
        UUID uuid2 = (UUID) j3.f14062b;
        if (!uuid.equals(uuid2)) {
            e2.a.n("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
            return null;
        }
        return (byte[]) j3.f14063c;
    }

    public static q3.o l(int i10, v vVar, String str) {
        int j3 = vVar.j();
        if (vVar.j() == 1684108385) {
            vVar.K(8);
            return new q3.o(str, null, i0.z(vVar.t(j3 - 16)));
        }
        e2.a.n("MetadataUtil", "Failed to parse text attribute: " + ed.k.a(i10));
        return null;
    }

    public static void m(int i10, p0 p0Var, b2.r rVar, p0 p0Var2, p0... p0VarArr) {
        if (p0Var2 == null) {
            p0Var2 = new p0(new o0[0]);
        }
        if (p0Var != null) {
            int i11 = 0;
            while (true) {
                o0[] o0VarArr = p0Var.f3507a;
                if (i11 >= o0VarArr.length) {
                    break;
                }
                o0 o0Var = o0VarArr[i11];
                if (o0Var instanceof f2.b) {
                    f2.b bVar = (f2.b) o0Var;
                    if (bVar.f9559a.equals("com.android.capture.fps")) {
                        if (i10 == 2) {
                            p0Var2 = p0Var2.a(bVar);
                        }
                    } else {
                        p0Var2 = p0Var2.a(bVar);
                    }
                }
                i11++;
            }
        }
        for (p0 p0Var3 : p0VarArr) {
            p0Var2 = p0Var2.b(p0Var3);
        }
        if (p0Var2.f3507a.length > 0) {
            rVar.f3579k = p0Var2;
        }
    }

    public static f0 n(c3.p pVar, boolean z10, boolean z11) {
        f0 f0Var;
        int i10;
        long j3;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        long length = pVar.getLength();
        long j10 = -1;
        int i14 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = 4096;
        if (i14 != 0 && length <= 4096) {
            j11 = length;
        }
        int i15 = (int) j11;
        v vVar = new v(64);
        int i16 = 0;
        int i17 = 0;
        boolean z12 = false;
        while (i17 < i15) {
            vVar.G(8);
            boolean z13 = true;
            if (!pVar.h(vVar.f8584a, i16, 8, true)) {
                break;
            }
            long z14 = vVar.z();
            int j12 = vVar.j();
            if (z14 == 1) {
                j3 = j10;
                pVar.a(8, 8, vVar.f8584a);
                i12 = 16;
                vVar.I(16);
                z14 = vVar.r();
                i11 = i17;
            } else {
                j3 = j10;
                if (z14 == 0) {
                    long length2 = pVar.getLength();
                    if (length2 != j3) {
                        i11 = i17;
                        z14 = (length2 - pVar.j()) + 8;
                        i12 = 8;
                    }
                }
                i11 = i17;
                i12 = 8;
            }
            long j13 = z14;
            long j14 = i12;
            if (j13 < j14) {
                return new Object();
            }
            int i18 = i11 + i12;
            f0Var = null;
            if (j12 == 1836019574) {
                i15 += (int) j13;
                if (i14 != 0 && i15 > length) {
                    i15 = (int) length;
                }
                i17 = i18;
                j10 = j3;
                i16 = 0;
            } else if (j12 != 1836019558 && j12 != 1836475768) {
                if (j12 == 1835295092) {
                    z12 = true;
                }
                long j15 = length;
                if ((i18 + j13) - j14 >= i15) {
                    i10 = 0;
                    break;
                }
                int i19 = (int) (j13 - j14);
                i17 = i18 + i19;
                if (j12 == 1718909296) {
                    if (i19 < 8) {
                        return new Object();
                    }
                    vVar.G(i19);
                    i13 = 0;
                    pVar.a(0, i19, vVar.f8584a);
                    if (d(vVar.j(), z11)) {
                        z12 = true;
                    }
                    vVar.K(4);
                    int a2 = vVar.a() / 4;
                    if (!z12 && a2 > 0) {
                        iArr = new int[a2];
                        int i20 = 0;
                        while (true) {
                            if (i20 < a2) {
                                int j16 = vVar.j();
                                iArr[i20] = j16;
                                if (d(j16, z11)) {
                                    break;
                                }
                                i20++;
                            } else {
                                z13 = z12;
                                break;
                            }
                        }
                    } else {
                        z13 = z12;
                        iArr = null;
                    }
                    if (!z13) {
                        ?? obj = new Object();
                        if (iArr != null) {
                            int i21 = h9.a.f11048c;
                            if (iArr.length == 0) {
                                return obj;
                            }
                            new h9.a(Arrays.copyOf(iArr, iArr.length));
                            return obj;
                        }
                        int i22 = h9.a.f11048c;
                        return obj;
                    }
                    z12 = z13;
                } else {
                    i13 = 0;
                    if (i19 != 0) {
                        pVar.l(i19);
                    }
                }
                i16 = i13;
                j10 = j3;
                length = j15;
            } else {
                i10 = 1;
                break;
            }
        }
        f0Var = null;
        i10 = i16;
        if (!z12) {
            return k.f49812c;
        }
        if (z10 != i10) {
            if (i10 != 0) {
                return k.f49810a;
            }
            return k.f49811b;
        }
        return f0Var;
    }
}
