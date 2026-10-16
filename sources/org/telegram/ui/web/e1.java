package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.b31;
public abstract class e1 {
    public static boolean f41031a;
    public static boolean f41032b;
    public static ArrayList f41033c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f41032b) {
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
        return f41033c;
    }

    public static void b() {
        if (!f41031a && !f41032b) {
            f41031a = true;
            f41033c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new b31(10));
        }
    }

    public static void c(d1 d1Var) {
        if (d1Var != null && d1Var.d != null) {
            b();
            d1 d1Var2 = (d1) d.get(d1Var.f41019a);
            if (d1Var2 != null) {
                d1Var2.d = d1Var.d;
            } else {
                f41033c.add(d1Var);
                d.put(d1Var.f41019a, d1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new b31(9));
            AndroidUtilities.runOnUIThread(new b31(9), 1000L);
        }
    }
}
