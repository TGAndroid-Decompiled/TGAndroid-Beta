package r2;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;
public final class i implements v {
    public static final i f41176a = new Object();
    public static final i f41177b = new Object();

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint c(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    @Override
    public int a(Object obj) {
        String str = ((o) obj).f41182a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (Build.VERSION.SDK_INT < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }

    public List b(String str, boolean z10, boolean z11) {
        return w.d(str, z10, z11);
    }
}
