package p3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d5.f0;
import d5.x;
import d5.y;
import g7.r;
import g7.s;
import h3.t1;
import java.util.Arrays;
import kh.p;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.t;
import m3.w;
import o8.z;
import z3.c;
public final class b implements k {
    public m f45345e;
    public w f45346f;
    public c h;
    public FlacStreamMetadata f45348i;
    public int f45349j;
    public int f45350k;
    public a f45351l;
    public int f45352m;
    public long f45353n;
    public final byte[] f45342a = new byte[42];
    public final y f45343b = new y(new byte[32768], 0);
    public final boolean f45344c = false;
    public final n d = new Object();
    public int f45347g = 0;

    @Override
    public final int b(l lVar, n nVar) {
        t oVar;
        long j10;
        boolean z10;
        boolean z11;
        int i9 = this.f45347g;
        boolean z12 = true;
        if (i9 != 0) {
            byte[] bArr = this.f45342a;
            if (i9 != 1) {
                if (i9 != 2) {
                    int i10 = 7;
                    if (i9 != 3) {
                        long j11 = 0;
                        if (i9 != 4) {
                            if (i9 == 5) {
                                this.f45346f.getClass();
                                this.f45348i.getClass();
                                a aVar = this.f45351l;
                                if (aVar != null && aVar.f45341c != null) {
                                    return aVar.b(lVar, nVar);
                                }
                                if (this.f45353n == -1) {
                                    FlacStreamMetadata flacStreamMetadata = this.f45348i;
                                    ((h) lVar).f17238f = 0;
                                    h hVar = (h) lVar;
                                    hVar.a(1, false);
                                    byte[] bArr2 = new byte[1];
                                    hVar.g(bArr2, 0, 1, false);
                                    if ((bArr2[0] & 1) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    hVar.a(2, false);
                                    if (!z11) {
                                        i10 = 6;
                                    }
                                    y yVar = new y(i10);
                                    byte[] bArr3 = yVar.f4410a;
                                    int i11 = 0;
                                    while (i11 < i10) {
                                        int e10 = hVar.e(i11, i10 - i11, bArr3);
                                        if (e10 == -1) {
                                            break;
                                        }
                                        i11 += e10;
                                    }
                                    yVar.B(i11);
                                    hVar.f17238f = 0;
                                    try {
                                        long x10 = yVar.x();
                                        if (!z11) {
                                            x10 *= flacStreamMetadata.maxBlockSizeSamples;
                                        }
                                        j11 = x10;
                                    } catch (NumberFormatException unused) {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        this.f45353n = j11;
                                    } else {
                                        throw t1.a(null, null);
                                    }
                                } else {
                                    y yVar2 = this.f45343b;
                                    int i12 = yVar2.f4412c;
                                    if (i12 < 32768) {
                                        int read = ((h) lVar).read(yVar2.f4410a, i12, 32768 - i12);
                                        if (read != -1) {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            yVar2.B(i12 + read);
                                        } else if (yVar2.a() == 0) {
                                            FlacStreamMetadata flacStreamMetadata2 = this.f45348i;
                                            int i13 = f0.f4349a;
                                            this.f45346f.e((this.f45353n * 1000000) / flacStreamMetadata2.sampleRate, 1, this.f45352m, 0, null);
                                            return -1;
                                        }
                                    } else {
                                        z12 = false;
                                    }
                                    int i14 = yVar2.f4411b;
                                    int i15 = this.f45352m;
                                    int i16 = this.f45349j;
                                    if (i15 < i16) {
                                        yVar2.D(Math.min(i16 - i15, yVar2.a()));
                                    }
                                    this.f45348i.getClass();
                                    int i17 = yVar2.f4411b;
                                    while (true) {
                                        int i18 = yVar2.f4412c - 16;
                                        n nVar2 = this.d;
                                        if (i17 <= i18) {
                                            yVar2.C(i17);
                                            if (r.a(yVar2, this.f45348i, this.f45350k, nVar2)) {
                                                yVar2.C(i17);
                                                j10 = nVar2.f17244a;
                                                break;
                                            }
                                            i17++;
                                        } else {
                                            if (z12) {
                                                while (true) {
                                                    int i19 = yVar2.f4412c;
                                                    if (i17 <= i19 - this.f45349j) {
                                                        yVar2.C(i17);
                                                        try {
                                                            z10 = r.a(yVar2, this.f45348i, this.f45350k, nVar2);
                                                        } catch (IndexOutOfBoundsException unused2) {
                                                            z10 = false;
                                                        }
                                                        if (yVar2.f4411b > yVar2.f4412c) {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            yVar2.C(i17);
                                                            j10 = nVar2.f17244a;
                                                            break;
                                                        }
                                                        i17++;
                                                    } else {
                                                        yVar2.C(i19);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                yVar2.C(i17);
                                            }
                                            j10 = -1;
                                        }
                                    }
                                    int i20 = yVar2.f4411b - i14;
                                    yVar2.C(i14);
                                    this.f45346f.a(i20, yVar2);
                                    int i21 = this.f45352m + i20;
                                    this.f45352m = i21;
                                    if (j10 != -1) {
                                        FlacStreamMetadata flacStreamMetadata3 = this.f45348i;
                                        int i22 = f0.f4349a;
                                        this.f45346f.e((this.f45353n * 1000000) / flacStreamMetadata3.sampleRate, 1, i21, 0, null);
                                        this.f45352m = 0;
                                        this.f45353n = j10;
                                    }
                                    if (yVar2.a() < 16) {
                                        int a2 = yVar2.a();
                                        byte[] bArr4 = yVar2.f4410a;
                                        System.arraycopy(bArr4, yVar2.f4411b, bArr4, 0, a2);
                                        yVar2.C(0);
                                        yVar2.B(a2);
                                    }
                                }
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        ((h) lVar).f17238f = 0;
                        y yVar3 = new y(2);
                        h hVar2 = (h) lVar;
                        hVar2.g(yVar3.f4410a, 0, 2, false);
                        int w8 = yVar3.w();
                        if ((w8 >> 2) == 16382) {
                            hVar2.f17238f = 0;
                            this.f45350k = w8;
                            m mVar = this.f45345e;
                            int i23 = f0.f4349a;
                            long j12 = hVar2.d;
                            long j13 = hVar2.f17236c;
                            this.f45348i.getClass();
                            FlacStreamMetadata flacStreamMetadata4 = this.f45348i;
                            if (flacStreamMetadata4.seekTable != null) {
                                oVar = new o(flacStreamMetadata4, j12, 0);
                            } else if (j13 != -1 && flacStreamMetadata4.totalSamples > 0) {
                                a aVar2 = new a(new p(flacStreamMetadata4, 15), new a6.a(flacStreamMetadata4, this.f45350k), flacStreamMetadata4.getDurationUs(), flacStreamMetadata4.totalSamples, j12, j13, flacStreamMetadata4.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata4.minFrameSize));
                                this.f45351l = aVar2;
                                oVar = aVar2.f45339a;
                            } else {
                                oVar = new o(flacStreamMetadata4.getDurationUs());
                            }
                            mVar.y(oVar);
                            this.f45347g = 5;
                            return 0;
                        }
                        hVar2.f17238f = 0;
                        throw t1.a("First frame does not start with sync code.", null);
                    }
                    FlacStreamMetadata flacStreamMetadata5 = this.f45348i;
                    boolean z13 = false;
                    while (!z13) {
                        ((h) lVar).f17238f = 0;
                        byte[] bArr5 = new byte[4];
                        x xVar = new x(bArr5, 4);
                        h hVar3 = (h) lVar;
                        hVar3.g(bArr5, 0, 4, false);
                        boolean h = xVar.h();
                        int i24 = xVar.i(7);
                        int i25 = xVar.i(24) + 4;
                        if (i24 == 0) {
                            byte[] bArr6 = new byte[38];
                            hVar3.d(bArr6, 0, 38, false);
                            flacStreamMetadata5 = new FlacStreamMetadata(bArr6, 4);
                        } else if (flacStreamMetadata5 != null) {
                            if (i24 == 3) {
                                y yVar4 = new y(i25);
                                hVar3.d(yVar4.f4410a, 0, i25, false);
                                flacStreamMetadata5 = flacStreamMetadata5.copyWithSeekTable(s.b(yVar4));
                            } else if (i24 == 4) {
                                y yVar5 = new y(i25);
                                hVar3.d(yVar5.f4410a, 0, i25, false);
                                yVar5.D(4);
                                flacStreamMetadata5 = flacStreamMetadata5.copyWithVorbisComments(Arrays.asList(g7.t.b(yVar5, false, false).f17270a));
                            } else if (i24 == 6) {
                                y yVar6 = new y(i25);
                                hVar3.d(yVar6.f4410a, 0, i25, false);
                                yVar6.D(4);
                                flacStreamMetadata5 = flacStreamMetadata5.copyWithPictureFrames(z.y(PictureFrame.fromPictureBlock(yVar6)));
                            } else {
                                hVar3.u(i25);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i26 = f0.f4349a;
                        this.f45348i = flacStreamMetadata5;
                        z13 = h;
                    }
                    this.f45348i.getClass();
                    this.f45349j = Math.max(this.f45348i.minFrameSize, 6);
                    w wVar = this.f45346f;
                    int i27 = f0.f4349a;
                    wVar.c(this.f45348i.getFormat(bArr, this.h));
                    this.f45347g = 4;
                    return 0;
                }
                y yVar7 = new y(4);
                ((h) lVar).d(yVar7.f4410a, 0, 4, false);
                if (yVar7.s() == 1716281667) {
                    this.f45347g = 3;
                    return 0;
                }
                throw t1.a("Failed to read FLAC stream marker.", null);
            }
            ((h) lVar).g(bArr, 0, bArr.length, false);
            ((h) lVar).f17238f = 0;
            this.f45347g = 2;
            return 0;
        }
        ((h) lVar).f17238f = 0;
        h hVar4 = (h) lVar;
        long k10 = hVar4.k();
        c a3 = s.a(lVar, !this.f45344c);
        hVar4.u((int) (hVar4.k() - k10));
        this.h = a3;
        this.f45347g = 1;
        return 0;
    }

    @Override
    public final void c(m mVar) {
        this.f45345e = mVar;
        this.f45346f = mVar.I(0, 1);
        mVar.B();
    }

    @Override
    public final boolean f(l lVar) {
        s.a(lVar, false);
        y yVar = new y(4);
        ((h) lVar).g(yVar.f4410a, 0, 4, false);
        if (yVar.s() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void g(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f45347g = 0;
        } else {
            a aVar = this.f45351l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f45353n = j12;
        this.f45352m = 0;
        this.f45343b.z(0);
    }

    @Override
    public final void release() {
    }
}
