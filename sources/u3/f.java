package u3;

import android.util.SparseArray;
import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c3.l;
import c3.q;
import c3.r;
import c3.s;
import c5.c0;
import com.google.android.gms.internal.play_billing.k3;
import e2.m0;
import e2.x;
import e9.l0;
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
import v7.u6;
import z3.k;
public final class f implements q {
    public static final byte[] f47988k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f47989l0;
    public static final byte[] m0;
    public static final byte[] f47990n0;
    public static final UUID f47991o0;
    public static final Map f47992p0;
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
    public final b f47993a;
    public int f47994a0;
    public final g f47995b;
    public int f47996b0;
    public final SparseArray f47997c;
    public int f47998c0;
    public final boolean d;
    public boolean f47999d0;
    public final boolean e;
    public boolean f48000e0;
    public final k f48001f;
    public boolean f48002f0;
    public final x f48003g;
    public int f48004g0;
    public final x h;
    public byte f48005h0;
    public final x f48006i;
    public boolean f48007i0;
    public final x f48008j;
    public s f48009j0;
    public final x f48010k;
    public final x f48011l;
    public final x f48012m;
    public final x f48013n;
    public final x f48014o;
    public final x f48015p;
    public ByteBuffer f48016q;
    public long f48017r;
    public long f48018s;
    public long f48019t;
    public long f48020u;
    public long v;
    public boolean f48021w;
    public boolean f48022x;
    public e f48023y;
    public boolean f48024z;

    static {
        String str = m0.f8259a;
        f47989l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f47990n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f47991o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        k3.n(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        k3.n(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f47992p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i10) {
        boolean z10;
        b bVar = new b();
        this.f48018s = -1L;
        this.f48019t = -9223372036854775807L;
        this.f48020u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f47993a = bVar;
        bVar.d = new l2.f(this, 24);
        this.f48001f = kVar;
        this.C = new SparseArray();
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.e = (i10 & 2) == 0;
        this.f47995b = new g();
        this.f47997c = new SparseArray();
        this.f48006i = new x(4);
        this.f48008j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f48010k = new x(4);
        this.f48003g = new x(f2.q.f10352a);
        this.h = new x(4);
        this.f48011l = new x();
        this.f48012m = new x();
        this.f48013n = new x(8);
        this.f48014o = new x();
        this.f48015p = new x();
        this.T = new int[1];
        this.f48022x = true;
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
        String str2 = m0.f8259a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean a(r rVar) {
        long t10;
        int i10;
        c0 c0Var = new c0(14, (short) 0);
        x xVar = (x) c0Var.f4729c;
        l lVar = (l) rVar;
        long j10 = lVar.f4647c;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = 1024;
        if (i11 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i12 = (int) j11;
        lVar.j(xVar.f8298a, 0, 4, false);
        long C = xVar.C();
        c0Var.f4728b = 4;
        while (true) {
            if (C != 440786851) {
                int i13 = c0Var.f4728b + 1;
                c0Var.f4728b = i13;
                if (i13 == i12) {
                    break;
                }
                lVar.j(xVar.f8298a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.f8298a[0] & 255);
            } else {
                long t11 = c0Var.t(lVar);
                long j12 = c0Var.f4728b;
                if (t11 != Long.MIN_VALUE && (i11 == 0 || j12 + t11 < j10)) {
                    while (true) {
                        int i14 = (c0Var.f4728b > (j12 + t11) ? 1 : (c0Var.f4728b == (j12 + t11) ? 0 : -1));
                        if (i14 < 0) {
                            if (c0Var.t(lVar) == Long.MIN_VALUE || (t10 = c0Var.t(lVar)) < 0 || t10 > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) t10;
                                lVar.u(i15, false);
                                c0Var.f4728b += i15;
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
    public final void c(s sVar) {
        if (this.e) {
            sVar = new c2.b(sVar, this.f48001f);
        }
        this.f48009j0 = sVar;
    }

    @Override
    public final void d(long j10, long j11) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f47993a;
        bVar.e = 0;
        bVar.f47953b.clear();
        g gVar = bVar.f47954c;
        gVar.f48026b = 0;
        gVar.f48027c = 0;
        g gVar2 = this.f47995b;
        gVar2.f48026b = 0;
        gVar2.f48027c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f48024z) {
            this.C.clear();
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f47997c;
            if (i10 < sparseArray.size()) {
                c3.m0 m0Var = ((e) sparseArray.valueAt(i10)).V;
                if (m0Var != null) {
                    m0Var.f4651b = false;
                    m0Var.f4652c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r44, c3.u r45) {
        throw new UnsupportedOperationException("Method not decompiled: u3.f.f(c3.r, c3.u):int");
    }

    public final void g(int i10) {
        if (this.D) {
            return;
        }
        throw w0.a(null, "Element " + i10 + " must be in a Cues");
    }

    public final void h(int i10) {
        if (this.f48023y != null) {
            return;
        }
        throw w0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void i(u3.e r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: u3.f.i(u3.e, long, int, int, int):void");
    }

    public final void k() {
        if (this.f48022x) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f47997c;
                if (i10 < sparseArray.size()) {
                    if (((e) sparseArray.valueAt(i10)).W) {
                        return;
                    }
                    i10++;
                } else {
                    s sVar = this.f48009j0;
                    sVar.getClass();
                    sVar.C();
                    this.f48022x = false;
                    return;
                }
            }
        }
    }

    public final void l(r rVar, int i10) {
        x xVar = this.f48006i;
        if (xVar.f8300c >= i10) {
            return;
        }
        byte[] bArr = xVar.f8298a;
        if (bArr.length < i10) {
            xVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = xVar.f8298a;
        int i11 = xVar.f8300c;
        rVar.readFully(bArr2, i11, i10 - i11);
        xVar.M(i10);
    }

    public final void m() {
        this.f47994a0 = 0;
        this.f47996b0 = 0;
        this.f47998c0 = 0;
        this.f47999d0 = false;
        this.f48000e0 = false;
        this.f48002f0 = false;
        this.f48004g0 = 0;
        this.f48005h0 = (byte) 0;
        this.f48007i0 = false;
        this.f48011l.K(0);
    }

    public final long n(long j10) {
        long j11 = this.f48019t;
        if (j11 != -9223372036854775807L) {
            String str = m0.f8259a;
            return m0.a0(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw w0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(r rVar, e eVar, int i10, boolean z10) {
        int a2;
        int a10;
        boolean z11;
        boolean z12;
        int i11;
        if ("S_TEXT/UTF8".equals(eVar.f47967c)) {
            p(rVar, f47988k0, i10);
            int i12 = this.f47996b0;
            m();
            return i12;
        } else if (!"S_TEXT/ASS".equals(eVar.f47967c) && !"S_TEXT/SSA".equals(eVar.f47967c)) {
            if ("S_TEXT/WEBVTT".equals(eVar.f47967c)) {
                p(rVar, f47990n0, i10);
                int i13 = this.f47996b0;
                m();
                return i13;
            }
            boolean z13 = true;
            if (eVar.W) {
                eVar.f47966b0.getClass();
                x xVar = new x(i10);
                if (rVar.j(xVar.f8298a, 0, i10, true)) {
                    rVar.q();
                    if (c3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        xVar.k(0, 10, bArr);
                        xVar.N(0);
                        int g10 = c3.b.g(bArr);
                        if (g10 > 0 && xVar.a() >= g10 + 4) {
                            xVar.O(g10);
                            if (c3.b.i(xVar.m()) == 2) {
                                v a11 = eVar.f47966b0.a();
                                a11.f4082r = v0.n("audio/vnd.dts.hd");
                                eVar.f47966b0 = new w(a11);
                            }
                        }
                    }
                }
                eVar.f47964a0.b(eVar.f47966b0);
                eVar.W = false;
                k();
            }
            c3.l0 l0Var = eVar.f47964a0;
            boolean z14 = this.f47999d0;
            x xVar2 = this.f48011l;
            if (!z14) {
                boolean z15 = eVar.f47971i;
                x xVar3 = this.f48006i;
                if (z15) {
                    this.W &= -1073741825;
                    int i14 = 128;
                    if (!this.f48000e0) {
                        rVar.readFully(xVar3.f8298a, 0, 1);
                        this.f47994a0++;
                        byte b10 = xVar3.f8298a[0];
                        if ((b10 & 128) != 128) {
                            this.f48005h0 = b10;
                            this.f48000e0 = true;
                        } else {
                            throw w0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f48005h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f48007i0) {
                            x xVar4 = this.f48013n;
                            rVar.readFully(xVar4.f8298a, 0, 8);
                            this.f47994a0 += 8;
                            this.f48007i0 = true;
                            byte[] bArr2 = xVar3.f8298a;
                            if (!z12) {
                                i14 = 0;
                            }
                            bArr2[0] = (byte) (i14 | 8);
                            xVar3.N(0);
                            l0Var.g(xVar3, 1, 1);
                            this.f47996b0++;
                            xVar4.N(0);
                            l0Var.g(xVar4, 8, 1);
                            this.f47996b0 += 8;
                        }
                        if (z12) {
                            if (!this.f48002f0) {
                                rVar.readFully(xVar3.f8298a, 0, 1);
                                this.f47994a0++;
                                xVar3.N(0);
                                this.f48004g0 = xVar3.A();
                                this.f48002f0 = true;
                            }
                            int i15 = this.f48004g0 * 4;
                            xVar3.K(i15);
                            rVar.readFully(xVar3.f8298a, 0, i15);
                            this.f47994a0 += i15;
                            short s10 = (short) ((this.f48004g0 / 2) + 1);
                            int i16 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f48016q;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f48016q = ByteBuffer.allocate(i16);
                            }
                            this.f48016q.position(0);
                            this.f48016q.putShort(s10);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.f48004g0;
                                if (i17 >= i11) {
                                    break;
                                }
                                int E = xVar3.E();
                                if (i17 % 2 == 0) {
                                    this.f48016q.putShort((short) (E - i18));
                                } else {
                                    this.f48016q.putInt(E - i18);
                                }
                                i17++;
                                i18 = E;
                            }
                            int i19 = (i10 - this.f47994a0) - i18;
                            if (i11 % 2 == 1) {
                                this.f48016q.putInt(i19);
                            } else {
                                this.f48016q.putShort((short) i19);
                                this.f48016q.putInt(0);
                            }
                            byte[] array = this.f48016q.array();
                            x xVar5 = this.f48014o;
                            xVar5.L(i16, array);
                            l0Var.g(xVar5, i16, 1);
                            this.f47996b0 += i16;
                        }
                    }
                } else {
                    byte[] bArr3 = eVar.f47972j;
                    if (bArr3 != null) {
                        xVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(eVar.f47967c)) {
                    z11 = z10;
                } else if (eVar.f47970g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.W |= 268435456;
                    this.f48015p.K(0);
                    int i20 = (xVar2.f8300c + i10) - this.f47994a0;
                    xVar3.K(4);
                    byte[] bArr4 = xVar3.f8298a;
                    bArr4[0] = (byte) ((i20 >> 24) & 255);
                    bArr4[1] = (byte) ((i20 >> 16) & 255);
                    bArr4[2] = (byte) ((i20 >> 8) & 255);
                    bArr4[3] = (byte) (i20 & 255);
                    l0Var.g(xVar3, 4, 2);
                    this.f47996b0 += 4;
                }
                this.f47999d0 = true;
            }
            int i21 = i10 + xVar2.f8300c;
            if (!"V_MPEG4/ISO/AVC".equals(eVar.f47967c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f47967c)) {
                if (eVar.V != null) {
                    if (xVar2.f8300c != 0) {
                        z13 = false;
                    }
                    u6.p(z13);
                    eVar.V.c(rVar);
                }
                while (true) {
                    int i22 = this.f47994a0;
                    if (i22 >= i21) {
                        break;
                    }
                    int i23 = i21 - i22;
                    int a12 = xVar2.a();
                    if (a12 > 0) {
                        a10 = Math.min(i23, a12);
                        l0Var.d(a10, xVar2);
                    } else {
                        a10 = l0Var.a(rVar, i23, false);
                    }
                    this.f47994a0 += a10;
                    this.f47996b0 += a10;
                }
            } else {
                x xVar6 = this.h;
                byte[] bArr5 = xVar6.f8298a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i24 = eVar.f47968c0;
                int i25 = 4 - i24;
                while (this.f47994a0 < i21) {
                    int i26 = this.f47998c0;
                    if (i26 == 0) {
                        int min = Math.min(i24, xVar2.a());
                        rVar.readFully(bArr5, i25 + min, i24 - min);
                        if (min > 0) {
                            xVar2.k(i25, min, bArr5);
                        }
                        this.f47994a0 += i24;
                        xVar6.N(0);
                        this.f47998c0 = xVar6.E();
                        x xVar7 = this.f48003g;
                        xVar7.N(0);
                        l0Var.d(4, xVar7);
                        this.f47996b0 += 4;
                    } else {
                        int a13 = xVar2.a();
                        if (a13 > 0) {
                            a2 = Math.min(i26, a13);
                            l0Var.d(a2, xVar2);
                        } else {
                            a2 = l0Var.a(rVar, i26, false);
                        }
                        this.f47994a0 += a2;
                        this.f47996b0 += a2;
                        this.f47998c0 -= a2;
                    }
                }
            }
            if ("A_VORBIS".equals(eVar.f47967c)) {
                x xVar8 = this.f48008j;
                xVar8.N(0);
                l0Var.d(4, xVar8);
                this.f47996b0 += 4;
            }
            int i27 = this.f47996b0;
            m();
            return i27;
        } else {
            p(rVar, m0, i10);
            int i28 = this.f47996b0;
            m();
            return i28;
        }
    }

    public final void p(r rVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        x xVar = this.f48012m;
        byte[] bArr2 = xVar.f8298a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        rVar.readFully(xVar.f8298a, bArr.length, i10);
        xVar.N(0);
        xVar.M(length);
    }

    @Override
    public final q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
