package vh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.dx0;
public final class s1 extends q1 {
    public sg.f0 f51919i;
    public sg.f0 f51920j;
    public int f51921k;
    public final org.telegram.ui.Components.t5 f51922l;
    public Timer f51923m;
    public final th.u6 f51924n;
    public final ArrayList f51925o;
    public final org.telegram.ui.ActionBar.f5 f51926p;

    public s1(org.telegram.ui.ActionBar.f5 f5Var) {
        super(f5Var);
        this.f51926p = f5Var;
        this.f51919i = new sg.f0(f5Var);
        this.f51920j = new sg.f0(f5Var);
        this.f51922l = new org.telegram.ui.Components.t5(f5Var);
        this.f51924n = new th.u6(f5Var);
        this.f51925o = new ArrayList();
        this.f51796a = 3;
        this.f51797b = org.telegram.messenger.i0.L(44.0f);
        this.f51798c = org.telegram.messenger.i0.L(36.0f);
        int i10 = u1.f52000y1;
        ArrayList arrayList = vi.b0(((u1) f5Var.h).f21584a).h;
        for (int i11 = 0; i11 < Math.min(arrayList.size(), 8); i11++) {
            this.f51925o.add(sg.o0.c((TLRPC.TL_availableReaction) arrayList.get(i11)));
        }
        Collections.sort(this.f51925o, new dx0(25));
        if (!this.f51925o.isEmpty()) {
            this.f51919i.e((sg.o0) this.f51925o.get(this.f51921k));
        }
        this.f51922l.e(true, 1.0f);
    }

    @Override
    public final void a(Canvas canvas, float f7, float f10) {
        float L = f10 - org.telegram.messenger.i0.L(4.0f);
        float f11 = this.f51797b;
        RectF rectF = this.f51799f;
        rectF.set((int) f7, (int) L, (int) (f7 + f11), (int) (L + f11));
        float a2 = this.f51800g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        th.u6 u6Var = this.f51924n;
        u6Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        u6Var.draw(canvas);
        Rect rect = org.telegram.messenger.i0.Q;
        float L2 = org.telegram.messenger.i0.L(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - L2), (int) (rectF.centerY() - L2), (int) (rectF.centerX() + L2), (int) (rectF.centerY() + L2));
        float e = this.f51922l.e(false, 1.0f);
        this.f51920j.c(rect);
        this.f51919i.c(rect);
        if (e == 1.0f) {
            this.f51919i.a(canvas);
        } else {
            canvas.save();
            float f12 = 1.0f - e;
            canvas.scale(f12, f12, rectF.centerX(), rectF.top);
            sg.f0 f0Var = this.f51920j;
            f0Var.h = f12;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e, e, rectF.centerX(), rectF.bottom);
            sg.f0 f0Var2 = this.f51919i;
            f0Var2.h = e;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z10) {
        this.f51919i.b(z10);
        this.f51920j.b(z10);
        Timer timer = this.f51923m;
        if (timer != null) {
            timer.cancel();
            this.f51923m = null;
        }
        if (z10) {
            Timer timer2 = new Timer();
            this.f51923m = timer2;
            timer2.schedule(new e6.r(this, 5), 2000L, 2000L);
        }
    }
}
