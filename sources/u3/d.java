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
import z3.k;
public final class d implements o {
    public static final byte[] f43823f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f43824g0;
    public static final byte[] f43825h0;
    public static final byte[] f43826i0;
    public static final UUID f43827j0;
    public static final Map f43828k0;
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
    public final b f43829a;
    public boolean f43830a0;
    public final e f43831b;
    public int f43832b0;
    public final SparseArray f43833c;
    public byte f43834c0;
    public final boolean d;
    public boolean f43835d0;
    public final boolean e;
    public q f43836e0;
    public final k f43837f;
    public final v f43838g;
    public final v h;
    public final v f43839i;
    public final v f43840j;
    public final v f43841k;
    public final v f43842l;
    public final v f43843m;
    public final v f43844n;
    public final v f43845o;
    public final v f43846p;
    public ByteBuffer f43847q;
    public long f43848r;
    public long f43849s;
    public long f43850t;
    public long f43851u;
    public long v;
    public boolean f43852w;
    public c f43853x;
    public boolean f43854y;
    public int f43855z;

    static {
        String str = d0.f7887a;
        f43824g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f43825h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f43826i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f43827j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        e2.o(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        e2.o(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f43828k0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(k kVar, int i10) {
        boolean z10;
        b bVar = new b();
        this.f43849s = -1L;
        this.f43850t = -9223372036854775807L;
        this.f43851u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.f43829a = bVar;
        bVar.d = new ka.c(this, 24);
        this.f43837f = kVar;
        if ((i10 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.e = (i10 & 2) == 0;
        this.f43831b = new e();
        this.f43833c = new SparseArray();
        this.f43839i = new v(4);
        this.f43840j = new v(ByteBuffer.allocate(4).putInt(-1).array());
        this.f43841k = new v(4);
        this.f43838g = new v(f2.o.f8849a);
        this.h = new v(4);
        this.f43842l = new v();
        this.f43843m = new v();
        this.f43844n = new v(8);
        this.f43845o = new v();
        this.f43846p = new v();
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
        String str2 = d0.f7887a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    @Override
    public final boolean a(p pVar) {
        long h;
        int i10;
        b0 b0Var = new b0(8, (byte) 0);
        v vVar = (v) b0Var.f3847c;
        l lVar = (l) pVar;
        long j3 = lVar.f3790c;
        long j10 = 1024;
        int i11 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
        if (i11 != 0 && j3 <= 1024) {
            j10 = j3;
        }
        int i12 = (int) j10;
        lVar.h(vVar.f7933a, 0, 4, false);
        long z10 = vVar.z();
        b0Var.f3846b = 4;
        while (true) {
            if (z10 != 440786851) {
                int i13 = b0Var.f3846b + 1;
                b0Var.f3846b = i13;
                if (i13 == i12) {
                    break;
                }
                lVar.h(vVar.f7933a, 0, 1, false);
                z10 = ((z10 << 8) & (-256)) | (vVar.f7933a[0] & 255);
            } else {
                long h10 = b0Var.h(lVar);
                long j11 = b0Var.f3846b;
                if (h10 != Long.MIN_VALUE && (i11 == 0 || j11 + h10 < j3)) {
                    while (true) {
                        int i14 = (b0Var.f3846b > (j11 + h10) ? 1 : (b0Var.f3846b == (j11 + h10) ? 0 : -1));
                        if (i14 < 0) {
                            if (b0Var.h(lVar) == Long.MIN_VALUE || (h = b0Var.h(lVar)) < 0 || h > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) h;
                                lVar.t(i15, false);
                                b0Var.f3846b += i15;
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
        if (this.f43853x != null) {
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
            qVar = new m(qVar, this.f43837f);
        }
        this.f43836e0 = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        this.E = -9223372036854775807L;
        this.J = 0;
        b bVar = this.f43829a;
        bVar.e = 0;
        bVar.f43796b.clear();
        e eVar = bVar.f43797c;
        eVar.f43857b = 0;
        eVar.f43858c = 0;
        e eVar2 = this.f43831b;
        eVar2.f43857b = 0;
        eVar2.f43858c = 0;
        k();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f43833c;
            if (i10 < sparseArray.size()) {
                i0 i0Var = ((c) sparseArray.valueAt(i10)).V;
                if (i0Var != null) {
                    i0Var.f3772b = false;
                    i0Var.f3773c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final List i() {
        g0 g0Var = e9.i0.f8083b;
        return a1.e;
    }

    public final void j(p pVar, int i10) {
        v vVar = this.f43839i;
        if (vVar.f7935c >= i10) {
            return;
        }
        byte[] bArr = vVar.f7933a;
        if (bArr.length < i10) {
            vVar.c(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = vVar.f7933a;
        int i11 = vVar.f7935c;
        pVar.readFully(bArr2, i11, i10 - i11);
        vVar.I(i10);
    }

    public final void k() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.f43830a0 = false;
        this.f43832b0 = 0;
        this.f43834c0 = (byte) 0;
        this.f43835d0 = false;
        this.f43842l.G(0);
    }

    public final long l(long j3) {
        long j10 = this.f43850t;
        if (j10 != -9223372036854775807L) {
            String str = d0.f7887a;
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
        if ("S_TEXT/UTF8".equals(cVar.f43803c)) {
            o(pVar, f43823f0, i10);
            int i12 = this.W;
            k();
            return i12;
        } else if (!"S_TEXT/ASS".equals(cVar.f43803c) && !"S_TEXT/SSA".equals(cVar.f43803c)) {
            if ("S_TEXT/WEBVTT".equals(cVar.f43803c)) {
                o(pVar, f43826i0, i10);
                int i13 = this.W;
                k();
                return i13;
            }
            h0 h0Var = cVar.Z;
            boolean z13 = this.Y;
            v vVar = this.f43842l;
            boolean z14 = true;
            if (!z13) {
                boolean z15 = cVar.f43806i;
                v vVar2 = this.f43839i;
                if (z15) {
                    this.R &= -1073741825;
                    int i14 = 128;
                    if (!this.Z) {
                        pVar.readFully(vVar2.f7933a, 0, 1);
                        this.V++;
                        byte b10 = vVar2.f7933a[0];
                        if ((b10 & 128) != 128) {
                            this.f43834c0 = b10;
                            this.Z = true;
                        } else {
                            throw s0.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b11 = this.f43834c0;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.R |= 1073741824;
                        if (!this.f43835d0) {
                            v vVar3 = this.f43844n;
                            pVar.readFully(vVar3.f7933a, 0, 8);
                            this.V += 8;
                            this.f43835d0 = true;
                            byte[] bArr = vVar2.f7933a;
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
                            if (!this.f43830a0) {
                                pVar.readFully(vVar2.f7933a, 0, 1);
                                this.V++;
                                vVar2.J(0);
                                this.f43832b0 = vVar2.x();
                                this.f43830a0 = true;
                            }
                            int i15 = this.f43832b0 * 4;
                            vVar2.G(i15);
                            pVar.readFully(vVar2.f7933a, 0, i15);
                            this.V += i15;
                            short s10 = (short) ((this.f43832b0 / 2) + 1);
                            int i16 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f43847q;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f43847q = ByteBuffer.allocate(i16);
                            }
                            this.f43847q.position(0);
                            this.f43847q.putShort(s10);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i11 = this.f43832b0;
                                if (i17 >= i11) {
                                    break;
                                }
                                int B = vVar2.B();
                                if (i17 % 2 == 0) {
                                    this.f43847q.putShort((short) (B - i18));
                                } else {
                                    this.f43847q.putInt(B - i18);
                                }
                                i17++;
                                i18 = B;
                            }
                            int i19 = (i10 - this.V) - i18;
                            if (i11 % 2 == 1) {
                                this.f43847q.putInt(i19);
                            } else {
                                this.f43847q.putShort((short) i19);
                                this.f43847q.putInt(0);
                            }
                            byte[] array = this.f43847q.array();
                            v vVar4 = this.f43845o;
                            vVar4.H(i16, array);
                            h0Var.f(vVar4, i16, 1);
                            this.W += i16;
                        }
                    }
                } else {
                    byte[] bArr2 = cVar.f43807j;
                    if (bArr2 != null) {
                        vVar.H(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(cVar.f43803c)) {
                    z11 = z10;
                } else if (cVar.f43805g > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.R |= 268435456;
                    this.f43846p.G(0);
                    int i20 = (vVar.f7935c + i10) - this.V;
                    vVar2.G(4);
                    byte[] bArr3 = vVar2.f7933a;
                    bArr3[0] = (byte) ((i20 >> 24) & 255);
                    bArr3[1] = (byte) ((i20 >> 16) & 255);
                    bArr3[2] = (byte) ((i20 >> 8) & 255);
                    bArr3[3] = (byte) (i20 & 255);
                    h0Var.f(vVar2, 4, 2);
                    this.W += 4;
                }
                this.Y = true;
            }
            int i21 = i10 + vVar.f7935c;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f43803c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f43803c)) {
                if (cVar.V != null) {
                    if (vVar.f7935c != 0) {
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
                byte[] bArr4 = vVar5.f7933a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i24 = cVar.f43801a0;
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
                        v vVar6 = this.f43838g;
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
            if ("A_VORBIS".equals(cVar.f43803c)) {
                v vVar7 = this.f43840j;
                vVar7.J(0);
                h0Var.d(4, vVar7);
                this.W += 4;
            }
            int i27 = this.W;
            k();
            return i27;
        } else {
            o(pVar, f43825h0, i10);
            int i28 = this.W;
            k();
            return i28;
        }
    }

    public final void o(p pVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        v vVar = this.f43843m;
        byte[] bArr2 = vVar.f7933a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            vVar.getClass();
            vVar.H(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        pVar.readFully(vVar.f7933a, bArr.length, i10);
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
