package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.n91;
public abstract class f1 {
    public static boolean f38942a;
    public static boolean f38943b;
    public static ArrayList f38944c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f38943b) {
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
        return f38944c;
    }

    public static void b() {
        if (!f38942a && !f38943b) {
            f38942a = true;
            f38944c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new n91(5));
        }
    }

    public static void c(e1 e1Var) {
        if (e1Var != null && e1Var.d != null) {
            b();
            e1 e1Var2 = (e1) d.get(e1Var.f38936a);
            if (e1Var2 != null) {
                e1Var2.d = e1Var.d;
            } else {
                f38944c.add(e1Var);
                d.put(e1Var.f38936a, e1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new n91(4));
            AndroidUtilities.runOnUIThread(new n91(4), 1000L);
        }
    }
}
