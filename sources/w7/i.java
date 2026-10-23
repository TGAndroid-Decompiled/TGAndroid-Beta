package w7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tm0;
public abstract class i {
    public static void a(tm0 tm0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        boolean q6;
        if (g6Var != null) {
            q6 = g6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.k6.I.q();
        }
        tm0Var.r(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var), q6);
    }

    public static int b(ki.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f15142c);
        if (max > 0) {
            i10 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(max, 1, 24, 28));
        }
        return c10 + i10;
    }

    public static int c(ki.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f15147k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(size, 1, 16, 12));
    }

    public static int d(ki.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f15147k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(size, 1, 16, 8));
    }
}
