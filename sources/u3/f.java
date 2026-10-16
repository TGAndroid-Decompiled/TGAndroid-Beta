package u3;

import android.util.SparseArray;
import b2.w;
import b2.w0;
import b2.x0;
import c3.i0;
import c3.j0;
import c3.o;
import c3.q;
import c5.c0;
import com.google.android.gms.internal.play_billing.k3;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import f2.p;
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
import v7.u6;
import z3.l;
public final class f implements o {
    public static final byte[] f46151k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f46152l0;
    public static final byte[] m0;
    public static final byte[] f46153n0;
    public static final UUID f46154o0;
    public static final Map f46155p0;
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
    public final b f46156a;
    public int f46157a0;
    public final g f46158b;
    public int f46159b0;
    public final SparseArray f46160c;
    public int f46161c0;
    public final boolean d;
    public boolean f46162d0;
    public final boolean e;
    public boolean f46163e0;
    public final l f46164f;
    public boolean f46165f0;
    public final x f46166g;
    public int f46167g0;
    public final x h;
    public byte f46168h0;
    public final x f46169i;
    public boolean f46170i0;
    public final x f46171j;
    public q f46172j0;
    public final x f46173k;
    public final x f46174l;
    public final x f46175m;
    public final x f46176n;
    public final x f46177o;
    public final x f46178p;
    public ByteBuffer f46179q;
    public long f46180r;
    public long f46181s;
    public long f46182t;
    public long f46183u;
    public long v;
    public boolean f46184w;
    public boolean f46185x;
    public e f46186y;
    public boolean f46187z;

    static {
        String str = m0.f8375a;
        f46152l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f46153n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f46154o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        k3.n(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        k3.n(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f46155p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(l lVar, int i10) {
        boolean z10;
        b bVar = new b();
        this.f46181s = -1L;
        this.f46182t = -9223372036854775807L;
        this.f46183u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f46156a = bVar;
        bVar.d = new m.l(this);
        this.f46164f = lVar;
        this.C = new SparseArray();
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.e = (i10 & 2) == 0;
        this.f46158b = new g();
        this.f46160c = new SparseArray();
        this.f46169i = new x(4);
        this.f46171j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f46173k = new x(4);
        this.f46166g = new x(p.f8892a);
        this.h = new x(4);
        this.f46174l = new x();
        this.f46175m = new x();
        this.f46176n = new x(8);
        this.f46177o = new x();
        this.f46178p = new x();
        this.T = new int[1];
        this.f46185x = true;
    }

    public static byte[] j(long j10, long j11, String str) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        String str2 = m0.f8375a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean a(c3.p pVar) {
        long p5;
        int i10;
        c0 c0Var = new c0(13, (short) 0);
        x xVar = (x) c0Var.f4356c;
        c3.l lVar = (c3.l) pVar;
        long j10 = lVar.f4273c;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = 1024;
        if (i11 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i12 = (int) j11;
        lVar.j(xVar.f8414a, 0, 4, false);
        long C = xVar.C();
        c0Var.f4355b = 4;
        while (true) {
            if (C != 440786851) {
                int i13 = c0Var.f4355b + 1;
                c0Var.f4355b = i13;
                if (i13 == i12) {
                    break;
                }
                lVar.j(xVar.f8414a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.f8414a[0] & 255);
            } else {
                long p9 = c0Var.p(lVar);
                long j12 = c0Var.f4355b;
                if (p9 != Long.MIN_VALUE && (i11 == 0 || j12 + p9 < j10)) {
                    while (true) {
                        int i14 = (c0Var.f4355b > (j12 + p9) ? 1 : (c0Var.f4355b == (j12 + p9) ? 0 : -1));
                        if (i14 < 0) {
                            if (c0Var.p(lVar) == Long.MIN_VALUE || (p5 = c0Var.p(lVar)) < 0 || p5 > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) p5;
                                lVar.v(i15, false);
                                c0Var.f4355b += i15;
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
            qVar = new c2.b(qVar, this.f46164f);
        }
        this.f46172j0 = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f46156a;
        bVar.e = 0;
        bVar.f46116b.clear();
        g gVar = bVar.f46117c;
        gVar.f46189b = 0;
        gVar.f46190c = 0;
        g gVar2 = this.f46158b;
        gVar2.f46189b = 0;
        gVar2.f46190c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f46187z) {
            this.C.clear();
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f46160c;
            if (i10 < sparseArray.size()) {
                j0 j0Var = ((e) sparseArray.valueAt(i10)).V;
                if (j0Var != null) {
                    j0Var.f4261b = false;
                    j0Var.f4262c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8595b;
        return x1.e;
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
        if (this.f46186y != null) {
            return;
        }
        throw x0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void i(u3.e r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: u3.f.i(u3.e, long, int, int, int):void");
    }

    public final void k() {
        if (this.f46185x) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f46160c;
                if (i10 < sparseArray.size()) {
                    if (((e) sparseArray.valueAt(i10)).W) {
                        return;
                    }
                    i10++;
                } else {
                    q qVar = this.f46172j0;
                    qVar.getClass();
                    qVar.D();
                    this.f46185x = false;
                    return;
                }
            }
        }
    }

    public final void l(c3.p pVar, int i10) {
        x xVar = this.f46169i;
        if (xVar.f8416c >= i10) {
            return;
        }
        byte[] bArr = xVar.f8414a;
        if (bArr.length < i10) {
            xVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = xVar.f8414a;
        int i11 = xVar.f8416c;
        pVar.readFully(bArr2, i11, i10 - i11);
        xVar.M(i10);
    }

    public final void m() {
        this.f46157a0 = 0;
        this.f46159b0 = 0;
        this.f46161c0 = 0;
        this.f46162d0 = false;
        this.f46163e0 = false;
        this.f46165f0 = false;
        this.f46167g0 = 0;
        this.f46168h0 = (byte) 0;
        this.f46170i0 = false;
        this.f46174l.K(0);
    }

    public final long n(long j10) {
        long j11 = this.f46182t;
        if (j11 != -9223372036854775807L) {
            String str = m0.f8375a;
            return m0.a0(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw x0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(c3.p pVar, e eVar, int i10, boolean z10) {
        int a2;
        int a10;
        boolean z11;
        boolean z12;
        int i11;
        if ("S_TEXT/UTF8".equals(eVar.f46130c)) {
            p(pVar, f46151k0, i10);
            int i12 = this.f46159b0;
            m();
            return i12;
        } else if (!"S_TEXT/ASS".equals(eVar.f46130c) && !"S_TEXT/SSA".equals(eVar.f46130c)) {
            if ("S_TEXT/WEBVTT".equals(eVar.f46130c)) {
                p(pVar, f46153n0, i10);
                int i13 = this.f46159b0;
                m();
                return i13;
            }
            boolean z13 = true;
            if (eVar.W) {
                eVar.f46129b0.getClass();
                x xVar = new x(i10);
                if (pVar.j(xVar.f8414a, 0, i10, true)) {
                    pVar.q();
                    if (c3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        xVar.k(0, 10, bArr);
                        xVar.N(0);
                        int g10 = c3.b.g(bArr);
                        if (g10 > 0 && xVar.a() >= g10 + 4) {
                            xVar.O(g10);
                            if (c3.b.i(xVar.m()) == 2) {
                                w a11 = eVar.f46129b0.a();
                                a11.f2470r = w0.n("audio/vnd.dts.hd");
                                eVar.f46129b0 = new b2.x(a11);
                            }
                        }
                    }
                }
                eVar.f46127a0.b(eVar.f46129b0);
                eVar.W = false;
                k();
            }
            i0 i0Var = eVar.f46127a0;
            boolean z14 = this.f46162d0;
            x xVar2 = this.f46174l;
            if (!z14) {
                boolean z15 = eVar.f46134i;
                x xVar3 = this.f46169i;
                if (z15) {
                    this.W &= -1073741825;
                    int i14 = 128;
                    if (!this.f46163e0) {
                        pVar.readFully(xVar3.f8414a, 0, 1);
                        this.f46157a0++;
                        byte b10 = xVar3.f8414a[0];
                        if ((b10 & 128) != 128) {
                            this.f46168h0 = b10;
                            this.f46163e0 = true;
                        } else {
                            throw x0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f46168h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f46170i0) {
                            x xVar4 = this.f46176n;
                            pVar.readFully(xVar4.f8414a, 0, 8);
                            this.f46157a0 += 8;
                            this.f46170i0 = true;
                            byte[] bArr2 = xVar3.f8414a;
                            if (!z12) {
                                i14 = 0;
                            }
                            bArr2[0] = (byte) (i14 | 8);
                            xVar3.N(0);
                            i0Var.g(xVar3, 1, 1);
                            this.f46159b0++;
                            xVar4.N(0);
                            i0Var.g(xVar4, 8, 1);
                            this.f46159b0 += 8;
                        }
                        if (z12) {
                            if (!this.f46165f0) {
                                pVar.readFully(xVar3.f8414a, 0, 1);
                                this.f46157a0++;
                                xVar3.N(0);
                                this.f46167g0 = xVar3.A();
                                this.f46165f0 = true;
                            }
                            int i15 = this.f46167g0 * 4;
                            xVar3.K(i15);
                            pVar.readFully(xVar3.f8414a, 0, i15);
                            this.f46157a0 += i15;
                            short s10 = (short) ((this.f46167g0 / 2) + 1);
                            int i16 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f46179q;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f46179q = ByteBuffer.allocate(i16);
                            }
                            this.f46179q.position(0);
                            this.f46179q.putShort(s10);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.f46167g0;
                                if (i17 >= i11) {
                                    break;
                                }
                                int E = xVar3.E();
                                if (i17 % 2 == 0) {
                                    this.f46179q.putShort((short) (E - i18));
                                } else {
                                    this.f46179q.putInt(E - i18);
                                }
                                i17++;
                                i18 = E;
                            }
                            int i19 = (i10 - this.f46157a0) - i18;
                            if (i11 % 2 == 1) {
                                this.f46179q.putInt(i19);
                            } else {
                                this.f46179q.putShort((short) i19);
                                this.f46179q.putInt(0);
                            }
                            byte[] array = this.f46179q.array();
                            x xVar5 = this.f46177o;
                            xVar5.L(i16, array);
                            i0Var.g(xVar5, i16, 1);
                            this.f46159b0 += i16;
                        }
                    }
                } else {
                    byte[] bArr3 = eVar.f46135j;
                    if (bArr3 != null) {
                        xVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(eVar.f46130c)) {
                    z11 = z10;
                } else if (eVar.f46133g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.W |= 268435456;
                    this.f46178p.K(0);
                    int i20 = (xVar2.f8416c + i10) - this.f46157a0;
                    xVar3.K(4);
                    byte[] bArr4 = xVar3.f8414a;
                    bArr4[0] = (byte) ((i20 >> 24) & 255);
                    bArr4[1] = (byte) ((i20 >> 16) & 255);
                    bArr4[2] = (byte) ((i20 >> 8) & 255);
                    bArr4[3] = (byte) (i20 & 255);
                    i0Var.g(xVar3, 4, 2);
                    this.f46159b0 += 4;
                }
                this.f46162d0 = true;
            }
            int i21 = i10 + xVar2.f8416c;
            if (!"V_MPEG4/ISO/AVC".equals(eVar.f46130c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f46130c)) {
                if (eVar.V != null) {
                    if (xVar2.f8416c != 0) {
                        z13 = false;
                    }
                    u6.p(z13);
                    eVar.V.c(pVar);
                }
                while (true) {
                    int i22 = this.f46157a0;
                    if (i22 >= i21) {
                        break;
                    }
                    int i23 = i21 - i22;
                    int a12 = xVar2.a();
                    if (a12 > 0) {
                        a10 = Math.min(i23, a12);
                        i0Var.d(a10, xVar2);
                    } else {
                        a10 = i0Var.a(pVar, i23, false);
                    }
                    this.f46157a0 += a10;
                    this.f46159b0 += a10;
                }
            } else {
                x xVar6 = this.h;
                byte[] bArr5 = xVar6.f8414a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i24 = eVar.f46131c0;
                int i25 = 4 - i24;
                while (this.f46157a0 < i21) {
                    int i26 = this.f46161c0;
                    if (i26 == 0) {
                        int min = Math.min(i24, xVar2.a());
                        pVar.readFully(bArr5, i25 + min, i24 - min);
                        if (min > 0) {
                            xVar2.k(i25, min, bArr5);
                        }
                        this.f46157a0 += i24;
                        xVar6.N(0);
                        this.f46161c0 = xVar6.E();
                        x xVar7 = this.f46166g;
                        xVar7.N(0);
                        i0Var.d(4, xVar7);
                        this.f46159b0 += 4;
                    } else {
                        int a13 = xVar2.a();
                        if (a13 > 0) {
                            a2 = Math.min(i26, a13);
                            i0Var.d(a2, xVar2);
                        } else {
                            a2 = i0Var.a(pVar, i26, false);
                        }
                        this.f46157a0 += a2;
                        this.f46159b0 += a2;
                        this.f46161c0 -= a2;
                    }
                }
            }
            if ("A_VORBIS".equals(eVar.f46130c)) {
                x xVar8 = this.f46171j;
                xVar8.N(0);
                i0Var.d(4, xVar8);
                this.f46159b0 += 4;
            }
            int i27 = this.f46159b0;
            m();
            return i27;
        } else {
            p(pVar, m0, i10);
            int i28 = this.f46159b0;
            m();
            return i28;
        }
    }

    public final void p(c3.p pVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        x xVar = this.f46175m;
        byte[] bArr2 = xVar.f8414a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.f8414a, bArr.length, i10);
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
