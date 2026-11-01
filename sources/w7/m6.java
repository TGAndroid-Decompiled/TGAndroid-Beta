package w7;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.r20;
public abstract class m6 {
    public static boolean f52664a;
    public static boolean f52665b;
    public static ArrayList f52666c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(r20 r20Var) {
        boolean z10;
        if (r20Var != null && !f52665b) {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(r20Var);
            z10 = true;
        } else {
            z10 = false;
        }
        b();
        if (z10) {
            return null;
        }
        return f52666c;
    }

    public static void b() {
        if (!f52664a && !f52665b) {
            f52664a = true;
            f52666c = new ArrayList();
            d = new LongSparseArray();
            Utilities.e.c(new org.telegram.ui.Components.voip.n0(24));
        }
    }

    public static void c(org.telegram.ui.web.a1 a1Var) {
        if (a1Var != null && a1Var.d != null) {
            b();
            org.telegram.ui.web.a1 a1Var2 = (org.telegram.ui.web.a1) d.get(a1Var.f42784a);
            if (a1Var2 != null) {
                a1Var2.d = a1Var.d;
            } else {
                f52666c.add(a1Var);
                d.put(a1Var.f42784a, a1Var);
            }
            org.telegram.messenger.i0.r(new org.telegram.ui.Components.voip.n0(23));
            org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.n0(23), 1000L);
        }
    }
}
