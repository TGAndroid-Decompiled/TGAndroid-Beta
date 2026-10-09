package r2;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
public final class i implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final k f46887a;

    public i(k kVar) {
        this.f46887a = kVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f46887a.f46891b.getClass();
        return bundle;
    }
}
