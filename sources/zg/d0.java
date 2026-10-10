package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class d0 {
    public static Runnable f54547c;
    public static Boolean h;
    public static final HashSet f54545a = new HashSet();
    public static volatile boolean f54546b = false;
    public static boolean d = true;
    public static boolean f54548e = false;
    public static boolean f54549f = false;
    public static boolean f54550g = false;

    public static void a() {
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f10519b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f10519b = null;
        }
        f54546b = false;
        f54548e = false;
        f54550g = false;
        f54547c = null;
        Iterator it = f54545a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f54545a.clear();
    }

    public static boolean b(View view) {
        if (f54546b) {
            f54545a.add(view);
        }
        return f54546b;
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
        if (f54546b) {
            f54545a.addAll(Arrays.asList(viewArr));
        }
        return f54546b;
    }

    public static boolean d() {
        if (!f54546b && !f54548e && !f54550g) {
            return false;
        }
        return true;
    }
}
