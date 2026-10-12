package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class d0 {
    public static Runnable f54727c;
    public static Boolean h;
    public static final HashSet f54725a = new HashSet();
    public static volatile boolean f54726b = false;
    public static boolean d = true;
    public static boolean f54728e = false;
    public static boolean f54729f = false;
    public static boolean f54730g = false;

    public static void a() {
        gf.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f10517b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f10517b = null;
        }
        f54726b = false;
        f54728e = false;
        f54730g = false;
        f54727c = null;
        Iterator it = f54725a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f54725a.clear();
    }

    public static boolean b(View view) {
        if (f54726b) {
            f54725a.add(view);
        }
        return f54726b;
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
        if (f54726b) {
            f54725a.addAll(Arrays.asList(viewArr));
        }
        return f54726b;
    }

    public static boolean d() {
        if (!f54726b && !f54728e && !f54730g) {
            return false;
        }
        return true;
    }
}
