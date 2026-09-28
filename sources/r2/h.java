package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
public final class h implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
    public final j f42241a;

    public h(j jVar) {
        this.f42241a = jVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f42241a.f42245b.getClass();
        return bundle;
    }
}
