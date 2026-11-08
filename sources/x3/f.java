package x3;

import a8.ia;
import android.util.SparseArray;
import c4.k;
import e2.s0;
import e2.t;
import e2.t0;
import f3.j0;
import f3.k0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f5.u;
import h2.m0;
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
import org.telegram.ui.Components.n;
public final class f implements o {
    public static final byte[] f58578k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f58579l0;
    public static final byte[] m0;
    public static final byte[] f58580n0;
    public static final UUID f58581o0;
    public static final Map f58582p0;
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
    public final b f58583a;
    public int f58584a0;
    public final g f58585b;
    public int f58586b0;
    public final SparseArray f58587c;
    public int f58588c0;
    public final boolean d;
    public boolean f58589d0;
    public final boolean f58590e;
    public boolean f58591e0;
    public final k f58592f;
    public boolean f58593f0;
    public final x f58594g;
    public int f58595g0;
    public final x h;
    public byte f58596h0;
    public final x f58597i;
    public boolean f58598i0;
    public final x f58599j;
    public q f58600j0;
    public final x f58601k;
    public final x f58602l;
    public final x f58603m;
    public final x f58604n;
    public final x f58605o;
    public final x f58606p;
    public ByteBuffer f58607q;
    public long f58608r;
    public long f58609s;
    public long f58610t;
    public long f58611u;
    public long v;
    public boolean f58612w;
    public boolean f58613x;
    public e f58614y;
    public boolean f58615z;

    static {
        String str = m0.f14112a;
        f58579l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f58580n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f58581o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        com.google.android.recaptcha.internal.a.p(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        com.google.android.recaptcha.internal.a.p(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f58582p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i7) {
        boolean z9;
        b bVar = new b();
        this.f58609s = -1L;
        this.f58610t = -9223372036854775807L;
        this.f58611u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f58583a = bVar;
        bVar.d = new n(this);
        this.f58592f = kVar;
        this.C = new SparseArray();
        if ((i7 & 1) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        this.f58590e = (i7 & 2) == 0;
        this.f58585b = new g();
        this.f58587c = new SparseArray();
        this.f58597i = new x(4);
        this.f58599j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f58601k = new x(4);
        this.f58594g = new x(i2.o.f15205a);
        this.h = new x(4);
        this.f58602l = new x();
        this.f58603m = new x();
        this.f58604n = new x(8);
        this.f58605o = new x();
        this.f58606p = new x();
        this.T = new int[1];
        this.f58613x = true;
    }

    public static byte[] j(long j3, String str, long j10) {
        boolean z9;
        if (j3 != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        int i7 = (int) (j3 / 3600000000L);
        long j11 = j3 - (i7 * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        String str2 = m0.f14112a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean b(p pVar) {
        long u10;
        int i7;
        u uVar = new u(18, (short) 0);
        x xVar = (x) uVar.f11191c;
        l lVar = (l) pVar;
        long j3 = lVar.f11057c;
        int i10 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        long j10 = 1024;
        if (i10 != 0 && j3 <= 1024) {
            j10 = j3;
        }
        int i11 = (int) j10;
        lVar.k(xVar.f14162a, 0, 4, false);
        long C = xVar.C();
        uVar.f11190b = 4;
        while (true) {
            if (C != 440786851) {
                int i12 = uVar.f11190b + 1;
                uVar.f11190b = i12;
                if (i12 == i11) {
                    break;
                }
                lVar.k(xVar.f14162a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.f14162a[0] & 255);
            } else {
                long u11 = uVar.u(lVar);
                long j11 = uVar.f11190b;
                if (u11 != Long.MIN_VALUE && (i10 == 0 || j11 + u11 < j3)) {
                    while (true) {
                        int i13 = (uVar.f11190b > (j11 + u11) ? 1 : (uVar.f11190b == (j11 + u11) ? 0 : -1));
                        if (i13 < 0) {
                            if (uVar.u(lVar) == Long.MIN_VALUE || (u10 = uVar.u(lVar)) < 0 || u10 > 2147483647L) {
                                break;
                            } else if (i7 != 0) {
                                int i14 = (int) u10;
                                lVar.v(i14, false);
                                uVar.f11190b += i14;
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
        if (this.f58590e) {
            qVar = new ab.q(qVar, this.f58592f);
        }
        this.f58600j0 = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f58583a;
        bVar.f58543e = 0;
        bVar.f58541b.clear();
        g gVar = bVar.f58542c;
        gVar.f58617b = 0;
        gVar.f58618c = 0;
        g gVar2 = this.f58585b;
        gVar2.f58617b = 0;
        gVar2.f58618c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f58615z) {
            this.C.clear();
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f58587c;
            if (i7 < sparseArray.size()) {
                k0 k0Var = ((e) sparseArray.valueAt(i7)).V;
                if (k0Var != null) {
                    k0Var.f11050b = false;
                    k0Var.f11051c = 0;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14329b;
        return t1.f14397e;
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
        if (this.f58614y != null) {
            return;
        }
        throw t0.a(null, "Element " + i7 + " must be in a TrackEntry");
    }

    public final void i(x3.e r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: x3.f.i(x3.e, long, int, int, int):void");
    }

    public final void k() {
        if (this.f58613x) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = this.f58587c;
                if (i7 < sparseArray.size()) {
                    if (((e) sparseArray.valueAt(i7)).W) {
                        return;
                    }
                    i7++;
                } else {
                    q qVar = this.f58600j0;
                    qVar.getClass();
                    qVar.U0();
                    this.f58613x = false;
                    return;
                }
            }
        }
    }

    public final void l(p pVar, int i7) {
        x xVar = this.f58597i;
        if (xVar.f14164c >= i7) {
            return;
        }
        byte[] bArr = xVar.f14162a;
        if (bArr.length < i7) {
            xVar.c(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = xVar.f14162a;
        int i10 = xVar.f14164c;
        pVar.readFully(bArr2, i10, i7 - i10);
        xVar.M(i7);
    }

    public final void m() {
        this.f58584a0 = 0;
        this.f58586b0 = 0;
        this.f58588c0 = 0;
        this.f58589d0 = false;
        this.f58591e0 = false;
        this.f58593f0 = false;
        this.f58595g0 = 0;
        this.f58596h0 = (byte) 0;
        this.f58598i0 = false;
        this.f58602l.K(0);
    }

    public final long n(long j3) {
        long j10 = this.f58610t;
        if (j10 != -9223372036854775807L) {
            String str = m0.f14112a;
            return m0.a0(j3, j10, 1000L, RoundingMode.DOWN);
        }
        throw t0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(p pVar, e eVar, int i7, boolean z9) {
        int e10;
        int e11;
        boolean z10;
        boolean z11;
        int i10;
        if ("S_TEXT/UTF8".equals(eVar.f58556c)) {
            p(pVar, f58578k0, i7);
            int i11 = this.f58586b0;
            m();
            return i11;
        } else if (!"S_TEXT/ASS".equals(eVar.f58556c) && !"S_TEXT/SSA".equals(eVar.f58556c)) {
            if ("S_TEXT/WEBVTT".equals(eVar.f58556c)) {
                p(pVar, f58580n0, i7);
                int i12 = this.f58586b0;
                m();
                return i12;
            }
            boolean z12 = true;
            if (eVar.W) {
                eVar.f58555b0.getClass();
                x xVar = new x(i7);
                if (pVar.k(xVar.f14162a, 0, i7, true)) {
                    pVar.q();
                    if (f3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        xVar.k(0, 10, bArr);
                        xVar.N(0);
                        int g10 = f3.b.g(bArr);
                        if (g10 > 0 && xVar.a() >= g10 + 4) {
                            xVar.O(g10);
                            if (f3.b.i(xVar.m()) == 2) {
                                t a10 = eVar.f58555b0.a();
                                a10.f10563r = s0.n("audio/vnd.dts.hd");
                                eVar.f58555b0 = new e2.u(a10);
                            }
                        }
                    }
                }
                eVar.f58553a0.g(eVar.f58555b0);
                eVar.W = false;
                k();
            }
            j0 j0Var = eVar.f58553a0;
            boolean z13 = this.f58589d0;
            x xVar2 = this.f58602l;
            if (!z13) {
                boolean z14 = eVar.f58561i;
                x xVar3 = this.f58597i;
                if (z14) {
                    this.W &= -1073741825;
                    int i13 = 128;
                    if (!this.f58591e0) {
                        pVar.readFully(xVar3.f14162a, 0, 1);
                        this.f58584a0++;
                        byte b10 = xVar3.f14162a[0];
                        if ((b10 & 128) != 128) {
                            this.f58596h0 = b10;
                            this.f58591e0 = true;
                        } else {
                            throw t0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f58596h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f58598i0) {
                            x xVar4 = this.f58604n;
                            pVar.readFully(xVar4.f14162a, 0, 8);
                            this.f58584a0 += 8;
                            this.f58598i0 = true;
                            byte[] bArr2 = xVar3.f14162a;
                            if (!z11) {
                                i13 = 0;
                            }
                            bArr2[0] = (byte) (i13 | 8);
                            xVar3.N(0);
                            j0Var.a(xVar3, 1, 1);
                            this.f58586b0++;
                            xVar4.N(0);
                            j0Var.a(xVar4, 8, 1);
                            this.f58586b0 += 8;
                        }
                        if (z11) {
                            if (!this.f58593f0) {
                                pVar.readFully(xVar3.f14162a, 0, 1);
                                this.f58584a0++;
                                xVar3.N(0);
                                this.f58595g0 = xVar3.A();
                                this.f58593f0 = true;
                            }
                            int i14 = this.f58595g0 * 4;
                            xVar3.K(i14);
                            pVar.readFully(xVar3.f14162a, 0, i14);
                            this.f58584a0 += i14;
                            short s5 = (short) ((this.f58595g0 / 2) + 1);
                            int i15 = (s5 * 6) + 2;
                            ByteBuffer byteBuffer = this.f58607q;
                            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                                this.f58607q = ByteBuffer.allocate(i15);
                            }
                            this.f58607q.position(0);
                            this.f58607q.putShort(s5);
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i10 = this.f58595g0;
                                if (i16 >= i10) {
                                    break;
                                }
                                int E = xVar3.E();
                                if (i16 % 2 == 0) {
                                    this.f58607q.putShort((short) (E - i17));
                                } else {
                                    this.f58607q.putInt(E - i17);
                                }
                                i16++;
                                i17 = E;
                            }
                            int i18 = (i7 - this.f58584a0) - i17;
                            if (i10 % 2 == 1) {
                                this.f58607q.putInt(i18);
                            } else {
                                this.f58607q.putShort((short) i18);
                                this.f58607q.putInt(0);
                            }
                            byte[] array = this.f58607q.array();
                            x xVar5 = this.f58605o;
                            xVar5.L(i15, array);
                            j0Var.a(xVar5, i15, 1);
                            this.f58586b0 += i15;
                        }
                    }
                } else {
                    byte[] bArr3 = eVar.f58562j;
                    if (bArr3 != null) {
                        xVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(eVar.f58556c)) {
                    z10 = z9;
                } else if (eVar.f58560g > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.W |= 268435456;
                    this.f58606p.K(0);
                    int i19 = (xVar2.f14164c + i7) - this.f58584a0;
                    xVar3.K(4);
                    byte[] bArr4 = xVar3.f14162a;
                    bArr4[0] = (byte) ((i19 >> 24) & 255);
                    bArr4[1] = (byte) ((i19 >> 16) & 255);
                    bArr4[2] = (byte) ((i19 >> 8) & 255);
                    bArr4[3] = (byte) (i19 & 255);
                    j0Var.a(xVar3, 4, 2);
                    this.f58586b0 += 4;
                }
                this.f58589d0 = true;
            }
            int i20 = i7 + xVar2.f14164c;
            if (!"V_MPEG4/ISO/AVC".equals(eVar.f58556c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f58556c)) {
                if (eVar.V != null) {
                    if (xVar2.f14164c != 0) {
                        z12 = false;
                    }
                    ia.p(z12);
                    eVar.V.c(pVar);
                }
                while (true) {
                    int i21 = this.f58584a0;
                    if (i21 >= i20) {
                        break;
                    }
                    int i22 = i20 - i21;
                    int a11 = xVar2.a();
                    if (a11 > 0) {
                        e11 = Math.min(i22, a11);
                        j0Var.b(e11, xVar2);
                    } else {
                        e11 = j0Var.e(pVar, i22, false);
                    }
                    this.f58584a0 += e11;
                    this.f58586b0 += e11;
                }
            } else {
                x xVar6 = this.h;
                byte[] bArr5 = xVar6.f14162a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i23 = eVar.f58557c0;
                int i24 = 4 - i23;
                while (this.f58584a0 < i20) {
                    int i25 = this.f58588c0;
                    if (i25 == 0) {
                        int min = Math.min(i23, xVar2.a());
                        pVar.readFully(bArr5, i24 + min, i23 - min);
                        if (min > 0) {
                            xVar2.k(i24, min, bArr5);
                        }
                        this.f58584a0 += i23;
                        xVar6.N(0);
                        this.f58588c0 = xVar6.E();
                        x xVar7 = this.f58594g;
                        xVar7.N(0);
                        j0Var.b(4, xVar7);
                        this.f58586b0 += 4;
                    } else {
                        int a12 = xVar2.a();
                        if (a12 > 0) {
                            e10 = Math.min(i25, a12);
                            j0Var.b(e10, xVar2);
                        } else {
                            e10 = j0Var.e(pVar, i25, false);
                        }
                        this.f58584a0 += e10;
                        this.f58586b0 += e10;
                        this.f58588c0 -= e10;
                    }
                }
            }
            if ("A_VORBIS".equals(eVar.f58556c)) {
                x xVar8 = this.f58599j;
                xVar8.N(0);
                j0Var.b(4, xVar8);
                this.f58586b0 += 4;
            }
            int i26 = this.f58586b0;
            m();
            return i26;
        } else {
            p(pVar, m0, i7);
            int i27 = this.f58586b0;
            m();
            return i27;
        }
    }

    public final void p(p pVar, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        x xVar = this.f58603m;
        byte[] bArr2 = xVar.f14162a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i7);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.f14162a, bArr.length, i7);
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
