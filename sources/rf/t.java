package rf;

import android.view.FrameMetrics;
import android.view.Window;
public final class t implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        v.a(frameMetrics);
    }
}
