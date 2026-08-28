package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.lj0;
public abstract class a1 {
    public static boolean f43794a;
    public static boolean f43795b;
    public static ArrayList f43796c;
    public static LongSparseArray d;
    public static ArrayList f43797e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f43795b) {
            if (f43797e == null) {
                f43797e = new ArrayList();
            }
            f43797e.add(callback);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f43796c;
    }

    public static void b() {
        if (!f43794a && !f43795b) {
            f43794a = true;
            f43796c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new lj0(10));
        }
    }

    public static void c(z0 z0Var) {
        if (z0Var != null && z0Var.d != null) {
            b();
            z0 z0Var2 = (z0) d.get(z0Var.f44112a);
            if (z0Var2 != null) {
                z0Var2.d = z0Var.d;
            } else {
                f43796c.add(z0Var);
                d.put(z0Var.f44112a, z0Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new lj0(9));
            AndroidUtilities.runOnUIThread(new lj0(9), 1000L);
        }
    }
}
