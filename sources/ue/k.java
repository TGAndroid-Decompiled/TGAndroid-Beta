package ue;

public final class k {
    public static final int[][] h = {new int[]{11025, -1, 22050, 44100}, new int[]{12000, -1, 24000, 48000}, new int[]{8000, -1, 16000, 32000}, new int[]{-1, -1, -1, -1}};

    public static final int[][] f48552i = {new int[]{0, 0, 0, 0, 0}, new int[]{32000, 32000, 32000, 32000, 8000}, new int[]{64000, 48000, 40000, 48000, 16000}, new int[]{96000, 56000, 48000, 56000, 24000}, new int[]{128000, 64000, 56000, 64000, 32000}, new int[]{160000, 80000, 64000, 80000, 40000}, new int[]{192000, 96000, 80000, 96000, 48000}, new int[]{224000, 112000, 96000, 112000, 56000}, new int[]{256000, 128000, 112000, 128000, 64000}, new int[]{288000, 160000, 128000, 144000, 80000}, new int[]{320000, 192000, 160000, 160000, 96000}, new int[]{352000, 224000, 192000, 176000, 112000}, new int[]{384000, 256000, 224000, 192000, 128000}, new int[]{416000, 320000, 256000, 224000, 144000}, new int[]{448000, 384000, 320000, 256000, 160000}, new int[]{-1, -1, -1, -1, -1}};

    public static final int[][] f48553j = {new int[]{-1, 4, 4, 3}, new int[]{-1, -1, -1, -1}, new int[]{-1, 4, 4, 3}, new int[]{-1, 2, 1, 0}};

    public static final int[][] f48554k = {new int[]{-1, 72, 144, 12}, new int[]{-1, -1, -1, -1}, new int[]{-1, 72, 144, 12}, new int[]{-1, 144, 144, 12}};

    public static final int[] f48555l = {-1, 1, 1, 4};

    public static final int[][] f48556m = {new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{17, -1, 17, 32}, new int[]{9, -1, 9, 17}};

    public final int f48557a;

    public final int f48558b;

    public final int f48559c;
    public final int d;

    public final int f48560e;

    public final int f48561f;

    public final int f48562g;

    public k(int i10, int i11, int i12) throws i {
        int i13 = (i10 >> 3) & 3;
        this.f48557a = i13;
        if (i13 == 1) {
            throw new i("Reserved version");
        }
        int i14 = (i10 >> 1) & 3;
        this.f48558b = i14;
        if (i14 == 0) {
            throw new i("Reserved layer");
        }
        int i15 = (i11 >> 4) & 15;
        this.d = i15;
        if (i15 == 15) {
            throw new i("Reserved bitrate");
        }
        if (i15 == 0) {
            throw new i("Free bitrate");
        }
        int i16 = (i11 >> 2) & 3;
        this.f48559c = i16;
        if (i16 == 3) {
            throw new i("Reserved frequency");
        }
        int i17 = (i12 >> 6) & 3;
        this.f48560e = i17;
        this.f48561f = (i11 >> 1) & 1;
        int i18 = i10 & 1;
        this.f48562g = i18;
        int i19 = i18 != 0 ? 4 : 6;
        i19 = i14 == 1 ? i19 + f48556m[i17][i13] : i19;
        if (b() < i19) {
            throw new i(i0.a.k(i19, "Frame size must be at least "));
        }
    }

    public final int a() {
        return f48552i[this.d][f48553j[this.f48557a][this.f48558b]];
    }

    public final int b() {
        int[][] iArr = f48554k;
        int i10 = this.f48557a;
        int[] iArr2 = iArr[i10];
        int i11 = this.f48558b;
        return (((a() * iArr2[i11]) / h[this.f48559c][i10]) + this.f48561f) * f48555l[i11];
    }

    public final long c(long j10) {
        long j11 = ((long) (this.f48558b == 3 ? 384 : 1152)) * j10 * 1000;
        int iB = b();
        int[] iArr = h[this.f48559c];
        int i10 = this.f48557a;
        long j12 = j11 / ((long) (iArr[i10] * iB));
        return (i10 == 3 || this.f48560e != 3) ? j12 : j12 / 2;
    }

    public final boolean d(k kVar) {
        return this.f48558b == kVar.f48558b && this.f48557a == kVar.f48557a && this.f48559c == kVar.f48559c && this.f48560e == kVar.f48560e;
    }
}
