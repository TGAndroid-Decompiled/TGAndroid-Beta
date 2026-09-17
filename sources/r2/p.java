package r2;
public final class p extends Exception {
    public final String f41994a;
    public final boolean f41995b;
    public final o f41996c;
    public final String d;

    public p(b2.s sVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + sVar, tVar, sVar.f3309r, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f41994a = str2;
        this.f41995b = z10;
        this.f41996c = oVar;
        this.d = str3;
    }
}
