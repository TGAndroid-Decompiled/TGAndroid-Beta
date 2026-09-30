package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
public final class h implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
    public final j f42346a;

    public h(j jVar) {
        this.f42346a = jVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f42346a.f42350b.getClass();
        return bundle;
    }
}
