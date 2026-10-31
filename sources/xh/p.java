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
    public final RectF f53947a = new RectF();
    public final t5 f53948b;
    public final t5 f53949c;
    public final t5 d;
    public final t5 e;
    public final w4 f53950f;
    public final w4 f53951g;
    public final t5 h;
    public final t5 f53952i;
    public final dc f53953j;
    public final Paint f53954k;
    public final e6 f53955l;
    public int f53956m;
    public final org.telegram.ui.Cells.y f53957n;
    public final kp f53958o;
    public final org.telegram.ui.Components.voip.g f53959p;

    public p(r rVar) {
        gr grVar = gr.h;
        this.f53948b = new t5(rVar, 0L, 320L, grVar);
        this.f53949c = new t5(rVar, 0L, 320L, grVar);
        this.d = new t5(rVar, 0L, 320L, grVar);
        this.e = new t5(rVar, 0L, 320L, grVar);
        this.f53950f = new w4(rVar, 320L, grVar, 0);
        this.f53951g = new w4(rVar, 320L, grVar, 0);
        this.h = new t5(rVar, 0L, 320L, grVar);
        this.f53952i = new t5(rVar, 0L, 320L, grVar);
        this.f53953j = new dc(rVar);
        this.f53954k = new Paint(1);
        e6 e6Var = new e6(true, false, true);
        this.f53955l = e6Var;
        org.telegram.ui.Cells.y a02 = t6.a0(0, 9, 9);
        this.f53957n = a02;
        kp kpVar = new kp(-1);
        this.f53958o = kpVar;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.f53959p = gVar;
        e6Var.f25695b = 17;
        e6Var.w(org.telegram.messenger.i0.L(14.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.M = org.telegram.messenger.i0.f16026q.x * 4;
        e6Var.q(true);
        e6Var.setCallback(rVar);
        kpVar.setCallback(rVar);
        a02.setCallback(rVar);
        gVar.f31441l = true;
        gVar.f31442m = 2.0f;
    }
}
