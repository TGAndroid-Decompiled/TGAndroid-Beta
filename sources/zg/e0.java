package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f53368c;
    public static Boolean h;
    public static final HashSet f53366a = new HashSet();
    public static volatile boolean f53367b = false;
    public static boolean d = true;
    public static boolean f53369e = false;
    public static boolean f53370f = false;
    public static boolean f53371g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9847b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9847b = null;
        }
        f53367b = false;
        f53369e = false;
        f53371g = false;
        f53368c = null;
        Iterator it = f53366a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f53366a.clear();
    }

    public static boolean b(View view) {
        if (f53367b) {
            f53366a.add(view);
        }
        return f53367b;
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
        if (f53367b) {
            f53366a.addAll(Arrays.asList(viewArr));
        }
        return f53367b;
    }

    public static boolean d() {
        if (!f53367b && !f53369e && !f53371g) {
            return false;
        }
        return true;
    }
}
