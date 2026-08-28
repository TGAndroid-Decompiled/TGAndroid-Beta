package org.webrtc;

import java.util.HashMap;
import java.util.Map;
public class Metrics {
    private static final String TAG = "Metrics";
    public final Map<String, HistogramInfo> map = new HashMap();

    public static class HistogramInfo {
        public final int bucketCount;
        public final int max;
        public final int min;
        public final Map<Integer, Integer> samples = new HashMap();

        public HistogramInfo(int i9, int i10, int i11) {
            this.min = i9;
            this.max = i10;
            this.bucketCount = i11;
        }

        public void addSample(int i9, int i10) {
            this.samples.put(Integer.valueOf(i9), Integer.valueOf(i10));
        }
    }

    private void add(String str, HistogramInfo histogramInfo) {
        this.map.put(str, histogramInfo);
    }

    public static void enable() {
        nativeEnable();
    }

    public static Metrics getAndReset() {
        return nativeGetAndReset();
    }

    private static native void nativeEnable();

    private static native Metrics nativeGetAndReset();
}
