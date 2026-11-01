package xh;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.w4;
public final class p {
    public final RectF f53966a = new RectF();
    public final t5 f53967b;
    public final t5 f53968c;
    public final t5 d;
    public final t5 e;
    public final w4 f53969f;
    public final w4 f53970g;
    public final t5 h;
    public final t5 f53971i;
    public final dc f53972j;
    public final Paint f53973k;
    public final e6 f53974l;
    public int f53975m;
    public final org.telegram.ui.Cells.y f53976n;
    public final kp f53977o;
    public final org.telegram.ui.Components.voip.g f53978p;

    public p(r rVar) {
        gr grVar = gr.h;
        this.f53967b = new t5(rVar, 0L, 320L, grVar);
        this.f53968c = new t5(rVar, 0L, 320L, grVar);
        this.d = new t5(rVar, 0L, 320L, grVar);
        this.e = new t5(rVar, 0L, 320L, grVar);
        this.f53969f = new w4(rVar, 320L, grVar, 0);
        this.f53970g = new w4(rVar, 320L, grVar, 0);
        this.h = new t5(rVar, 0L, 320L, grVar);
        this.f53971i = new t5(rVar, 0L, 320L, grVar);
        this.f53972j = new dc(rVar);
        this.f53973k = new Paint(1);
        e6 e6Var = new e6(true, false, true);
        this.f53974l = e6Var;
        org.telegram.ui.Cells.y a02 = t6.a0(0, 9, 9);
        this.f53976n = a02;
        kp kpVar = new kp(-1);
        this.f53977o = kpVar;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f53978p = gVar;
        e6Var.f25744b = 17;
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.M = org.telegram.messenger.i0.f16172q.x * 4;
        e6Var.q(true);
        e6Var.setCallback(rVar);
        kpVar.setCallback(rVar);
        a02.setCallback(rVar);
        gVar.f31499l = true;
        gVar.f31500m = 2.0f;
    }
}
