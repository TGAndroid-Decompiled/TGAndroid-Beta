package org.webrtc;
class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        xi4.l("Failed to get WebRTC class loader.");
        return null;
    }
}
