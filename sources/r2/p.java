package r2;
public final class p extends Exception {
    public final String f44988a;
    public final boolean f44989b;
    public final o f44990c;
    public final String d;

    public p(b2.w wVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + wVar, tVar, wVar.f4132s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f44988a = str2;
        this.f44989b = z10;
        this.f44990c = oVar;
        this.d = str3;
    }
}
