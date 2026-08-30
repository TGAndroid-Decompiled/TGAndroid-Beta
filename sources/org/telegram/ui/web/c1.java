package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.c21;
public abstract class c1 {
    public static boolean f39465a;
    public static boolean f39466b;
    public static ArrayList f39467c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z4;
        if (callback != null && !f39466b) {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(callback);
            z4 = true;
        } else {
            z4 = false;
        }
        b();
        if (z4) {
            return null;
        }
        return f39467c;
    }

    public static void b() {
        if (!f39465a && !f39466b) {
            f39465a = true;
            f39467c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new c21(8));
        }
    }

    public static void c(b1 b1Var) {
        if (b1Var != null && b1Var.d != null) {
            b();
            b1 b1Var2 = (b1) d.get(b1Var.f39459a);
            if (b1Var2 != null) {
                b1Var2.d = b1Var.d;
            } else {
                f39467c.add(b1Var);
                d.put(b1Var.f39459a, b1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new c21(7));
            AndroidUtilities.runOnUIThread(new c21(7), 1000L);
        }
    }
}
