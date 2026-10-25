package r2;
public final class p extends Exception {
    public final String f47230a;
    public final boolean f47231b;
    public final o f47232c;
    public final String d;

    public p(b2.x xVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + xVar, tVar, xVar.f3586s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f47230a = str2;
        this.f47231b = z10;
        this.f47232c = oVar;
        this.d = str3;
    }
}
