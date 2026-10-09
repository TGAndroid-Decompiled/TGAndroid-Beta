package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class d0 {
    public static Runnable f54503c;
    public static Boolean h;
    public static final HashSet f54501a = new HashSet();
    public static volatile boolean f54502b = false;
    public static boolean d = true;
    public static boolean f54504e = false;
    public static boolean f54505f = false;
    public static boolean f54506g = false;

    public static void a() {
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f10519b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f10519b = null;
        }
        f54502b = false;
        f54504e = false;
        f54506g = false;
        f54503c = null;
        Iterator it = f54501a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f54501a.clear();
    }

    public static boolean b(View view) {
        if (f54502b) {
            f54501a.add(view);
        }
        return f54502b;
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
        if (f54502b) {
            f54501a.addAll(Arrays.asList(viewArr));
        }
        return f54502b;
    }

    public static boolean d() {
        if (!f54502b && !f54504e && !f54506g) {
            return false;
        }
        return true;
    }
}
