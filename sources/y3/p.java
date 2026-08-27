package y3;

import h3.t0;

public final class p extends Exception {

    public final String f49501a;

    public final boolean f49502b;

    public final n f49503c;
    public final String d;

    public p(t0 t0Var, t tVar, boolean z10, int i10) {
        this("Decoder init failed: [" + i10 + "], " + t0Var, tVar, t0Var.B, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
    }

    public p(String str, Throwable th, String str2, boolean z10, n nVar, String str3) {
        super(str, th);
        this.f49501a = str2;
        this.f49502b = z10;
        this.f49503c = nVar;
        this.d = str3;
    }
}
