package r2;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
public final class i implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final k f47013a;

    public i(k kVar) {
        this.f47013a = kVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f47013a.f47017b.getClass();
        return bundle;
    }
}
