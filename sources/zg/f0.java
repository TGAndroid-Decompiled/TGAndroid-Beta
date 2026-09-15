package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class f0 {
    public static Runnable f49024c;
    public static Boolean h;
    public static final HashSet f49022a = new HashSet();
    public static volatile boolean f49023b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49025f = false;
    public static boolean f49026g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9060b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9060b = null;
        }
        f49023b = false;
        e = false;
        f49026g = false;
        f49024c = null;
        Iterator it = f49022a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49022a.clear();
    }

    public static boolean b(View view) {
        if (f49023b) {
            f49022a.add(view);
        }
        return f49023b;
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
        if (f49023b) {
            f49022a.addAll(Arrays.asList(viewArr));
        }
        return f49023b;
    }

    public static boolean d() {
        if (!f49023b && !e && !f49026g) {
            return false;
        }
        return true;
    }
}
