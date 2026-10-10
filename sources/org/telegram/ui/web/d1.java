package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.t21;
public abstract class d1 {
    public static boolean f43331a;
    public static boolean f43332b;
    public static ArrayList f43333c;
    public static LongSparseArray d;
    public static ArrayList f43334e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f43332b) {
            if (f43334e == null) {
                f43334e = new ArrayList();
            }
            f43334e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f43333c;
    }

    public static void b() {
        if (!f43331a && !f43332b) {
            f43331a = true;
            f43333c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new t21(9));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f43324a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f43333c.add(c1Var);
                d.put(c1Var.f43324a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new t21(8));
            AndroidUtilities.runOnUIThread(new t21(8), 1000L);
        }
    }
}
