package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f49291c;
    public static Boolean h;
    public static final HashSet f49289a = new HashSet();
    public static volatile boolean f49290b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49292f = false;
    public static boolean f49293g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9047b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9047b = null;
        }
        f49290b = false;
        e = false;
        f49293g = false;
        f49291c = null;
        Iterator it = f49289a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49289a.clear();
    }

    public static boolean b(View view) {
        if (f49290b) {
            f49289a.add(view);
        }
        return f49290b;
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
        if (f49290b) {
            f49289a.addAll(Arrays.asList(viewArr));
        }
        return f49290b;
    }

    public static boolean d() {
        if (!f49290b && !e && !f49293g) {
            return false;
        }
        return true;
    }
}
