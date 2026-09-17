package zg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.ek0;
public final class l0 {
    public static l0 B;
    public static l0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f49090a;
    public final j0 f49091b;
    public final j0 f49092c;
    public final j0 d;
    public final FrameLayout e;
    public final l0 f49093f;
    public float f49094g;
    public float h;
    public final i0 f49095i;
    public WindowManager f49097k;
    public boolean f49098l;
    public float f49099m;
    public final int f49100n;
    public final long f49101o;
    public final p0 f49102p;
    public float f49103q;
    public float f49104r;
    public boolean f49105s;
    public final ek0 f49106t;
    public boolean f49107u;
    public final View v;
    public boolean f49108w;
    public long f49110y;
    public boolean f49111z;
    public final int[] f49096j = new int[2];
    public final ArrayList f49109x = new ArrayList();

    public l0(android.content.Context r32, org.telegram.ui.ActionBar.o2 r33, org.telegram.ui.Components.gk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, zg.p0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: zg.l0.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.gk0, android.view.View, android.view.View, float, float, zg.p0, int, int, boolean):void");
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
                    l0Var.f49098l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.o2 r14, org.telegram.ui.Components.gk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, zg.p0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: zg.l0.d(org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.gk0, android.view.View, android.view.View, float, float, zg.p0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        l0 l0Var = B;
        if (l0Var != null) {
            l0Var.f49105s = true;
            l0Var.f49110y = System.currentTimeMillis();
            if (B.f49090a == 0 && System.currentTimeMillis() - E > 200) {
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
                ((t1) view).N.b(l0Var2.f49102p);
            } else if (view instanceof w0) {
                ((w0) view).C0.b(l0Var2.f49102p);
            }
        }
    }

    public static void g() {
        l0 l0Var = C;
        if (l0Var != null && !l0Var.f49105s) {
            l0Var.f49105s = true;
            l0Var.f49110y = System.currentTimeMillis();
            if (C.f49090a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f49108w;
            i0 i0Var = this.f49095i;
            if (z10) {
                this.f49097k.removeView(i0Var);
            } else {
                AndroidUtilities.removeFromParent(i0Var);
            }
        } catch (Exception unused) {
        }
    }
}
