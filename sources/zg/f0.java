package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class f0 {
    public static Runnable f49344c;
    public static Boolean h;
    public static final HashSet f49342a = new HashSet();
    public static volatile boolean f49343b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49345f = false;
    public static boolean f49346g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9065b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9065b = null;
        }
        f49343b = false;
        e = false;
        f49346g = false;
        f49344c = null;
        Iterator it = f49342a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49342a.clear();
    }

    public static boolean b(View view) {
        if (f49343b) {
            f49342a.add(view);
        }
        return f49343b;
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
        if (f49343b) {
            f49342a.addAll(Arrays.asList(viewArr));
        }
        return f49343b;
    }

    public static boolean d() {
        if (!f49343b && !e && !f49346g) {
            return false;
        }
        return true;
    }
}
