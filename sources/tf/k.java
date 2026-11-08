package tf;
public final class k {
    public static final int[][] h = {new int[]{11025, -1, 22050, 44100}, new int[]{12000, -1, 24000, 48000}, new int[]{8000, -1, 16000, 32000}, new int[]{-1, -1, -1, -1}};
    public static final int[][] f55543i = {new int[]{0, 0, 0, 0, 0}, new int[]{32000, 32000, 32000, 32000, 8000}, new int[]{64000, 48000, 40000, 48000, 16000}, new int[]{96000, 56000, 48000, 56000, 24000}, new int[]{128000, 64000, 56000, 64000, 32000}, new int[]{160000, 80000, 64000, 80000, 40000}, new int[]{192000, 96000, 80000, 96000, 48000}, new int[]{224000, 112000, 96000, 112000, 56000}, new int[]{256000, 128000, 112000, 128000, 64000}, new int[]{288000, 160000, 128000, 144000, 80000}, new int[]{320000, 192000, 160000, 160000, 96000}, new int[]{352000, 224000, 192000, 176000, 112000}, new int[]{384000, 256000, 224000, 192000, 128000}, new int[]{416000, 320000, 256000, 224000, 144000}, new int[]{448000, 384000, 320000, 256000, 160000}, new int[]{-1, -1, -1, -1, -1}};
    public static final int[][] f55544j = {new int[]{-1, 4, 4, 3}, new int[]{-1, -1, -1, -1}, new int[]{-1, 4, 4, 3}, new int[]{-1, 2, 1, 0}};
    public static final int[][] f55545k = {new int[]{-1, 72, 144, 12}, new int[]{-1, -1, -1, -1}, new int[]{-1, 72, 144, 12}, new int[]{-1, 144, 144, 12}};
    public static final int[] f55546l = {-1, 1, 1, 4};
    public static final int[][] f55547m = {new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{9, -1, 9, 17}};
    public final int f55548a;
    public final int f55549b;
    public final int f55550c;
    public final int d;
    public final int f55551e;
    public final int f55552f;
    public final int f55553g;

    public k(int i7, int i10, int i11) {
        int i12 = (i7 >> 3) & 3;
        this.f55548a = i12;
        if (i12 != 1) {
            int i13 = (i7 >> 1) & 3;
            this.f55549b = i13;
            if (i13 != 0) {
                int i14 = (i10 >> 4) & 15;
                this.d = i14;
                if (i14 != 15) {
                    if (i14 != 0) {
                        int i15 = (i10 >> 2) & 3;
                        this.f55550c = i15;
                        if (i15 != 3) {
                            int i16 = (i11 >> 6) & 3;
                            this.f55551e = i16;
                            this.f55552f = (i10 >> 1) & 1;
                            int i17 = i7 & 1;
                            this.f55553g = i17;
                            int i18 = i17 != 0 ? 4 : 6;
                            i18 = i13 == 1 ? i18 + f55547m[i16][i12] : i18;
                            if (b() >= i18) {
                                return;
                            }
                            throw new Exception(jg.g.j(i18, "Frame size must be at least "));
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
        return f55543i[this.d][f55544j[this.f55548a][this.f55549b]];
    }

    public final int b() {
        int[][] iArr = f55545k;
        int i7 = this.f55548a;
        int[] iArr2 = iArr[i7];
        int i10 = this.f55549b;
        return (((a() * iArr2[i10]) / h[this.f55550c][i7]) + this.f55552f) * f55546l[i10];
    }

    public final long c(long j3) {
        int i7;
        if (this.f55549b == 3) {
            i7 = 384;
        } else {
            i7 = 1152;
        }
        int b10 = b();
        int[] iArr = h[this.f55550c];
        int i10 = this.f55548a;
        long j10 = ((i7 * j3) * 1000) / (iArr[i10] * b10);
        if (i10 != 3 && this.f55551e == 3) {
            return j10 / 2;
        }
        return j10;
    }

    public final boolean d(k kVar) {
        if (this.f55549b == kVar.f55549b && this.f55548a == kVar.f55548a && this.f55550c == kVar.f55550c && this.f55551e == kVar.f55551e) {
            return true;
        }
        return false;
    }
}
