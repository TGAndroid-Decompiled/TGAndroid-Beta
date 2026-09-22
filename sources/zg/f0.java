package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class f0 {
    public static Runnable f49017c;
    public static Boolean h;
    public static final HashSet f49015a = new HashSet();
    public static volatile boolean f49016b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49018f = false;
    public static boolean f49019g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9062b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9062b = null;
        }
        f49016b = false;
        e = false;
        f49019g = false;
        f49017c = null;
        Iterator it = f49015a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49015a.clear();
    }

    public static boolean b(View view) {
        if (f49016b) {
            f49015a.add(view);
        }
        return f49016b;
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
        if (f49016b) {
            f49015a.addAll(Arrays.asList(viewArr));
        }
        return f49016b;
    }

    public static boolean d() {
        if (!f49016b && !e && !f49019g) {
            return false;
        }
        return true;
    }
}
