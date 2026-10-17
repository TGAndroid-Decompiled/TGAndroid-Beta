package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ff0;
public abstract class c1 {
    public static boolean f42565a;
    public static boolean f42566b;
    public static ArrayList f42567c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f42566b) {
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
        return f42567c;
    }

    public static void b() {
        if (!f42565a && !f42566b) {
            f42565a = true;
            f42567c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new ff0(12));
        }
    }

    public static void c(b1 b1Var) {
        if (b1Var != null && b1Var.d != null) {
            b();
            b1 b1Var2 = (b1) d.get(b1Var.f42558a);
            if (b1Var2 != null) {
                b1Var2.d = b1Var.d;
            } else {
                f42567c.add(b1Var);
                d.put(b1Var.f42558a, b1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new ff0(11));
            AndroidUtilities.runOnUIThread(new ff0(11), 1000L);
        }
    }
}
