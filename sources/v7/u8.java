package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tm0;
public abstract class u8 {
    public static void a(tm0 tm0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        boolean q6;
        if (c6Var != null) {
            q6 = c6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.g6.I.q();
        }
        tm0Var.q(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var), q6);
    }

    public static int b(ji.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f13108c);
        if (max > 0) {
            i10 = AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(max, 1, 24, 28));
        }
        return c10 + i10;
    }

    public static int c(ji.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f13113k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(size, 1, 16, 12));
    }

    public static int d(ji.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f13113k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.play_billing.k3.v(size, 1, 16, 8));
    }
}
