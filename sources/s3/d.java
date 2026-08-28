package s3;

import android.util.SparseArray;
import d5.f0;
import d5.y;
import h3.t1;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.x;
import n2.p;
import n2.w;
import org.telegram.ui.Cells.j2;
public final class d implements k {
    public static final byte[] f47328c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] f47329d0;
    public static final byte[] f47330e0;
    public static final byte[] f47331f0;
    public static final UUID f47332g0;
    public static final Map f47333h0;
    public long A;
    public long B;
    public w C;
    public w D;
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
    public final b f47334a;
    public boolean f47335a0;
    public final e f47336b;
    public m f47337b0;
    public final SparseArray f47338c;
    public final boolean d;
    public final y f47339e;
    public final y f47340f;
    public final y f47341g;
    public final y h;
    public final y f47342i;
    public final y f47343j;
    public final y f47344k;
    public final y f47345l;
    public final y f47346m;
    public final y f47347n;
    public ByteBuffer f47348o;
    public long f47349p;
    public long f47350q;
    public long f47351r;
    public long f47352s;
    public long f47353t;
    public c f47354u;
    public boolean v;
    public int f47355w;
    public long f47356x;
    public boolean f47357y;
    public long f47358z;

    static {
        int i9 = f0.f4349a;
        f47329d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(n8.d.f18513c);
        f47330e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f47331f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f47332g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        j2.n(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        j2.n(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f47333h0 = DesugarCollections.unmodifiableMap(hashMap);
    }

    public d(int i9) {
        boolean z10;
        b bVar = new b();
        this.f47350q = -1L;
        this.f47351r = -9223372036854775807L;
        this.f47352s = -9223372036854775807L;
        this.f47353t = -9223372036854775807L;
        this.f47358z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f47334a = bVar;
        bVar.d = new p(this, 20);
        if ((i9 & 1) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f47336b = new e();
        this.f47338c = new SparseArray();
        this.f47341g = new y(4);
        this.h = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.f47342i = new y(4);
        this.f47339e = new y(d5.a.d);
        this.f47340f = new y(4);
        this.f47343j = new y();
        this.f47344k = new y();
        this.f47345l = new y(8);
        this.f47346m = new y();
        this.f47347n = new y();
        this.L = new int[1];
    }

    public static byte[] h(long j10, long j11, String str) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        d5.a.f(z10);
        int i9 = (int) (j10 / 3600000000L);
        long j12 = j10 - (i9 * 3600000000L);
        int i10 = (int) (j12 / 60000000);
        long j13 = j12 - (i10 * 60000000);
        int i11 = (int) (j13 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (i11 * 1000000)) / j11)));
        int i12 = f0.f4349a;
        return format.getBytes(n8.d.f18513c);
    }

    public final void a(int i9) {
        if (this.C != null && this.D != null) {
            return;
        }
        throw t1.a("Element " + i9 + " must be in a Cues", null);
    }

    @Override
    public final int b(m3.l r37, m3.n r38) {
        throw new UnsupportedOperationException("Method not decompiled: s3.d.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m mVar) {
        this.f47337b0 = mVar;
    }

    public final void d(int i9) {
        if (this.f47354u != null) {
            return;
        }
        throw t1.a("Element " + i9 + " must be in a TrackEntry", null);
    }

    public final void e(s3.c r18, long r19, int r21, int r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: s3.d.e(s3.c, long, int, int, int):void");
    }

    @Override
    public final boolean f(l lVar) {
        long g10;
        int i9;
        w wVar = new w(10, (byte) 0);
        y yVar = (y) wVar.f18361c;
        h hVar = (h) lVar;
        long j10 = hVar.f17236c;
        long j11 = 1024;
        int i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        if (i10 != 0 && j10 <= 1024) {
            j11 = j10;
        }
        int i11 = (int) j11;
        hVar.g(yVar.f4410a, 0, 4, false);
        long s10 = yVar.s();
        wVar.f18360b = 4;
        while (true) {
            if (s10 != 440786851) {
                int i12 = wVar.f18360b + 1;
                wVar.f18360b = i12;
                if (i12 == i11) {
                    break;
                }
                hVar.g(yVar.f4410a, 0, 1, false);
                s10 = ((s10 << 8) & (-256)) | (yVar.f4410a[0] & 255);
            } else {
                long g11 = wVar.g(hVar);
                long j12 = wVar.f18360b;
                if (g11 != Long.MIN_VALUE && (i10 == 0 || j12 + g11 < j10)) {
                    while (true) {
                        int i13 = (wVar.f18360b > (j12 + g11) ? 1 : (wVar.f18360b == (j12 + g11) ? 0 : -1));
                        if (i13 < 0) {
                            if (wVar.g(hVar) == Long.MIN_VALUE || (g10 = wVar.g(hVar)) < 0 || g10 > 2147483647L) {
                                break;
                            } else if (i9 != 0) {
                                int i14 = (int) g10;
                                hVar.a(i14, false);
                                wVar.f18360b += i14;
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
    public final void g(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        b bVar = this.f47334a;
        bVar.f47302e = 0;
        bVar.f47300b.clear();
        e eVar = bVar.f47301c;
        eVar.f47360b = 0;
        eVar.f47361c = 0;
        e eVar2 = this.f47336b;
        eVar2.f47360b = 0;
        eVar2.f47361c = 0;
        j();
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.f47338c;
            if (i9 < sparseArray.size()) {
                x xVar = ((c) sparseArray.valueAt(i9)).T;
                if (xVar != null) {
                    xVar.f17265b = false;
                    xVar.f17266c = 0;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void i(l lVar, int i9) {
        y yVar = this.f47341g;
        if (yVar.f4412c >= i9) {
            return;
        }
        byte[] bArr = yVar.f4410a;
        if (bArr.length < i9) {
            yVar.b(Math.max(bArr.length * 2, i9));
        }
        byte[] bArr2 = yVar.f4410a;
        int i10 = yVar.f4412c;
        lVar.readFully(bArr2, i10, i9 - i10);
        yVar.B(i9);
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
        this.f47335a0 = false;
        this.f47343j.z(0);
    }

    public final long k(long j10) {
        long j11 = this.f47351r;
        if (j11 != -9223372036854775807L) {
            return f0.O(j10, j11, 1000L);
        }
        throw t1.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int l(l lVar, c cVar, int i9, boolean z10) {
        int b10;
        int b11;
        boolean z11;
        boolean z12;
        int i10;
        if ("S_TEXT/UTF8".equals(cVar.f47306b)) {
            m(lVar, f47328c0, i9);
            int i11 = this.T;
            j();
            return i11;
        } else if ("S_TEXT/ASS".equals(cVar.f47306b)) {
            m(lVar, f47330e0, i9);
            int i12 = this.T;
            j();
            return i12;
        } else if ("S_TEXT/WEBVTT".equals(cVar.f47306b)) {
            m(lVar, f47331f0, i9);
            int i13 = this.T;
            j();
            return i13;
        } else {
            m3.w wVar = cVar.X;
            boolean z13 = this.V;
            y yVar = this.f47343j;
            boolean z14 = true;
            if (!z13) {
                boolean z15 = cVar.h;
                y yVar2 = this.f47341g;
                if (z15) {
                    this.O &= -1073741825;
                    int i14 = 128;
                    if (!this.W) {
                        lVar.readFully(yVar2.f4410a, 0, 1);
                        this.S++;
                        byte b12 = yVar2.f4410a[0];
                        if ((b12 & 128) != 128) {
                            this.Z = b12;
                            this.W = true;
                        } else {
                            throw t1.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b13 = this.Z;
                    if ((b13 & 1) == 1) {
                        if ((b13 & 2) == 2) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.O |= 1073741824;
                        if (!this.f47335a0) {
                            y yVar3 = this.f47345l;
                            lVar.readFully(yVar3.f4410a, 0, 8);
                            this.S += 8;
                            this.f47335a0 = true;
                            byte[] bArr = yVar2.f4410a;
                            if (!z12) {
                                i14 = 0;
                            }
                            bArr[0] = (byte) (i14 | 8);
                            yVar2.C(0);
                            wVar.d(1, yVar2);
                            this.T++;
                            yVar3.C(0);
                            wVar.d(8, yVar3);
                            this.T += 8;
                        }
                        if (z12) {
                            if (!this.X) {
                                lVar.readFully(yVar2.f4410a, 0, 1);
                                this.S++;
                                yVar2.C(0);
                                this.Y = yVar2.r();
                                this.X = true;
                            }
                            int i15 = this.Y * 4;
                            yVar2.z(i15);
                            lVar.readFully(yVar2.f4410a, 0, i15);
                            this.S += i15;
                            short s10 = (short) ((this.Y / 2) + 1);
                            int i16 = (s10 * 6) + 2;
                            ByteBuffer byteBuffer = this.f47348o;
                            if (byteBuffer == null || byteBuffer.capacity() < i16) {
                                this.f47348o = ByteBuffer.allocate(i16);
                            }
                            this.f47348o.position(0);
                            this.f47348o.putShort(s10);
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                i10 = this.Y;
                                if (i17 >= i10) {
                                    break;
                                }
                                int u10 = yVar2.u();
                                if (i17 % 2 == 0) {
                                    this.f47348o.putShort((short) (u10 - i18));
                                } else {
                                    this.f47348o.putInt(u10 - i18);
                                }
                                i17++;
                                i18 = u10;
                            }
                            int i19 = (i9 - this.S) - i18;
                            if (i10 % 2 == 1) {
                                this.f47348o.putInt(i19);
                            } else {
                                this.f47348o.putShort((short) i19);
                                this.f47348o.putInt(0);
                            }
                            byte[] array = this.f47348o.array();
                            y yVar4 = this.f47346m;
                            yVar4.A(i16, array);
                            wVar.d(i16, yVar4);
                            this.T += i16;
                        }
                    }
                } else {
                    byte[] bArr2 = cVar.f47311i;
                    if (bArr2 != null) {
                        yVar.A(bArr2.length, bArr2);
                    }
                }
                if ("A_OPUS".equals(cVar.f47306b)) {
                    z11 = z10;
                } else if (cVar.f47309f > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    this.O |= 268435456;
                    this.f47347n.z(0);
                    int i20 = (yVar.f4412c + i9) - this.S;
                    yVar2.z(4);
                    byte[] bArr3 = yVar2.f4410a;
                    bArr3[0] = (byte) ((i20 >> 24) & 255);
                    bArr3[1] = (byte) ((i20 >> 16) & 255);
                    bArr3[2] = (byte) ((i20 >> 8) & 255);
                    bArr3[3] = (byte) (i20 & 255);
                    wVar.d(4, yVar2);
                    this.T += 4;
                }
                this.V = true;
            }
            int i21 = i9 + yVar.f4412c;
            if (!"V_MPEG4/ISO/AVC".equals(cVar.f47306b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f47306b)) {
                if (cVar.T != null) {
                    if (yVar.f4412c != 0) {
                        z14 = false;
                    }
                    d5.a.i(z14);
                    cVar.T.c(lVar);
                }
                while (true) {
                    int i22 = this.S;
                    if (i22 >= i21) {
                        break;
                    }
                    int i23 = i21 - i22;
                    int a2 = yVar.a();
                    if (a2 > 0) {
                        b11 = Math.min(i23, a2);
                        wVar.a(b11, yVar);
                    } else {
                        b11 = wVar.b(lVar, i23, false);
                    }
                    this.S += b11;
                    this.T += b11;
                }
            } else {
                y yVar5 = this.f47340f;
                byte[] bArr4 = yVar5.f4410a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i24 = cVar.Y;
                int i25 = 4 - i24;
                while (this.S < i21) {
                    int i26 = this.U;
                    if (i26 == 0) {
                        int min = Math.min(i24, yVar.a());
                        lVar.readFully(bArr4, i25 + min, i24 - min);
                        if (min > 0) {
                            yVar.c(i25, min, bArr4);
                        }
                        this.S += i24;
                        yVar5.C(0);
                        this.U = yVar5.u();
                        y yVar6 = this.f47339e;
                        yVar6.C(0);
                        wVar.a(4, yVar6);
                        this.T += 4;
                    } else {
                        int a3 = yVar.a();
                        if (a3 > 0) {
                            b10 = Math.min(i26, a3);
                            wVar.a(b10, yVar);
                        } else {
                            b10 = wVar.b(lVar, i26, false);
                        }
                        this.S += b10;
                        this.T += b10;
                        this.U -= b10;
                    }
                }
            }
            if ("A_VORBIS".equals(cVar.f47306b)) {
                y yVar7 = this.h;
                yVar7.C(0);
                wVar.a(4, yVar7);
                this.T += 4;
            }
            int i27 = this.T;
            j();
            return i27;
        }
    }

    public final void m(l lVar, byte[] bArr, int i9) {
        int length = bArr.length + i9;
        y yVar = this.f47344k;
        byte[] bArr2 = yVar.f4410a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i9);
            yVar.getClass();
            yVar.A(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        lVar.readFully(yVar.f4410a, bArr.length, i9);
        yVar.C(0);
        yVar.B(length);
    }

    @Override
    public final void release() {
    }
}
