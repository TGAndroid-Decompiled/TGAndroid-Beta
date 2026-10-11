package r2;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;
public final class j implements w {
    public static final j f47014a = new Object();
    public static final j f47015b = new Object();

    public static MediaCodecInfo.VideoCapabilities.PerformancePoint c(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public List a(String str, boolean z10, boolean z11) {
        return x.d(str, z10, z11);
    }

    @Override
    public int b(Object obj) {
        String str = ((p) obj).f47020a;
        if (!str.startsWith("OMX.google") && !str.startsWith("c2.android")) {
            if (Build.VERSION.SDK_INT < 26 && str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                return -1;
            }
            return 0;
        }
        return 1;
    }
}
