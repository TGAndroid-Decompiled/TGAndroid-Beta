package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class d0 {
    public static Runnable f54735c;
    public static Boolean h;
    public static final HashSet f54733a = new HashSet();
    public static volatile boolean f54734b = false;
    public static boolean d = true;
    public static boolean f54736e = false;
    public static boolean f54737f = false;
    public static boolean f54738g = false;

    public static void a() {
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f10517b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f10517b = null;
        }
        f54734b = false;
        f54736e = false;
        f54738g = false;
        f54735c = null;
        Iterator it = f54733a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f54733a.clear();
    }

    public static boolean b(View view) {
        if (f54734b) {
            f54733a.add(view);
        }
        return f54734b;
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
        if (f54734b) {
            f54733a.addAll(Arrays.asList(viewArr));
        }
        return f54734b;
    }

    public static boolean d() {
        if (!f54734b && !f54736e && !f54738g) {
            return false;
        }
        return true;
    }
}
