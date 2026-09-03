package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.j21;
public abstract class e1 {
    public static boolean f39428a;
    public static boolean f39429b;
    public static ArrayList f39430c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z4;
        if (callback != null && !f39429b) {
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
        return f39430c;
    }

    public static void b() {
        if (!f39428a && !f39429b) {
            f39428a = true;
            f39430c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new j21(8));
        }
    }

    public static void c(d1 d1Var) {
        if (d1Var != null && d1Var.d != null) {
            b();
            d1 d1Var2 = (d1) d.get(d1Var.f39422a);
            if (d1Var2 != null) {
                d1Var2.d = d1Var.d;
            } else {
                f39430c.add(d1Var);
                d.put(d1Var.f39422a, d1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new j21(7));
            AndroidUtilities.runOnUIThread(new j21(7), 1000L);
        }
    }
}
