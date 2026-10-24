package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.hf0;
public abstract class d1 {
    public static boolean f43081a;
    public static boolean f43082b;
    public static ArrayList f43083c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f43082b) {
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
        return f43083c;
    }

    public static void b() {
        if (!f43081a && !f43082b) {
            f43081a = true;
            f43083c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new hf0(13));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f43076a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f43083c.add(c1Var);
                d.put(c1Var.f43076a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new hf0(12));
            AndroidUtilities.runOnUIThread(new hf0(12), 1000L);
        }
    }
}
