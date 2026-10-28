package r2;
public final class p extends Exception {
    public final String f47268a;
    public final boolean f47269b;
    public final o f47270c;
    public final String d;

    public p(b2.x xVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + xVar, tVar, xVar.f3586s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f47268a = str2;
        this.f47269b = z10;
        this.f47270c = oVar;
        this.d = str3;
    }
}
