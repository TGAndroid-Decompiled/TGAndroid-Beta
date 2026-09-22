package zg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.qk0;
public final class l0 {
    public static l0 B;
    public static l0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f49387a;
    public final j0 f49388b;
    public final j0 f49389c;
    public final j0 d;
    public final FrameLayout e;
    public final l0 f49390f;
    public float f49391g;
    public float h;
    public final i0 f49392i;
    public WindowManager f49394k;
    public boolean f49395l;
    public float f49396m;
    public final int f49397n;
    public final long f49398o;
    public final p0 f49399p;
    public float f49400q;
    public float f49401r;
    public boolean f49402s;
    public final qk0 f49403t;
    public boolean f49404u;
    public final View v;
    public boolean f49405w;
    public long f49407y;
    public boolean f49408z;
    public final int[] f49393j = new int[2];
    public final ArrayList f49406x = new ArrayList();

    public l0(android.content.Context r32, org.telegram.ui.ActionBar.n2 r33, org.telegram.ui.Components.sk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, zg.p0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: zg.l0.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.sk0, android.view.View, android.view.View, float, float, zg.p0, int, int, boolean):void");
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
                    l0Var.f49395l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.n2 r14, org.telegram.ui.Components.sk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, zg.p0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: zg.l0.d(org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.sk0, android.view.View, android.view.View, float, float, zg.p0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        l0 l0Var = B;
        if (l0Var != null) {
            l0Var.f49402s = true;
            l0Var.f49407y = System.currentTimeMillis();
            if (B.f49387a == 0 && System.currentTimeMillis() - E > 200) {
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
            if (view instanceof u1) {
                ((u1) view).N.b(l0Var2.f49399p);
            } else if (view instanceof w0) {
                ((w0) view).C0.b(l0Var2.f49399p);
            }
        }
    }

    public static void g() {
        l0 l0Var = C;
        if (l0Var != null && !l0Var.f49402s) {
            l0Var.f49402s = true;
            l0Var.f49407y = System.currentTimeMillis();
            if (C.f49387a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f49405w;
            i0 i0Var = this.f49392i;
            if (z10) {
                this.f49394k.removeView(i0Var);
            } else {
                AndroidUtilities.removeFromParent(i0Var);
            }
        } catch (Exception unused) {
        }
    }
}
