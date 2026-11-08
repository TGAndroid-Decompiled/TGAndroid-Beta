package u2;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;
public final class i implements v {
    public static final i f56254a = new Object();
    public static final i f56255b = new Object();

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint b(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public List a(String str, boolean z9, boolean z10) {
        return w.e(str, z9, z10);
    }

    @Override
    public int d(Object obj) {
        String str = ((o) obj).f56260a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (Build.VERSION.SDK_INT < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }
}
