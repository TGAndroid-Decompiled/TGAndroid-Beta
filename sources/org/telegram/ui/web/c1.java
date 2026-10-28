package org.telegram.ui.web;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.w90;
public abstract class c1 {
    public static boolean f44719a;
    public static boolean f44720b;
    public static ArrayList f44721c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(Utilities.Callback callback) {
        boolean z10;
        if (callback != null && !f44720b) {
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
        return f44721c;
    }

    public static void b() {
        if (!f44719a && !f44720b) {
            f44719a = true;
            f44721c = new ArrayList();
            d = new LongSparseArray();
            Utilities.globalQueue.postRunnable(new w90(17));
        }
    }

    public static void c(b1 b1Var) {
        if (b1Var != null && b1Var.d != null) {
            b();
            b1 b1Var2 = (b1) d.get(b1Var.f44710a);
            if (b1Var2 != null) {
                b1Var2.d = b1Var.d;
            } else {
                f44721c.add(b1Var);
                d.put(b1Var.f44710a, b1Var);
            }
            AndroidUtilities.cancelRunOnUIThread(new w90(16));
            AndroidUtilities.runOnUIThread(new w90(16), 1000L);
        }
    }
}
