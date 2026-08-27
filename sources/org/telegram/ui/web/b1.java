package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.tq0;

public abstract class b1 {

    public static boolean f43781a;

    public static boolean f43782b;

    public static ArrayList f43783c;
    public static LongSparseArray d;

    public static ArrayList f43784e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback == null || f43782b) {
            z10 = false;
        } else {
            if (f43784e == null) {
                f43784e = new ArrayList();
            }
            f43784e.add(callback);
            z10 = true;
        }
        b();
        if (z10) {
            return null;
        }
        return f43783c;
    }

    public static void b() {
        if (f43781a || f43782b) {
            return;
        }
        f43781a = true;
        f43783c = new ArrayList();
        d = new LongSparseArray();
        Utilities.globalQueue.postRunnable(new tq0(9));
    }

    public static void c(a1 a1Var) {
        if (a1Var == null || a1Var.d == null) {
            return;
        }
        b();
        a1 a1Var2 = (a1) d.get(a1Var.f43774a);
        if (a1Var2 != null) {
            a1Var2.d = a1Var.d;
        } else {
            f43783c.add(a1Var);
            d.put(a1Var.f43774a, a1Var);
        }
        int i10 = 8;
        AndroidUtilities.cancelRunOnUIThread(new tq0(i10));
        AndroidUtilities.runOnUIThread(new tq0(i10), 1000L);
    }
}
