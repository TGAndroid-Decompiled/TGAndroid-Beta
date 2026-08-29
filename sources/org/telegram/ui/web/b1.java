package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ef0;
public abstract class b1 {
    public static boolean f43987a;
    public static boolean f43988b;
    public static ArrayList f43989c;
    public static LongSparseArray d;
    public static ArrayList f43990e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f43988b) {
            if (f43990e == null) {
                f43990e = new ArrayList();
            }
            f43990e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f43989c;
    }

    public static void b() {
        if (!f43987a && !f43988b) {
            f43987a = true;
            f43989c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new ef0(12));
        }
    }

    public static void c(a1 a1Var) {
        if (a1Var != null && a1Var.d != null) {
            b();
            a1 a1Var2 = (a1) d.get(a1Var.f43975a);
            if (a1Var2 != null) {
                a1Var2.d = a1Var.d;
            } else {
                f43989c.add(a1Var);
                d.put(a1Var.f43975a, a1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new ef0(11));
            AndroidUtilities.runOnUIThread(new ef0(11), 1000L);
        }
    }
}
