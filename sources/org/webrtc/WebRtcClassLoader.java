package org.webrtc;
class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        zo4.k("Failed to get WebRTC class loader.");
        return null;
    }
}
