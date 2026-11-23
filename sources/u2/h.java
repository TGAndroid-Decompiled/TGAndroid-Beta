package u2;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
public final class h implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final j f58376a;

    public h(j jVar) {
        this.f58376a = jVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f58376a.f58380b.getClass();
        return bundle;
    }
}
