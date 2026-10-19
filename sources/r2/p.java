package r2;
public final class p extends Exception {
    public final String f44940a;
    public final boolean f44941b;
    public final o f44942c;
    public final String d;

    public p(b2.w wVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + wVar, tVar, wVar.f4130s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f44940a = str2;
        this.f44941b = z10;
        this.f44942c = oVar;
        this.d = str3;
    }
}
