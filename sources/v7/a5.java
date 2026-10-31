package v7;

import org.telegram.ui.Components.dl0;
public abstract class a5 {
    public static void a(dl0 dl0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        boolean q6;
        if (p6Var != null) {
            q6 = p6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.t6.I.q();
        }
        dl0Var.r(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var), q6);
    }

    public static int b(bi.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f2819c);
        if (max > 0) {
            i10 = org.telegram.messenger.i0.L(i0.a.e(max, 1, 24, 28));
        }
        return c10 + i10;
    }

    public static int c(bi.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f2824k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.i0.L(i0.a.e(size, 1, 16, 12));
    }

    public static int d(bi.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f2824k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return org.telegram.messenger.i0.L(i0.a.e(size, 1, 16, 8));
    }
}
