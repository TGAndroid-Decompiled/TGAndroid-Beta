package r2;
public final class p extends Exception {
    public final String f45754a;
    public final boolean f45755b;
    public final o f45756c;
    public final String d;

    public p(b2.s sVar, u uVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + sVar, uVar, sVar.f3564r, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th2, String str2, boolean z10, o oVar, String str3) {
        super(str, th2);
        this.f45754a = str2;
        this.f45755b = z10;
        this.f45756c = oVar;
        this.d = str3;
    }
}
