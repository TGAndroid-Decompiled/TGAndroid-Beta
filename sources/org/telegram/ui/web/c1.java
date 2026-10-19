package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.kj0;
public abstract class c1 {
    public static boolean f42606a;
    public static boolean f42607b;
    public static ArrayList f42608c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f42607b) {
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
        return f42608c;
    }

    public static void b() {
        if (!f42606a && !f42607b) {
            f42606a = true;
            f42608c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new kj0(12));
        }
    }

    public static void c(b1 b1Var) {
        if (b1Var != null && b1Var.d != null) {
            b();
            b1 b1Var2 = (b1) d.get(b1Var.f42599a);
            if (b1Var2 != null) {
                b1Var2.d = b1Var.d;
            } else {
                f42608c.add(b1Var);
                d.put(b1Var.f42599a, b1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new kj0(11));
            AndroidUtilities.runOnUIThread(new kj0(11), 1000L);
        }
    }
}
