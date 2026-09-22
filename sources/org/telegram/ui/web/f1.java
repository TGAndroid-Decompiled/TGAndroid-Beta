package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.u21;
public abstract class f1 {
    public static boolean f38921a;
    public static boolean f38922b;
    public static ArrayList f38923c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f38922b) {
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
        return f38923c;
    }

    public static void b() {
        if (!f38921a && !f38922b) {
            f38921a = true;
            f38923c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new u21(7));
        }
    }

    public static void c(e1 e1Var) {
        if (e1Var != null && e1Var.d != null) {
            b();
            e1 e1Var2 = (e1) d.get(e1Var.f38912a);
            if (e1Var2 != null) {
                e1Var2.d = e1Var.d;
            } else {
                f38923c.add(e1Var);
                d.put(e1Var.f38912a, e1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new u21(6));
            AndroidUtilities.runOnUIThread(new u21(6), 1000L);
        }
    }
}
