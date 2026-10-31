package th;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.kp;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.u10;
import org.telegram.ui.Components.zt;
public final class u5 {
    public final int f49516a;
    public final zt f49517b;
    public final u10 f49518c;
    public int d;
    public int e;
    public final org.telegram.ui.Components.w4 f49519f;
    public final org.telegram.ui.Components.w4 f49520g;
    public boolean h;
    public kp f49521i;
    public int f49522j;

    public u5(View view) {
        zt ztVar = new zt(1, view);
        this.f49516a = d20.f15147s0;
        this.f49517b = ztVar;
        gr grVar = gr.h;
        this.f49519f = new org.telegram.ui.Components.w4(ztVar, 350L, grVar);
        this.f49520g = new org.telegram.ui.Components.w4(ztVar, 350L, grVar);
        u10 u10Var = new u10();
        this.f49518c = u10Var;
        u10Var.f30751a = true;
        u10Var.f30752b = true;
        b(false);
        u10Var.f30753c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
        u10Var.f30753c.setStyle(Paint.Style.STROKE);
        u10Var.f30753c.setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint a(RectF rectF) {
        int m10;
        int n10;
        int i10 = this.f49522j;
        int i11 = org.telegram.ui.ActionBar.a7.f20158b;
        org.telegram.ui.Components.w4 w4Var = this.f49520g;
        org.telegram.ui.Components.w4 w4Var2 = this.f49519f;
        if (i10 != i11) {
            this.f49522j = i11;
            try {
                if (this.h) {
                    m10 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false);
                    n10 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false);
                } else {
                    kp kpVar = this.f49521i;
                    if (kpVar != null) {
                        m10 = kpVar.m(org.telegram.ui.ActionBar.t6.I.q());
                        n10 = this.f49521i.n(org.telegram.ui.ActionBar.t6.I.q());
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
        u10 u10Var = this.f49518c;
        u10Var.d(a2, a10, 0, 0);
        u10Var.b(rectF.left, rectF.top, rectF.right, rectF.bottom);
        return u10Var.f30753c;
    }

    public final void b(boolean z10) {
        this.h = true;
        this.f49521i = null;
        this.f49522j = org.telegram.ui.ActionBar.a7.f20158b;
        d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false), z10);
    }

    public final void c(kp kpVar, boolean z10) {
        this.f49521i = kpVar;
        this.f49522j = org.telegram.ui.ActionBar.a7.f20158b;
        if (kpVar != null) {
            this.h = false;
            d(kpVar.m(org.telegram.ui.ActionBar.t6.I.q()), kpVar.n(org.telegram.ui.ActionBar.t6.I.q()), z10);
            return;
        }
        b(z10);
    }

    public final void d(int i10, int i11, boolean z10) {
        this.d = i10;
        this.e = i11;
        if (!z10) {
            this.f49519f.a(i10, true);
            this.f49520g.a(i11, true);
        }
        zt ztVar = this.f49517b;
        if (ztVar != null) {
            ztVar.run();
        }
    }
}
