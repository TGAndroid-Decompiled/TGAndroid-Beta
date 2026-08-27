package p3;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import d5.g0;
import d5.y;
import d5.z;
import h3.t1;
import h7.r;
import h7.s;
import java.util.Arrays;
import lh.p;
import m3.h;
import m3.k;
import m3.l;
import m3.m;
import m3.n;
import m3.o;
import m3.t;
import m3.w;
import z3.c;

public final class b implements k {

    public m f45351e;

    public w f45352f;
    public c h;

    public FlacStreamMetadata f45354i;

    public int f45355j;

    public int f45356k;

    public a f45357l;

    public int f45358m;

    public long f45359n;

    public final byte[] f45348a = new byte[42];

    public final z f45349b = new z(new byte[32768], 0);

    public final boolean f45350c = false;
    public final n d = new n();

    public int f45353g = 0;

    @Override
    public final int b(l lVar, n nVar) throws Throwable {
        t oVar;
        long j10;
        boolean zA;
        int i10 = this.f45353g;
        boolean z10 = true;
        if (i10 == 0) {
            boolean z11 = !this.f45350c;
            ((h) lVar).f17614f = 0;
            h hVar = (h) lVar;
            long jI = hVar.i();
            c cVarA = s.a(lVar, z11);
            hVar.t((int) (hVar.i() - jI));
            this.h = cVarA;
            this.f45353g = 1;
            return 0;
        }
        byte[] bArr = this.f45348a;
        if (i10 == 1) {
            ((h) lVar).g(bArr, 0, bArr.length, false);
            ((h) lVar).f17614f = 0;
            this.f45353g = 2;
            return 0;
        }
        if (i10 == 2) {
            z zVar = new z(4);
            ((h) lVar).d(zVar.f4858a, 0, 4, false);
            if (zVar.s() != 1716281667) {
                throw t1.a("Failed to read FLAC stream marker.", null);
            }
            this.f45353g = 3;
            return 0;
        }
        if (i10 == 3) {
            FlacStreamMetadata flacStreamMetadataCopyWithPictureFrames = this.f45354i;
            boolean z12 = false;
            while (!z12) {
                ((h) lVar).f17614f = 0;
                byte[] bArr2 = new byte[4];
                y yVar = new y(bArr2, 4);
                h hVar2 = (h) lVar;
                hVar2.g(bArr2, 0, 4, false);
                boolean zH = yVar.h();
                int i11 = yVar.i(7);
                int i12 = yVar.i(24) + 4;
                if (i11 == 0) {
                    byte[] bArr3 = new byte[38];
                    hVar2.d(bArr3, 0, 38, false);
                    flacStreamMetadataCopyWithPictureFrames = new FlacStreamMetadata(bArr3, 4);
                } else {
                    if (flacStreamMetadataCopyWithPictureFrames == null) {
                        throw new IllegalArgumentException();
                    }
                    if (i11 == 3) {
                        z zVar2 = new z(i12);
                        hVar2.d(zVar2.f4858a, 0, i12, false);
                        flacStreamMetadataCopyWithPictureFrames = flacStreamMetadataCopyWithPictureFrames.copyWithSeekTable(s.b(zVar2));
                    } else if (i11 == 4) {
                        z zVar3 = new z(i12);
                        hVar2.d(zVar3.f4858a, 0, i12, false);
                        zVar3.D(4);
                        flacStreamMetadataCopyWithPictureFrames = flacStreamMetadataCopyWithPictureFrames.copyWithVorbisComments(Arrays.asList(h7.t.b(zVar3, false, false).f17646a));
                    } else if (i11 == 6) {
                        z zVar4 = new z(i12);
                        hVar2.d(zVar4.f4858a, 0, i12, false);
                        zVar4.D(4);
                        flacStreamMetadataCopyWithPictureFrames = flacStreamMetadataCopyWithPictureFrames.copyWithPictureFrames(p8.z.y(PictureFrame.fromPictureBlock(zVar4)));
                    } else {
                        hVar2.t(i12);
                    }
                }
                int i13 = g0.f4795a;
                this.f45354i = flacStreamMetadataCopyWithPictureFrames;
                z12 = zH;
            }
            this.f45354i.getClass();
            this.f45355j = Math.max(this.f45354i.minFrameSize, 6);
            w wVar = this.f45352f;
            int i14 = g0.f4795a;
            wVar.c(this.f45354i.getFormat(bArr, this.h));
            this.f45353g = 4;
            return 0;
        }
        long j11 = 0;
        if (i10 == 4) {
            ((h) lVar).f17614f = 0;
            z zVar5 = new z(2);
            h hVar3 = (h) lVar;
            hVar3.g(zVar5.f4858a, 0, 2, false);
            int iW = zVar5.w();
            if ((iW >> 2) != 16382) {
                hVar3.f17614f = 0;
                throw t1.a("First frame does not start with sync code.", null);
            }
            hVar3.f17614f = 0;
            this.f45356k = iW;
            m mVar = this.f45351e;
            int i15 = g0.f4795a;
            long j12 = hVar3.d;
            long j13 = hVar3.f17612c;
            this.f45354i.getClass();
            FlacStreamMetadata flacStreamMetadata = this.f45354i;
            if (flacStreamMetadata.seekTable != null) {
                oVar = new o(flacStreamMetadata, j12, 0);
            } else if (j13 == -1 || flacStreamMetadata.totalSamples <= 0) {
                oVar = new o(flacStreamMetadata.getDurationUs());
            } else {
                a aVar = new a(new p(flacStreamMetadata, 15), new b6.a(flacStreamMetadata, this.f45356k), flacStreamMetadata.getDurationUs(), flacStreamMetadata.totalSamples, j12, j13, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
                this.f45357l = aVar;
                oVar = aVar.f45345a;
            }
            mVar.n(oVar);
            this.f45353g = 5;
            return 0;
        }
        if (i10 != 5) {
            throw new IllegalStateException();
        }
        this.f45352f.getClass();
        this.f45354i.getClass();
        a aVar2 = this.f45357l;
        if (aVar2 != null && aVar2.f45347c != null) {
            return aVar2.b(lVar, nVar);
        }
        if (this.f45359n == -1) {
            FlacStreamMetadata flacStreamMetadata2 = this.f45354i;
            ((h) lVar).f17614f = 0;
            h hVar4 = (h) lVar;
            hVar4.a(1, false);
            byte[] bArr4 = new byte[1];
            hVar4.g(bArr4, 0, 1, false);
            boolean z13 = (bArr4[0] & 1) == 1;
            hVar4.a(2, false);
            int i16 = z13 ? 7 : 6;
            z zVar6 = new z(i16);
            byte[] bArr5 = zVar6.f4858a;
            int i17 = 0;
            while (i17 < i16) {
                int iE = hVar4.e(i17, i16 - i17, bArr5);
                if (iE == -1) {
                    break;
                }
                i17 += iE;
            }
            zVar6.B(i17);
            hVar4.f17614f = 0;
            try {
                long jX = zVar6.x();
                if (!z13) {
                    jX *= (long) flacStreamMetadata2.maxBlockSizeSamples;
                }
                j11 = jX;
            } catch (NumberFormatException unused) {
                z10 = false;
            }
            if (!z10) {
                throw t1.a(null, null);
            }
            this.f45359n = j11;
        } else {
            z zVar7 = this.f45349b;
            int i18 = zVar7.f4860c;
            if (i18 < 32768) {
                int i19 = ((h) lVar).read(zVar7.f4858a, i18, 32768 - i18);
                z10 = i19 == -1;
                if (!z10) {
                    zVar7.B(i18 + i19);
                } else if (zVar7.a() == 0) {
                    long j14 = this.f45359n * 1000000;
                    FlacStreamMetadata flacStreamMetadata3 = this.f45354i;
                    int i20 = g0.f4795a;
                    this.f45352f.e(j14 / ((long) flacStreamMetadata3.sampleRate), 1, this.f45358m, 0, null);
                    return -1;
                }
            } else {
                z10 = false;
            }
            int i21 = zVar7.f4859b;
            int i22 = this.f45358m;
            int i23 = this.f45355j;
            if (i22 < i23) {
                zVar7.D(Math.min(i23 - i22, zVar7.a()));
            }
            this.f45354i.getClass();
            int i24 = zVar7.f4859b;
            while (true) {
                int i25 = zVar7.f4860c - 16;
                n nVar2 = this.d;
                if (i24 > i25) {
                    if (z10) {
                        while (true) {
                            int i26 = zVar7.f4860c;
                            if (i24 <= i26 - this.f45355j) {
                                zVar7.C(i24);
                                try {
                                    zA = r.a(zVar7, this.f45354i, this.f45356k, nVar2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zA = false;
                                }
                                if (zVar7.f4859b > zVar7.f4860c) {
                                    zA = false;
                                }
                                if (zA) {
                                    zVar7.C(i24);
                                    j10 = nVar2.f17620a;
                                    break;
                                }
                                i24++;
                            } else {
                                zVar7.C(i26);
                            }
                        }
                    } else {
                        zVar7.C(i24);
                    }
                    j10 = -1;
                    break;
                }
                zVar7.C(i24);
                if (r.a(zVar7, this.f45354i, this.f45356k, nVar2)) {
                    zVar7.C(i24);
                    j10 = nVar2.f17620a;
                    break;
                }
                i24++;
            }
            int i27 = zVar7.f4859b - i21;
            zVar7.C(i21);
            this.f45352f.a(i27, zVar7);
            int i28 = this.f45358m + i27;
            this.f45358m = i28;
            if (j10 != -1) {
                long j15 = this.f45359n * 1000000;
                FlacStreamMetadata flacStreamMetadata4 = this.f45354i;
                int i29 = g0.f4795a;
                this.f45352f.e(j15 / ((long) flacStreamMetadata4.sampleRate), 1, i28, 0, null);
                this.f45358m = 0;
                this.f45359n = j10;
            }
            if (zVar7.a() < 16) {
                int iA = zVar7.a();
                byte[] bArr6 = zVar7.f4858a;
                System.arraycopy(bArr6, zVar7.f4859b, bArr6, 0, iA);
                zVar7.C(0);
                zVar7.B(iA);
            }
        }
        return 0;
    }

    @Override
    public final void c(m mVar) {
        this.f45351e = mVar;
        this.f45352f = mVar.C(0, 1);
        mVar.A();
    }

    @Override
    public final boolean f(l lVar) throws Throwable {
        s.a(lVar, false);
        z zVar = new z(4);
        ((h) lVar).g(zVar.f4858a, 0, 4, false);
        return zVar.s() == 1716281667;
    }

    @Override
    public final void g(long j10, long j11) {
        if (j10 == 0) {
            this.f45353g = 0;
        } else {
            a aVar = this.f45357l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        this.f45359n = j11 != 0 ? -1L : 0L;
        this.f45358m = 0;
        this.f45349b.z(0);
    }

    @Override
    public final void release() {
    }
}
