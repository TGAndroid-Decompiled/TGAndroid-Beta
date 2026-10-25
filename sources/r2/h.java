package r2;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
public final class h implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final j f47214a;

    public h(j jVar) {
        this.f47214a = jVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f47214a.f47218b.getClass();
        return bundle;
    }
}
