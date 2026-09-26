package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f49292c;
    public static Boolean h;
    public static final HashSet f49290a = new HashSet();
    public static volatile boolean f49291b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49293f = false;
    public static boolean f49294g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9047b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9047b = null;
        }
        f49291b = false;
        e = false;
        f49294g = false;
        f49292c = null;
        Iterator it = f49290a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49290a.clear();
    }

    public static boolean b(View view) {
        if (f49291b) {
            f49290a.add(view);
        }
        return f49291b;
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
        if (f49291b) {
            f49290a.addAll(Arrays.asList(viewArr));
        }
        return f49291b;
    }

    public static boolean d() {
        if (!f49291b && !e && !f49294g) {
            return false;
        }
        return true;
    }
}
