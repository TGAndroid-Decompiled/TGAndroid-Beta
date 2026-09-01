package x3;

import android.util.SparseArray;
import h5.d0;
import h5.w;
import j$.util.DesugarCollections;
import j3.r1;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.telegram.ui.web.e0;
import p2.v;
import r3.h;
import r3.k;
import r3.l;
import r3.m;
public final class d implements k {
    public static final byte[] f50332c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f50333d0;
    public static final byte[] f50334e0;
    public static final byte[] f50335f0;
    public static final UUID f50336g0;
    public static final Map f50337h0;
    public long A;
    public long B;
    public v C;
    public v D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final b f50338a;
    public boolean f50339a0;
    public final e f50340b;
    public m f50341b0;
    public final SparseArray f50342c;
    public final boolean d;
    public final w f50343e;
    public final w f50344f;
    public final w f50345g;
    public final w h;
    public final w f50346i;
    public final w f50347j;
    public final w f50348k;
    public final w f50349l;
    public final w f50350m;
    public final w f50351n;
    public ByteBuffer f50352o;
    public long f50353p;
    public long f50354q;
    public long f50355r;
    public long f50356s;
    public long f50357t;
    public c f50358u;
    public boolean v;
    public int f50359w;
    public long f50360x;
    public boolean f50361y;
    public long f50362z;

    static {
        int i10 = d0.f7237a;
        f50333d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(r8.d.f46738c);
        f50334e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f50335f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f50336g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        w.c.i(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        w.c.i(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f50337h0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(int i10) {
        boolean z4;
        b bVar = new b();
        this.f50354q = -1L;
        this.f50355r = -9223372036854775807L;
        this.f50356s = -9223372036854775807L;
        this.f50357t = -9223372036854775807L;
        this.f50362z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f50338a = bVar;
        bVar.d = new e0(this, 22);
        if ((i10 & 1) == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        this.f50340b = new e();
        this.f50342c = new SparseArray();
        this.f50345g = new w(4);
        this.h = new w(ByteBuffer.allocate(4).putInt(-1).array());
        this.f50346i = new w(4);
        this.f50343e = new w(h5.a.d);
        this.f50344f = new w(4);
        this.f50347j = new w();
        this.f50348k = new w();
        this.f50349l = new w(8);
        this.f50350m = new w();
        this.f50351n = new w();
        this.L = new int[1];
    }

    public static byte[] f(long j10, long j11, String str) {
        boolean z4;
        if (j10 != -9223372036854775807L) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.f(z4);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i10 * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (i11 * 60000000);
        int i12 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11)));
        int i13 = d0.f7237a;
        return format.getBytes(r8.d.f46738c);
    }

    public final void a(int i10) {
        if (this.C != null && this.D != null) {
            return;
        }
        throw r1.a("Element " + i10 + " must be in a Cues", null);
    }

    public final void b(int i10) {
        if (this.f50358u != null) {
            return;
        }
        throw r1.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    public final void c(x3.c r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.c(x3.c, long, int, int, int):void");
    }

    @Override
    public final void d(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        b bVar = this.f50338a;
        bVar.f50306e = 0;
        bVar.f50304b.clear();
        e eVar = bVar.f50305c;
        eVar.f50364b = 0;
        eVar.f50365c = 0;
        e eVar2 = this.f50340b;
        eVar2.f50364b = 0;
        eVar2.f50365c = 0;
        j();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f50342c;
            if (i10 < sparseArray.size()) {
                r3.w wVar = ((c) sparseArray.valueAt(i10)).T;
                if (wVar != null) {
                    wVar.f46591b = false;
                    wVar.f46592c = 0;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void e(m mVar) {
        this.f50341b0 = mVar;
    }

    public final void g(l lVar, int i10) {
        w wVar = this.f50345g;
        if (wVar.f7310c >= i10) {
            return;
        }
        byte[] bArr = wVar.f7308a;
        if (bArr.length < i10) {
            wVar.b(Math.max(bArr.length * 2, i10));
        }
        byte[] bArr2 = wVar.f7308a;
        int i11 = wVar.f7310c;
        lVar.readFully(bArr2, i11, i10 - i11);
        wVar.E(i10);
    }

    @Override
    public final int h(r3.l r38, org.telegram.ui.Components.jb r39) {
        throw new UnsupportedOperationException("Method not decompiled: x3.d.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        long g10;
        int i10;
        v vVar = new v(11, (byte) 0);
        w wVar = (w) vVar.f44183c;
        h hVar = (h) lVar;
        long j10 = hVar.f46556c;
        long j11 = 1024;
        int i11 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        if (i11 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i12 = (int) j11;
        hVar.f(wVar.f7308a, 0, 4, false);
        long v = wVar.v();
        vVar.f44182b = 4;
        while (true) {
            if (v != 440786851) {
                int i13 = vVar.f44182b + 1;
                vVar.f44182b = i13;
                if (i13 == i12) {
                    break;
                }
                hVar.f(wVar.f7308a, 0, 1, false);
                v = ((v << 8) & (-256)) | (wVar.f7308a[0] & 255);
            } else {
                long g11 = vVar.g(hVar);
                long j12 = vVar.f44182b;
                if (g11 != Long.MIN_VALUE && (i11 == 0 || j12 + g11 < j10)) {
                    while (true) {
                        int i14 = (vVar.f44182b > (j12 + g11) ? 1 : (vVar.f44182b == (j12 + g11) ? 0 : -1));
                        if (i14 < 0) {
                            if (vVar.g(hVar) == Long.MIN_VALUE || (g10 = vVar.g(hVar)) < 0 || g10 > 2147483647L) {
                                break;
                            } else if (i10 != 0) {
                                int i15 = (int) g10;
                                hVar.a(i15, false);
                                vVar.f44182b += i15;
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

    public final void j() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f50339a0 = false;
        this.f50347j.C(0);
    }

    public final long k(long j10) {
        long j11 = this.f50355r;
        if (j11 != -9223372036854775807L) {
            return d0.N(j10, j11, 1000L);
        }
        throw r1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(l lVar, c cVar, int i10, boolean z4) {
        int e6;
        int e10;
        boolean z10;
        boolean z11;
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f50310b)) {
            m(lVar, f50332c0, i10);
            int i12 = this.T;
            j();
            return i12;
        } else if ("S_TEXT/ASS".equals(cVar.f50310b)) {
            m(lVar, f50334e0, i10);
            int i13 = this.T;
            j();
            return i13;
        } else if ("S_TEXT/WEBVTT".equals(cVar.f50310b)) {
            m(lVar, f50335f0, i10);
            int i14 = this.T;
            j();
            return i14;
        } else {
            r3.v vVar = cVar.X;
            boolean z12 = this.V;
            w wVar = this.f50347j;
            boolean z13 = true;
            if (!z12) {
                boolean z14 = cVar.h;
                w wVar2 = this.f50345g;
                if (z14) {
                    this.O &= -1073741825;
                    int i15 = 128;
                    if (!this.W) {
                        lVar.readFully(wVar2.f7308a, 0, 1);
                        this.S++;
                        byte b10 = wVar2.f7308a[0];
                        if ((b10 & 128) != 128) {
                            this.Z = b10;
                            this.W = true;
                        } else {
                            throw r1.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b11 = this.Z;
                    if ((b11 & 1) == 1) {
                        if ((b11 & 2) == 2) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.O |= 1073741824;
                        if (!this.f50339a0) {
                            w wVar3 = this.f50349l;
                            lVar.readFully(wVar3.f7308a, 0, 8);
                            this.S += 8;
                            this.f50339a0 = true;
                            byte[] bArr = wVar2.f7308a;
                            if (!z11) {
                                i15 = 0;
                            }
                            bArr[0] = (byte) (i15 | 8);
                            wVar2.F(0);
                            vVar.a(1, wVar2);
                            this.T++;
                            wVar3.F(0);
                            vVar.a(8, wVar3);
                            this.T += 8;
                        }
                        if (z11) {
                            if (!this.X) {
                                lVar.readFully(wVar2.f7308a, 0, 1);
                                this.S++;
                                wVar2.F(0);
                                this.Y = wVar2.u();
                                this.X = true;
                            }
                            int i16 = this.Y * 4;
                            wVar2.C(i16);
                            lVar.readFully(wVar2.f7308a, 0, i16);
                            this.S += i16;
                            short s6 = (short) ((this.Y / 2) + 1);
                            int i17 = (s6 * 6) + 2;
                            ByteBuffer byteBuffer = this.f50352o;
                            if (byteBuffer == null || byteBuffer.capacity() < i17) {
                                this.f50352o = ByteBuffer.allocate(i17);
                            }
                            this.f50352o.position(0);
                            this.f50352o.putShort(s6);
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                i11 = this.Y;
                                if (i18 >= i11) {
                                    break;
                                }
                                int x10 = wVar2.x();
                                if (i18 % 2 == 0) {
                                    this.f50352o.putShort((short) (x10 - i19));
                                } else {
                                    this.f50352o.putInt(x10 - i19);
                                }
                                i18++;
                                i19 = x10;
                            }
                            int i20 = (i10 - this.S) - i19;
                            if (i11 % 2 == 1) {
                                this.f50352o.putInt(i20);
                            } else {
                                this.f50352o.putShort((short) i20);
                                this.f50352o.putInt(0);
                            }
                            byte[] array = this.f50352o.array();
                            w wVar4 = this.f50350m;
                            wVar4.D(i17, array);
                            vVar.a(i17, wVar4);
                            this.T += i17;
                        }
                    }
                } else {
                    byte[] bArr2 = cVar.f50315i;
                    if (bArr2 != null) {
                        wVar.D(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(cVar.f50310b)) {
                    z10 = z4;
                } else if (cVar.f50313f > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.O |= 268435456;
                    this.f50351n.C(0);
                    int i21 = (wVar.f7310c + i10) - this.S;
                    wVar2.C(4);
                    byte[] bArr3 = wVar2.f7308a;
                    bArr3[0] = (byte) ((i21 >> 24) & 255);
                    bArr3[1] = (byte) ((i21 >> 16) & 255);
                    bArr3[2] = (byte) ((i21 >> 8) & 255);
                    bArr3[3] = (byte) (i21 & 255);
                    vVar.a(4, wVar2);
                    this.T += 4;
                }
                this.V = true;
            }
            int i22 = i10 + wVar.f7310c;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f50310b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f50310b)) {
                if (cVar.T != null) {
                    if (wVar.f7310c != 0) {
                        z13 = false;
                    }
                    h5.a.i(z13);
                    cVar.T.c(lVar);
                }
                while (true) {
                    int i23 = this.S;
                    if (i23 >= i22) {
                        break;
                    }
                    int i24 = i22 - i23;
                    int a2 = wVar.a();
                    if (a2 > 0) {
                        e10 = Math.min(i24, a2);
                        vVar.d(e10, wVar);
                    } else {
                        e10 = vVar.e(lVar, i24, false);
                    }
                    this.S += e10;
                    this.T += e10;
                }
            } else {
                w wVar5 = this.f50344f;
                byte[] bArr4 = wVar5.f7308a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i25 = cVar.Y;
                int i26 = 4 - i25;
                while (this.S < i22) {
                    int i27 = this.U;
                    if (i27 == 0) {
                        int min = Math.min(i25, wVar.a());
                        lVar.readFully(bArr4, i26 + min, i25 - min);
                        if (min > 0) {
                            wVar.e(i26, min, bArr4);
                        }
                        this.S += i25;
                        wVar5.F(0);
                        this.U = wVar5.x();
                        w wVar6 = this.f50343e;
                        wVar6.F(0);
                        vVar.d(4, wVar6);
                        this.T += 4;
                    } else {
                        int a10 = wVar.a();
                        if (a10 > 0) {
                            e6 = Math.min(i27, a10);
                            vVar.d(e6, wVar);
                        } else {
                            e6 = vVar.e(lVar, i27, false);
                        }
                        this.S += e6;
                        this.T += e6;
                        this.U -= e6;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f50310b)) {
                w wVar7 = this.h;
                wVar7.F(0);
                vVar.d(4, wVar7);
                this.T += 4;
            }
            int i28 = this.T;
            j();
            return i28;
        }
    }

    public final void m(l lVar, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        w wVar = this.f50348k;
        byte[] bArr2 = wVar.f7308a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i10);
            wVar.getClass();
            wVar.D(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(wVar.f7308a, bArr.length, i10);
        wVar.F(0);
        wVar.E(length);
    }

    @Override
    public final void release() {
    }
}
