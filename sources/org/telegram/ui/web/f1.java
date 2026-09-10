package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c30;
public abstract class f1 {
    public static boolean f37932a;
    public static boolean f37933b;
    public static ArrayList f37934c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f37933b) {
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
        return f37934c;
    }

    public static void b() {
        if (!f37932a && !f37933b) {
            f37932a = true;
            f37934c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new d1(0));
        }
    }

    public static void c(e1 e1Var) {
        if (e1Var != null && e1Var.d != null) {
            b();
            e1 e1Var2 = (e1) d.get(e1Var.f37926a);
            if (e1Var2 != null) {
                e1Var2.d = e1Var.d;
            } else {
                f37934c.add(e1Var);
                d.put(e1Var.f37926a, e1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new c30(29));
            AndroidUtilities.runOnUIThread(new c30(29), 1000L);
        }
    }
}
