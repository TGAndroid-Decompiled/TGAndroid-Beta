package u2;
public final class p extends Exception {
    public final String f57780a;
    public final boolean f57781b;
    public final o f57782c;
    public final String d;

    public p(e2.u uVar, t tVar, boolean z10, int i7) {
        this("Decoder init failed: [" + i7 + "], " + uVar, tVar, uVar.f10451s, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f57780a = str2;
        this.f57781b = z10;
        this.f57782c = oVar;
        this.d = str3;
    }
}
