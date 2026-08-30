package org.webrtc;
class NativeLibrary {
    private static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    public static class DefaultLoader implements NativeLibraryLoader {
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
            try {
                if (libraryLoaded) {
                    Logging.d(TAG, "Native library has already been loaded.");
                    return;
                }
                String str2 = TAG;
                Logging.d(str2, "Loading native library: " + str);
                libraryLoaded = nativeLibraryLoader.load(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isLoaded() {
        boolean z4;
        synchronized (lock) {
            z4 = libraryLoaded;
        }
        return z4;
    }
}
