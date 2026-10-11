package zg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.kl0;
public final class j0 {
    public static j0 B;
    public static j0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f54639a;
    public final h0 f54640b;
    public final h0 f54641c;
    public final h0 d;
    public final FrameLayout f54642e;
    public final j0 f54643f;
    public float f54644g;
    public float h;
    public final g0 f54645i;
    public WindowManager f54647k;
    public boolean f54648l;
    public float f54649m;
    public final int f54650n;
    public final long f54651o;
    public final n0 f54652p;
    public float f54653q;
    public float f54654r;
    public boolean f54655s;
    public final kl0 f54656t;
    public boolean f54657u;
    public final View v;
    public boolean f54658w;
    public long f54660y;
    public boolean f54661z;
    public final int[] f54646j = new int[2];
    public final ArrayList f54659x = new ArrayList();

    public j0(android.content.Context r32, org.telegram.ui.ActionBar.m2 r33, org.telegram.ui.Components.ml0 r34, android.view.View r35, android.view.View r36, float r37, float r38, zg.n0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: zg.j0.<init>(android.content.Context, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.ml0, android.view.View, android.view.View, float, float, zg.n0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        j0 j0Var;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                j0Var = B;
            } else {
                j0Var = C;
            }
            if (j0Var != null) {
                if (z10) {
                    j0Var.c();
                } else {
                    j0Var.f54648l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.m2 r14, org.telegram.ui.Components.ml0 r15, android.view.View r16, android.view.View r17, float r18, float r19, zg.n0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: zg.j0.d(org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.ml0, android.view.View, android.view.View, float, float, zg.n0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        j0 j0Var = B;
        if (j0Var != null) {
            j0Var.f54655s = true;
            j0Var.f54660y = System.currentTimeMillis();
            if (B.f54639a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        j0 j0Var2 = C;
        if (j0Var2 != null) {
            View view = j0Var2.v;
            if (view instanceof u1) {
                ((u1) view).N.b(j0Var2.f54652p);
            } else if (view instanceof w0) {
                ((w0) view).E0.b(j0Var2.f54652p);
            }
        }
    }

    public static void g() {
        j0 j0Var = C;
        if (j0Var != null && !j0Var.f54655s) {
            j0Var.f54655s = true;
            j0Var.f54660y = System.currentTimeMillis();
            if (C.f54639a == 1 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                View view = C.v;
                if (view != null) {
                    view.performHapticFeedback(3);
                }
            }
        }
    }

    public final void c() {
        try {
            boolean z10 = this.f54658w;
            g0 g0Var = this.f54645i;
            if (z10) {
                this.f54647k.removeView(g0Var);
            } else {
                AndroidUtilities.removeFromParent(g0Var);
            }
        } catch (Exception unused) {
        }
    }
}
