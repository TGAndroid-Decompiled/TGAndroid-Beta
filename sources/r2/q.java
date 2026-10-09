package r2;
public final class q extends Exception {
    public final String f46904a;
    public final boolean f46905b;
    public final p f46906c;
    public final String d;

    public q(b2.s sVar, u uVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + sVar, uVar, sVar.f3643r, z10, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public q(String str, Throwable th2, String str2, boolean z10, p pVar, String str3) {
        super(str, th2);
        this.f46904a = str2;
        this.f46905b = z10;
        this.f46906c = pVar;
        this.d = str3;
    }
}
