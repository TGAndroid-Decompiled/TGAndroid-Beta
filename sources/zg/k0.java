package zg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.ok0;
public final class k0 {
    public static k0 B;
    public static k0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f49336a;
    public final i0 f49337b;
    public final i0 f49338c;
    public final i0 d;
    public final FrameLayout e;
    public final k0 f49339f;
    public float f49340g;
    public float h;
    public final h0 f49341i;
    public WindowManager f49343k;
    public boolean f49344l;
    public float f49345m;
    public final int f49346n;
    public final long f49347o;
    public final o0 f49348p;
    public float f49349q;
    public float f49350r;
    public boolean f49351s;
    public final ok0 f49352t;
    public boolean f49353u;
    public final View v;
    public boolean f49354w;
    public long f49356y;
    public boolean f49357z;
    public final int[] f49342j = new int[2];
    public final ArrayList f49355x = new ArrayList();

    public k0(android.content.Context r32, org.telegram.ui.ActionBar.m2 r33, org.telegram.ui.Components.qk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, zg.o0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: zg.k0.<init>(android.content.Context, org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.qk0, android.view.View, android.view.View, float, float, zg.o0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        k0 k0Var;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                k0Var = B;
            } else {
                k0Var = C;
            }
            if (k0Var != null) {
                if (z10) {
                    k0Var.c();
                } else {
                    k0Var.f49344l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.m2 r14, org.telegram.ui.Components.qk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, zg.o0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: zg.k0.d(org.telegram.ui.ActionBar.m2, org.telegram.ui.Components.qk0, android.view.View, android.view.View, float, float, zg.o0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        k0 k0Var = B;
        if (k0Var != null) {
            k0Var.f49351s = true;
            k0Var.f49356y = System.currentTimeMillis();
            if (B.f49336a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        k0 k0Var2 = C;
        if (k0Var2 != null) {
            View view = k0Var2.v;
            if (view instanceof u1) {
                ((u1) view).N.b(k0Var2.f49348p);
            } else if (view instanceof w0) {
                ((w0) view).C0.b(k0Var2.f49348p);
            }
        }
    }

    public static void g() {
        k0 k0Var = C;
        if (k0Var != null && !k0Var.f49351s) {
            k0Var.f49351s = true;
            k0Var.f49356y = System.currentTimeMillis();
            if (C.f49336a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f49354w;
            h0 h0Var = this.f49341i;
            if (z10) {
                this.f49343k.removeView(h0Var);
            } else {
                AndroidUtilities.removeFromParent(h0Var);
            }
        } catch (Exception unused) {
        }
    }
}
