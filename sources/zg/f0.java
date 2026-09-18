package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class f0 {
    public static Runnable f49052c;
    public static Boolean h;
    public static final HashSet f49050a = new HashSet();
    public static volatile boolean f49051b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49053f = false;
    public static boolean f49054g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9065b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9065b = null;
        }
        f49051b = false;
        e = false;
        f49054g = false;
        f49052c = null;
        Iterator it = f49050a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49050a.clear();
    }

    public static boolean b(View view) {
        if (f49051b) {
            f49050a.add(view);
        }
        return f49051b;
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
        if (f49051b) {
            f49050a.addAll(Arrays.asList(viewArr));
        }
        return f49051b;
    }

    public static boolean d() {
        if (!f49051b && !e && !f49054g) {
            return false;
        }
        return true;
    }
}
