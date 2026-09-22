package r2;
public final class p extends Exception {
    public final String f42292a;
    public final boolean f42293b;
    public final o f42294c;
    public final String d;

    public p(b2.s sVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + sVar, tVar, sVar.f3308r, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f42292a = str2;
        this.f42293b = z10;
        this.f42294c = oVar;
        this.d = str3;
    }
}
