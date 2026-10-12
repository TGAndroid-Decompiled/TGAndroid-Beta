package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.b31;
public abstract class d1 {
    public static boolean f41330a;
    public static boolean f41331b;
    public static ArrayList f41332c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f41331b) {
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
        return f41332c;
    }

    public static void b() {
        if (!f41330a && !f41331b) {
            f41330a = true;
            f41332c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new b31(10));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f41321a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f41332c.add(c1Var);
                d.put(c1Var.f41321a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new b31(9));
            AndroidUtilities.runOnUIThread(new b31(9), 1000L);
        }
    }
}
