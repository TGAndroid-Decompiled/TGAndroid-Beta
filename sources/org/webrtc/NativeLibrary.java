package org.webrtc;
class NativeLibrary {
    private static final String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static final Object lock = new Object();

    static class DefaultLoader implements NativeLibraryLoader {
        @Override
        public boolean load(String str) {
            Logging.d("NativeLibrary", "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            if (libraryLoaded) {
                Logging.d("NativeLibrary", "Native library has already been loaded.");
                return;
            }
            Logging.d("NativeLibrary", "Loading native library: " + str);
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
