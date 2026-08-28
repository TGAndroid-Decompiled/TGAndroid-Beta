package y3;

import android.media.MediaCodecInfo;
import java.util.List;
public abstract class m {
    public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i9, int i10, double d) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(i9, i10, (int) d);
        for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
            if (supportedPerformancePoints.get(i11).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
