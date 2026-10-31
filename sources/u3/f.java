package u3;

import android.util.SparseArray;
import b2.v0;
import b2.w;
import b2.w0;
import c3.i0;
import c3.k0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import e2.l0;
import e2.x;
import e9.n0;
import e9.x1;
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
import v7.t6;
import z3.k;
public final class f implements o {
    public static final byte[] f50112k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f50113l0;
    public static final byte[] m0;
    public static final byte[] f50114n0;
    public static final UUID f50115o0;
    public static final Map f50116p0;
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
    public final b f50117a;
    public int f50118a0;
    public final g f50119b;
    public int f50120b0;
    public final SparseArray f50121c;
    public int f50122c0;
    public final boolean d;
    public boolean f50123d0;
    public final boolean e;
    public boolean f50124e0;
    public final k f50125f;
    public boolean f50126f0;
    public final x f50127g;
    public int f50128g0;
    public final x h;
    public byte f50129h0;
    public final x f50130i;
    public boolean f50131i0;
    public final x f50132j;
    public q f50133j0;
    public final x f50134k;
    public final x f50135l;
    public final x f50136m;
    public final x f50137n;
    public final x f50138o;
    public final x f50139p;
    public ByteBuffer f50140q;
    public long f50141r;
    public long f50142s;
    public long f50143t;
    public long f50144u;
    public long v;
    public boolean f50145w;
    public boolean f50146x;
    public e f50147y;
    public boolean f50148z;

    static {
        String str = l0.f6165a;
        f50113l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f50114n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f50115o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        i0.o(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        i0.o(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f50116p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i10) {
        boolean z10;
        b bVar = new b();
        this.f50142s = -1L;
        this.f50143t = -9223372036854775807L;
        this.f50144u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f50117a = bVar;
        bVar.d = new s9.g(this);
        this.f50125f = kVar;
        this.C = new SparseArray();
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.e = (i10 & 2) == 0;
        this.f50119b = new g();
        this.f50121c = new SparseArray();
        this.f50130i = new x(4);
        this.f50132j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f50134k = new x(4);
        this.f50127g = new x(f2.q.f6783a);
        this.h = new x(4);
        this.f50135l = new x();
        this.f50136m = new x();
        this.f50137n = new x(8);
        this.f50138o = new x();
        this.f50139p = new x();
        this.T = new int[1];
        this.f50146x = true;
    }

    public static byte[] j(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        t6.f(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        String str2 = l0.f6165a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean a(p pVar) {
        long q6;
        int i10;
        c5.x xVar = new c5.x(18, (short) 0);
        x xVar2 = (x) xVar.f3828c;
        l lVar = (l) pVar;
        long j10 = lVar.f3671c;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = 1024;
        if (i11 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i12 = (int) j11;
        lVar.j(xVar2.f6207a, 0, 4, false);
        long C = xVar2.C();
        xVar.f3827b = 4;
        while (true) {
            if (C != 440786851) {
                int i13 = xVar.f3827b + 1;
                xVar.f3827b = i13;
                if (i13 == i12) {
                    break;
                }
                lVar.j(xVar2.f6207a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar2.f6207a[0] & 255);
            } else {
                long q10 = xVar.q(lVar);
                long j12 = xVar.f3827b;
                if (q10 != Long.MIN_VALUE && (i11 == 0 || j12 + q10 < j10)) {
                    while (true) {
                        int i14 = (xVar.f3827b > (j12 + q10) ? 1 : (xVar.f3827b == (j12 + q10) ? 0 : -1));
                        if (i14 < 0) {
                            if (xVar.q(lVar) == Long.MIN_VALUE || (q6 = xVar.q(lVar)) < 0 || q6 > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) q6;
                                lVar.r(i15, false);
                                xVar.f3827b += i15;
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
            qVar = new ac.a(qVar, this.f50125f);
        }
        this.f50133j0 = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f50117a;
        bVar.e = 0;
        bVar.f50077b.clear();
        g gVar = bVar.f50078c;
        gVar.f50150b = 0;
        gVar.f50151c = 0;
        g gVar2 = this.f50119b;
        gVar2.f50150b = 0;
        gVar2.f50151c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f50148z) {
            this.C.clear();
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f50121c;
            if (i10 < sparseArray.size()) {
                c3.l0 l0Var = ((e) sparseArray.valueAt(i10)).V;
                if (l0Var != null) {
                    l0Var.f3674b = false;
                    l0Var.f3675c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f6390b;
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
        throw w0.a(null, "Element " + i10 + " must be in a Cues");
    }

    public final void h(int i10) {
        if (this.f50147y != null) {
            return;
        }
        throw w0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void i(u3.e r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: u3.f.i(u3.e, long, int, int, int):void");
    }

    public final void k() {
        if (this.f50146x) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f50121c;
                if (i10 < sparseArray.size()) {
                    if (((e) sparseArray.valueAt(i10)).W) {
                        return;
                    }
                    i10++;
                } else {
                    q qVar = this.f50133j0;
                    qVar.getClass();
                    qVar.Q0();
                    this.f50146x = false;
                    return;
                }
            }
        }
    }

    public final void l(p pVar, int i10) {
        x xVar = this.f50130i;
        if (xVar.f6209c >= i10) {
            return;
        }
        byte[] bArr = xVar.f6207a;
        if (bArr.length < i10) {
            xVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = xVar.f6207a;
        int i11 = xVar.f6209c;
        pVar.readFully(bArr2, i11, i10 - i11);
        xVar.M(i10);
    }

    public final void m() {
        this.f50118a0 = 0;
        this.f50120b0 = 0;
        this.f50122c0 = 0;
        this.f50123d0 = false;
        this.f50124e0 = false;
        this.f50126f0 = false;
        this.f50128g0 = 0;
        this.f50129h0 = (byte) 0;
        this.f50131i0 = false;
        this.f50135l.K(0);
    }

    public final long n(long j10) {
        long j11 = this.f50143t;
        if (j11 != -9223372036854775807L) {
            String str = l0.f6165a;
            return l0.a0(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw w0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(p pVar, e eVar, int i10, boolean z10) {
        int a2;
        int a10;
        boolean z11;
        boolean z12;
        int i11;
        if ("S_TEXT/UTF8".equals(eVar.f50091c)) {
            p(pVar, f50112k0, i10);
            int i12 = this.f50120b0;
            m();
            return i12;
        } else if (!"S_TEXT/ASS".equals(eVar.f50091c) && !"S_TEXT/SSA".equals(eVar.f50091c)) {
            if ("S_TEXT/WEBVTT".equals(eVar.f50091c)) {
                p(pVar, f50114n0, i10);
                int i13 = this.f50120b0;
                m();
                return i13;
            }
            boolean z13 = true;
            if (eVar.W) {
                eVar.f50090b0.getClass();
                x xVar = new x(i10);
                if (pVar.j(xVar.f6207a, 0, i10, true)) {
                    pVar.m();
                    if (c3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        xVar.k(0, 10, bArr);
                        xVar.N(0);
                        int g10 = c3.b.g(bArr);
                        if (g10 > 0 && xVar.a() >= g10 + 4) {
                            xVar.O(g10);
                            if (c3.b.i(xVar.m()) == 2) {
                                w a11 = eVar.f50090b0.a();
                                a11.f2370r = v0.n("audio/vnd.dts.hd");
                                eVar.f50090b0 = new b2.x(a11);
                            }
                        }
                    }
                }
                eVar.f50088a0.b(eVar.f50090b0);
                eVar.W = false;
                k();
            }
            k0 k0Var = eVar.f50088a0;
            boolean z14 = this.f50123d0;
            x xVar2 = this.f50135l;
            if (!z14) {
                boolean z15 = eVar.f50095i;
                x xVar3 = this.f50130i;
                if (z15) {
                    this.W &= -1073741825;
                    int i14 = 128;
                    if (!this.f50124e0) {
                        pVar.readFully(xVar3.f6207a, 0, 1);
                        this.f50118a0++;
                        byte b10 = xVar3.f6207a[0];
                        if ((b10 & 128) != 128) {
                            this.f50129h0 = b10;
                            this.f50124e0 = true;
                        } else {
                            throw w0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f50129h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f50131i0) {
                            x xVar4 = this.f50137n;
                            pVar.readFully(xVar4.f6207a, 0, 8);
                            this.f50118a0 += 8;
                            this.f50131i0 = true;
                            byte[] bArr2 = xVar3.f6207a;
                            if (!z12) {
                                i14 = 0;
                            }
                            bArr2[0] = (byte) (i14 | 8);
                            xVar3.N(0);
                            k0Var.g(xVar3, 1, 1);
                            this.f50120b0++;
                            xVar4.N(0);
                            k0Var.g(xVar4, 8, 1);
                            this.f50120b0 += 8;
                        }
                        if (z12) {
                            if (!this.f50126f0) {
                                pVar.readFully(xVar3.f6207a, 0, 1);
                                this.f50118a0++;
                                xVar3.N(0);
                                this.f50128g0 = xVar3.A();
                                this.f50126f0 = true;
                            }
                            int i15 = this.f50128g0 * 4;
                            xVar3.K(i15);
                            pVar.readFully(xVar3.f6207a, 0, i15);
                            this.f50118a0 += i15;
                            short s10 = (short) ((this.f50128g0 / 2) + 1);
                            int i16 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f50140q;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f50140q = ByteBuffer.allocate(i16);
                            }
                            this.f50140q.position(0);
                            this.f50140q.putShort(s10);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.f50128g0;
                                if (i17 >= i11) {
                                    break;
                                }
                                int E = xVar3.E();
                                if (i17 % 2 == 0) {
                                    this.f50140q.putShort((short) (E - i18));
                                } else {
                                    this.f50140q.putInt(E - i18);
                                }
                                i17++;
                                i18 = E;
                            }
                            int i19 = (i10 - this.f50118a0) - i18;
                            if (i11 % 2 == 1) {
                                this.f50140q.putInt(i19);
                            } else {
                                this.f50140q.putShort((short) i19);
                                this.f50140q.putInt(0);
                            }
                            byte[] array = this.f50140q.array();
                            x xVar5 = this.f50138o;
                            xVar5.L(i16, array);
                            k0Var.g(xVar5, i16, 1);
                            this.f50120b0 += i16;
                        }
                    }
                } else {
                    byte[] bArr3 = eVar.f50096j;
                    if (bArr3 != null) {
                        xVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(eVar.f50091c)) {
                    z11 = z10;
                } else if (eVar.f50094g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.W |= 268435456;
                    this.f50139p.K(0);
                    int i20 = (xVar2.f6209c + i10) - this.f50118a0;
                    xVar3.K(4);
                    byte[] bArr4 = xVar3.f6207a;
                    bArr4[0] = (byte) ((i20 >> 24) & 255);
                    bArr4[1] = (byte) ((i20 >> 16) & 255);
                    bArr4[2] = (byte) ((i20 >> 8) & 255);
                    bArr4[3] = (byte) (i20 & 255);
                    k0Var.g(xVar3, 4, 2);
                    this.f50120b0 += 4;
                }
                this.f50123d0 = true;
            }
            int i21 = i10 + xVar2.f6209c;
            if (!"V_MPEG4/ISO/AVC".equals(eVar.f50091c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f50091c)) {
                if (eVar.V != null) {
                    if (xVar2.f6209c != 0) {
                        z13 = false;
                    }
                    t6.p(z13);
                    eVar.V.c(pVar);
                }
                while (true) {
                    int i22 = this.f50118a0;
                    if (i22 >= i21) {
                        break;
                    }
                    int i23 = i21 - i22;
                    int a12 = xVar2.a();
                    if (a12 > 0) {
                        a10 = Math.min(i23, a12);
                        k0Var.d(a10, xVar2);
                    } else {
                        a10 = k0Var.a(pVar, i23, false);
                    }
                    this.f50118a0 += a10;
                    this.f50120b0 += a10;
                }
            } else {
                x xVar6 = this.h;
                byte[] bArr5 = xVar6.f6207a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i24 = eVar.f50092c0;
                int i25 = 4 - i24;
                while (this.f50118a0 < i21) {
                    int i26 = this.f50122c0;
                    if (i26 == 0) {
                        int min = Math.min(i24, xVar2.a());
                        pVar.readFully(bArr5, i25 + min, i24 - min);
                        if (min > 0) {
                            xVar2.k(i25, min, bArr5);
                        }
                        this.f50118a0 += i24;
                        xVar6.N(0);
                        this.f50122c0 = xVar6.E();
                        x xVar7 = this.f50127g;
                        xVar7.N(0);
                        k0Var.d(4, xVar7);
                        this.f50120b0 += 4;
                    } else {
                        int a13 = xVar2.a();
                        if (a13 > 0) {
                            a2 = Math.min(i26, a13);
                            k0Var.d(a2, xVar2);
                        } else {
                            a2 = k0Var.a(pVar, i26, false);
                        }
                        this.f50118a0 += a2;
                        this.f50120b0 += a2;
                        this.f50122c0 -= a2;
                    }
                }
            }
            if ("A_VORBIS".equals(eVar.f50091c)) {
                x xVar8 = this.f50132j;
                xVar8.N(0);
                k0Var.d(4, xVar8);
                this.f50120b0 += 4;
            }
            int i27 = this.f50120b0;
            m();
            return i27;
        } else {
            p(pVar, m0, i10);
            int i28 = this.f50120b0;
            m();
            return i28;
        }
    }

    public final void p(p pVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        x xVar = this.f50136m;
        byte[] bArr2 = xVar.f6207a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.f6207a, bArr.length, i10);
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
