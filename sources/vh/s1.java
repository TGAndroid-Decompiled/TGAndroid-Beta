package vh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ex0;
public final class s1 extends q1 {
    public sg.f0 f51906i;
    public sg.f0 f51907j;
    public int f51908k;
    public final org.telegram.ui.Components.t5 f51909l;
    public Timer f51910m;
    public final th.u6 f51911n;
    public final ArrayList f51912o;
    public final org.telegram.ui.ActionBar.f5 f51913p;

    public s1(org.telegram.ui.ActionBar.f5 f5Var) {
        super(f5Var);
        this.f51913p = f5Var;
        this.f51906i = new sg.f0(f5Var);
        this.f51907j = new sg.f0(f5Var);
        this.f51909l = new org.telegram.ui.Components.t5(f5Var);
        this.f51911n = new th.u6(f5Var);
        this.f51912o = new ArrayList();
        this.f51781a = 3;
        this.f51782b = org.telegram.messenger.i0.L(44.0f);
        this.f51783c = org.telegram.messenger.i0.L(36.0f);
        int i10 = u1.f51993y1;
        ArrayList arrayList = ui.b0(((u1) f5Var.h).f21583a).h;
        for (int i11 = 0; i11 < Math.min(arrayList.size(), 8); i11++) {
            this.f51912o.add(sg.o0.c((TLRPC.TL_availableReaction) arrayList.get(i11)));
        }
        Collections.sort(this.f51912o, new ex0(25));
        if (!this.f51912o.isEmpty()) {
            this.f51906i.e((sg.o0) this.f51912o.get(this.f51908k));
        }
        this.f51909l.e(true, 1.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float L = f10 - org.telegram.messenger.i0.L(4.0f);
        float f11 = this.f51782b;
        RectF rectF = this.f51784f;
        rectF.set((int) f7, (int) L, (int) (f7 + f11), (int) (L + f11));
        float a2 = this.f51785g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        th.u6 u6Var = this.f51911n;
        u6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        u6Var.draw(canvas);
        Rect rect = org.telegram.messenger.i0.Q;
        float L2 = org.telegram.messenger.i0.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e = this.f51909l.e(false, 1.0f);
        this.f51907j.c(rect);
        this.f51906i.c(rect);
        if (e == 1.0f) {
            this.f51906i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - e;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            sg.f0 f0Var = this.f51907j;
            f0Var.h = f12;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e, e, rectF.centerX(), rectF.bottom);
            sg.f0 f0Var2 = this.f51906i;
            f0Var2.h = e;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f51906i.b(z10);
        this.f51907j.b(z10);
        Timer timer = this.f51910m;
        if (timer != null) {
            timer.cancel();
            this.f51910m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f51910m = timer2;
            timer2.schedule(new e6.r(this, 5), 2000L, 2000L);
        }
    }
}
