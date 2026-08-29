package u3;

import android.util.SparseArray;
import f5.d0;
import f5.w;
import j$.util.DesugarCollections;
import j3.t1;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import o3.h;
import o3.k;
import o3.l;
import o3.m;
import o3.x;
import p2.u;
public final class e implements k {
    public static final byte[] f48992c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f48993d0;
    public static final byte[] f48994e0;
    public static final byte[] f48995f0;
    public static final UUID f48996g0;
    public static final Map f48997h0;
    public long A;
    public long B;
    public u C;
    public u D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final b f48998a;
    public boolean f48999a0;
    public final f f49000b;
    public m f49001b0;
    public final SparseArray f49002c;
    public final boolean d;
    public final w f49003e;
    public final w f49004f;
    public final w f49005g;
    public final w h;
    public final w f49006i;
    public final w f49007j;
    public final w f49008k;
    public final w f49009l;
    public final w f49010m;
    public final w f49011n;
    public ByteBuffer f49012o;
    public long f49013p;
    public long f49014q;
    public long f49015r;
    public long f49016s;
    public long f49017t;
    public d f49018u;
    public boolean v;
    public int f49019w;
    public long f49020x;
    public boolean f49021y;
    public long f49022z;

    static {
        int i10 = d0.f6579a;
        f48993d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(p8.d.f45658c);
        f48994e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f48995f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f48996g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        c.i(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        c.i(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f48997h0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public e(int i10) {
        boolean z10;
        b bVar = new b();
        this.f49014q = -1L;
        this.f49015r = -9223372036854775807L;
        this.f49016s = -9223372036854775807L;
        this.f49017t = -9223372036854775807L;
        this.f49022z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f48998a = bVar;
        bVar.d = new o1.a(this, 26);
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f49000b = new f();
        this.f49002c = new SparseArray();
        this.f49005g = new w(4);
        this.h = new w(ByteBuffer.allocate(4).putInt(-1).array());
        this.f49006i = new w(4);
        this.f49003e = new w(f5.a.d);
        this.f49004f = new w(4);
        this.f49007j = new w();
        this.f49008k = new w();
        this.f49009l = new w(8);
        this.f49010m = new w();
        this.f49011n = new w();
        this.L = new int[1];
    }

    public static byte[] g(long j10, long j11, String str) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        f5.a.f(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = d0.f6579a;
        return format.getBytes(p8.d.f45658c);
    }

    public final void a(int i10) {
        if (this.C != null && this.D != null) {
            return;
        }
        throw t1.a("Element " + i10 + " must be in a Cues", null);
    }

    public final void b(int i10) {
        if (this.f49018u != null) {
            return;
        }
        throw t1.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    public final void c(u3.d r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: u3.e.c(u3.d, long, int, int, int):void");
    }

    @Override
    public final int d(o3.l r37, o3.n r38) {
        throw new UnsupportedOperationException("Method not decompiled: u3.e.d(o3.l, o3.n):int");
    }

    @Override
    public final boolean e(l lVar) {
        long g10;
        int i10;
        u uVar = new u(11, (byte) 0);
        w wVar = (w) uVar.f45495c;
        h hVar = (h) lVar;
        long j10 = hVar.f19095c;
        long j11 = 1024;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        if (i11 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i12 = (int) j11;
        hVar.f(wVar.f6640a, 0, 4, false);
        long s10 = wVar.s();
        uVar.f45494b = 4;
        while (true) {
            if (s10 != 440786851) {
                int i13 = uVar.f45494b + 1;
                uVar.f45494b = i13;
                if (i13 == i12) {
                    break;
                }
                hVar.f(wVar.f6640a, 0, 1, false);
                s10 = ((s10 << 8) & (-256)) | (wVar.f6640a[0] & 255);
            } else {
                long g11 = uVar.g(hVar);
                long j12 = uVar.f45494b;
                if (g11 != Long.MIN_VALUE && (i11 == 0 || j12 + g11 < j10)) {
                    while (true) {
                        int i14 = (uVar.f45494b > (j12 + g11) ? 1 : (uVar.f45494b == (j12 + g11) ? 0 : -1));
                        if (i14 < 0) {
                            if (uVar.g(hVar) == Long.MIN_VALUE || (g10 = uVar.g(hVar)) < 0 || g10 > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) g10;
                                hVar.b(i15, false);
                                uVar.f45494b += i15;
                            }
                        } else if (i14 == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void f(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        b bVar = this.f48998a;
        bVar.f48966e = 0;
        bVar.f48964b.clear();
        f fVar = bVar.f48965c;
        fVar.f49024b = 0;
        fVar.f49025c = 0;
        f fVar2 = this.f49000b;
        fVar2.f49024b = 0;
        fVar2.f49025c = 0;
        j();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f49002c;
            if (i10 < sparseArray.size()) {
                x xVar = ((d) sparseArray.valueAt(i10)).T;
                if (xVar != null) {
                    xVar.f19124b = false;
                    xVar.f19125c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void h(l lVar, int i10) {
        w wVar = this.f49005g;
        if (wVar.f6642c >= i10) {
            return;
        }
        byte[] bArr = wVar.f6640a;
        if (bArr.length < i10) {
            wVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = wVar.f6640a;
        int i11 = wVar.f6642c;
        lVar.readFully(bArr2, i11, i10 - i11);
        wVar.B(i10);
    }

    @Override
    public final void i(m mVar) {
        this.f49001b0 = mVar;
    }

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f48999a0 = false;
        this.f49007j.z(0);
    }

    public final long k(long j10) {
        long j11 = this.f49015r;
        if (j11 != -9223372036854775807L) {
            return d0.O(j10, j11, 1000L);
        }
        throw t1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(l lVar, d dVar, int i10, boolean z10) {
        int a2;
        int a10;
        boolean z11;
        boolean z12;
        int i11;
        if ("S_TEXT/UTF8".equals(dVar.f48970b)) {
            m(lVar, f48992c0, i10);
            int i12 = this.T;
            j();
            return i12;
        } else if ("S_TEXT/ASS".equals(dVar.f48970b)) {
            m(lVar, f48994e0, i10);
            int i13 = this.T;
            j();
            return i13;
        } else if ("S_TEXT/WEBVTT".equals(dVar.f48970b)) {
            m(lVar, f48995f0, i10);
            int i14 = this.T;
            j();
            return i14;
        } else {
            o3.w wVar = dVar.X;
            boolean z13 = this.V;
            w wVar2 = this.f49007j;
            boolean z14 = true;
            if (!z13) {
                boolean z15 = dVar.h;
                w wVar3 = this.f49005g;
                if (z15) {
                    this.O &= -1073741825;
                    int i15 = 128;
                    if (!this.W) {
                        lVar.readFully(wVar3.f6640a, 0, 1);
                        this.S++;
                        byte b10 = wVar3.f6640a[0];
                        if ((b10 & 128) != 128) {
                            this.Z = b10;
                            this.W = true;
                        } else {
                            throw t1.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b11 = this.Z;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.O |= 1073741824;
                        if (!this.f48999a0) {
                            w wVar4 = this.f49009l;
                            lVar.readFully(wVar4.f6640a, 0, 8);
                            this.S += 8;
                            this.f48999a0 = true;
                            byte[] bArr = wVar3.f6640a;
                            if (!z12) {
                                i15 = 0;
                            }
                            bArr[0] = (byte) (i15 | 8);
                            wVar3.C(0);
                            wVar.d(1, wVar3);
                            this.T++;
                            wVar4.C(0);
                            wVar.d(8, wVar4);
                            this.T += 8;
                        }
                        if (z12) {
                            if (!this.X) {
                                lVar.readFully(wVar3.f6640a, 0, 1);
                                this.S++;
                                wVar3.C(0);
                                this.Y = wVar3.r();
                                this.X = true;
                            }
                            int i16 = this.Y * 4;
                            wVar3.z(i16);
                            lVar.readFully(wVar3.f6640a, 0, i16);
                            this.S += i16;
                            short s10 = (short) ((this.Y / 2) + 1);
                            int i17 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f49012o;
                            if (byteBuffer == null || byteBuffer.capacity() < i17) {
                                this.f49012o = ByteBuffer.allocate(i17);
                            }
                            this.f49012o.position(0);
                            this.f49012o.putShort(s10);
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                i11 = this.Y;
                                if (i18 >= i11) {
                                    break;
                                }
                                int u10 = wVar3.u();
                                if (i18 % 2 == 0) {
                                    this.f49012o.putShort((short) (u10 - i19));
                                } else {
                                    this.f49012o.putInt(u10 - i19);
                                }
                                i18++;
                                i19 = u10;
                            }
                            int i20 = (i10 - this.S) - i19;
                            if (i11 % 2 == 1) {
                                this.f49012o.putInt(i20);
                            } else {
                                this.f49012o.putShort((short) i20);
                                this.f49012o.putInt(0);
                            }
                            byte[] array = this.f49012o.array();
                            w wVar5 = this.f49010m;
                            wVar5.A(i17, array);
                            wVar.d(i17, wVar5);
                            this.T += i17;
                        }
                    }
                } else {
                    byte[] bArr2 = dVar.f48975i;
                    if (bArr2 != null) {
                        wVar2.A(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(dVar.f48970b)) {
                    z11 = z10;
                } else if (dVar.f48973f > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.O |= 268435456;
                    this.f49011n.z(0);
                    int i21 = (wVar2.f6642c + i10) - this.S;
                    wVar3.z(4);
                    byte[] bArr3 = wVar3.f6640a;
                    bArr3[0] = (byte) ((i21 >> 24) & 255);
                    bArr3[1] = (byte) ((i21 >> 16) & 255);
                    bArr3[2] = (byte) ((i21 >> 8) & 255);
                    bArr3[3] = (byte) (i21 & 255);
                    wVar.d(4, wVar3);
                    this.T += 4;
                }
                this.V = true;
            }
            int i22 = i10 + wVar2.f6642c;
            if (!"V_MPEG4/ISO/AVC".equals(dVar.f48970b) && !"V_MPEGH/ISO/HEVC".equals(dVar.f48970b)) {
                if (dVar.T != null) {
                    if (wVar2.f6642c != 0) {
                        z14 = false;
                    }
                    f5.a.i(z14);
                    dVar.T.c(lVar);
                }
                while (true) {
                    int i23 = this.S;
                    if (i23 >= i22) {
                        break;
                    }
                    int i24 = i22 - i23;
                    int a11 = wVar2.a();
                    if (a11 > 0) {
                        a10 = Math.min(i24, a11);
                        wVar.e(a10, wVar2);
                    } else {
                        a10 = wVar.a(lVar, i24, false);
                    }
                    this.S += a10;
                    this.T += a10;
                }
            } else {
                w wVar6 = this.f49004f;
                byte[] bArr4 = wVar6.f6640a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i25 = dVar.Y;
                int i26 = 4 - i25;
                while (this.S < i22) {
                    int i27 = this.U;
                    if (i27 == 0) {
                        int min = Math.min(i25, wVar2.a());
                        lVar.readFully(bArr4, i26 + min, i25 - min);
                        if (min > 0) {
                            wVar2.c(i26, min, bArr4);
                        }
                        this.S += i25;
                        wVar6.C(0);
                        this.U = wVar6.u();
                        w wVar7 = this.f49003e;
                        wVar7.C(0);
                        wVar.e(4, wVar7);
                        this.T += 4;
                    } else {
                        int a12 = wVar2.a();
                        if (a12 > 0) {
                            a2 = Math.min(i27, a12);
                            wVar.e(a2, wVar2);
                        } else {
                            a2 = wVar.a(lVar, i27, false);
                        }
                        this.S += a2;
                        this.T += a2;
                        this.U -= a2;
                    }
                }
            }
            if ("A_VORBIS".equals(dVar.f48970b)) {
                w wVar8 = this.h;
                wVar8.C(0);
                wVar.e(4, wVar8);
                this.T += 4;
            }
            int i28 = this.T;
            j();
            return i28;
        }
    }

    public final void m(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        w wVar = this.f49008k;
        byte[] bArr2 = wVar.f6640a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            wVar.getClass();
            wVar.A(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(wVar.f6640a, bArr.length, i10);
        wVar.C(0);
        wVar.B(length);
    }

    @Override
    public final void release() {
    }
}
