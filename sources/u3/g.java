package u3;

import android.util.SparseArray;
import b2.v;
import b2.v0;
import b2.w;
import b2.w0;
import c3.j0;
import c3.k0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c5.b0;
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
public final class g implements o {
    public static final byte[] f47581k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f47582l0;
    public static final byte[] m0;
    public static final byte[] f47583n0;
    public static final UUID f47584o0;
    public static final Map f47585p0;
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
    public final b f47586a;
    public int f47587a0;
    public final h f47588b;
    public int f47589b0;
    public final SparseArray f47590c;
    public int f47591c0;
    public final boolean d;
    public boolean f47592d0;
    public final boolean e;
    public boolean f47593e0;
    public final k f47594f;
    public boolean f47595f0;
    public final x f47596g;
    public int f47597g0;
    public final x h;
    public byte f47598h0;
    public final x f47599i;
    public boolean f47600i0;
    public final x f47601j;
    public q f47602j0;
    public final x f47603k;
    public final x f47604l;
    public final x f47605m;
    public final x f47606n;
    public final x f47607o;
    public final x f47608p;
    public ByteBuffer f47609q;
    public long f47610r;
    public long f47611s;
    public long f47612t;
    public long f47613u;
    public long v;
    public boolean f47614w;
    public boolean f47615x;
    public f f47616y;
    public boolean f47617z;

    static {
        String str = m0.f8255a;
        f47582l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f47583n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f47584o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        k3.n(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        k3.n(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f47585p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public g(k kVar, int i10) {
        boolean z10;
        b bVar = new b();
        this.f47611s = -1L;
        this.f47612t = -9223372036854775807L;
        this.f47613u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f47586a = bVar;
        bVar.d = new c(this);
        this.f47594f = kVar;
        this.C = new SparseArray();
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.e = (i10 & 2) == 0;
        this.f47588b = new h();
        this.f47590c = new SparseArray();
        this.f47599i = new x(4);
        this.f47601j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f47603k = new x(4);
        this.f47596g = new x(f2.q.f10338a);
        this.h = new x(4);
        this.f47604l = new x();
        this.f47605m = new x();
        this.f47606n = new x(8);
        this.f47607o = new x();
        this.f47608p = new x();
        this.T = new int[1];
        this.f47615x = true;
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
        String str2 = m0.f8255a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean a(p pVar) {
        long s10;
        int i10;
        b0 b0Var = new b0(13, (short) 0);
        x xVar = (x) b0Var.f4704c;
        l lVar = (l) pVar;
        long j10 = lVar.f4648c;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = 1024;
        if (i11 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i12 = (int) j11;
        lVar.j(xVar.f8294a, 0, 4, false);
        long C = xVar.C();
        b0Var.f4703b = 4;
        while (true) {
            if (C != 440786851) {
                int i13 = b0Var.f4703b + 1;
                b0Var.f4703b = i13;
                if (i13 == i12) {
                    break;
                }
                lVar.j(xVar.f8294a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.f8294a[0] & 255);
            } else {
                long s11 = b0Var.s(lVar);
                long j12 = b0Var.f4703b;
                if (s11 != Long.MIN_VALUE && (i11 == 0 || j12 + s11 < j10)) {
                    while (true) {
                        int i14 = (b0Var.f4703b > (j12 + s11) ? 1 : (b0Var.f4703b == (j12 + s11) ? 0 : -1));
                        if (i14 < 0) {
                            if (b0Var.s(lVar) == Long.MIN_VALUE || (s10 = b0Var.s(lVar)) < 0 || s10 > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) s10;
                                lVar.v(i15, false);
                                b0Var.f4703b += i15;
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
            qVar = new c2.b(qVar, this.f47594f);
        }
        this.f47602j0 = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f47586a;
        bVar.e = 0;
        bVar.f47545b.clear();
        h hVar = bVar.f47546c;
        hVar.f47619b = 0;
        hVar.f47620c = 0;
        h hVar2 = this.f47588b;
        hVar2.f47619b = 0;
        hVar2.f47620c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f47617z) {
            this.C.clear();
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f47590c;
            if (i10 < sparseArray.size()) {
                k0 k0Var = ((f) sparseArray.valueAt(i10)).V;
                if (k0Var != null) {
                    k0Var.f4642b = false;
                    k0Var.f4643c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8477b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r44, c3.s r45) {
        throw new UnsupportedOperationException("Method not decompiled: u3.g.f(c3.p, c3.s):int");
    }

    public final void g(int i10) {
        if (this.D) {
            return;
        }
        throw w0.a(null, "Element " + i10 + " must be in a Cues");
    }

    public final void h(int i10) {
        if (this.f47616y != null) {
            return;
        }
        throw w0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void i(u3.f r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: u3.g.i(u3.f, long, int, int, int):void");
    }

    public final void k() {
        if (this.f47615x) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f47590c;
                if (i10 < sparseArray.size()) {
                    if (((f) sparseArray.valueAt(i10)).W) {
                        return;
                    }
                    i10++;
                } else {
                    q qVar = this.f47602j0;
                    qVar.getClass();
                    qVar.H();
                    this.f47615x = false;
                    return;
                }
            }
        }
    }

    public final void l(p pVar, int i10) {
        x xVar = this.f47599i;
        if (xVar.f8296c >= i10) {
            return;
        }
        byte[] bArr = xVar.f8294a;
        if (bArr.length < i10) {
            xVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = xVar.f8294a;
        int i11 = xVar.f8296c;
        pVar.readFully(bArr2, i11, i10 - i11);
        xVar.M(i10);
    }

    public final void m() {
        this.f47587a0 = 0;
        this.f47589b0 = 0;
        this.f47591c0 = 0;
        this.f47592d0 = false;
        this.f47593e0 = false;
        this.f47595f0 = false;
        this.f47597g0 = 0;
        this.f47598h0 = (byte) 0;
        this.f47600i0 = false;
        this.f47604l.K(0);
    }

    public final long n(long j10) {
        long j11 = this.f47612t;
        if (j11 != -9223372036854775807L) {
            String str = m0.f8255a;
            return m0.a0(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw w0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(p pVar, f fVar, int i10, boolean z10) {
        int a2;
        int a10;
        boolean z11;
        boolean z12;
        int i11;
        if ("S_TEXT/UTF8".equals(fVar.f47560c)) {
            p(pVar, f47581k0, i10);
            int i12 = this.f47589b0;
            m();
            return i12;
        } else if (!"S_TEXT/ASS".equals(fVar.f47560c) && !"S_TEXT/SSA".equals(fVar.f47560c)) {
            if ("S_TEXT/WEBVTT".equals(fVar.f47560c)) {
                p(pVar, f47583n0, i10);
                int i13 = this.f47589b0;
                m();
                return i13;
            }
            boolean z13 = true;
            if (fVar.W) {
                fVar.f47559b0.getClass();
                x xVar = new x(i10);
                if (pVar.j(xVar.f8294a, 0, i10, true)) {
                    pVar.q();
                    if (c3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        xVar.k(0, 10, bArr);
                        xVar.N(0);
                        int g10 = c3.b.g(bArr);
                        if (g10 > 0 && xVar.a() >= g10 + 4) {
                            xVar.O(g10);
                            if (c3.b.i(xVar.m()) == 2) {
                                v a11 = fVar.f47559b0.a();
                                a11.f4079r = v0.n("audio/vnd.dts.hd");
                                fVar.f47559b0 = new w(a11);
                            }
                        }
                    }
                }
                fVar.f47557a0.b(fVar.f47559b0);
                fVar.W = false;
                k();
            }
            j0 j0Var = fVar.f47557a0;
            boolean z14 = this.f47592d0;
            x xVar2 = this.f47604l;
            if (!z14) {
                boolean z15 = fVar.f47564i;
                x xVar3 = this.f47599i;
                if (z15) {
                    this.W &= -1073741825;
                    int i14 = 128;
                    if (!this.f47593e0) {
                        pVar.readFully(xVar3.f8294a, 0, 1);
                        this.f47587a0++;
                        byte b10 = xVar3.f8294a[0];
                        if ((b10 & 128) != 128) {
                            this.f47598h0 = b10;
                            this.f47593e0 = true;
                        } else {
                            throw w0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f47598h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f47600i0) {
                            x xVar4 = this.f47606n;
                            pVar.readFully(xVar4.f8294a, 0, 8);
                            this.f47587a0 += 8;
                            this.f47600i0 = true;
                            byte[] bArr2 = xVar3.f8294a;
                            if (!z12) {
                                i14 = 0;
                            }
                            bArr2[0] = (byte) (i14 | 8);
                            xVar3.N(0);
                            j0Var.g(xVar3, 1, 1);
                            this.f47589b0++;
                            xVar4.N(0);
                            j0Var.g(xVar4, 8, 1);
                            this.f47589b0 += 8;
                        }
                        if (z12) {
                            if (!this.f47595f0) {
                                pVar.readFully(xVar3.f8294a, 0, 1);
                                this.f47587a0++;
                                xVar3.N(0);
                                this.f47597g0 = xVar3.A();
                                this.f47595f0 = true;
                            }
                            int i15 = this.f47597g0 * 4;
                            xVar3.K(i15);
                            pVar.readFully(xVar3.f8294a, 0, i15);
                            this.f47587a0 += i15;
                            short s10 = (short) ((this.f47597g0 / 2) + 1);
                            int i16 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f47609q;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f47609q = ByteBuffer.allocate(i16);
                            }
                            this.f47609q.position(0);
                            this.f47609q.putShort(s10);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.f47597g0;
                                if (i17 >= i11) {
                                    break;
                                }
                                int E = xVar3.E();
                                if (i17 % 2 == 0) {
                                    this.f47609q.putShort((short) (E - i18));
                                } else {
                                    this.f47609q.putInt(E - i18);
                                }
                                i17++;
                                i18 = E;
                            }
                            int i19 = (i10 - this.f47587a0) - i18;
                            if (i11 % 2 == 1) {
                                this.f47609q.putInt(i19);
                            } else {
                                this.f47609q.putShort((short) i19);
                                this.f47609q.putInt(0);
                            }
                            byte[] array = this.f47609q.array();
                            x xVar5 = this.f47607o;
                            xVar5.L(i16, array);
                            j0Var.g(xVar5, i16, 1);
                            this.f47589b0 += i16;
                        }
                    }
                } else {
                    byte[] bArr3 = fVar.f47565j;
                    if (bArr3 != null) {
                        xVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(fVar.f47560c)) {
                    z11 = z10;
                } else if (fVar.f47563g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.W |= 268435456;
                    this.f47608p.K(0);
                    int i20 = (xVar2.f8296c + i10) - this.f47587a0;
                    xVar3.K(4);
                    byte[] bArr4 = xVar3.f8294a;
                    bArr4[0] = (byte) ((i20 >> 24) & 255);
                    bArr4[1] = (byte) ((i20 >> 16) & 255);
                    bArr4[2] = (byte) ((i20 >> 8) & 255);
                    bArr4[3] = (byte) (i20 & 255);
                    j0Var.g(xVar3, 4, 2);
                    this.f47589b0 += 4;
                }
                this.f47592d0 = true;
            }
            int i21 = i10 + xVar2.f8296c;
            if (!"V_MPEG4/ISO/AVC".equals(fVar.f47560c) && !"V_MPEGH/ISO/HEVC".equals(fVar.f47560c)) {
                if (fVar.V != null) {
                    if (xVar2.f8296c != 0) {
                        z13 = false;
                    }
                    u6.p(z13);
                    fVar.V.c(pVar);
                }
                while (true) {
                    int i22 = this.f47587a0;
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
                    this.f47587a0 += a10;
                    this.f47589b0 += a10;
                }
            } else {
                x xVar6 = this.h;
                byte[] bArr5 = xVar6.f8294a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i24 = fVar.f47561c0;
                int i25 = 4 - i24;
                while (this.f47587a0 < i21) {
                    int i26 = this.f47591c0;
                    if (i26 == 0) {
                        int min = Math.min(i24, xVar2.a());
                        pVar.readFully(bArr5, i25 + min, i24 - min);
                        if (min > 0) {
                            xVar2.k(i25, min, bArr5);
                        }
                        this.f47587a0 += i24;
                        xVar6.N(0);
                        this.f47591c0 = xVar6.E();
                        x xVar7 = this.f47596g;
                        xVar7.N(0);
                        j0Var.d(4, xVar7);
                        this.f47589b0 += 4;
                    } else {
                        int a13 = xVar2.a();
                        if (a13 > 0) {
                            a2 = Math.min(i26, a13);
                            j0Var.d(a2, xVar2);
                        } else {
                            a2 = j0Var.a(pVar, i26, false);
                        }
                        this.f47587a0 += a2;
                        this.f47589b0 += a2;
                        this.f47591c0 -= a2;
                    }
                }
            }
            if ("A_VORBIS".equals(fVar.f47560c)) {
                x xVar8 = this.f47601j;
                xVar8.N(0);
                j0Var.d(4, xVar8);
                this.f47589b0 += 4;
            }
            int i27 = this.f47589b0;
            m();
            return i27;
        } else {
            p(pVar, m0, i10);
            int i28 = this.f47589b0;
            m();
            return i28;
        }
    }

    public final void p(p pVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        x xVar = this.f47605m;
        byte[] bArr2 = xVar.f8294a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.f8294a, bArr.length, i10);
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
