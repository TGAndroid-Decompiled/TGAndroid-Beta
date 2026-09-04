package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
public final class h implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
    public final j f44824a;

    public h(j jVar) {
        this.f44824a = jVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f44824a.f44828b.getClass();
        return bundle;
    }
}
