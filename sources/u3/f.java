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
public final class f implements o {
    public static final byte[] f47548k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f47549l0;
    public static final byte[] m0;
    public static final byte[] f47550n0;
    public static final UUID f47551o0;
    public static final Map f47552p0;
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
    public final b f47553a;
    public int f47554a0;
    public final g f47555b;
    public int f47556b0;
    public final SparseArray f47557c;
    public int f47558c0;
    public final boolean d;
    public boolean f47559d0;
    public final boolean e;
    public boolean f47560e0;
    public final k f47561f;
    public boolean f47562f0;
    public final x f47563g;
    public int f47564g0;
    public final x h;
    public byte f47565h0;
    public final x f47566i;
    public boolean f47567i0;
    public final x f47568j;
    public q f47569j0;
    public final x f47570k;
    public final x f47571l;
    public final x f47572m;
    public final x f47573n;
    public final x f47574o;
    public final x f47575p;
    public ByteBuffer f47576q;
    public long f47577r;
    public long f47578s;
    public long f47579t;
    public long f47580u;
    public long v;
    public boolean f47581w;
    public boolean f47582x;
    public e f47583y;
    public boolean f47584z;

    static {
        String str = m0.f8252a;
        f47549l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f47550n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f47551o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        k3.n(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        k3.n(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f47552p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i10) {
        boolean z10;
        b bVar = new b();
        this.f47578s = -1L;
        this.f47579t = -9223372036854775807L;
        this.f47580u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f47553a = bVar;
        bVar.d = new l2.f(this, 24);
        this.f47561f = kVar;
        this.C = new SparseArray();
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.e = (i10 & 2) == 0;
        this.f47555b = new g();
        this.f47557c = new SparseArray();
        this.f47566i = new x(4);
        this.f47568j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f47570k = new x(4);
        this.f47563g = new x(f2.q.f10335a);
        this.h = new x(4);
        this.f47571l = new x();
        this.f47572m = new x();
        this.f47573n = new x(8);
        this.f47574o = new x();
        this.f47575p = new x();
        this.T = new int[1];
        this.f47582x = true;
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
        String str2 = m0.f8252a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean a(p pVar) {
        long t10;
        int i10;
        c0 c0Var = new c0(14, (short) 0);
        x xVar = (x) c0Var.f4724c;
        l lVar = (l) pVar;
        long j10 = lVar.f4644c;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        long j11 = 1024;
        if (i11 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i12 = (int) j11;
        lVar.j(xVar.f8291a, 0, 4, false);
        long C = xVar.C();
        c0Var.f4723b = 4;
        while (true) {
            if (C != 440786851) {
                int i13 = c0Var.f4723b + 1;
                c0Var.f4723b = i13;
                if (i13 == i12) {
                    break;
                }
                lVar.j(xVar.f8291a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.f8291a[0] & 255);
            } else {
                long t11 = c0Var.t(lVar);
                long j12 = c0Var.f4723b;
                if (t11 != Long.MIN_VALUE && (i11 == 0 || j12 + t11 < j10)) {
                    while (true) {
                        int i14 = (c0Var.f4723b > (j12 + t11) ? 1 : (c0Var.f4723b == (j12 + t11) ? 0 : -1));
                        if (i14 < 0) {
                            if (c0Var.t(lVar) == Long.MIN_VALUE || (t10 = c0Var.t(lVar)) < 0 || t10 > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) t10;
                                lVar.v(i15, false);
                                c0Var.f4723b += i15;
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
            qVar = new c2.b(qVar, this.f47561f);
        }
        this.f47569j0 = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f47553a;
        bVar.e = 0;
        bVar.f47513b.clear();
        g gVar = bVar.f47514c;
        gVar.f47586b = 0;
        gVar.f47587c = 0;
        g gVar2 = this.f47555b;
        gVar2.f47586b = 0;
        gVar2.f47587c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f47584z) {
            this.C.clear();
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f47557c;
            if (i10 < sparseArray.size()) {
                k0 k0Var = ((e) sparseArray.valueAt(i10)).V;
                if (k0Var != null) {
                    k0Var.f4638b = false;
                    k0Var.f4639c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8474b;
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
        if (this.f47583y != null) {
            return;
        }
        throw w0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void i(u3.e r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: u3.f.i(u3.e, long, int, int, int):void");
    }

    public final void k() {
        if (this.f47582x) {
            int i10 = 0;
            while (true) {
                SparseArray sparseArray = this.f47557c;
                if (i10 < sparseArray.size()) {
                    if (((e) sparseArray.valueAt(i10)).W) {
                        return;
                    }
                    i10++;
                } else {
                    q qVar = this.f47569j0;
                    qVar.getClass();
                    qVar.H();
                    this.f47582x = false;
                    return;
                }
            }
        }
    }

    public final void l(p pVar, int i10) {
        x xVar = this.f47566i;
        if (xVar.f8293c >= i10) {
            return;
        }
        byte[] bArr = xVar.f8291a;
        if (bArr.length < i10) {
            xVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = xVar.f8291a;
        int i11 = xVar.f8293c;
        pVar.readFully(bArr2, i11, i10 - i11);
        xVar.M(i10);
    }

    public final void m() {
        this.f47554a0 = 0;
        this.f47556b0 = 0;
        this.f47558c0 = 0;
        this.f47559d0 = false;
        this.f47560e0 = false;
        this.f47562f0 = false;
        this.f47564g0 = 0;
        this.f47565h0 = (byte) 0;
        this.f47567i0 = false;
        this.f47571l.K(0);
    }

    public final long n(long j10) {
        long j11 = this.f47579t;
        if (j11 != -9223372036854775807L) {
            String str = m0.f8252a;
            return m0.a0(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw w0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(p pVar, e eVar, int i10, boolean z10) {
        int a2;
        int a10;
        boolean z11;
        boolean z12;
        int i11;
        if ("S_TEXT/UTF8".equals(eVar.f47527c)) {
            p(pVar, f47548k0, i10);
            int i12 = this.f47556b0;
            m();
            return i12;
        } else if (!"S_TEXT/ASS".equals(eVar.f47527c) && !"S_TEXT/SSA".equals(eVar.f47527c)) {
            if ("S_TEXT/WEBVTT".equals(eVar.f47527c)) {
                p(pVar, f47550n0, i10);
                int i13 = this.f47556b0;
                m();
                return i13;
            }
            boolean z13 = true;
            if (eVar.W) {
                eVar.f47526b0.getClass();
                x xVar = new x(i10);
                if (pVar.j(xVar.f8291a, 0, i10, true)) {
                    pVar.q();
                    if (c3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        xVar.k(0, 10, bArr);
                        xVar.N(0);
                        int g10 = c3.b.g(bArr);
                        if (g10 > 0 && xVar.a() >= g10 + 4) {
                            xVar.O(g10);
                            if (c3.b.i(xVar.m()) == 2) {
                                v a11 = eVar.f47526b0.a();
                                a11.f4075r = v0.n("audio/vnd.dts.hd");
                                eVar.f47526b0 = new w(a11);
                            }
                        }
                    }
                }
                eVar.f47524a0.b(eVar.f47526b0);
                eVar.W = false;
                k();
            }
            j0 j0Var = eVar.f47524a0;
            boolean z14 = this.f47559d0;
            x xVar2 = this.f47571l;
            if (!z14) {
                boolean z15 = eVar.f47531i;
                x xVar3 = this.f47566i;
                if (z15) {
                    this.W &= -1073741825;
                    int i14 = 128;
                    if (!this.f47560e0) {
                        pVar.readFully(xVar3.f8291a, 0, 1);
                        this.f47554a0++;
                        byte b10 = xVar3.f8291a[0];
                        if ((b10 & 128) != 128) {
                            this.f47565h0 = b10;
                            this.f47560e0 = true;
                        } else {
                            throw w0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f47565h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f47567i0) {
                            x xVar4 = this.f47573n;
                            pVar.readFully(xVar4.f8291a, 0, 8);
                            this.f47554a0 += 8;
                            this.f47567i0 = true;
                            byte[] bArr2 = xVar3.f8291a;
                            if (!z12) {
                                i14 = 0;
                            }
                            bArr2[0] = (byte) (i14 | 8);
                            xVar3.N(0);
                            j0Var.g(xVar3, 1, 1);
                            this.f47556b0++;
                            xVar4.N(0);
                            j0Var.g(xVar4, 8, 1);
                            this.f47556b0 += 8;
                        }
                        if (z12) {
                            if (!this.f47562f0) {
                                pVar.readFully(xVar3.f8291a, 0, 1);
                                this.f47554a0++;
                                xVar3.N(0);
                                this.f47564g0 = xVar3.A();
                                this.f47562f0 = true;
                            }
                            int i15 = this.f47564g0 * 4;
                            xVar3.K(i15);
                            pVar.readFully(xVar3.f8291a, 0, i15);
                            this.f47554a0 += i15;
                            short s10 = (short) ((this.f47564g0 / 2) + 1);
                            int i16 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f47576q;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f47576q = ByteBuffer.allocate(i16);
                            }
                            this.f47576q.position(0);
                            this.f47576q.putShort(s10);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.f47564g0;
                                if (i17 >= i11) {
                                    break;
                                }
                                int E = xVar3.E();
                                if (i17 % 2 == 0) {
                                    this.f47576q.putShort((short) (E - i18));
                                } else {
                                    this.f47576q.putInt(E - i18);
                                }
                                i17++;
                                i18 = E;
                            }
                            int i19 = (i10 - this.f47554a0) - i18;
                            if (i11 % 2 == 1) {
                                this.f47576q.putInt(i19);
                            } else {
                                this.f47576q.putShort((short) i19);
                                this.f47576q.putInt(0);
                            }
                            byte[] array = this.f47576q.array();
                            x xVar5 = this.f47574o;
                            xVar5.L(i16, array);
                            j0Var.g(xVar5, i16, 1);
                            this.f47556b0 += i16;
                        }
                    }
                } else {
                    byte[] bArr3 = eVar.f47532j;
                    if (bArr3 != null) {
                        xVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(eVar.f47527c)) {
                    z11 = z10;
                } else if (eVar.f47530g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.W |= 268435456;
                    this.f47575p.K(0);
                    int i20 = (xVar2.f8293c + i10) - this.f47554a0;
                    xVar3.K(4);
                    byte[] bArr4 = xVar3.f8291a;
                    bArr4[0] = (byte) ((i20 >> 24) & 255);
                    bArr4[1] = (byte) ((i20 >> 16) & 255);
                    bArr4[2] = (byte) ((i20 >> 8) & 255);
                    bArr4[3] = (byte) (i20 & 255);
                    j0Var.g(xVar3, 4, 2);
                    this.f47556b0 += 4;
                }
                this.f47559d0 = true;
            }
            int i21 = i10 + xVar2.f8293c;
            if (!"V_MPEG4/ISO/AVC".equals(eVar.f47527c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f47527c)) {
                if (eVar.V != null) {
                    if (xVar2.f8293c != 0) {
                        z13 = false;
                    }
                    u6.p(z13);
                    eVar.V.c(pVar);
                }
                while (true) {
                    int i22 = this.f47554a0;
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
                    this.f47554a0 += a10;
                    this.f47556b0 += a10;
                }
            } else {
                x xVar6 = this.h;
                byte[] bArr5 = xVar6.f8291a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i24 = eVar.f47528c0;
                int i25 = 4 - i24;
                while (this.f47554a0 < i21) {
                    int i26 = this.f47558c0;
                    if (i26 == 0) {
                        int min = Math.min(i24, xVar2.a());
                        pVar.readFully(bArr5, i25 + min, i24 - min);
                        if (min > 0) {
                            xVar2.k(i25, min, bArr5);
                        }
                        this.f47554a0 += i24;
                        xVar6.N(0);
                        this.f47558c0 = xVar6.E();
                        x xVar7 = this.f47563g;
                        xVar7.N(0);
                        j0Var.d(4, xVar7);
                        this.f47556b0 += 4;
                    } else {
                        int a13 = xVar2.a();
                        if (a13 > 0) {
                            a2 = Math.min(i26, a13);
                            j0Var.d(a2, xVar2);
                        } else {
                            a2 = j0Var.a(pVar, i26, false);
                        }
                        this.f47554a0 += a2;
                        this.f47556b0 += a2;
                        this.f47558c0 -= a2;
                    }
                }
            }
            if ("A_VORBIS".equals(eVar.f47527c)) {
                x xVar8 = this.f47568j;
                xVar8.N(0);
                j0Var.d(4, xVar8);
                this.f47556b0 += 4;
            }
            int i27 = this.f47556b0;
            m();
            return i27;
        } else {
            p(pVar, m0, i10);
            int i28 = this.f47556b0;
            m();
            return i28;
        }
    }

    public final void p(p pVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        x xVar = this.f47572m;
        byte[] bArr2 = xVar.f8291a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.f8291a, bArr.length, i10);
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
