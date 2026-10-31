package w7;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.q20;
public abstract class m6 {
    public static boolean f52646a;
    public static boolean f52647b;
    public static ArrayList f52648c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(q20 q20Var) {
        boolean z10;
        if (q20Var != null && !f52647b) {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(q20Var);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f52648c;
    }

    public static void b() {
        if (!f52646a && !f52647b) {
            f52646a = true;
            f52648c = new ArrayList();
            d = new LongSparseArray();
            Utilities.e.c(new org.telegram.ui.Components.voip.m0(24));
        }
    }

    public static void c(org.telegram.ui.web.a1 a1Var) {
        if (a1Var != null && a1Var.d != null) {
            b();
            org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) d.get(a1Var.f42982a);
            if (a1Var2 != null) {
                a1Var2.d = a1Var.d;
            } else {
                f52648c.add(a1Var);
                d.put(a1Var.f42982a, a1Var);
            }
            org.telegram.messenger.i0.r(new org.telegram.ui.Components.voip.m0(23));
            org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.m0(23), 1000L);
        }
    }
}
