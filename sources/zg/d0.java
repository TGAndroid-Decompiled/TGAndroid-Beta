package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class d0 {
    public static Runnable f54624c;
    public static Boolean h;
    public static final HashSet f54622a = new HashSet();
    public static volatile boolean f54623b = false;
    public static boolean d = true;
    public static boolean f54625e = false;
    public static boolean f54626f = false;
    public static boolean f54627g = false;

    public static void a() {
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f10518b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f10518b = null;
        }
        f54623b = false;
        f54625e = false;
        f54627g = false;
        f54624c = null;
        Iterator it = f54622a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f54622a.clear();
    }

    public static boolean b(View view) {
        if (f54623b) {
            f54622a.add(view);
        }
        return f54623b;
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
        if (f54623b) {
            f54622a.addAll(Arrays.asList(viewArr));
        }
        return f54623b;
    }

    public static boolean d() {
        if (!f54623b && !f54625e && !f54627g) {
            return false;
        }
        return true;
    }
}
