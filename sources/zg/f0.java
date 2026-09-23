package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class f0 {
    public static Runnable f48968c;
    public static Boolean h;
    public static final HashSet f48966a = new HashSet();
    public static volatile boolean f48967b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f48969f = false;
    public static boolean f48970g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9048b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9048b = null;
        }
        f48967b = false;
        e = false;
        f48970g = false;
        f48968c = null;
        Iterator it = f48966a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f48966a.clear();
    }

    public static boolean b(View view) {
        if (f48967b) {
            f48966a.add(view);
        }
        return f48967b;
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
        if (f48967b) {
            f48966a.addAll(Arrays.asList(viewArr));
        }
        return f48967b;
    }

    public static boolean d() {
        if (!f48967b && !e && !f48970g) {
            return false;
        }
        return true;
    }
}
