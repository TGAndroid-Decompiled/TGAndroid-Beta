package r2;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
public final class h implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
    public final j f44938a;

    public h(j jVar) {
        this.f44938a = jVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f44938a.f44942b.getClass();
        return bundle;
    }
}
