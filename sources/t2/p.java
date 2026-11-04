package t2;
public final class p extends Exception {
    public final String f54862a;
    public final boolean f54863b;
    public final o f54864c;
    public final String d;

    public p(d2.v vVar, t tVar, boolean z10, int i3) {
        this("Decoder init failed: [" + i3 + "], " + vVar, tVar, vVar.f8489s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i3 < 0 ? "neg_" : "") + Math.abs(i3));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f54862a = str2;
        this.f54863b = z10;
        this.f54864c = oVar;
        this.d = str3;
    }
}
