package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.o91;
public abstract class f1 {
    public static boolean f38948a;
    public static boolean f38949b;
    public static ArrayList f38950c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f38949b) {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f38950c;
    }

    public static void b() {
        if (!f38948a && !f38949b) {
            f38948a = true;
            f38950c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new o91(5));
        }
    }

    public static void c(e1 e1Var) {
        if (e1Var != null && e1Var.d != null) {
            b();
            e1 e1Var2 = (e1) d.get(e1Var.f38942a);
            if (e1Var2 != null) {
                e1Var2.d = e1Var.d;
            } else {
                f38950c.add(e1Var);
                d.put(e1Var.f38942a, e1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new o91(4));
            AndroidUtilities.runOnUIThread(new o91(4), 1000L);
        }
    }
}
