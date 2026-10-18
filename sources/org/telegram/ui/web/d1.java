package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.mj0;
public abstract class d1 {
    public static boolean f42571a;
    public static boolean f42572b;
    public static ArrayList f42573c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f42572b) {
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
        return f42573c;
    }

    public static void b() {
        if (!f42571a && !f42572b) {
            f42571a = true;
            f42573c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new mj0(12));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f42564a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f42573c.add(c1Var);
                d.put(c1Var.f42564a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new mj0(11));
            AndroidUtilities.runOnUIThread(new mj0(11), 1000L);
        }
    }
}
