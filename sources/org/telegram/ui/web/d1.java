package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.if0;
public abstract class d1 {
    public static boolean f43092a;
    public static boolean f43093b;
    public static ArrayList f43094c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f43093b) {
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
        return f43094c;
    }

    public static void b() {
        if (!f43092a && !f43093b) {
            f43092a = true;
            f43094c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new if0(13));
        }
    }

    public static void c(c1 c1Var) {
        if (c1Var != null && c1Var.d != null) {
            b();
            c1 c1Var2 = (c1) d.get(c1Var.f43087a);
            if (c1Var2 != null) {
                c1Var2.d = c1Var.d;
            } else {
                f43094c.add(c1Var);
                d.put(c1Var.f43087a, c1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new if0(12));
            AndroidUtilities.runOnUIThread(new if0(12), 1000L);
        }
    }
}
