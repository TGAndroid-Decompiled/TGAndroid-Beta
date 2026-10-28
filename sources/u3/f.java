package u3;

import a8.yb;
import android.util.SparseArray;
import b2.w;
import b2.w0;
import b2.x0;
import c3.h0;
import c3.j0;
import c3.k0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import d5.z;
import e2.n0;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import z3.k;
public final class f implements o {
    public static final byte[] f49568k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f49569l0;
    public static final byte[] m0;
    public static final byte[] f49570n0;
    public static final UUID f49571o0;
    public static final Map f49572p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final b f49573a;
    public int f49574a0;
    public final g f49575b;
    public int f49576b0;
    public final SparseArray f49577c;
    public int f49578c0;
    public final boolean d;
    public boolean f49579d0;
    public final boolean e;
    public boolean f49580e0;
    public final k f49581f;
    public boolean f49582f0;
    public final x f49583g;
    public int f49584g0;
    public final x h;
    public byte f49585h0;
    public final x f49586i;
    public boolean f49587i0;
    public final x f49588j;
    public q f49589j0;
    public final x f49590k;
    public final x f49591l;
    public final x f49592m;
    public final x f49593n;
    public final x f49594o;
    public final x f49595p;
    public ByteBuffer f49596q;
    public long f49597r;
    public long f49598s;
    public long f49599t;
    public long f49600u;
    public long v;
    public boolean f49601w;
    public boolean f49602x;
    public e f49603y;
    public boolean f49604z;

    static {
        String str = n0.f9691a;
        f49569l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f49570n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f49571o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        h0.o(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        h0.o(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f49572p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i10) {
        boolean z10;
        b bVar = new b();
        this.f49598s = -1L;
        this.f49599t = -9223372036854775807L;
        this.f49600u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f49573a = bVar;
        bVar.d = new t6.f(this);
        this.f49581f = kVar;
        this.C = new SparseArray();
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.e = (i10 & 2) == 0;
        this.f49575b = new g();
        this.f49577c = new SparseArray();
        this.f49586i = new x(4);
        this.f49588j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f49590k = new x(4);
        this.f49583g = new x(f2.q.f10110a);
        this.h = new x(4);
        this.f49591l = new x();
        this.f49592m = new x();
        this.f49593n = new x(8);
        this.f49594o = new x();
        this.f49595p = new x();
        this.T = new int[1];
        this.f49602x = true;
    }

    public static byte[] j(long j10, long j11, String str) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.g(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        String str2 = n0.f9691a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean a(p pVar) {
        long q5;
        int i10;
        z zVar = new z(11, (short) 0);
        x xVar = (x) zVar.f8027c;
        l lVar = (l) pVar;
        long j10 = lVar.f6080c;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = 1024;
        if (i11 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i12 = (int) j11;
        lVar.h(xVar.f9731a, 0, 4, false);
        long C = xVar.C();
        zVar.f8026b = 4;
        while (true) {
            if (C != 440786851) {
                int i13 = zVar.f8026b + 1;
                zVar.f8026b = i13;
                if (i13 == i12) {
                    break;
                }
                lVar.h(xVar.f9731a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.f9731a[0] & 255);
            } else {
                long q9 = zVar.q(lVar);
                long j12 = zVar.f8026b;
                if (q9 != Long.MIN_VALUE && (i11 == 0 || j12 + q9 < j10)) {
                    while (true) {
                        int i14 = (zVar.f8026b > (j12 + q9) ? 1 : (zVar.f8026b == (j12 + q9) ? 0 : -1));
                        if (i14 < 0) {
                            if (zVar.q(lVar) == Long.MIN_VALUE || (q5 = zVar.q(lVar)) < 0 || q5 > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) q5;
                                lVar.u(i15, false);
                                zVar.f8026b += i15;
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
    public final void c(q qVar) {
        if (this.e) {
            qVar = new c2.b(qVar, this.f49581f);
        }
        this.f49589j0 = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f49573a;
        bVar.e = 0;
        bVar.f49533b.clear();
        g gVar = bVar.f49534c;
        gVar.f49606b = 0;
        gVar.f49607c = 0;
        g gVar2 = this.f49575b;
        gVar2.f49606b = 0;
        gVar2.f49607c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f49604z) {
            this.C.clear();
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f49577c;
            if (i10 < sparseArray.size()) {
                k0 k0Var = ((e) sparseArray.valueAt(i10)).V;
                if (k0Var != null) {
                    k0Var.f6074b = false;
                    k0Var.f6075c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10286b;
        return s1.e;
    }

    @Override
    public final int f(c3.p r44, c3.s r45) {
        throw new UnsupportedOperationException("Method not decompiled: u3.f.f(c3.p, c3.s):int");
    }

    public final void g(int i10) {
        if (this.D) {
            return;
        }
        throw x0.a(null, "Element " + i10 + " must be in a Cues");
    }

    public final void h(int i10) {
        if (this.f49603y != null) {
            return;
        }
        throw x0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void i(u3.e r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: u3.f.i(u3.e, long, int, int, int):void");
    }

    public final void k() {
        if (this.f49602x) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f49577c;
                if (i10 < sparseArray.size()) {
                    if (((e) sparseArray.valueAt(i10)).W) {
                        return;
                    }
                    i10++;
                } else {
                    q qVar = this.f49589j0;
                    qVar.getClass();
                    qVar.Q0();
                    this.f49602x = false;
                    return;
                }
            }
        }
    }

    public final void l(p pVar, int i10) {
        x xVar = this.f49586i;
        if (xVar.f9733c >= i10) {
            return;
        }
        byte[] bArr = xVar.f9731a;
        if (bArr.length < i10) {
            xVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = xVar.f9731a;
        int i11 = xVar.f9733c;
        pVar.readFully(bArr2, i11, i10 - i11);
        xVar.M(i10);
    }

    public final void m() {
        this.f49574a0 = 0;
        this.f49576b0 = 0;
        this.f49578c0 = 0;
        this.f49579d0 = false;
        this.f49580e0 = false;
        this.f49582f0 = false;
        this.f49584g0 = 0;
        this.f49585h0 = (byte) 0;
        this.f49587i0 = false;
        this.f49591l.K(0);
    }

    public final long n(long j10) {
        long j11 = this.f49599t;
        if (j11 != -9223372036854775807L) {
            String str = n0.f9691a;
            return n0.a0(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw x0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(p pVar, e eVar, int i10, boolean z10) {
        int a2;
        int a10;
        boolean z11;
        boolean z12;
        int i11;
        if ("S_TEXT/UTF8".equals(eVar.f49547c)) {
            p(pVar, f49568k0, i10);
            int i12 = this.f49576b0;
            m();
            return i12;
        } else if (!"S_TEXT/ASS".equals(eVar.f49547c) && !"S_TEXT/SSA".equals(eVar.f49547c)) {
            if ("S_TEXT/WEBVTT".equals(eVar.f49547c)) {
                p(pVar, f49570n0, i10);
                int i13 = this.f49576b0;
                m();
                return i13;
            }
            boolean z13 = true;
            if (eVar.W) {
                eVar.f49546b0.getClass();
                x xVar = new x(i10);
                if (pVar.h(xVar.f9731a, 0, i10, true)) {
                    pVar.p();
                    if (c3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        xVar.k(0, 10, bArr);
                        xVar.N(0);
                        int g7 = c3.b.g(bArr);
                        if (g7 > 0 && xVar.a() >= g7 + 4) {
                            xVar.O(g7);
                            if (c3.b.i(xVar.m()) == 2) {
                                w a11 = eVar.f49546b0.a();
                                a11.f3533r = w0.n("audio/vnd.dts.hd");
                                eVar.f49546b0 = new b2.x(a11);
                            }
                        }
                    }
                }
                eVar.f49544a0.b(eVar.f49546b0);
                eVar.W = false;
                k();
            }
            j0 j0Var = eVar.f49544a0;
            boolean z14 = this.f49579d0;
            x xVar2 = this.f49591l;
            if (!z14) {
                boolean z15 = eVar.f49551i;
                x xVar3 = this.f49586i;
                if (z15) {
                    this.W &= -1073741825;
                    int i14 = 128;
                    if (!this.f49580e0) {
                        pVar.readFully(xVar3.f9731a, 0, 1);
                        this.f49574a0++;
                        byte b10 = xVar3.f9731a[0];
                        if ((b10 & 128) != 128) {
                            this.f49585h0 = b10;
                            this.f49580e0 = true;
                        } else {
                            throw x0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f49585h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f49587i0) {
                            x xVar4 = this.f49593n;
                            pVar.readFully(xVar4.f9731a, 0, 8);
                            this.f49574a0 += 8;
                            this.f49587i0 = true;
                            byte[] bArr2 = xVar3.f9731a;
                            if (!z12) {
                                i14 = 0;
                            }
                            bArr2[0] = (byte) (i14 | 8);
                            xVar3.N(0);
                            j0Var.g(xVar3, 1, 1);
                            this.f49576b0++;
                            xVar4.N(0);
                            j0Var.g(xVar4, 8, 1);
                            this.f49576b0 += 8;
                        }
                        if (z12) {
                            if (!this.f49582f0) {
                                pVar.readFully(xVar3.f9731a, 0, 1);
                                this.f49574a0++;
                                xVar3.N(0);
                                this.f49584g0 = xVar3.A();
                                this.f49582f0 = true;
                            }
                            int i15 = this.f49584g0 * 4;
                            xVar3.K(i15);
                            pVar.readFully(xVar3.f9731a, 0, i15);
                            this.f49574a0 += i15;
                            short s10 = (short) ((this.f49584g0 / 2) + 1);
                            int i16 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f49596q;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f49596q = ByteBuffer.allocate(i16);
                            }
                            this.f49596q.position(0);
                            this.f49596q.putShort(s10);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.f49584g0;
                                if (i17 >= i11) {
                                    break;
                                }
                                int E = xVar3.E();
                                if (i17 % 2 == 0) {
                                    this.f49596q.putShort((short) (E - i18));
                                } else {
                                    this.f49596q.putInt(E - i18);
                                }
                                i17++;
                                i18 = E;
                            }
                            int i19 = (i10 - this.f49574a0) - i18;
                            if (i11 % 2 == 1) {
                                this.f49596q.putInt(i19);
                            } else {
                                this.f49596q.putShort((short) i19);
                                this.f49596q.putInt(0);
                            }
                            byte[] array = this.f49596q.array();
                            x xVar5 = this.f49594o;
                            xVar5.L(i16, array);
                            j0Var.g(xVar5, i16, 1);
                            this.f49576b0 += i16;
                        }
                    }
                } else {
                    byte[] bArr3 = eVar.f49552j;
                    if (bArr3 != null) {
                        xVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(eVar.f49547c)) {
                    z11 = z10;
                } else if (eVar.f49550g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.W |= 268435456;
                    this.f49595p.K(0);
                    int i20 = (xVar2.f9733c + i10) - this.f49574a0;
                    xVar3.K(4);
                    byte[] bArr4 = xVar3.f9731a;
                    bArr4[0] = (byte) ((i20 >> 24) & 255);
                    bArr4[1] = (byte) ((i20 >> 16) & 255);
                    bArr4[2] = (byte) ((i20 >> 8) & 255);
                    bArr4[3] = (byte) (i20 & 255);
                    j0Var.g(xVar3, 4, 2);
                    this.f49576b0 += 4;
                }
                this.f49579d0 = true;
            }
            int i21 = i10 + xVar2.f9733c;
            if (!"V_MPEG4/ISO/AVC".equals(eVar.f49547c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f49547c)) {
                if (eVar.V != null) {
                    if (xVar2.f9733c != 0) {
                        z13 = false;
                    }
                    yb.p(z13);
                    eVar.V.c(pVar);
                }
                while (true) {
                    int i22 = this.f49574a0;
                    if (i22 >= i21) {
                        break;
                    }
                    int i23 = i21 - i22;
                    int a12 = xVar2.a();
                    if (a12 > 0) {
                        a10 = Math.min(i23, a12);
                        j0Var.d(a10, xVar2);
                    } else {
                        a10 = j0Var.a(pVar, i23, false);
                    }
                    this.f49574a0 += a10;
                    this.f49576b0 += a10;
                }
            } else {
                x xVar6 = this.h;
                byte[] bArr5 = xVar6.f9731a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i24 = eVar.f49548c0;
                int i25 = 4 - i24;
                while (this.f49574a0 < i21) {
                    int i26 = this.f49578c0;
                    if (i26 == 0) {
                        int min = Math.min(i24, xVar2.a());
                        pVar.readFully(bArr5, i25 + min, i24 - min);
                        if (min > 0) {
                            xVar2.k(i25, min, bArr5);
                        }
                        this.f49574a0 += i24;
                        xVar6.N(0);
                        this.f49578c0 = xVar6.E();
                        x xVar7 = this.f49583g;
                        xVar7.N(0);
                        j0Var.d(4, xVar7);
                        this.f49576b0 += 4;
                    } else {
                        int a13 = xVar2.a();
                        if (a13 > 0) {
                            a2 = Math.min(i26, a13);
                            j0Var.d(a2, xVar2);
                        } else {
                            a2 = j0Var.a(pVar, i26, false);
                        }
                        this.f49574a0 += a2;
                        this.f49576b0 += a2;
                        this.f49578c0 -= a2;
                    }
                }
            }
            if ("A_VORBIS".equals(eVar.f49547c)) {
                x xVar8 = this.f49588j;
                xVar8.N(0);
                j0Var.d(4, xVar8);
                this.f49576b0 += 4;
            }
            int i27 = this.f49576b0;
            m();
            return i27;
        } else {
            p(pVar, m0, i10);
            int i28 = this.f49576b0;
            m();
            return i28;
        }
    }

    public final void p(p pVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        x xVar = this.f49592m;
        byte[] bArr2 = xVar.f9731a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.f9731a, bArr.length, i10);
        xVar.N(0);
        xVar.M(length);
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
