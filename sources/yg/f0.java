package yg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class f0 {
    public static Runnable f46997c;
    public static Boolean h;
    public static final HashSet f46995a = new HashSet();
    public static volatile boolean f46996b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f46998f = false;
    public static boolean f46999g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f7947b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f7947b = null;
        }
        f46996b = false;
        e = false;
        f46999g = false;
        f46997c = null;
        Iterator it = f46995a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f46995a.clear();
    }

    public static boolean b(View view) {
        if (f46996b) {
            f46995a.add(view);
        }
        return f46996b;
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
        if (f46996b) {
            f46995a.addAll(Arrays.asList(viewArr));
        }
        return f46996b;
    }

    public static boolean d() {
        if (!f46996b && !e && !f46999g) {
            return false;
        }
        return true;
    }
}
