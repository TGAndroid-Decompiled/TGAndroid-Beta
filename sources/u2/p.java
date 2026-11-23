package u2;
public final class p extends Exception {
    public final String f58358a;
    public final boolean f58359b;
    public final o f58360c;
    public final String d;

    public p(e2.u uVar, t tVar, boolean z10, int i7) {
        this("Decoder init failed: [" + i7 + "], " + uVar, tVar, uVar.f10761s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f58358a = str2;
        this.f58359b = z10;
        this.f58360c = oVar;
        this.d = str3;
    }
}
