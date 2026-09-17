package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class f0 {
    public static Runnable f49047c;
    public static Boolean h;
    public static final HashSet f49045a = new HashSet();
    public static volatile boolean f49046b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49048f = false;
    public static boolean f49049g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9065b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9065b = null;
        }
        f49046b = false;
        e = false;
        f49049g = false;
        f49047c = null;
        Iterator it = f49045a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49045a.clear();
    }

    public static boolean b(View view) {
        if (f49046b) {
            f49045a.add(view);
        }
        return f49046b;
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
        if (f49046b) {
            f49045a.addAll(Arrays.asList(viewArr));
        }
        return f49046b;
    }

    public static boolean d() {
        if (!f49046b && !e && !f49049g) {
            return false;
        }
        return true;
    }
}
