package r3;

import ag.j2;
import b4.c;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import f5.d0;
import f5.v;
import i7.i0;
import i7.j0;
import i7.w5;
import j3.t1;
import java.util.Arrays;
import l4.s0;
import o3.h;
import o3.k;
import o3.l;
import o3.m;
import o3.n;
import o3.o;
import o3.t;
import o3.w;
import q8.z;
public final class b implements k {
    public m f46926e;
    public w f46927f;
    public c h;
    public FlacStreamMetadata f46929i;
    public int f46930j;
    public int f46931k;
    public a f46932l;
    public int f46933m;
    public long f46934n;
    public final byte[] f46923a = new byte[42];
    public final f5.w f46924b = new f5.w(new byte[32768], 0);
    public final boolean f46925c = false;
    public final n d = new Object();
    public int f46928g = 0;

    @Override
    public final int d(l lVar, n nVar) {
        t oVar;
        long j10;
        boolean z10;
        boolean z11;
        int i10 = this.f46928g;
        boolean z12 = true;
        if (i10 != 0) {
            byte[] bArr = this.f46923a;
            if (i10 != 1) {
                if (i10 != 2) {
                    int i11 = 7;
                    if (i10 != 3) {
                        long j11 = 0;
                        if (i10 != 4) {
                            if (i10 == 5) {
                                this.f46927f.getClass();
                                this.f46929i.getClass();
                                a aVar = this.f46932l;
                                if (aVar != null && aVar.f46922c != null) {
                                    return aVar.b(lVar, nVar);
                                }
                                if (this.f46934n == -1) {
                                    FlacStreamMetadata flacStreamMetadata = this.f46929i;
                                    ((h) lVar).f19097f = 0;
                                    h hVar = (h) lVar;
                                    hVar.b(1, false);
                                    byte[] bArr2 = new byte[1];
                                    hVar.f(bArr2, 0, 1, false);
                                    if ((bArr2[0] & 1) == 1) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    hVar.b(2, false);
                                    if (!z11) {
                                        i11 = 6;
                                    }
                                    f5.w wVar = new f5.w(i11);
                                    byte[] bArr3 = wVar.f6640a;
                                    int i12 = 0;
                                    while (i12 < i11) {
                                        int d = hVar.d(i12, i11 - i12, bArr3);
                                        if (d == -1) {
                                            break;
                                        }
                                        i12 += d;
                                    }
                                    wVar.B(i12);
                                    hVar.f19097f = 0;
                                    try {
                                        long x4 = wVar.x();
                                        if (!z11) {
                                            x4 *= flacStreamMetadata.maxBlockSizeSamples;
                                        }
                                        j11 = x4;
                                    } catch (NumberFormatException unused) {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        this.f46934n = j11;
                                    } else {
                                        throw t1.a(null, null);
                                    }
                                } else {
                                    f5.w wVar2 = this.f46924b;
                                    int i13 = wVar2.f6642c;
                                    if (i13 < 32768) {
                                        int read = ((h) lVar).read(wVar2.f6640a, i13, 32768 - i13);
                                        if (read != -1) {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            wVar2.B(i13 + read);
                                        } else if (wVar2.a() == 0) {
                                            FlacStreamMetadata flacStreamMetadata2 = this.f46929i;
                                            int i14 = d0.f6579a;
                                            this.f46927f.c((this.f46934n * 1000000) / flacStreamMetadata2.sampleRate, 1, this.f46933m, 0, null);
                                            return -1;
                                        }
                                    } else {
                                        z12 = false;
                                    }
                                    int i15 = wVar2.f6641b;
                                    int i16 = this.f46933m;
                                    int i17 = this.f46930j;
                                    if (i16 < i17) {
                                        wVar2.D(Math.min(i17 - i16, wVar2.a()));
                                    }
                                    this.f46929i.getClass();
                                    int i18 = wVar2.f6641b;
                                    while (true) {
                                        int i19 = wVar2.f6642c - 16;
                                        n nVar2 = this.d;
                                        if (i18 <= i19) {
                                            wVar2.C(i18);
                                            if (i0.a(wVar2, this.f46929i, this.f46931k, nVar2)) {
                                                wVar2.C(i18);
                                                j10 = nVar2.f19103a;
                                                break;
                                            }
                                            i18++;
                                        } else {
                                            if (z12) {
                                                while (true) {
                                                    int i20 = wVar2.f6642c;
                                                    if (i18 <= i20 - this.f46930j) {
                                                        wVar2.C(i18);
                                                        try {
                                                            z10 = i0.a(wVar2, this.f46929i, this.f46931k, nVar2);
                                                        } catch (IndexOutOfBoundsException unused2) {
                                                            z10 = false;
                                                        }
                                                        if (wVar2.f6641b > wVar2.f6642c) {
                                                            z10 = false;
                                                        }
                                                        if (z10) {
                                                            wVar2.C(i18);
                                                            j10 = nVar2.f19103a;
                                                            break;
                                                        }
                                                        i18++;
                                                    } else {
                                                        wVar2.C(i20);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                wVar2.C(i18);
                                            }
                                            j10 = -1;
                                        }
                                    }
                                    int i21 = wVar2.f6641b - i15;
                                    wVar2.C(i15);
                                    this.f46927f.e(i21, wVar2);
                                    int i22 = this.f46933m + i21;
                                    this.f46933m = i22;
                                    if (j10 != -1) {
                                        FlacStreamMetadata flacStreamMetadata3 = this.f46929i;
                                        int i23 = d0.f6579a;
                                        this.f46927f.c((this.f46934n * 1000000) / flacStreamMetadata3.sampleRate, 1, i22, 0, null);
                                        this.f46933m = 0;
                                        this.f46934n = j10;
                                    }
                                    if (wVar2.a() < 16) {
                                        int a2 = wVar2.a();
                                        byte[] bArr4 = wVar2.f6640a;
                                        System.arraycopy(bArr4, wVar2.f6641b, bArr4, 0, a2);
                                        wVar2.C(0);
                                        wVar2.B(a2);
                                    }
                                }
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        ((h) lVar).f19097f = 0;
                        f5.w wVar3 = new f5.w(2);
                        h hVar2 = (h) lVar;
                        hVar2.f(wVar3.f6640a, 0, 2, false);
                        int w10 = wVar3.w();
                        if ((w10 >> 2) == 16382) {
                            hVar2.f19097f = 0;
                            this.f46931k = w10;
                            m mVar = this.f46926e;
                            int i24 = d0.f6579a;
                            long j12 = hVar2.d;
                            long j13 = hVar2.f19095c;
                            this.f46929i.getClass();
                            FlacStreamMetadata flacStreamMetadata4 = this.f46929i;
                            if (flacStreamMetadata4.seekTable != null) {
                                oVar = new o(flacStreamMetadata4, j12, 0);
                            } else if (j13 != -1 && flacStreamMetadata4.totalSamples > 0) {
                                a aVar2 = new a(new s0(flacStreamMetadata4, 27), new j2(flacStreamMetadata4, this.f46931k), flacStreamMetadata4.getDurationUs(), flacStreamMetadata4.totalSamples, j12, j13, flacStreamMetadata4.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata4.minFrameSize));
                                this.f46932l = aVar2;
                                oVar = aVar2.f46920a;
                            } else {
                                oVar = new o(flacStreamMetadata4.getDurationUs());
                            }
                            mVar.D1(oVar);
                            this.f46928g = 5;
                            return 0;
                        }
                        hVar2.f19097f = 0;
                        throw t1.a("First frame does not start with sync code.", null);
                    }
                    FlacStreamMetadata flacStreamMetadata5 = this.f46929i;
                    boolean z13 = false;
                    while (!z13) {
                        ((h) lVar).f19097f = 0;
                        byte[] bArr5 = new byte[4];
                        v vVar = new v(bArr5, 4);
                        h hVar3 = (h) lVar;
                        hVar3.f(bArr5, 0, 4, false);
                        boolean h = vVar.h();
                        int i25 = vVar.i(7);
                        int i26 = vVar.i(24) + 4;
                        if (i25 == 0) {
                            byte[] bArr6 = new byte[38];
                            hVar3.c(bArr6, 0, 38, false);
                            flacStreamMetadata5 = new FlacStreamMetadata(bArr6, 4);
                        } else if (flacStreamMetadata5 != null) {
                            if (i25 == 3) {
                                f5.w wVar4 = new f5.w(i26);
                                hVar3.c(wVar4.f6640a, 0, i26, false);
                                flacStreamMetadata5 = flacStreamMetadata5.copyWithSeekTable(j0.b(wVar4));
                            } else if (i25 == 4) {
                                f5.w wVar5 = new f5.w(i26);
                                hVar3.c(wVar5.f6640a, 0, i26, false);
                                wVar5.D(4);
                                flacStreamMetadata5 = flacStreamMetadata5.copyWithVorbisComments(Arrays.asList(w5.b(wVar5, false, false).f19129a));
                            } else if (i25 == 6) {
                                f5.w wVar6 = new f5.w(i26);
                                hVar3.c(wVar6.f6640a, 0, i26, false);
                                wVar6.D(4);
                                flacStreamMetadata5 = flacStreamMetadata5.copyWithPictureFrames(z.y(PictureFrame.fromPictureBlock(wVar6)));
                            } else {
                                hVar3.t(i26);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        int i27 = d0.f6579a;
                        this.f46929i = flacStreamMetadata5;
                        z13 = h;
                    }
                    this.f46929i.getClass();
                    this.f46930j = Math.max(this.f46929i.minFrameSize, 6);
                    w wVar7 = this.f46927f;
                    int i28 = d0.f6579a;
                    wVar7.b(this.f46929i.getFormat(bArr, this.h));
                    this.f46928g = 4;
                    return 0;
                }
                f5.w wVar8 = new f5.w(4);
                ((h) lVar).c(wVar8.f6640a, 0, 4, false);
                if (wVar8.s() == 1716281667) {
                    this.f46928g = 3;
                    return 0;
                }
                throw t1.a("Failed to read FLAC stream marker.", null);
            }
            ((h) lVar).f(bArr, 0, bArr.length, false);
            ((h) lVar).f19097f = 0;
            this.f46928g = 2;
            return 0;
        }
        ((h) lVar).f19097f = 0;
        h hVar4 = (h) lVar;
        long h10 = hVar4.h();
        c a10 = j0.a(lVar, !this.f46925c);
        hVar4.t((int) (hVar4.h() - h10));
        this.h = a10;
        this.f46928g = 1;
        return 0;
    }

    @Override
    public final boolean e(l lVar) {
        j0.a(lVar, false);
        f5.w wVar = new f5.w(4);
        ((h) lVar).f(wVar.f6640a, 0, 4, false);
        if (wVar.s() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void f(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f46928g = 0;
        } else {
            a aVar = this.f46932l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f46934n = j12;
        this.f46933m = 0;
        this.f46924b.z(0);
    }

    @Override
    public final void i(m mVar) {
        this.f46926e = mVar;
        this.f46927f = mVar.Z1(0, 1);
        mVar.e1();
    }

    @Override
    public final void release() {
    }
}
