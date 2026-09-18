package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f49273c;
    public static Boolean h;
    public static final HashSet f49271a = new HashSet();
    public static volatile boolean f49272b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49274f = false;
    public static boolean f49275g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9064b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9064b = null;
        }
        f49272b = false;
        e = false;
        f49275g = false;
        f49273c = null;
        Iterator it = f49271a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49271a.clear();
    }

    public static boolean b(View view) {
        if (f49272b) {
            f49271a.add(view);
        }
        return f49272b;
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
        if (f49272b) {
            f49271a.addAll(Arrays.asList(viewArr));
        }
        return f49272b;
    }

    public static boolean d() {
        if (!f49272b && !e && !f49275g) {
            return false;
        }
        return true;
    }
}
