package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.l21;
public abstract class d1 {
    public static boolean f39044a;
    public static boolean f39045b;
    public static ArrayList f39046c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f39045b) {
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
        return f39046c;
    }

    public static void b() {
        if (!f39044a && !f39045b) {
            f39044a = true;
            f39046c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new l21(7));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f39038a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f39046c.add(c1Var);
                d.put(c1Var.f39038a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new l21(6));
            AndroidUtilities.runOnUIThread(new l21(6), 1000L);
        }
    }
}
