package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.s21;
public abstract class d1 {
    public static boolean f43509a;
    public static boolean f43510b;
    public static ArrayList f43511c;
    public static LongSparseArray d;
    public static ArrayList f43512e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f43510b) {
            if (f43512e == null) {
                f43512e = new ArrayList();
            }
            f43512e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f43511c;
    }

    public static void b() {
        if (!f43509a && !f43510b) {
            f43509a = true;
            f43511c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new s21(9));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f43499a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f43511c.add(c1Var);
                d.put(c1Var.f43499a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new s21(8));
            AndroidUtilities.runOnUIThread(new s21(8), 1000L);
        }
    }
}
