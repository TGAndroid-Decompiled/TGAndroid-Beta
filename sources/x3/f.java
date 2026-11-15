package x3;

import a8.ja;
import android.util.SparseArray;
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
import f5.v;
import h2.l0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
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
import org.telegram.ui.Components.ff;
public final class f implements o {
    public static final byte[] f59769k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f59770l0;
    public static final byte[] m0;
    public static final byte[] f59771n0;
    public static final UUID f59772o0;
    public static final Map f59773p0;
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
    public final b f59774a;
    public int f59775a0;
    public final g f59776b;
    public int f59777b0;
    public final SparseArray f59778c;
    public int f59779c0;
    public final boolean d;
    public boolean f59780d0;
    public final boolean f59781e;
    public boolean f59782e0;
    public final k f59783f;
    public boolean f59784f0;
    public final x f59785g;
    public int f59786g0;
    public final x h;
    public byte f59787h0;
    public final x f59788i;
    public boolean f59789i0;
    public final x f59790j;
    public q f59791j0;
    public final x f59792k;
    public final x f59793l;
    public final x f59794m;
    public final x f59795n;
    public final x f59796o;
    public final x f59797p;
    public ByteBuffer f59798q;
    public long f59799r;
    public long f59800s;
    public long f59801t;
    public long f59802u;
    public long v;
    public boolean f59803w;
    public boolean f59804x;
    public e f59805y;
    public boolean f59806z;

    static {
        String str = l0.f13471a;
        f59770l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f59771n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f59772o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        e2.p(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        e2.p(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f59773p0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public f(k kVar, int i7) {
        boolean z10;
        b bVar = new b();
        this.f59800s = -1L;
        this.f59801t = -9223372036854775807L;
        this.f59802u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f59774a = bVar;
        bVar.d = new ff(this, 26);
        this.f59783f = kVar;
        this.C = new SparseArray();
        if ((i7 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f59781e = (i7 & 2) == 0;
        this.f59776b = new g();
        this.f59778c = new SparseArray();
        this.f59788i = new x(4);
        this.f59790j = new x(ByteBuffer.allocate(4).putInt(-1).array());
        this.f59792k = new x(4);
        this.f59785g = new x(i2.o.f15659a);
        this.h = new x(4);
        this.f59793l = new x();
        this.f59794m = new x();
        this.f59795n = new x(8);
        this.f59796o = new x();
        this.f59797p = new x();
        this.T = new int[1];
        this.f59804x = true;
    }

    public static byte[] j(long j3, String str, long j10) {
        boolean z10;
        if (j3 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        ja.f(z10);
        int i7 = (int) (j3 / 3600000000L);
        long j11 = j3 - (i7 * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (i10 * 60000000);
        int i11 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (i11 * 1000000)) / j10)));
        String str2 = l0.f13471a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean b(p pVar) {
        long t6;
        int i7;
        v vVar = new v(18, (short) 0);
        x xVar = (x) vVar.f11019c;
        l lVar = (l) pVar;
        long j3 = lVar.f10865c;
        int i10 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        long j10 = 1024;
        if (i10 != 0 && j3 <= 1024) {
            j10 = j3;
        }
        int i11 = (int) j10;
        lVar.h(xVar.f13521a, 0, 4, false);
        long C = xVar.C();
        vVar.f11018b = 4;
        while (true) {
            if (C != 440786851) {
                int i12 = vVar.f11018b + 1;
                vVar.f11018b = i12;
                if (i12 == i11) {
                    break;
                }
                lVar.h(xVar.f13521a, 0, 1, false);
                C = ((C << 8) & (-256)) | (xVar.f13521a[0] & 255);
            } else {
                long t10 = vVar.t(lVar);
                long j11 = vVar.f11018b;
                if (t10 != Long.MIN_VALUE && (i10 == 0 || j11 + t10 < j3)) {
                    while (true) {
                        int i13 = (vVar.f11018b > (j11 + t10) ? 1 : (vVar.f11018b == (j11 + t10) ? 0 : -1));
                        if (i13 < 0) {
                            if (vVar.t(lVar) == Long.MIN_VALUE || (t6 = vVar.t(lVar)) < 0 || t6 > 2147483647L) {
                                break;
                            } else if (i7 != 0) {
                                int i14 = (int) t6;
                                lVar.n(i14, false);
                                vVar.f11018b += i14;
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
        if (this.f59781e) {
            qVar = new ab.q(qVar, this.f59783f);
        }
        this.f59791j0 = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        this.M = -9223372036854775807L;
        this.O = 0;
        b bVar = this.f59774a;
        bVar.f59734e = 0;
        bVar.f59732b.clear();
        g gVar = bVar.f59733c;
        gVar.f59808b = 0;
        gVar.f59809c = 0;
        g gVar2 = this.f59776b;
        gVar2.f59808b = 0;
        gVar2.f59809c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f59806z) {
            this.C.clear();
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f59778c;
            if (i7 < sparseArray.size()) {
                j0 j0Var = ((e) sparseArray.valueAt(i7)).V;
                if (j0Var != null) {
                    j0Var.f10851b = false;
                    j0Var.f10852c = 0;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13686b;
        return s1.f13749e;
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
        if (this.f59805y != null) {
            return;
        }
        throw t0.a(null, "Element " + i7 + " must be in a TrackEntry");
    }

    public final void i(x3.e r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: x3.f.i(x3.e, long, int, int, int):void");
    }

    public final void k() {
        if (this.f59804x) {
            int i7 = 0;
            while (true) {
                SparseArray sparseArray = this.f59778c;
                if (i7 < sparseArray.size()) {
                    if (((e) sparseArray.valueAt(i7)).W) {
                        return;
                    }
                    i7++;
                } else {
                    q qVar = this.f59791j0;
                    qVar.getClass();
                    qVar.d1();
                    this.f59804x = false;
                    return;
                }
            }
        }
    }

    public final void l(p pVar, int i7) {
        x xVar = this.f59788i;
        if (xVar.f13523c >= i7) {
            return;
        }
        byte[] bArr = xVar.f13521a;
        if (bArr.length < i7) {
            xVar.c(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = xVar.f13521a;
        int i10 = xVar.f13523c;
        pVar.readFully(bArr2, i10, i7 - i10);
        xVar.M(i7);
    }

    public final void m() {
        this.f59775a0 = 0;
        this.f59777b0 = 0;
        this.f59779c0 = 0;
        this.f59780d0 = false;
        this.f59782e0 = false;
        this.f59784f0 = false;
        this.f59786g0 = 0;
        this.f59787h0 = (byte) 0;
        this.f59789i0 = false;
        this.f59793l.K(0);
    }

    public final long n(long j3) {
        long j10 = this.f59801t;
        if (j10 != -9223372036854775807L) {
            String str = l0.f13471a;
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
        if ("S_TEXT/UTF8".equals(eVar.f59747c)) {
            p(pVar, f59769k0, i7);
            int i11 = this.f59777b0;
            m();
            return i11;
        } else if (!"S_TEXT/ASS".equals(eVar.f59747c) && !"S_TEXT/SSA".equals(eVar.f59747c)) {
            if ("S_TEXT/WEBVTT".equals(eVar.f59747c)) {
                p(pVar, f59771n0, i7);
                int i12 = this.f59777b0;
                m();
                return i12;
            }
            boolean z13 = true;
            if (eVar.W) {
                eVar.f59746b0.getClass();
                x xVar = new x(i7);
                if (pVar.h(xVar.f13521a, 0, i7, true)) {
                    pVar.l();
                    if (f3.b.i(xVar.i()) == 1 && xVar.a() >= 10) {
                        byte[] bArr = new byte[10];
                        xVar.k(0, 10, bArr);
                        xVar.N(0);
                        int g10 = f3.b.g(bArr);
                        if (g10 > 0 && xVar.a() >= g10 + 4) {
                            xVar.O(g10);
                            if (f3.b.i(xVar.m()) == 2) {
                                t a10 = eVar.f59746b0.a();
                                a10.f10399r = s0.n("audio/vnd.dts.hd");
                                eVar.f59746b0 = new u(a10);
                            }
                        }
                    }
                }
                eVar.f59744a0.g(eVar.f59746b0);
                eVar.W = false;
                k();
            }
            f3.i0 i0Var = eVar.f59744a0;
            boolean z14 = this.f59780d0;
            x xVar2 = this.f59793l;
            if (!z14) {
                boolean z15 = eVar.f59752i;
                x xVar3 = this.f59788i;
                if (z15) {
                    this.W &= -1073741825;
                    int i13 = 128;
                    if (!this.f59782e0) {
                        pVar.readFully(xVar3.f13521a, 0, 1);
                        this.f59775a0++;
                        byte b10 = xVar3.f13521a[0];
                        if ((b10 & 128) != 128) {
                            this.f59787h0 = b10;
                            this.f59782e0 = true;
                        } else {
                            throw t0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f59787h0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.f59789i0) {
                            x xVar4 = this.f59795n;
                            pVar.readFully(xVar4.f13521a, 0, 8);
                            this.f59775a0 += 8;
                            this.f59789i0 = true;
                            byte[] bArr2 = xVar3.f13521a;
                            if (!z12) {
                                i13 = 0;
                            }
                            bArr2[0] = (byte) (i13 | 8);
                            xVar3.N(0);
                            i0Var.a(xVar3, 1, 1);
                            this.f59777b0++;
                            xVar4.N(0);
                            i0Var.a(xVar4, 8, 1);
                            this.f59777b0 += 8;
                        }
                        if (z12) {
                            if (!this.f59784f0) {
                                pVar.readFully(xVar3.f13521a, 0, 1);
                                this.f59775a0++;
                                xVar3.N(0);
                                this.f59786g0 = xVar3.A();
                                this.f59784f0 = true;
                            }
                            int i14 = this.f59786g0 * 4;
                            xVar3.K(i14);
                            pVar.readFully(xVar3.f13521a, 0, i14);
                            this.f59775a0 += i14;
                            short s5 = (short) ((this.f59786g0 / 2) + 1);
                            int i15 = (s5 * 6) + 2;
                            ByteBuffer byteBuffer = this.f59798q;
                            if (byteBuffer == null || byteBuffer.capacity() < i15) {
                                this.f59798q = ByteBuffer.allocate(i15);
                            }
                            this.f59798q.position(0);
                            this.f59798q.putShort(s5);
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                i10 = this.f59786g0;
                                if (i16 >= i10) {
                                    break;
                                }
                                int E = xVar3.E();
                                if (i16 % 2 == 0) {
                                    this.f59798q.putShort((short) (E - i17));
                                } else {
                                    this.f59798q.putInt(E - i17);
                                }
                                i16++;
                                i17 = E;
                            }
                            int i18 = (i7 - this.f59775a0) - i17;
                            if (i10 % 2 == 1) {
                                this.f59798q.putInt(i18);
                            } else {
                                this.f59798q.putShort((short) i18);
                                this.f59798q.putInt(0);
                            }
                            byte[] array = this.f59798q.array();
                            x xVar5 = this.f59796o;
                            xVar5.L(i15, array);
                            i0Var.a(xVar5, i15, 1);
                            this.f59777b0 += i15;
                        }
                    }
                } else {
                    byte[] bArr3 = eVar.f59753j;
                    if (bArr3 != null) {
                        xVar2.L(bArr3.length, bArr3);
                    }
                }
                if ("A_OPUS".equals(eVar.f59747c)) {
                    z11 = z10;
                } else if (eVar.f59751g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.W |= 268435456;
                    this.f59797p.K(0);
                    int i19 = (xVar2.f13523c + i7) - this.f59775a0;
                    xVar3.K(4);
                    byte[] bArr4 = xVar3.f13521a;
                    bArr4[0] = (byte) ((i19 >> 24) & 255);
                    bArr4[1] = (byte) ((i19 >> 16) & 255);
                    bArr4[2] = (byte) ((i19 >> 8) & 255);
                    bArr4[3] = (byte) (i19 & 255);
                    i0Var.a(xVar3, 4, 2);
                    this.f59777b0 += 4;
                }
                this.f59780d0 = true;
            }
            int i20 = i7 + xVar2.f13523c;
            if (!"V_MPEG4/ISO/AVC".equals(eVar.f59747c) && !"V_MPEGH/ISO/HEVC".equals(eVar.f59747c)) {
                if (eVar.V != null) {
                    if (xVar2.f13523c != 0) {
                        z13 = false;
                    }
                    ja.p(z13);
                    eVar.V.c(pVar);
                }
                while (true) {
                    int i21 = this.f59775a0;
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
                    this.f59775a0 += e11;
                    this.f59777b0 += e11;
                }
            } else {
                x xVar6 = this.h;
                byte[] bArr5 = xVar6.f13521a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i23 = eVar.f59748c0;
                int i24 = 4 - i23;
                while (this.f59775a0 < i20) {
                    int i25 = this.f59779c0;
                    if (i25 == 0) {
                        int min = Math.min(i23, xVar2.a());
                        pVar.readFully(bArr5, i24 + min, i23 - min);
                        if (min > 0) {
                            xVar2.k(i24, min, bArr5);
                        }
                        this.f59775a0 += i23;
                        xVar6.N(0);
                        this.f59779c0 = xVar6.E();
                        x xVar7 = this.f59785g;
                        xVar7.N(0);
                        i0Var.b(4, xVar7);
                        this.f59777b0 += 4;
                    } else {
                        int a12 = xVar2.a();
                        if (a12 > 0) {
                            e10 = Math.min(i25, a12);
                            i0Var.b(e10, xVar2);
                        } else {
                            e10 = i0Var.e(pVar, i25, false);
                        }
                        this.f59775a0 += e10;
                        this.f59777b0 += e10;
                        this.f59779c0 -= e10;
                    }
                }
            }
            if ("A_VORBIS".equals(eVar.f59747c)) {
                x xVar8 = this.f59790j;
                xVar8.N(0);
                i0Var.b(4, xVar8);
                this.f59777b0 += 4;
            }
            int i26 = this.f59777b0;
            m();
            return i26;
        } else {
            p(pVar, m0, i7);
            int i27 = this.f59777b0;
            m();
            return i27;
        }
    }

    public final void p(p pVar, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        x xVar = this.f59794m;
        byte[] bArr2 = xVar.f13521a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i7);
            xVar.getClass();
            xVar.L(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(xVar.f13521a, bArr.length, i7);
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
