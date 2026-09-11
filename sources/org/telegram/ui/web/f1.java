package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.q31;
public abstract class f1 {
    public static boolean f42088a;
    public static boolean f42089b;
    public static ArrayList f42090c;
    public static LongSparseArray d;
    public static ArrayList f42091e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f42089b) {
            if (f42091e == null) {
                f42091e = new ArrayList();
            }
            f42091e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f42090c;
    }

    public static void b() {
        if (!f42088a && !f42089b) {
            f42088a = true;
            f42090c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new q31(6));
        }
    }

    public static void c(e1 e1Var) {
        if (e1Var != null && e1Var.d != null) {
            b();
            e1 e1Var2 = (e1) d.get(e1Var.f42076a);
            if (e1Var2 != null) {
                e1Var2.d = e1Var.d;
            } else {
                f42090c.add(e1Var);
                d.put(e1Var.f42076a, e1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new q31(5));
            AndroidUtilities.runOnUIThread(new q31(5), 1000L);
        }
    }
}
