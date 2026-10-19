package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.df0;
public abstract class c1 {
    public static boolean f42607a;
    public static boolean f42608b;
    public static ArrayList f42609c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f42608b) {
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
        return f42609c;
    }

    public static void b() {
        if (!f42607a && !f42608b) {
            f42607a = true;
            f42609c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new df0(13));
        }
    }

    public static void c(b1 b1Var) {
        if (b1Var != null && b1Var.d != null) {
            b();
            b1 b1Var2 = (b1) d.get(b1Var.f42600a);
            if (b1Var2 != null) {
                b1Var2.d = b1Var.d;
            } else {
                f42609c.add(b1Var);
                d.put(b1Var.f42600a, b1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new df0(12));
            AndroidUtilities.runOnUIThread(new df0(12), 1000L);
        }
    }
}
