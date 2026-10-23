package r2;
public final class p extends Exception {
    public final String f45366a;
    public final boolean f45367b;
    public final o f45368c;
    public final String d;

    public p(b2.w wVar, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + wVar, tVar, wVar.f4135s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f45366a = str2;
        this.f45367b = z10;
        this.f45368c = oVar;
        this.d = str3;
    }
}
