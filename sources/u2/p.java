package u2;
public final class p extends Exception {
    public final String f56282a;
    public final boolean f56283b;
    public final o f56284c;
    public final String d;

    public p(e2.u uVar, t tVar, boolean z9, int i7) {
        this("Decoder init failed: [" + i7 + "], " + uVar, tVar, uVar.f10615s, z9, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public p(String str, Throwable th2, String str2, boolean z9, o oVar, String str3) {
        super(str, th2);
        this.f56282a = str2;
        this.f56283b = z9;
        this.f56284c = oVar;
        this.d = str3;
    }
}
