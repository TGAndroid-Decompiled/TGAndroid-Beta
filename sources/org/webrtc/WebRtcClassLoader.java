package org.webrtc;
class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        wn4.j("Failed to get WebRTC class loader.");
        return null;
    }
}
