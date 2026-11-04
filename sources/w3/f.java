package w3;

import android.util.SparseArray;
import b4.k;
import b4.n;
import b8.zb;
import d2.u0;
import d2.v;
import d2.v0;
import e3.j0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e5.u;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
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
import org.telegram.ui.Components.y00;
public final class f implements o {
    public static final byte[] f57335k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f57336l0;
    public static final byte[] m0;
    public static final byte[] f57337n0;
    public static final UUID f57338o0;
    public static final Map f57339p0;
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
    public final b f57340a;
    public int f57341a0;
    public final g f57342b;
    public int f57343b0;
    public final SparseArray f57344c;
    public int f57345c0;
    public final boolean d;
    public boolean f57346d0;
    public final boolean f57347e;
    public boolean f57348e0;
    public final k f57349f;
    public boolean f57350f0;
    public final y f57351g;
    public int f57352g0;
    public final y h;
    public byte f57353h0;
    public final y f57354i;
    public boolean f57355i0;
    public final y f57356j;
    public q f57357j0;
    public final y f57358k;
    public final y f57359l;
    public final y f57360m;
    public final y f57361n;
    public final y f57362o;
    public final y f57363p;
    public ByteBuffer f57364q;
    public long f57365r;
    public long f57366s;
    public long f57367t;
    public long f57368u;
    public long v;
    public boolean f57369w;
    public boolean f57370x;
    public e f57371y;
    public boolean f57372z;

    static {
        String str = n0.f11873a;
        f57336l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f57337n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f57338o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        com.google.android.recaptcha.internal.a.p(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        com.google.android.recaptcha.internal.a.p(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f57339p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i3) {
        boolean z10;
        b bVar = new b();
        this.f57366s = -1L;
        this.f57367t = -9223372036854775807L;
        this.f57368u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f57340a = bVar;
        bVar.d = new y00(this);
        this.f57349f = kVar;
        this.C = new SparseArray();
        if ((i3 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f57347e = (i3 & 2) == 0;
        this.f57342b = new g();
        this.f57344c = new SparseArray();
        this.f57354i = new y(4);
        this.f57356j = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.f57358k = new y(4);
        this.f57351g = new y(h2.o.f14158a);
        this.h = new y(4);
        this.f57359l = new y();
        this.f57360m = new y();
        this.f57361n = new y(8);
        this.f57362o = new y();
        this.f57363p = new y();
        this.T = new int[1];
        this.f57370x = true;
    }

    public static byte[] j(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        int i3 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i3 * 3600000000L);
        int i10 = (int) (j12 / 60000000);
        long j13 = j12 - (i10 * 60000000);
        int i11 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i3), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (i11 * 1000000)) / j11)));
        String str2 = n0.f11873a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean b(p pVar) {
        long p10;
        int i3;
        u uVar = new u(17, (short) 0);
        y yVar = (y) uVar.f9634c;
        l lVar = (l) pVar;
        long j10 = lVar.f9494c;
        int i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = 1024;
        if (i10 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i11 = (int) j11;
        lVar.h(yVar.f11923a, 0, 4, false);
        long C = yVar.C();
        uVar.f9633b = 4;
        while (true) {
            if (C != 440786851) {
                int i12 = uVar.f9633b + 1;
                uVar.f9633b = i12;
                if (i12 == i11) {
                    break;
                }
                lVar.h(yVar.f11923a, 0, 1, false);
                C = ((C << 8) & (-256)) | (yVar.f11923a[0] & 255);
            } else {
                long p11 = uVar.p(lVar);
                long j12 = uVar.f9633b;
                if (p11 != Long.MIN_VALUE && (i10 == 0 || j12 + p11 < j10)) {
                    while (true) {
                        int i13 = (uVar.f9633b > (j12 + p11) ? 1 : (uVar.f9633b == (j12 + p11) ? 0 : -1));
                        if (i13 < 0) {
                            if (uVar.p(lVar) == Long.MIN_VALUE || (p10 = uVar.p(lVar)) < 0 || p10 > 2147483647L) {
                                break;
                            } else if (i3 != 0) {
                                int i14 = (int) p10;
                                lVar.w(i14, false);
                                uVar.f9633b += i14;
                            }
                        } else if (i13 == 0) {
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
        if (this.f57347e) {
            qVar = new n(qVar, this.f57349f);
        }
        this.f57357j0 = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f57340a;
        bVar.f57300e = 0;
        bVar.f57298b.clear();
        g gVar = bVar.f57299c;
        gVar.f57374b = 0;
        gVar.f57375c = 0;
        g gVar2 = this.f57342b;
        gVar2.f57374b = 0;
        gVar2.f57375c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f57372z) {
            this.C.clear();
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.f57344c;
            if (i3 < sparseArray.size()) {
                j0 j0Var = ((e) sparseArray.valueAt(i3)).V;
                if (j0Var != null) {
                    j0Var.f9480b = false;
                    j0Var.f9481c = 0;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r44, e3.s r45) {
        throw new UnsupportedOperationException("Method not decompiled: w3.f.f(e3.p, e3.s):int");
    }

    public final void g(int i3) {
        if (this.D) {
            return;
        }
        throw v0.a(null, "Element " + i3 + " must be in a Cues");
    }

    public final void h(int i3) {
        if (this.f57371y != null) {
            return;
        }
        throw v0.a(null, "Element " + i3 + " must be in a TrackEntry");
    }

    public final void i(w3.e r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: w3.f.i(w3.e, long, int, int, int):void");
    }

    public final void k() {
        if (this.f57370x) {
            int i3 = 0;
            while (true) {
                SparseArray sparseArray = this.f57344c;
                if (i3 < sparseArray.size()) {
                    if (((e) sparseArray.valueAt(i3)).W) {
                        return;
                    }
                    i3++;
                } else {
                    q qVar = this.f57357j0;
                    qVar.getClass();
                    qVar.L();
                    this.f57370x = false;
                    return;
                }
            }
        }
    }

    public final void l(p pVar, int i3) {
        y yVar = this.f57354i;
        if (yVar.f11925c >= i3) {
            return;
        }
        byte[] bArr = yVar.f11923a;
        if (bArr.length < i3) {
            yVar.c(Math.max(bArr.length * 2, i3));
        }
        byte[] bArr2 = yVar.f11923a;
        int i10 = yVar.f11925c;
        pVar.readFully(bArr2, i10, i3 - i10);
        yVar.M(i3);
    }

    public final void m() {
        this.f57341a0 = 0;
        this.f57343b0 = 0;
        this.f57345c0 = 0;
        this.f57346d0 = false;
        this.f57348e0 = false;
        this.f57350f0 = false;
        this.f57352g0 = 0;
        this.f57353h0 = (byte) 0;
        this.f57355i0 = false;
        this.f57359l.K(0);
    }

    public final long n(long j10) {
        long j11 = this.f57367t;
        if (j11 != -9223372036854775807L) {
            String str = n0.f11873a;
            return n0.a0(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw v0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(p pVar, e eVar, int i3, boolean z10) {
        int a10;
        int a11;
        boolean z11;
        boolean z12;
        int i10;
        if ("S_TEXT/UTF8".equals(eVar.f57313c)) {
            p(pVar, f57335k0, i3);
            int i11 = this.f57343b0;
            m();
            return i11;
        } else if (!"S_TEXT/ASS".equals(eVar.f57313c) && !"S_TEXT/SSA".equals(eVar.f57313c)) {
            if ("S_TEXT/WEBVTT".equals(eVar.f57313c)) {
                p(pVar, f57337n0, i3);
                int i12 = this.f57343b0;
                m();
                return i12;
            }
            boolean z13 = true;
            if (eVar.W) {
                eVar.f57312b0.getClass();
                y yVar = new y(i3);
                if (pVar.h(yVar.f11923a, 0, i3, true)) {
                    pVar.o();
                    if (e3.b.i(yVar.i()) == 1 && yVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        yVar.k(0, 10, bArr);
                        yVar.N(0);
                        int g7 = e3.b.g(bArr);
                        if (g7 > 0 && yVar.a() >= g7 + 4) {
                            yVar.O(g7);
                            if (e3.b.i(yVar.m()) == 2) {
                                d2.u a12 = eVar.f57312b0.a();
                                a12.f8431r = u0.n("audio/vnd.dts.hd");
                                eVar.f57312b0 = new v(a12);
                            }
                        }
                    }
                }
                eVar.f57310a0.g(eVar.f57312b0);
                eVar.W = false;
                k();
            }
            e3.i0 i0Var = eVar.f57310a0;
            boolean z14 = this.f57346d0;
            y yVar2 = this.f57359l;
            if (!z14) {
                boolean z15 = eVar.f57318i;
                y yVar3 = this.f57354i;
                if (z15) {
                    this.W &= -1073741825;
                    int i13 = 128;
                    if (!this.f57348e0) {
                        pVar.readFully(yVar3.f11923a, 0, 1);
                        this.f57341a0++;
                        byte b10 = yVar3.f11923a[0];
                        if ((b10 & 128) != 128) {
                            this.f57353h0 = b10;
                            this.f57348e0 = true;
                        } else {
                            throw v0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f57353h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f57355i0) {
                            y yVar4 = this.f57361n;
                            pVar.readFully(yVar4.f11923a, 0, 8);
                            this.f57341a0 += 8;
                            this.f57355i0 = true;
                            byte[] bArr2 = yVar3.f11923a;
                            if (!z12) {
                                i13 = 0;
                            }
                            bArr2[0] = (byte) (i13 | 8);
                            yVar3.N(0);
                            i0Var.f(yVar3, 1, 1);
                            this.f57343b0++;
                            yVar4.N(0);
                            i0Var.f(yVar4, 8, 1);
                            this.f57343b0 += 8;
                        }
                        if (z12) {
                            if (!this.f57350f0) {
                                pVar.readFully(yVar3.f11923a, 0, 1);
                                this.f57341a0++;
                                yVar3.N(0);
                                this.f57352g0 = yVar3.A();
                                this.f57350f0 = true;
                            }
                            int i14 = this.f57352g0 * 4;
                            yVar3.K(i14);
                            pVar.readFully(yVar3.f11923a, 0, i14);
                            this.f57341a0 += i14;
                            short s6 = (short) ((this.f57352g0 / 2) + 1);
                            int i15 = (s6 * 6) + 2;
                            ByteBuffer byteBuffer = this.f57364q;
                            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                                this.f57364q = ByteBuffer.allocate(i15);
                            }
                            this.f57364q.position(0);
                            this.f57364q.putShort(s6);
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i10 = this.f57352g0;
                                if (i16 >= i10) {
                                    break;
                                }
                                int E = yVar3.E();
                                if (i16 % 2 == 0) {
                                    this.f57364q.putShort((short) (E - i17));
                                } else {
                                    this.f57364q.putInt(E - i17);
                                }
                                i16++;
                                i17 = E;
                            }
                            int i18 = (i3 - this.f57341a0) - i17;
                            if (i10 % 2 == 1) {
                                this.f57364q.putInt(i18);
                            } else {
                                this.f57364q.putShort((short) i18);
                                this.f57364q.putInt(0);
                            }
                            byte[] array = this.f57364q.array();
                            y yVar5 = this.f57362o;
                            yVar5.L(i15, array);
                            i0Var.f(yVar5, i15, 1);
                            this.f57343b0 += i15;
                        }
                    }
                } else {
                    byte[] bArr3 = eVar.f57319j;
                    if (bArr3 != null) {
                        yVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(eVar.f57313c)) {
                    z11 = z10;
                } else if (eVar.f57317g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.W |= 268435456;
                    this.f57363p.K(0);
                    int i19 = (yVar2.f11925c + i3) - this.f57341a0;
                    yVar3.K(4);
                    byte[] bArr4 = yVar3.f11923a;
                    bArr4[0] = (byte) ((i19 >> 24) & 255);
                    bArr4[1] = (byte) ((i19 >> 16) & 255);
                    bArr4[2] = (byte) ((i19 >> 8) & 255);
                    bArr4[3] = (byte) (i19 & 255);
                    i0Var.f(yVar3, 4, 2);
                    this.f57343b0 += 4;
                }
                this.f57346d0 = true;
            }
            int i20 = i3 + yVar2.f11925c;
            if (!"V_MPEG4/ISO/AVC".equals(eVar.f57313c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f57313c)) {
                if (eVar.V != null) {
                    if (yVar2.f11925c != 0) {
                        z13 = false;
                    }
                    zb.p(z13);
                    eVar.V.c(pVar);
                }
                while (true) {
                    int i21 = this.f57341a0;
                    if (i21 >= i20) {
                        break;
                    }
                    int i22 = i20 - i21;
                    int a13 = yVar2.a();
                    if (a13 > 0) {
                        a11 = Math.min(i22, a13);
                        i0Var.e(a11, yVar2);
                    } else {
                        a11 = i0Var.a(pVar, i22, false);
                    }
                    this.f57341a0 += a11;
                    this.f57343b0 += a11;
                }
            } else {
                y yVar6 = this.h;
                byte[] bArr5 = yVar6.f11923a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i23 = eVar.f57314c0;
                int i24 = 4 - i23;
                while (this.f57341a0 < i20) {
                    int i25 = this.f57345c0;
                    if (i25 == 0) {
                        int min = Math.min(i23, yVar2.a());
                        pVar.readFully(bArr5, i24 + min, i23 - min);
                        if (min > 0) {
                            yVar2.k(i24, min, bArr5);
                        }
                        this.f57341a0 += i23;
                        yVar6.N(0);
                        this.f57345c0 = yVar6.E();
                        y yVar7 = this.f57351g;
                        yVar7.N(0);
                        i0Var.e(4, yVar7);
                        this.f57343b0 += 4;
                    } else {
                        int a14 = yVar2.a();
                        if (a14 > 0) {
                            a10 = Math.min(i25, a14);
                            i0Var.e(a10, yVar2);
                        } else {
                            a10 = i0Var.a(pVar, i25, false);
                        }
                        this.f57341a0 += a10;
                        this.f57343b0 += a10;
                        this.f57345c0 -= a10;
                    }
                }
            }
            if ("A_VORBIS".equals(eVar.f57313c)) {
                y yVar8 = this.f57356j;
                yVar8.N(0);
                i0Var.e(4, yVar8);
                this.f57343b0 += 4;
            }
            int i26 = this.f57343b0;
            m();
            return i26;
        } else {
            p(pVar, m0, i3);
            int i27 = this.f57343b0;
            m();
            return i27;
        }
    }

    public final void p(p pVar, byte[] bArr, int i3) {
        int length = bArr.length + i3;
        y yVar = this.f57360m;
        byte[] bArr2 = yVar.f11923a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i3);
            yVar.getClass();
            yVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(yVar.f11923a, bArr.length, i3);
        yVar.N(0);
        yVar.M(length);
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
