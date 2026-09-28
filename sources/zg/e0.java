package zg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SharedConfig;
public abstract class e0 {
    public static Runnable f49293c;
    public static Boolean h;
    public static final HashSet f49291a = new HashSet();
    public static volatile boolean f49292b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f49294f = false;
    public static boolean f49295g = false;

    public static void a() {
        ff.c cacheOutQueue = ImageLoader.getInstance().getCacheOutQueue();
        CountDownLatch countDownLatch = cacheOutQueue.f9047b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            cacheOutQueue.f9047b = null;
        }
        f49292b = false;
        e = false;
        f49295g = false;
        f49293c = null;
        Iterator it = f49291a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f49291a.clear();
    }

    public static boolean b(View view) {
        if (f49292b) {
            f49291a.add(view);
        }
        return f49292b;
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
        if (f49292b) {
            f49291a.addAll(Arrays.asList(viewArr));
        }
        return f49292b;
    }

    public static boolean d() {
        if (!f49292b && !e && !f49295g) {
            return false;
        }
        return true;
    }
}
