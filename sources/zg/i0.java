package zg;

import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.qk0;
public final class i0 {
    public static i0 B;
    public static i0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int f53407a;
    public final g0 f53408b;
    public final g0 f53409c;
    public final g0 d;
    public final FrameLayout f53410e;
    public final i0 f53411f;
    public float f53412g;
    public float h;
    public final f0 f53413i;
    public WindowManager f53415k;
    public boolean f53416l;
    public float f53417m;
    public final int f53418n;
    public final long f53419o;
    public final m0 f53420p;
    public float f53421q;
    public float f53422r;
    public boolean f53423s;
    public final qk0 f53424t;
    public boolean f53425u;
    public final View v;
    public boolean f53426w;
    public long f53428y;
    public boolean f53429z;
    public final int[] f53414j = new int[2];
    public final ArrayList f53427x = new ArrayList();

    public i0(android.content.Context r32, org.telegram.ui.ActionBar.n2 r33, org.telegram.ui.Components.sk0 r34, android.view.View r35, android.view.View r36, float r37, float r38, zg.m0 r39, int r40, int r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: zg.i0.<init>(android.content.Context, org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.sk0, android.view.View, android.view.View, float, float, zg.m0, int, int, boolean):void");
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        i0 i0Var;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                i0Var = B;
            } else {
                i0Var = C;
            }
            if (i0Var != null) {
                if (z10) {
                    i0Var.c();
                } else {
                    i0Var.f53416l = true;
                }
            }
        }
        C = null;
        B = null;
    }

    public static void d(org.telegram.ui.ActionBar.n2 r14, org.telegram.ui.Components.sk0 r15, android.view.View r16, android.view.View r17, float r18, float r19, zg.m0 r20, int r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: zg.i0.d(org.telegram.ui.ActionBar.n2, org.telegram.ui.Components.sk0, android.view.View, android.view.View, float, float, zg.m0, int, int):void");
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        i0 i0Var = B;
        if (i0Var != null) {
            i0Var.f53423s = true;
            i0Var.f53428y = System.currentTimeMillis();
            if (B.f53407a == 0 && System.currentTimeMillis() - E > 200) {
                E = System.currentTimeMillis();
                B.v.performHapticFeedback(3);
                return;
            }
            return;
        }
        g();
        i0 i0Var2 = C;
        if (i0Var2 != null) {
            View view = i0Var2.v;
            if (view instanceof u1) {
                ((u1) view).N.b(i0Var2.f53420p);
            } else if (view instanceof w0) {
                ((w0) view).C0.b(i0Var2.f53420p);
            }
        }
    }

    public static void g() {
        i0 i0Var = C;
        if (i0Var != null && !i0Var.f53423s) {
            i0Var.f53423s = true;
            i0Var.f53428y = System.currentTimeMillis();
            if (C.f53407a == 1 && System.currentTimeMillis() - E > 200) {
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
            boolean z10 = this.f53426w;
            f0 f0Var = this.f53413i;
            if (z10) {
                this.f53415k.removeView(f0Var);
            } else {
                AndroidUtilities.removeFromParent(f0Var);
            }
        } catch (Exception unused) {
        }
    }
}
