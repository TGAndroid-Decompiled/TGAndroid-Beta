package r2;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;
public final class i implements v {
    public static final i f47112a = new Object();
    public static final i f47113b = new Object();

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint c(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public List a(String str, boolean z10, boolean z11) {
        return w.d(str, z10, z11);
    }

    @Override
    public int b(Object obj) {
        String str = ((o) obj).f47118a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (Build.VERSION.SDK_INT < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }
}
