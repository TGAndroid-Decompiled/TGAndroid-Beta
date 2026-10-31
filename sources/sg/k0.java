package sg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Components.kj0;
public final class k0 {
    public static k0 B;
    public static k0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f48365a;
    public final i0 f48366b;
    public final i0 f48367c;
    public final i0 d;
    public final FrameLayout e;
    public final k0 f48368f;
    public float f48369g;
    public float h;
    public final h0 f48370i;
    public WindowManager f48372k;
    public boolean f48373l;
    public float f48374m;
    public final int f48375n;
    public final long f48376o;
    public final o0 f48377p;
    public float f48378q;
    public float f48379r;
    public boolean f48380s;
    public final kj0 f48381t;
    public boolean f48382u;
    public final View v;
    public boolean f48383w;
    public long f48385y;
    public boolean f48386z;
    public final int[] f48371j = new int[2];
    public final ArrayList f48384x = new ArrayList();

    public k0(android.content.Context r33, org.telegram.ui.ActionBar.k2 r34, org.telegram.ui.Components.mj0 r35, android.view.View r36, android.view.View r37, float r38, float r39, sg.o0 r40, int r41, int r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: sg.k0.<init>(android.content.Context, org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.mj0, android.view.View, android.view.View, float, float, sg.o0, int, int, boolean):void");
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
                    k0Var.f48373l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.k2 r14, org.telegram.ui.Components.mj0 r15, android.view.View r16, android.view.View r17, float r18, float r19, sg.o0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: sg.k0.d(org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.mj0, android.view.View, android.view.View, float, float, sg.o0, int, int):void");
    }

    public static int e() {
        return (int) ((org.telegram.messenger.i0.L(40.0f) * 2.0f) / org.telegram.messenger.i0.f16025p);
    }

    public static void f() {
        k0 k0Var = B;
        if (k0Var != null) {
            k0Var.f48380s = true;
            k0Var.f48385y = System.currentTimeMillis();
            if (B.f48365a == 0 && System.currentTimeMillis() - E > 200) {
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
            if (view instanceof q1) {
                ((q1) view).N.b(k0Var2.f48377p);
            } else if (view instanceof s0) {
                ((s0) view).E0.b(k0Var2.f48377p);
            }
        }
    }

    public static void g() {
        k0 k0Var = C;
        if (k0Var != null && !k0Var.f48380s) {
            k0Var.f48380s = true;
            k0Var.f48385y = System.currentTimeMillis();
            if (C.f48365a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f48383w;
            h0 h0Var = this.f48370i;
            if (z10) {
                this.f48372k.removeView(h0Var);
            } else {
                org.telegram.messenger.i0.E2(h0Var);
            }
        } catch (Exception unused) {
        }
    }
}
