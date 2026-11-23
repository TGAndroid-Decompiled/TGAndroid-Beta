package x3;

import a8.la;
import android.util.SparseArray;
import b3.j;
import c4.k;
import com.google.android.gms.internal.vision.e2;
import e2.s0;
import e2.t;
import e2.t0;
import e2.u;
import f3.j0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import h2.l0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
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
import org.telegram.ui.Components.qf;
public final class f implements o {
    public static final byte[] f60385k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f60386l0;
    public static final byte[] m0;
    public static final byte[] f60387n0;
    public static final UUID f60388o0;
    public static final Map f60389p0;
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
    public final b f60390a;
    public int f60391a0;
    public final g f60392b;
    public int f60393b0;
    public final SparseArray f60394c;
    public int f60395c0;
    public final boolean d;
    public boolean f60396d0;
    public final boolean f60397e;
    public boolean f60398e0;
    public final k f60399f;
    public boolean f60400f0;
    public final x f60401g;
    public int f60402g0;
    public final x h;
    public byte f60403h0;
    public final x f60404i;
    public boolean f60405i0;
    public final x f60406j;
    public q f60407j0;
    public final x f60408k;
    public final x f60409l;
    public final x f60410m;
    public final x f60411n;
    public final x f60412o;
    public final x f60413p;
    public ByteBuffer f60414q;
    public long f60415r;
    public long f60416s;
    public long f60417t;
    public long f60418u;
    public long v;
    public boolean f60419w;
    public boolean f60420x;
    public e f60421y;
    public boolean f60422z;

    static {
        String str = l0.f13815a;
        f60386l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f60387n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f60388o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        e2.p(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        e2.p(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f60389p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i7) {
        boolean z10;
        b bVar = new b();
        this.f60416s = -1L;
        this.f60417t = -9223372036854775807L;
        this.f60418u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f60390a = bVar;
        bVar.d = new qf(this, 27);
        this.f60399f = kVar;
        this.C = new SparseArray();
        if ((i7 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f60397e = (i7 & 2) == 0;
        this.f60392b = new g();
        this.f60394c = new SparseArray();
        this.f60404i = new x(4);
        this.f60406j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f60408k = new x(4);
        this.f60401g = new x(i2.o.f16002a);
        this.h = new x(4);
        this.f60409l = new x();
        this.f60410m = new x();
        this.f60411n = new x(8);
        this.f60412o = new x();
        this.f60413p = new x();
        this.T = new int[1];
        this.f60420x = true;
    }

    public static byte[] j(long j3, String str, long j10) {
        boolean z10;
        if (j3 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.f(z10);
        int i7 = (int) (j3 / 3600000000L);
        long j11 = j3 - (i7 * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        String str2 = l0.f13815a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean b(p pVar) {
        long s5;
        int i7;
        j jVar = new j(17, (short) 0);
        x xVar = (x) jVar.f2922c;
        l lVar = (l) pVar;
        long j3 = lVar.f11216c;
        int i10 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        long j10 = 1024;
        if (i10 != 0 && j3 <= 1024) {
            j10 = j3;
        }
        int i11 = (int) j10;
        lVar.g(xVar.f13865a, 0, 4, false);
        long C = xVar.C();
        jVar.f2921b = 4;
        while (true) {
            if (C != 440786851) {
                int i12 = jVar.f2921b + 1;
                jVar.f2921b = i12;
                if (i12 == i11) {
                    break;
                }
                lVar.g(xVar.f13865a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.f13865a[0] & 255);
            } else {
                long s9 = jVar.s(lVar);
                long j11 = jVar.f2921b;
                if (s9 != Long.MIN_VALUE && (i10 == 0 || j11 + s9 < j3)) {
                    while (true) {
                        int i13 = (jVar.f2921b > (j11 + s9) ? 1 : (jVar.f2921b == (j11 + s9) ? 0 : -1));
                        if (i13 < 0) {
                            if (jVar.s(lVar) == Long.MIN_VALUE || (s5 = jVar.s(lVar)) < 0 || s5 > 2147483647L) {
                                break;
                            } else if (i7 != 0) {
                                int i14 = (int) s5;
                                lVar.x(i14, false);
                                jVar.f2921b += i14;
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
        if (this.f60397e) {
            qVar = new ab.q(qVar, this.f60399f);
        }
        this.f60407j0 = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f60390a;
        bVar.f60350e = 0;
        bVar.f60348b.clear();
        g gVar = bVar.f60349c;
        gVar.f60424b = 0;
        gVar.f60425c = 0;
        g gVar2 = this.f60392b;
        gVar2.f60424b = 0;
        gVar2.f60425c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f60422z) {
            this.C.clear();
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f60394c;
            if (i7 < sparseArray.size()) {
                j0 j0Var = ((e) sparseArray.valueAt(i7)).V;
                if (j0Var != null) {
                    j0Var.f11202b = false;
                    j0Var.f11203c = 0;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14035b;
        return t1.f14103e;
    }

    @Override
    public final int f(f3.p r44, f3.s r45) {
        throw new UnsupportedOperationException("Method not decompiled: x3.f.f(f3.p, f3.s):int");
    }

    public final void g(int i7) {
        if (this.D) {
            return;
        }
        throw t0.a(null, "Element " + i7 + " must be in a Cues");
    }

    public final void h(int i7) {
        if (this.f60421y != null) {
            return;
        }
        throw t0.a(null, "Element " + i7 + " must be in a TrackEntry");
    }

    public final void i(x3.e r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: x3.f.i(x3.e, long, int, int, int):void");
    }

    public final void k() {
        if (this.f60420x) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = this.f60394c;
                if (i7 < sparseArray.size()) {
                    if (((e) sparseArray.valueAt(i7)).W) {
                        return;
                    }
                    i7++;
                } else {
                    q qVar = this.f60407j0;
                    qVar.getClass();
                    qVar.d1();
                    this.f60420x = false;
                    return;
                }
            }
        }
    }

    public final void l(p pVar, int i7) {
        x xVar = this.f60404i;
        if (xVar.f13867c >= i7) {
            return;
        }
        byte[] bArr = xVar.f13865a;
        if (bArr.length < i7) {
            xVar.c(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = xVar.f13865a;
        int i10 = xVar.f13867c;
        pVar.readFully(bArr2, i10, i7 - i10);
        xVar.M(i7);
    }

    public final void m() {
        this.f60391a0 = 0;
        this.f60393b0 = 0;
        this.f60395c0 = 0;
        this.f60396d0 = false;
        this.f60398e0 = false;
        this.f60400f0 = false;
        this.f60402g0 = 0;
        this.f60403h0 = (byte) 0;
        this.f60405i0 = false;
        this.f60409l.K(0);
    }

    public final long n(long j3) {
        long j10 = this.f60417t;
        if (j10 != -9223372036854775807L) {
            String str = l0.f13815a;
            return l0.a0(j3, j10, 1000L, RoundingMode.DOWN);
        }
        throw t0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(p pVar, e eVar, int i7, boolean z10) {
        int e10;
        int e11;
        boolean z11;
        boolean z12;
        int i10;
        if ("S_TEXT/UTF8".equals(eVar.f60363c)) {
            p(pVar, f60385k0, i7);
            int i11 = this.f60393b0;
            m();
            return i11;
        } else if (!"S_TEXT/ASS".equals(eVar.f60363c) && !"S_TEXT/SSA".equals(eVar.f60363c)) {
            if ("S_TEXT/WEBVTT".equals(eVar.f60363c)) {
                p(pVar, f60387n0, i7);
                int i12 = this.f60393b0;
                m();
                return i12;
            }
            boolean z13 = true;
            if (eVar.W) {
                eVar.f60362b0.getClass();
                x xVar = new x(i7);
                if (pVar.g(xVar.f13865a, 0, i7, true)) {
                    pVar.n();
                    if (f3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        xVar.k(0, 10, bArr);
                        xVar.N(0);
                        int g10 = f3.b.g(bArr);
                        if (g10 > 0 && xVar.a() >= g10 + 4) {
                            xVar.O(g10);
                            if (f3.b.i(xVar.m()) == 2) {
                                t a10 = eVar.f60362b0.a();
                                a10.f10746r = s0.n("audio/vnd.dts.hd");
                                eVar.f60362b0 = new u(a10);
                            }
                        }
                    }
                }
                eVar.f60360a0.g(eVar.f60362b0);
                eVar.W = false;
                k();
            }
            f3.i0 i0Var = eVar.f60360a0;
            boolean z14 = this.f60396d0;
            x xVar2 = this.f60409l;
            if (!z14) {
                boolean z15 = eVar.f60368i;
                x xVar3 = this.f60404i;
                if (z15) {
                    this.W &= -1073741825;
                    int i13 = 128;
                    if (!this.f60398e0) {
                        pVar.readFully(xVar3.f13865a, 0, 1);
                        this.f60391a0++;
                        byte b10 = xVar3.f13865a[0];
                        if ((b10 & 128) != 128) {
                            this.f60403h0 = b10;
                            this.f60398e0 = true;
                        } else {
                            throw t0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f60403h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f60405i0) {
                            x xVar4 = this.f60411n;
                            pVar.readFully(xVar4.f13865a, 0, 8);
                            this.f60391a0 += 8;
                            this.f60405i0 = true;
                            byte[] bArr2 = xVar3.f13865a;
                            if (!z12) {
                                i13 = 0;
                            }
                            bArr2[0] = (byte) (i13 | 8);
                            xVar3.N(0);
                            i0Var.a(xVar3, 1, 1);
                            this.f60393b0++;
                            xVar4.N(0);
                            i0Var.a(xVar4, 8, 1);
                            this.f60393b0 += 8;
                        }
                        if (z12) {
                            if (!this.f60400f0) {
                                pVar.readFully(xVar3.f13865a, 0, 1);
                                this.f60391a0++;
                                xVar3.N(0);
                                this.f60402g0 = xVar3.A();
                                this.f60400f0 = true;
                            }
                            int i14 = this.f60402g0 * 4;
                            xVar3.K(i14);
                            pVar.readFully(xVar3.f13865a, 0, i14);
                            this.f60391a0 += i14;
                            short s5 = (short) ((this.f60402g0 / 2) + 1);
                            int i15 = (s5 * 6) + 2;
                            ByteBuffer byteBuffer = this.f60414q;
                            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                                this.f60414q = ByteBuffer.allocate(i15);
                            }
                            this.f60414q.position(0);
                            this.f60414q.putShort(s5);
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i10 = this.f60402g0;
                                if (i16 >= i10) {
                                    break;
                                }
                                int E = xVar3.E();
                                if (i16 % 2 == 0) {
                                    this.f60414q.putShort((short) (E - i17));
                                } else {
                                    this.f60414q.putInt(E - i17);
                                }
                                i16++;
                                i17 = E;
                            }
                            int i18 = (i7 - this.f60391a0) - i17;
                            if (i10 % 2 == 1) {
                                this.f60414q.putInt(i18);
                            } else {
                                this.f60414q.putShort((short) i18);
                                this.f60414q.putInt(0);
                            }
                            byte[] array = this.f60414q.array();
                            x xVar5 = this.f60412o;
                            xVar5.L(i15, array);
                            i0Var.a(xVar5, i15, 1);
                            this.f60393b0 += i15;
                        }
                    }
                } else {
                    byte[] bArr3 = eVar.f60369j;
                    if (bArr3 != null) {
                        xVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(eVar.f60363c)) {
                    z11 = z10;
                } else if (eVar.f60367g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.W |= 268435456;
                    this.f60413p.K(0);
                    int i19 = (xVar2.f13867c + i7) - this.f60391a0;
                    xVar3.K(4);
                    byte[] bArr4 = xVar3.f13865a;
                    bArr4[0] = (byte) ((i19 >> 24) & 255);
                    bArr4[1] = (byte) ((i19 >> 16) & 255);
                    bArr4[2] = (byte) ((i19 >> 8) & 255);
                    bArr4[3] = (byte) (i19 & 255);
                    i0Var.a(xVar3, 4, 2);
                    this.f60393b0 += 4;
                }
                this.f60396d0 = true;
            }
            int i20 = i7 + xVar2.f13867c;
            if (!"V_MPEG4/ISO/AVC".equals(eVar.f60363c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f60363c)) {
                if (eVar.V != null) {
                    if (xVar2.f13867c != 0) {
                        z13 = false;
                    }
                    la.p(z13);
                    eVar.V.c(pVar);
                }
                while (true) {
                    int i21 = this.f60391a0;
                    if (i21 >= i20) {
                        break;
                    }
                    int i22 = i20 - i21;
                    int a11 = xVar2.a();
                    if (a11 > 0) {
                        e11 = Math.min(i22, a11);
                        i0Var.b(e11, xVar2);
                    } else {
                        e11 = i0Var.e(pVar, i22, false);
                    }
                    this.f60391a0 += e11;
                    this.f60393b0 += e11;
                }
            } else {
                x xVar6 = this.h;
                byte[] bArr5 = xVar6.f13865a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i23 = eVar.f60364c0;
                int i24 = 4 - i23;
                while (this.f60391a0 < i20) {
                    int i25 = this.f60395c0;
                    if (i25 == 0) {
                        int min = Math.min(i23, xVar2.a());
                        pVar.readFully(bArr5, i24 + min, i23 - min);
                        if (min > 0) {
                            xVar2.k(i24, min, bArr5);
                        }
                        this.f60391a0 += i23;
                        xVar6.N(0);
                        this.f60395c0 = xVar6.E();
                        x xVar7 = this.f60401g;
                        xVar7.N(0);
                        i0Var.b(4, xVar7);
                        this.f60393b0 += 4;
                    } else {
                        int a12 = xVar2.a();
                        if (a12 > 0) {
                            e10 = Math.min(i25, a12);
                            i0Var.b(e10, xVar2);
                        } else {
                            e10 = i0Var.e(pVar, i25, false);
                        }
                        this.f60391a0 += e10;
                        this.f60393b0 += e10;
                        this.f60395c0 -= e10;
                    }
                }
            }
            if ("A_VORBIS".equals(eVar.f60363c)) {
                x xVar8 = this.f60406j;
                xVar8.N(0);
                i0Var.b(4, xVar8);
                this.f60393b0 += 4;
            }
            int i26 = this.f60393b0;
            m();
            return i26;
        } else {
            p(pVar, m0, i7);
            int i27 = this.f60393b0;
            m();
            return i27;
        }
    }

    public final void p(p pVar, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        x xVar = this.f60410m;
        byte[] bArr2 = xVar.f13865a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i7);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.f13865a, bArr.length, i7);
        xVar.N(0);
        xVar.M(length);
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
