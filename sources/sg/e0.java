package sg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.hc;
import org.telegram.messenger.tz;
public abstract class e0 {
    public static Runnable f48321c;
    public static Boolean h;
    public static final HashSet f48319a = new HashSet();
    public static volatile boolean f48320b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f48322f = false;
    public static boolean f48323g = false;

    public static void a() {
        com.google.android.gms.internal.cast.c0 c0Var = hc.D().f15865p;
        CountDownLatch countDownLatch = (CountDownLatch) c0Var.f4586c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            c0Var.f4586c = null;
        }
        f48320b = false;
        e = false;
        f48323g = false;
        f48321c = null;
        Iterator it = f48319a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f48319a.clear();
    }

    public static boolean b(View view) {
        if (f48320b) {
            f48319a.add(view);
        }
        return f48320b;
    }

    public static boolean c(View... viewArr) {
        boolean z10;
        if (h == null) {
            if (tz.o() != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h = Boolean.valueOf(z10);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f48320b) {
            f48319a.addAll(Arrays.asList(viewArr));
        }
        return f48320b;
    }

    public static boolean d() {
        if (!f48320b && !e && !f48323g) {
            return false;
        }
        return true;
    }
}
