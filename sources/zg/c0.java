package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class c0 {
    public static Runnable f53349c;
    public static Boolean h;
    public static final HashSet f53347a = new HashSet();
    public static volatile boolean f53348b = false;
    public static boolean d = true;
    public static boolean f53350e = false;
    public static boolean f53351f = false;
    public static boolean f53352g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9848b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9848b = null;
        }
        f53348b = false;
        f53350e = false;
        f53352g = false;
        f53349c = null;
        Iterator it = f53347a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f53347a.clear();
    }

    public static boolean b(View view) {
        if (f53348b) {
            f53347a.add(view);
        }
        return f53348b;
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
        if (f53348b) {
            f53347a.addAll(Arrays.asList(viewArr));
        }
        return f53348b;
    }

    public static boolean d() {
        if (!f53348b && !f53350e && !f53352g) {
            return false;
        }
        return true;
    }
}
