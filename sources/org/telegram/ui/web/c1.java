package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.u90;
public abstract class c1 {
    public static boolean f45205a;
    public static boolean f45206b;
    public static ArrayList f45207c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f45206b) {
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
        return f45207c;
    }

    public static void b() {
        if (!f45205a && !f45206b) {
            f45205a = true;
            f45207c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new u90(16));
        }
    }

    public static void c(b1 b1Var) {
        if (b1Var != null && b1Var.d != null) {
            b();
            b1 b1Var2 = (b1) d.get(b1Var.f45196a);
            if (b1Var2 != null) {
                b1Var2.d = b1Var.d;
            } else {
                f45207c.add(b1Var);
                d.put(b1Var.f45196a, b1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new u90(15));
            AndroidUtilities.runOnUIThread(new u90(15), 1000L);
        }
    }
}
