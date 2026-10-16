package r2;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
public final class h implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final j f43596a;

    public h(j jVar) {
        this.f43596a = jVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f43596a.f43600b.getClass();
        return bundle;
    }
}
