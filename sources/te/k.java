package te;

import j3.r0;
public final class k {
    public static final int[][] h = {new int[]{11025, -1, 22050, 44100}, new int[]{12000, -1, 24000, 48000}, new int[]{8000, -1, 16000, 32000}, new int[]{-1, -1, -1, -1}};
    public static final int[][] f47830i = {new int[]{0, 0, 0, 0, 0}, new int[]{32000, 32000, 32000, 32000, 8000}, new int[]{64000, 48000, 40000, 48000, 16000}, new int[]{96000, 56000, 48000, 56000, 24000}, new int[]{128000, 64000, 56000, 64000, 32000}, new int[]{160000, 80000, 64000, 80000, 40000}, new int[]{192000, 96000, 80000, 96000, 48000}, new int[]{224000, 112000, 96000, 112000, 56000}, new int[]{256000, 128000, 112000, 128000, 64000}, new int[]{288000, 160000, 128000, 144000, 80000}, new int[]{320000, 192000, 160000, 160000, 96000}, new int[]{352000, 224000, 192000, 176000, 112000}, new int[]{384000, 256000, 224000, 192000, 128000}, new int[]{416000, 320000, 256000, 224000, 144000}, new int[]{448000, 384000, 320000, 256000, 160000}, new int[]{-1, -1, -1, -1, -1}};
    public static final int[][] f47831j = {new int[]{-1, 4, 4, 3}, new int[]{-1, -1, -1, -1}, new int[]{-1, 4, 4, 3}, new int[]{-1, 2, 1, 0}};
    public static final int[][] f47832k = {new int[]{-1, 72, 144, 12}, new int[]{-1, -1, -1, -1}, new int[]{-1, 72, 144, 12}, new int[]{-1, 144, 144, 12}};
    public static final int[] f47833l = {-1, 1, 1, 4};
    public static final int[][] f47834m = {new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{9, -1, 9, 17}};
    public final int f47835a;
    public final int f47836b;
    public final int f47837c;
    public final int d;
    public final int f47838e;
    public final int f47839f;
    public final int f47840g;

    public k(int i9, int i10, int i11) {
        int i12 = (i9 >> 3) & 3;
        this.f47835a = i12;
        if (i12 != 1) {
            int i13 = (i9 >> 1) & 3;
            this.f47836b = i13;
            if (i13 != 0) {
                int i14 = (i10 >> 4) & 15;
                this.d = i14;
                if (i14 != 15) {
                    if (i14 != 0) {
                        int i15 = (i10 >> 2) & 3;
                        this.f47837c = i15;
                        if (i15 != 3) {
                            int i16 = (i11 >> 6) & 3;
                            this.f47838e = i16;
                            this.f47839f = (i10 >> 1) & 1;
                            int i17 = i9 & 1;
                            this.f47840g = i17;
                            int i18 = i17 != 0 ? 4 : 6;
                            i18 = i13 == 1 ? i18 + f47834m[i16][i12] : i18;
                            if (b() >= i18) {
                                return;
                            }
                            throw new Exception(r0.l(i18, "Frame size must be at least "));
                        }
                        throw new Exception("Reserved frequency");
                    }
                    throw new Exception("Free bitrate");
                }
                throw new Exception("Reserved bitrate");
            }
            throw new Exception("Reserved layer");
        }
        throw new Exception("Reserved version");
    }

    public final int a() {
        return f47830i[this.d][f47831j[this.f47835a][this.f47836b]];
    }

    public final int b() {
        int[][] iArr = f47832k;
        int i9 = this.f47835a;
        int[] iArr2 = iArr[i9];
        int i10 = this.f47836b;
        return (((a() * iArr2[i10]) / h[this.f47837c][i9]) + this.f47839f) * f47833l[i10];
    }

    public final long c(long j10) {
        int i9;
        if (this.f47836b == 3) {
            i9 = 384;
        } else {
            i9 = 1152;
        }
        int b10 = b();
        int[] iArr = h[this.f47837c];
        int i10 = this.f47835a;
        long j11 = ((i9 * j10) * 1000) / (iArr[i10] * b10);
        if (i10 != 3 && this.f47838e == 3) {
            return j11 / 2;
        }
        return j11;
    }

    public final boolean d(k kVar) {
        if (this.f47836b == kVar.f47836b && this.f47835a == kVar.f47835a && this.f47837c == kVar.f47837c && this.f47838e == kVar.f47838e) {
            return true;
        }
        return false;
    }
}
