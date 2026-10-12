package r2;
public final class p extends Exception {
    public final String f43853a;
    public final boolean f43854b;
    public final o f43855c;
    public final String d;

    public p(b2.x xVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + xVar, tVar, xVar.f2519s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f43853a = str2;
        this.f43854b = z10;
        this.f43855c = oVar;
        this.d = str3;
    }
}
