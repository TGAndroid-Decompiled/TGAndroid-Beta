package zh;

import android.app.ActivityManager;
import android.os.Build;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
public abstract class e1 {
    public static final float[][] f51979a = {new float[]{1.1f, 27.0f, 1.05f, 23.0f, 1.15f, 33.0f, 3.8f, 1.0f, -1.0f, 1.0f, 1.0f, 2.0f, 3.0f}, new float[]{0.83f, 27.0f, 0.79f, 23.0f, 0.86f, 33.0f, 3.8f, 1.0f, -1.0f, 0.6f, 1.0f, 2.0f, 3.0f}, new float[]{1.1f, 27.0f, 1.05f, 23.0f, 1.15f, 18.0f, 3.8f, 1.0f, -1.0f, 1.2f, 1.0f, 2.0f, 3.0f}, new float[]{0.83f, 13.0f, 0.79f, 11.0f, 0.86f, 16.0f, 3.8f, 1.0f, -1.0f, 0.6f, 1.0f, 1.0f, 1.5f}};
    public static final float[] f51980b = {20.0f, 10.0f, 17.5f, 6.0f, 85.0f, 55.0f, 26.0f, 50.0f, 40.0f, 5.0f, 7.0f, 9.0f, 33.0f, 46.0f, 24.0f, 0.0f, 30.0f, 45.0f, 67.0f, 15.0f, 70.0f, 139.0f, 100.0f, 61.0f, 193.0f, 4.0f, 2.0f, 100.0f, 55.0f, 0.3f, 100.0f, 30.0f, 1.5f, 2.5f, 0.0f, 1.0f, 1.3f, 200.0f, 0.7f, 207.0f, 0.0f, 0.0f, 3.5f, 0.0f, 1.5f, 2.5f, 34.0f, 27.0f, 360.0f, 780.0f, 1.1f, 920.0f, 1.0f, 10.0f};

    public static boolean a(long j10) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
                if (memoryInfo.lowMemory || memoryInfo.availMem - j10 <= memoryInfo.threshold * 2) {
                    return false;
                }
                return true;
            }
            Runtime runtime = Runtime.getRuntime();
            if (j10 >= (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) / 2) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return false;
        }
    }

    public static int b(int i10, int i11, int i12) {
        int min = Math.min(i11, (4096 / ((int) Math.ceil(Math.sqrt(Math.max(1, i10))))) - 4);
        if (min >= i12) {
            return min;
        }
        return 0;
    }
}
