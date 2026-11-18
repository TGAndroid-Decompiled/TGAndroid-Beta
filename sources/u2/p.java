package u2;
public final class p extends Exception {
    public final String f58348a;
    public final boolean f58349b;
    public final o f58350c;
    public final String d;

    public p(e2.u uVar, t tVar, boolean z10, int i7) {
        this("Decoder init failed: [" + i7 + "], " + uVar, tVar, uVar.f10766s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f58348a = str2;
        this.f58349b = z10;
        this.f58350c = oVar;
        this.d = str3;
    }
}
