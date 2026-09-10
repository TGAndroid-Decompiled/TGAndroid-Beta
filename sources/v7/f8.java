package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cm0;
public abstract class f8 {
    public static void a(cm0 cm0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean q6;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        cm0Var.q(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), q6);
    }

    public static int b(hi.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f9422c);
        if (max > 0) {
            i10 = AndroidUtilities.dp(hc.b.B(max, 1, 24, 28));
        }
        return c10 + i10;
    }

    public static int c(hi.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f9427k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hc.b.B(size, 1, 16, 12));
    }

    public static int d(hi.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f9427k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hc.b.B(size, 1, 16, 8));
    }
}
