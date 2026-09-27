package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class f0 {
    public static Runnable f49340c;
    public static Boolean h;
    public static final HashSet f49338a = new HashSet();
    public static volatile boolean f49339b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49341f = false;
    public static boolean f49342g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9050b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9050b = null;
        }
        f49339b = false;
        e = false;
        f49342g = false;
        f49340c = null;
        Iterator it = f49338a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49338a.clear();
    }

    public static boolean b(View view) {
        if (f49339b) {
            f49338a.add(view);
        }
        return f49339b;
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
        if (f49339b) {
            f49338a.addAll(Arrays.asList(viewArr));
        }
        return f49339b;
    }

    public static boolean d() {
        if (!f49339b && !e && !f49342g) {
            return false;
        }
        return true;
    }
}
