package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.n21;
public abstract class e1 {
    public static boolean f42173a;
    public static boolean f42174b;
    public static ArrayList f42175c;
    public static LongSparseArray d;
    public static ArrayList f42176e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f42174b) {
            if (f42176e == null) {
                f42176e = new ArrayList();
            }
            f42176e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f42175c;
    }

    public static void b() {
        if (!f42173a && !f42174b) {
            f42173a = true;
            f42175c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new n21(7));
        }
    }

    public static void c(d1 d1Var) {
        if (d1Var != null && d1Var.d != null) {
            b();
            d1 d1Var2 = (d1) d.get(d1Var.f42164a);
            if (d1Var2 != null) {
                d1Var2.d = d1Var.d;
            } else {
                f42175c.add(d1Var);
                d.put(d1Var.f42164a, d1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new n21(6));
            AndroidUtilities.runOnUIThread(new n21(6), 1000L);
        }
    }
}
