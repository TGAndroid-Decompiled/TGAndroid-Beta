package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.p91;
public abstract class f1 {
    public static boolean f38785a;
    public static boolean f38786b;
    public static ArrayList f38787c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f38786b) {
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
        return f38787c;
    }

    public static void b() {
        if (!f38785a && !f38786b) {
            f38785a = true;
            f38787c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new p91(5));
        }
    }

    public static void c(e1 e1Var) {
        if (e1Var != null && e1Var.d != null) {
            b();
            e1 e1Var2 = (e1) d.get(e1Var.f38779a);
            if (e1Var2 != null) {
                e1Var2.d = e1Var.d;
            } else {
                f38787c.add(e1Var);
                d.put(e1Var.f38779a, e1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new p91(4));
            AndroidUtilities.runOnUIThread(new p91(4), 1000L);
        }
    }
}
