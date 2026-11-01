package r2;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;
public final class i implements v {
    public static final i f46246a = new Object();
    public static final i f46247b = new Object();

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint b(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public List a(String str, boolean z10, boolean z11) {
        return w.e(str, z10, z11);
    }

    @Override
    public int d(Object obj) {
        String str = ((o) obj).f46252a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (Build.VERSION.SDK_INT < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }
}
