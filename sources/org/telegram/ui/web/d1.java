package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.g91;
public abstract class d1 {
    public static boolean f38677a;
    public static boolean f38678b;
    public static ArrayList f38679c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f38678b) {
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
        return f38679c;
    }

    public static void b() {
        if (!f38677a && !f38678b) {
            f38677a = true;
            f38679c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new g91(5));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f38668a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f38679c.add(c1Var);
                d.put(c1Var.f38668a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new g91(4));
            AndroidUtilities.runOnUIThread(new g91(4), 1000L);
        }
    }
}
