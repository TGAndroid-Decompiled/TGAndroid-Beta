package v7;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sl0;
public abstract class c9 {
    public static t7.r f47415a;

    public static void a(sl0 sl0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        boolean q6;
        if (f6Var != null) {
            q6 = f6Var.a();
        } else {
            q6 = org.telegram.ui.ActionBar.j6.I.q();
        }
        sl0Var.q(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var), q6);
    }

    public static int b(ji.a aVar) {
        int i10 = 0;
        if (aVar == null) {
            return 0;
        }
        int c10 = c(aVar);
        int max = Math.max(0, aVar.f13733c);
        if (max > 0) {
            i10 = AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(max, 1, 24, 28));
        }
        return c10 + i10;
    }

    public static int c(ji.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f13739k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(size, 1, 16, 12));
    }

    public static int d(ji.a aVar) {
        int size;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f13739k.size();
        }
        if (size <= 0) {
            return 0;
        }
        return AndroidUtilities.dp(com.google.android.gms.internal.vision.e2.w(size, 1, 16, 8));
    }

    public static synchronized y8 e(v8 v8Var) {
        y8 y8Var;
        synchronized (c9.class) {
            try {
                if (f47415a == null) {
                    f47415a = new t7.r(1);
                }
                y8Var = (y8) f47415a.O0(v8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y8Var;
    }
}
