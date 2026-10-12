package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.w21;
public abstract class d1 {
    public static boolean f43228a;
    public static boolean f43229b;
    public static ArrayList f43230c;
    public static LongSparseArray d;
    public static ArrayList f43231e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f43229b) {
            if (f43231e == null) {
                f43231e = new ArrayList();
            }
            f43231e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f43230c;
    }

    public static void b() {
        if (!f43228a && !f43229b) {
            f43228a = true;
            f43230c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new w21(9));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f43218a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f43230c.add(c1Var);
                d.put(c1Var.f43218a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new w21(8));
            AndroidUtilities.runOnUIThread(new w21(8), 1000L);
        }
    }
}
