package th;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.lp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.zt;
public final class u5 {
    public final int f49530a;
    public final zt f49531b;
    public final u10 f49532c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.w4 f49533f;
    public final org.telegram.ui.Components.w4 f49534g;
    public boolean h;
    public lp f49535i;
    public int f49536j;

    public u5(View view) {
        zt ztVar = new zt(1, view);
        this.f49530a = e20.f15506s0;
        this.f49531b = ztVar;
        gr grVar = gr.h;
        this.f49533f = new org.telegram.ui.Components.w4(ztVar, 350L, grVar);
        this.f49534g = new org.telegram.ui.Components.w4(ztVar, 350L, grVar);
        u10 u10Var = new u10();
        this.f49532c = u10Var;
        u10Var.f30806a = true;
        u10Var.f30807b = true;
        b(false);
        u10Var.f30808c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
        u10Var.f30808c.setStyle(Paint.Style.STROKE);
        u10Var.f30808c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i10 = this.f49536j;
        int i11 = org.telegram.ui.ActionBar.a7.f20159b;
        org.telegram.ui.Components.w4 w4Var = this.f49534g;
        org.telegram.ui.Components.w4 w4Var2 = this.f49533f;
        if (i10 != i11) {
            this.f49536j = i11;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false);
                    n10 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false);
                } else {
                    lp lpVar = this.f49535i;
                    if (lpVar != null) {
                        m10 = lpVar.m(org.telegram.ui.ActionBar.t6.I.q());
                        n10 = this.f49535i.n(org.telegram.ui.ActionBar.t6.I.q());
                    }
                }
                if (m10 != this.d || n10 != this.e) {
                    this.d = m10;
                    this.e = n10;
                    w4Var2.a(m10, true);
                    w4Var.a(n10, true);
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        int a2 = w4Var2.a(this.d, false);
        int a10 = w4Var.a(this.e, false);
        u10 u10Var = this.f49532c;
        u10Var.d(a2, a10, 0, 0);
        u10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return u10Var.f30808c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f49535i = null;
        this.f49536j = org.telegram.ui.ActionBar.a7.f20159b;
        d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false), z10);
    }

    public final void c(lp lpVar, boolean z10) {
        this.f49535i = lpVar;
        this.f49536j = org.telegram.ui.ActionBar.a7.f20159b;
        if (lpVar != null) {
            this.h = false;
            d(lpVar.m(org.telegram.ui.ActionBar.t6.I.q()), lpVar.n(org.telegram.ui.ActionBar.t6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f49533f.a(i10, true);
            this.f49534g.a(i11, true);
        }
        zt ztVar = this.f49531b;
        if (ztVar != null) {
            ztVar.run();
        }
    }
}
