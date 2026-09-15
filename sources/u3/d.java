package u3;

import android.util.SparseArray;
import b2.s0;
import c3.h0;
import c3.i0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c5.b0;
import com.google.android.gms.internal.vision.e2;
import com.google.firebase.messaging.m;
import e2.d0;
import e2.v;
import e9.a1;
import e9.g0;
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
import k2.c0;
import z3.k;
public final class d implements o {
    public static final byte[] f43568f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f43569g0;
    public static final byte[] f43570h0;
    public static final byte[] f43571i0;
    public static final UUID f43572j0;
    public static final Map f43573k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public b0 F;
    public b0 G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final b f43574a;
    public boolean f43575a0;
    public final e f43576b;
    public int f43577b0;
    public final SparseArray f43578c;
    public byte f43579c0;
    public final boolean d;
    public boolean f43580d0;
    public final boolean e;
    public q f43581e0;
    public final k f43582f;
    public final v f43583g;
    public final v h;
    public final v f43584i;
    public final v f43585j;
    public final v f43586k;
    public final v f43587l;
    public final v f43588m;
    public final v f43589n;
    public final v f43590o;
    public final v f43591p;
    public ByteBuffer f43592q;
    public long f43593r;
    public long f43594s;
    public long f43595t;
    public long f43596u;
    public long v;
    public boolean f43597w;
    public c f43598x;
    public boolean f43599y;
    public int f43600z;

    static {
        String str = d0.f7883a;
        f43569g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f43570h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f43571i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f43572j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        e2.o(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        e2.o(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f43573k0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(k kVar, int i10) {
        boolean z10;
        b bVar = new b();
        this.f43594s = -1L;
        this.f43595t = -9223372036854775807L;
        this.f43596u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f43574a = bVar;
        bVar.d = new c0(this, 28);
        this.f43582f = kVar;
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.e = (i10 & 2) == 0;
        this.f43576b = new e();
        this.f43578c = new SparseArray();
        this.f43584i = new v(4);
        this.f43585j = new v(ByteBuffer.allocate(4).putInt(-1).array());
        this.f43586k = new v(4);
        this.f43583g = new v(f2.o.f8845a);
        this.h = new v(4);
        this.f43587l = new v();
        this.f43588m = new v();
        this.f43589n = new v(8);
        this.f43590o = new v();
        this.f43591p = new v();
        this.O = new int[1];
    }

    public static byte[] f(long j3, long j10, String str) {
        boolean z10;
        if (j3 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.b(z10);
        int i10 = (int) (j3 / 3600000000L);
        long j11 = j3 - (i10 * 3600000000L);
        int i11 = (int) (j11 / 60000000);
        long j12 = j11 - (i11 * 60000000);
        int i12 = (int) (j12 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j12 - (i12 * 1000000)) / j10)));
        String str2 = d0.f7883a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean a(p pVar) {
        long h;
        int i10;
        b0 b0Var = new b0(8, (byte) 0);
        v vVar = (v) b0Var.f3842c;
        l lVar = (l) pVar;
        long j3 = lVar.f3785c;
        long j10 = 1024;
        int i11 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        if (i11 != 0 && j3 <= 1024) {
            j10 = j3;
        }
        int i12 = (int) j10;
        lVar.h(vVar.f7929a, 0, 4, false);
        long z10 = vVar.z();
        b0Var.f3841b = 4;
        while (true) {
            if (z10 != 440786851) {
                int i13 = b0Var.f3841b + 1;
                b0Var.f3841b = i13;
                if (i13 == i12) {
                    break;
                }
                lVar.h(vVar.f7929a, 0, 1, false);
                z10 = ((z10 << 8) & (-256)) | (vVar.f7929a[0] & 255);
            } else {
                long h10 = b0Var.h(lVar);
                long j11 = b0Var.f3841b;
                if (h10 != Long.MIN_VALUE && (i11 == 0 || j11 + h10 < j3)) {
                    while (true) {
                        int i14 = (b0Var.f3841b > (j11 + h10) ? 1 : (b0Var.f3841b == (j11 + h10) ? 0 : -1));
                        if (i14 < 0) {
                            if (b0Var.h(lVar) == Long.MIN_VALUE || (h = b0Var.h(lVar)) < 0 || h > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) h;
                                lVar.s(i15, false);
                                b0Var.f3841b += i15;
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

    public final void b(int i10) {
        if (this.F != null && this.G != null) {
            return;
        }
        throw s0.a(null, "Element " + i10 + " must be in a Cues");
    }

    public final void d(int i10) {
        if (this.f43598x != null) {
            return;
        }
        throw s0.a(null, "Element " + i10 + " must be in a TrackEntry");
    }

    public final void e(u3.c r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: u3.d.e(u3.c, long, int, int, int):void");
    }

    @Override
    public final void g(q qVar) {
        if (this.e) {
            qVar = new m(qVar, this.f43582f);
        }
        this.f43581e0 = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        this.E = -9223372036854775807L;
        this.J = 0;
        b bVar = this.f43574a;
        bVar.e = 0;
        bVar.f43541b.clear();
        e eVar = bVar.f43542c;
        eVar.f43602b = 0;
        eVar.f43603c = 0;
        e eVar2 = this.f43576b;
        eVar2.f43602b = 0;
        eVar2.f43603c = 0;
        k();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f43578c;
            if (i10 < sparseArray.size()) {
                i0 i0Var = ((c) sparseArray.valueAt(i10)).V;
                if (i0Var != null) {
                    i0Var.f3767b = false;
                    i0Var.f3768c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List i() {
        g0 g0Var = e9.i0.f8079b;
        return a1.e;
    }

    public final void j(p pVar, int i10) {
        v vVar = this.f43584i;
        if (vVar.f7931c >= i10) {
            return;
        }
        byte[] bArr = vVar.f7929a;
        if (bArr.length < i10) {
            vVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = vVar.f7929a;
        int i11 = vVar.f7931c;
        pVar.readFully(bArr2, i11, i10 - i11);
        vVar.I(i10);
    }

    public final void k() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f43575a0 = false;
        this.f43577b0 = 0;
        this.f43579c0 = (byte) 0;
        this.f43580d0 = false;
        this.f43587l.G(0);
    }

    public final long l(long j3) {
        long j10 = this.f43595t;
        if (j10 != -9223372036854775807L) {
            String str = d0.f7883a;
            return d0.Y(j3, j10, 1000L, RoundingMode.DOWN);
        }
        throw s0.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    @Override
    public final int m(c3.p r43, c3.s r44) {
        throw new UnsupportedOperationException("Method not decompiled: u3.d.m(c3.p, c3.s):int");
    }

    public final int n(p pVar, c cVar, int i10, boolean z10) {
        int a2;
        int a10;
        boolean z11;
        boolean z12;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f43548c)) {
            o(pVar, f43568f0, i10);
            int i12 = this.W;
            k();
            return i12;
        } else if (!"S_TEXT/ASS".equals(cVar.f43548c) && !"S_TEXT/SSA".equals(cVar.f43548c)) {
            if ("S_TEXT/WEBVTT".equals(cVar.f43548c)) {
                o(pVar, f43571i0, i10);
                int i13 = this.W;
                k();
                return i13;
            }
            h0 h0Var = cVar.Z;
            boolean z13 = this.Y;
            v vVar = this.f43587l;
            boolean z14 = true;
            if (!z13) {
                boolean z15 = cVar.f43551i;
                v vVar2 = this.f43584i;
                if (z15) {
                    this.R &= -1073741825;
                    int i14 = 128;
                    if (!this.Z) {
                        pVar.readFully(vVar2.f7929a, 0, 1);
                        this.V++;
                        byte b10 = vVar2.f7929a[0];
                        if ((b10 & 128) != 128) {
                            this.f43579c0 = b10;
                            this.Z = true;
                        } else {
                            throw s0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f43579c0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.R |= 1073741824;
                        if (!this.f43580d0) {
                            v vVar3 = this.f43589n;
                            pVar.readFully(vVar3.f7929a, 0, 8);
                            this.V += 8;
                            this.f43580d0 = true;
                            byte[] bArr = vVar2.f7929a;
                            if (!z12) {
                                i14 = 0;
                            }
                            bArr[0] = (byte) (i14 | 8);
                            vVar2.J(0);
                            h0Var.f(vVar2, 1, 1);
                            this.W++;
                            vVar3.J(0);
                            h0Var.f(vVar3, 8, 1);
                            this.W += 8;
                        }
                        if (z12) {
                            if (!this.f43575a0) {
                                pVar.readFully(vVar2.f7929a, 0, 1);
                                this.V++;
                                vVar2.J(0);
                                this.f43577b0 = vVar2.x();
                                this.f43575a0 = true;
                            }
                            int i15 = this.f43577b0 * 4;
                            vVar2.G(i15);
                            pVar.readFully(vVar2.f7929a, 0, i15);
                            this.V += i15;
                            short s10 = (short) ((this.f43577b0 / 2) + 1);
                            int i16 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f43592q;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f43592q = ByteBuffer.allocate(i16);
                            }
                            this.f43592q.position(0);
                            this.f43592q.putShort(s10);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.f43577b0;
                                if (i17 >= i11) {
                                    break;
                                }
                                int B = vVar2.B();
                                if (i17 % 2 == 0) {
                                    this.f43592q.putShort((short) (B - i18));
                                } else {
                                    this.f43592q.putInt(B - i18);
                                }
                                i17++;
                                i18 = B;
                            }
                            int i19 = (i10 - this.V) - i18;
                            if (i11 % 2 == 1) {
                                this.f43592q.putInt(i19);
                            } else {
                                this.f43592q.putShort((short) i19);
                                this.f43592q.putInt(0);
                            }
                            byte[] array = this.f43592q.array();
                            v vVar4 = this.f43590o;
                            vVar4.H(i16, array);
                            h0Var.f(vVar4, i16, 1);
                            this.W += i16;
                        }
                    }
                } else {
                    byte[] bArr2 = cVar.f43552j;
                    if (bArr2 != null) {
                        vVar.H(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(cVar.f43548c)) {
                    z11 = z10;
                } else if (cVar.f43550g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.R |= 268435456;
                    this.f43591p.G(0);
                    int i20 = (vVar.f7931c + i10) - this.V;
                    vVar2.G(4);
                    byte[] bArr3 = vVar2.f7929a;
                    bArr3[0] = (byte) ((i20 >> 24) & 255);
                    bArr3[1] = (byte) ((i20 >> 16) & 255);
                    bArr3[2] = (byte) ((i20 >> 8) & 255);
                    bArr3[3] = (byte) (i20 & 255);
                    h0Var.f(vVar2, 4, 2);
                    this.W += 4;
                }
                this.Y = true;
            }
            int i21 = i10 + vVar.f7931c;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f43548c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f43548c)) {
                if (cVar.V != null) {
                    if (vVar.f7931c != 0) {
                        z14 = false;
                    }
                    e2.d.g(z14);
                    cVar.V.c(pVar);
                }
                while (true) {
                    int i22 = this.V;
                    if (i22 >= i21) {
                        break;
                    }
                    int i23 = i21 - i22;
                    int a11 = vVar.a();
                    if (a11 > 0) {
                        a10 = Math.min(i23, a11);
                        h0Var.d(a10, vVar);
                    } else {
                        a10 = h0Var.a(pVar, i23, false);
                    }
                    this.V += a10;
                    this.W += a10;
                }
            } else {
                v vVar5 = this.h;
                byte[] bArr4 = vVar5.f7929a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i24 = cVar.f43546a0;
                int i25 = 4 - i24;
                while (this.V < i21) {
                    int i26 = this.X;
                    if (i26 == 0) {
                        int min = Math.min(i24, vVar.a());
                        pVar.readFully(bArr4, i25 + min, i24 - min);
                        if (min > 0) {
                            vVar.h(i25, min, bArr4);
                        }
                        this.V += i24;
                        vVar5.J(0);
                        this.X = vVar5.B();
                        v vVar6 = this.f43583g;
                        vVar6.J(0);
                        h0Var.d(4, vVar6);
                        this.W += 4;
                    } else {
                        int a12 = vVar.a();
                        if (a12 > 0) {
                            a2 = Math.min(i26, a12);
                            h0Var.d(a2, vVar);
                        } else {
                            a2 = h0Var.a(pVar, i26, false);
                        }
                        this.V += a2;
                        this.W += a2;
                        this.X -= a2;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f43548c)) {
                v vVar7 = this.f43585j;
                vVar7.J(0);
                h0Var.d(4, vVar7);
                this.W += 4;
            }
            int i27 = this.W;
            k();
            return i27;
        } else {
            o(pVar, f43570h0, i10);
            int i28 = this.W;
            k();
            return i28;
        }
    }

    public final void o(p pVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        v vVar = this.f43588m;
        byte[] bArr2 = vVar.f7929a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            vVar.getClass();
            vVar.H(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(vVar.f7929a, bArr.length, i10);
        vVar.J(0);
        vVar.I(length);
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
