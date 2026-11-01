package r2;
public final class p extends Exception {
    public final String f46261a;
    public final boolean f46262b;
    public final o f46263c;
    public final String d;

    public p(b2.x xVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + xVar, tVar, xVar.f2423s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f46261a = str2;
        this.f46262b = z10;
        this.f46263c = oVar;
        this.d = str3;
    }
}
