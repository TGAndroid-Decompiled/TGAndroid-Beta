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
    public final int f49384a;
    public final j0 f49385b;
    public final j0 f49386c;
    public final j0 d;
    public final FrameLayout e;
    public final l0 f49387f;
    public float f49388g;
    public float h;
    public final i0 f49389i;
    public WindowManager f49391k;
    public boolean f49392l;
    public float f49393m;
    public final int f49394n;
    public final long f49395o;
    public final p0 f49396p;
    public float f49397q;
    public float f49398r;
    public boolean f49399s;
    public final qk0 f49400t;
    public boolean f49401u;
    public final View v;
    public boolean f49402w;
    public long f49404y;
    public boolean f49405z;
    public final int[] f49390j = new int[2];
    public final ArrayList f49403x = new ArrayList();

    public l0(android.content.Context r32, org.telegram.ui.ActionBar.o2 r33, org.telegram.ui.Components.sk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, zg.p0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: zg.l0.<init>(android.content.Context, org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.sk0, android.view.View, android.view.View, float, float, zg.p0, int, int, boolean):void");
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
                    l0Var.f49392l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.o2 r14, org.telegram.ui.Components.sk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, zg.p0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: zg.l0.d(org.telegram.ui.ActionBar.o2, org.telegram.ui.Components.sk0, android.view.View, android.view.View, float, float, zg.p0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        l0 l0Var = B;
        if (l0Var != null) {
            l0Var.f49399s = true;
            l0Var.f49404y = System.currentTimeMillis();
            if (B.f49384a == 0 && System.currentTimeMillis() - E > 200) {
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
                ((u1) view).N.b(l0Var2.f49396p);
            } else if (view instanceof w0) {
                ((w0) view).C0.b(l0Var2.f49396p);
            }
        }
    }

    public static void g() {
        l0 l0Var = C;
        if (l0Var != null && !l0Var.f49399s) {
            l0Var.f49399s = true;
            l0Var.f49404y = System.currentTimeMillis();
            if (C.f49384a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f49402w;
            i0 i0Var = this.f49389i;
            if (z10) {
                this.f49391k.removeView(i0Var);
            } else {
                AndroidUtilities.removeFromParent(i0Var);
            }
        } catch (Exception unused) {
        }
    }
}
