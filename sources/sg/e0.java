package sg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ic;
import org.telegram.messenger.uz;
public abstract class e0 {
    public static Runnable f48332c;
    public static Boolean h;
    public static final HashSet f48330a = new HashSet();
    public static volatile boolean f48331b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f48333f = false;
    public static boolean f48334g = false;

    public static void a() {
        com.google.android.gms.internal.cast.c0 c0Var = ic.D().f16258p;
        CountDownLatch countDownLatch = (CountDownLatch) c0Var.f4586c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            c0Var.f4586c = null;
        }
        f48331b = false;
        e = false;
        f48334g = false;
        f48332c = null;
        Iterator it = f48330a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        f48330a.clear();
    }

    public static boolean b(View view) {
        if (f48331b) {
            f48330a.add(view);
        }
        return f48331b;
    }

    public static boolean c(View... viewArr) {
        boolean z10;
        if (h == null) {
            if (uz.o() != 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            h = Boolean.valueOf(z10);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (f48331b) {
            f48330a.addAll(Arrays.asList(viewArr));
        }
        return f48331b;
    }

    public static boolean d() {
        if (!f48331b && !e && !f48334g) {
            return false;
        }
        return true;
    }
}
