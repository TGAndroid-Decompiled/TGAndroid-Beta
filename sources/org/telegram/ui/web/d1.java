package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.w21;
public abstract class d1 {
    public static boolean f43230a;
    public static boolean f43231b;
    public static ArrayList f43232c;
    public static LongSparseArray d;
    public static ArrayList f43233e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f43231b) {
            if (f43233e == null) {
                f43233e = new ArrayList();
            }
            f43233e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f43232c;
    }

    public static void b() {
        if (!f43230a && !f43231b) {
            f43230a = true;
            f43232c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new w21(9));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f43220a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f43232c.add(c1Var);
                d.put(c1Var.f43220a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new w21(8));
            AndroidUtilities.runOnUIThread(new w21(8), 1000L);
        }
    }
}
