package r2;
public final class p extends Exception {
    public final String f44869a;
    public final boolean f44870b;
    public final o f44871c;
    public final String d;

    public p(b2.s sVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + sVar, tVar, sVar.f2397r, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f44869a = str2;
        this.f44870b = z10;
        this.f44871c = oVar;
        this.d = str3;
    }
}
