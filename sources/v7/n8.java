package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xm0;
public abstract class n8 {
    public static void a(xm0 xm0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        boolean q6;
        if (e6Var != null) {
            q6 = e6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.i6.I.q();
        }
        xm0Var.q(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, e6Var), q6);
    }

    public static int b(ii.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f12235c);
        if (max > 0) {
            i10 = AndroidUtilities.dp(hg.c.f(max, 1, 24, 28));
        }
        return c10 + i10;
    }

    public static int c(ii.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f12241k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hg.c.f(size, 1, 16, 12));
    }

    public static int d(ii.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f12241k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(hg.c.f(size, 1, 16, 8));
    }
}
