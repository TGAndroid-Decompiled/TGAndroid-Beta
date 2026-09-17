package yf;

import android.view.FrameMetrics;
import android.view.Window;
public final class v implements Window.OnFrameMetricsAvailableListener {
    @Override
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
        y.a(frameMetrics);
    }
}
