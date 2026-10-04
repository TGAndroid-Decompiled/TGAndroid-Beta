package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f53373c;
    public static Boolean h;
    public static final HashSet f53371a = new HashSet();
    public static volatile boolean f53372b = false;
    public static boolean d = true;
    public static boolean f53374e = false;
    public static boolean f53375f = false;
    public static boolean f53376g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9848b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9848b = null;
        }
        f53372b = false;
        f53374e = false;
        f53376g = false;
        f53373c = null;
        Iterator it = f53371a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f53371a.clear();
    }

    public static boolean b(View view) {
        if (f53372b) {
            f53371a.add(view);
        }
        return f53372b;
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
        if (f53372b) {
            f53371a.addAll(Arrays.asList(viewArr));
        }
        return f53372b;
    }

    public static boolean d() {
        if (!f53372b && !f53374e && !f53376g) {
            return false;
        }
        return true;
    }
}
