package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.n21;
public abstract class e1 {
    public static boolean f42192a;
    public static boolean f42193b;
    public static ArrayList f42194c;
    public static LongSparseArray d;
    public static ArrayList f42195e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f42193b) {
            if (f42195e == null) {
                f42195e = new ArrayList();
            }
            f42195e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f42194c;
    }

    public static void b() {
        if (!f42192a && !f42193b) {
            f42192a = true;
            f42194c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new n21(7));
        }
    }

    public static void c(d1 d1Var) {
        if (d1Var != null && d1Var.d != null) {
            b();
            d1 d1Var2 = (d1) d.get(d1Var.f42183a);
            if (d1Var2 != null) {
                d1Var2.d = d1Var.d;
            } else {
                f42194c.add(d1Var);
                d.put(d1Var.f42183a, d1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new n21(6));
            AndroidUtilities.runOnUIThread(new n21(6), 1000L);
        }
    }
}
