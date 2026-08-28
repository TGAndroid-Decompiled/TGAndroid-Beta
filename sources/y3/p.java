package y3;

import h3.t0;
public final class p extends Exception {
    public final String f49511a;
    public final boolean f49512b;
    public final n f49513c;
    public final String d;

    public p(t0 t0Var, t tVar, boolean z10, int i9) {
        this("Decoder init failed: [" + i9 + "], " + t0Var, tVar, t0Var.B, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i9 < 0 ? "neg_" : "") + Math.abs(i9));
    }

    public p(String str, Throwable th, String str2, boolean z10, n nVar, String str3) {
        super(str, th);
        this.f49511a = str2;
        this.f49512b = z10;
        this.f49513c = nVar;
        this.d = str3;
    }
}
