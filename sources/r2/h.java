package r2;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
public final class h implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
    public final j f45730a;

    public h(j jVar) {
        this.f45730a = jVar;
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        this.f45730a.f45734b.getClass();
        return bundle;
    }
}
