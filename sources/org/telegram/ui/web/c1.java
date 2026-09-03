package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.sj0;
public abstract class c1 {
    public static boolean f42475a;
    public static boolean f42476b;
    public static ArrayList f42477c;
    public static LongSparseArray d;
    public static ArrayList f42478e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z4;
        if (callback != null && !f42476b) {
            if (f42478e == null) {
                f42478e = new ArrayList();
            }
            f42478e.add(callback);
            z4 = true;
        } else {
            z4 = false;
        }
        b();
        if (z4) {
            return null;
        }
        return f42477c;
    }

    public static void b() {
        if (!f42475a && !f42476b) {
            f42475a = true;
            f42477c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new sj0(10));
        }
    }

    public static void c(b1 b1Var) {
        if (b1Var != null && b1Var.d != null) {
            b();
            b1 b1Var2 = (b1) d.get(b1Var.f42472a);
            if (b1Var2 != null) {
                b1Var2.d = b1Var.d;
            } else {
                f42477c.add(b1Var);
                d.put(b1Var.f42472a, b1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new sj0(9));
            AndroidUtilities.runOnUIThread(new sj0(9), 1000L);
        }
    }
}
