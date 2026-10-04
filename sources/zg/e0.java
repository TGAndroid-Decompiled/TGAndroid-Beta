package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f53367c;
    public static Boolean h;
    public static final HashSet f53365a = new HashSet();
    public static volatile boolean f53366b = false;
    public static boolean d = true;
    public static boolean f53368e = false;
    public static boolean f53369f = false;
    public static boolean f53370g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9847b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9847b = null;
        }
        f53366b = false;
        f53368e = false;
        f53370g = false;
        f53367c = null;
        Iterator it = f53365a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f53365a.clear();
    }

    public static boolean b(View view) {
        if (f53366b) {
            f53365a.add(view);
        }
        return f53366b;
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
        if (f53366b) {
            f53365a.addAll(Arrays.asList(viewArr));
        }
        return f53366b;
    }

    public static boolean d() {
        if (!f53366b && !f53368e && !f53370g) {
            return false;
        }
        return true;
    }
}
