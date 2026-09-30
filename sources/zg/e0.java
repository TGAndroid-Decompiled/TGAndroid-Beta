package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f49400c;
    public static Boolean h;
    public static final HashSet f49398a = new HashSet();
    public static volatile boolean f49399b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49401f = false;
    public static boolean f49402g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9059b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9059b = null;
        }
        f49399b = false;
        e = false;
        f49402g = false;
        f49400c = null;
        Iterator it = f49398a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49398a.clear();
    }

    public static boolean b(View view) {
        if (f49399b) {
            f49398a.add(view);
        }
        return f49399b;
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
        if (f49399b) {
            f49398a.addAll(Arrays.asList(viewArr));
        }
        return f49399b;
    }

    public static boolean d() {
        if (!f49399b && !e && !f49402g) {
            return false;
        }
        return true;
    }
}
