package r2;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
public final class i implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final k f46889a;

    public i(k kVar) {
        this.f46889a = kVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f46889a.f46893b.getClass();
        return bundle;
    }
}
