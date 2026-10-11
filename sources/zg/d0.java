package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class d0 {
    public static Runnable f54590c;
    public static Boolean h;
    public static final HashSet f54588a = new HashSet();
    public static volatile boolean f54589b = false;
    public static boolean d = true;
    public static boolean f54591e = false;
    public static boolean f54592f = false;
    public static boolean f54593g = false;

    public static void a() {
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f10518b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f10518b = null;
        }
        f54589b = false;
        f54591e = false;
        f54593g = false;
        f54590c = null;
        Iterator it = f54588a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f54588a.clear();
    }

    public static boolean b(View view) {
        if (f54589b) {
            f54588a.add(view);
        }
        return f54589b;
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
        if (f54589b) {
            f54588a.addAll(Arrays.asList(viewArr));
        }
        return f54589b;
    }

    public static boolean d() {
        if (!f54589b && !f54591e && !f54593g) {
            return false;
        }
        return true;
    }
}
