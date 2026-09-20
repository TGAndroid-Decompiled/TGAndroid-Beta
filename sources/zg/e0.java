package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f49319c;
    public static Boolean h;
    public static final HashSet f49317a = new HashSet();
    public static volatile boolean f49318b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49320f = false;
    public static boolean f49321g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9065b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9065b = null;
        }
        f49318b = false;
        e = false;
        f49321g = false;
        f49319c = null;
        Iterator it = f49317a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49317a.clear();
    }

    public static boolean b(View view) {
        if (f49318b) {
            f49317a.add(view);
        }
        return f49318b;
    }

    public static boolean c(View... viewArr) {
        boolean z10;
        if (h == null) {
            if (SharedConfig.getDevicePerformanceClass() != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h = Boolean.valueOf(z10);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f49318b) {
            f49317a.addAll(Arrays.asList(viewArr));
        }
        return f49318b;
    }

    public static boolean d() {
        if (!f49318b && !e && !f49321g) {
            return false;
        }
        return true;
    }
}
