package org.webrtc;
class NativeLibrary {
    private static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    static class DefaultLoader implements NativeLibraryLoader {
        @Override
        public boolean load(String str) {
            String str2 = NativeLibrary.TAG;
            Logging.d(str2, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            boolean z = libraryLoaded;
            String str2 = TAG;
            if (z) {
                Logging.d(str2, "Native library has already been loaded.");
                return;
            }
            Logging.d(str2, "Loading native library: " + str);
            libraryLoaded = nativeLibraryLoader.load(str);
        }
    }

    public static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}
