package org.webrtc;

import java.nio.charset.StandardCharsets;
import java.util.Map;
class JniHelper {
    public static Object getKey(Map.Entry<?, ?> entry) {
        return entry.getKey();
    }

    public static byte[] getStringBytes(String str) {
        return str.getBytes(StandardCharsets.ISO_8859_1);
    }

    public static Object getStringClass() {
        return String.class;
    }

    public static Object getValue(Map.Entry<?, ?> entry) {
        return entry.getValue();
    }
}
