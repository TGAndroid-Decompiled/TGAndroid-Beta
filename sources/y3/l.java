package y3;

import android.media.MediaCodec;
import d5.g0;

public class l extends k3.g {

    public final String f49494a;

    public l(IllegalStateException illegalStateException, n nVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(nVar == null ? null : nVar.f49495a);
        super(sb2.toString(), illegalStateException);
        if (g0.f4795a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f49494a = diagnosticInfo;
    }
}
