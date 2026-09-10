package yg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.nk0;
public final class l0 {
    public static l0 B;
    public static l0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f47041a;
    public final j0 f47042b;
    public final j0 f47043c;
    public final j0 d;
    public final FrameLayout e;
    public final l0 f47044f;
    public float f47045g;
    public float h;
    public final i0 f47046i;
    public WindowManager f47048k;
    public boolean f47049l;
    public float f47050m;
    public final int f47051n;
    public final long f47052o;
    public final p0 f47053p;
    public float f47054q;
    public float f47055r;
    public boolean f47056s;
    public final nk0 f47057t;
    public boolean f47058u;
    public final View v;
    public boolean f47059w;
    public long f47061y;
    public boolean f47062z;
    public final int[] f47047j = new int[2];
    public final ArrayList f47060x = new ArrayList();

    public l0(android.content.Context r32, org.telegram.ui.ActionBar.p2 r33, org.telegram.ui.Components.pk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, yg.p0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: yg.l0.<init>(android.content.Context, org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.pk0, android.view.View, android.view.View, float, float, yg.p0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        l0 l0Var;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                l0Var = B;
            } else {
                l0Var = C;
            }
            if (l0Var != null) {
                if (z10) {
                    l0Var.c();
                } else {
                    l0Var.f47049l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.p2 r14, org.telegram.ui.Components.pk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, yg.p0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: yg.l0.d(org.telegram.ui.ActionBar.p2, org.telegram.ui.Components.pk0, android.view.View, android.view.View, float, float, yg.p0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        l0 l0Var = B;
        if (l0Var != null) {
            l0Var.f47056s = true;
            l0Var.f47061y = System.currentTimeMillis();
            if (B.f47041a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        l0 l0Var2 = C;
        if (l0Var2 != null) {
            View view = l0Var2.v;
            if (view instanceof t1) {
                ((t1) view).N.b(l0Var2.f47053p);
            } else if (view instanceof w0) {
                ((w0) view).C0.b(l0Var2.f47053p);
            }
        }
    }

    public static void g() {
        l0 l0Var = C;
        if (l0Var != null && !l0Var.f47056s) {
            l0Var.f47056s = true;
            l0Var.f47061y = System.currentTimeMillis();
            if (C.f47041a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f47059w;
            i0 i0Var = this.f47046i;
            if (z10) {
                this.f47048k.removeView(i0Var);
            } else {
                AndroidUtilities.removeFromParent(i0Var);
            }
        } catch (Exception unused) {
        }
    }
}
