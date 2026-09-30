package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f49294c;
    public static Boolean h;
    public static final HashSet f49292a = new HashSet();
    public static volatile boolean f49293b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49295f = false;
    public static boolean f49296g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9047b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9047b = null;
        }
        f49293b = false;
        e = false;
        f49296g = false;
        f49294c = null;
        Iterator it = f49292a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49292a.clear();
    }

    public static boolean b(View view) {
        if (f49293b) {
            f49292a.add(view);
        }
        return f49293b;
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
        if (f49293b) {
            f49292a.addAll(Arrays.asList(viewArr));
        }
        return f49293b;
    }

    public static boolean d() {
        if (!f49293b && !e && !f49296g) {
            return false;
        }
        return true;
    }
}
