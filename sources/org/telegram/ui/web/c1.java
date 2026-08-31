package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.sj0;
public abstract class c1 {
    public static boolean f42512a;
    public static boolean f42513b;
    public static ArrayList f42514c;
    public static LongSparseArray d;
    public static ArrayList f42515e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z4;
        if (callback != null && !f42513b) {
            if (f42515e == null) {
                f42515e = new ArrayList();
            }
            f42515e.add(callback);
            z4 = true;
        } else {
            z4 = false;
        }
        b();
        if (z4) {
            return null;
        }
        return f42514c;
    }

    public static void b() {
        if (!f42512a && !f42513b) {
            f42512a = true;
            f42514c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new sj0(10));
        }
    }

    public static void c(b1 b1Var) {
        if (b1Var != null && b1Var.d != null) {
            b();
            b1 b1Var2 = (b1) d.get(b1Var.f42509a);
            if (b1Var2 != null) {
                b1Var2.d = b1Var.d;
            } else {
                f42514c.add(b1Var);
                d.put(b1Var.f42509a, b1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new sj0(9));
            AndroidUtilities.runOnUIThread(new sj0(9), 1000L);
        }
    }
}
