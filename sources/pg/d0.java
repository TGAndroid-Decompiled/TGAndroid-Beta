package pg;

import ai.j6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.r00;
import rg.z1;
import yh.j7;
import yh.o2;
import yh.p2;
public final class d0 extends AnimatorListenerAdapter {
    public final int f41085a;
    public final Object f41086b;

    public d0(Object obj, int i10) {
        this.f41085a = i10;
        this.f41086b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41085a) {
            case 3:
                ((r0.m0) this.f41086b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        boolean z10;
        switch (this.f41085a) {
            case 0:
                e0 e0Var = (e0) this.f41086b;
                e0Var.f41097a.getPainting().c(null, e0Var.f41097a.getCurrentColor(), true, null);
                e0Var.f41111r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) this.f41086b;
                ImageView imageView = l0Var.f41768c;
                l0Var.f41768c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 2:
                qg.r1 r1Var = (qg.r1) this.f41086b;
                if (animator == r1Var.f41949r) {
                    r1Var.f41947f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f41949r = null;
                    return;
                }
                return;
            case 3:
                ((r0.m0) this.f41086b).c();
                return;
            case 4:
                rg.p0 p0Var = (rg.p0) this.f41086b;
                if (p0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p0Var.f42754n = f7;
                p0Var.e();
                return;
            case 5:
                z1 z1Var = (z1) ((ci.c0) this.f41086b).f4437b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((j6) this.f41086b).f1034b;
                eVar.f43270b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 7:
                tg.b bVar = (tg.b) this.f41086b;
                bVar.f43423b = 1.0f;
                bVar.invalidate();
                return;
            case 8:
                vh.g gVar = (vh.g) this.f41086b;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f44732c.size() < gVar.d) {
                        gVar.f44732c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f44743q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f44743q = null;
                }
                gVar.f44744r = null;
                gVar.invalidateSelf();
                return;
            case 9:
                ((xh.h0) this.f41086b).f46226b.f46258w.setVisibility(8);
                return;
            case 10:
                p2 p2Var = (p2) this.f41086b;
                p2Var.E = 1.0f;
                p2Var.F = -1;
                o2 o2Var = p2Var.H;
                if (o2Var != null && (z10 = o2Var.f47871l) && z10) {
                    o2Var.f47871l = false;
                    o2Var.b();
                }
                p2Var.G = null;
                return;
            case 11:
                r00 r00Var = ((j7) this.f41086b).f47633c;
                r00Var.setScaleX(1.0f);
                r00Var.setScaleY(1.0f);
                return;
            case 12:
                ((zg.k) this.f41086b).run();
                return;
            case 13:
                zg.u uVar = (zg.u) this.f41086b;
                uVar.setVisibility(8);
                zg.t tVar = uVar.f49488b;
                if (tVar != null) {
                    uVar.removeView(tVar);
                    uVar.f49488b = null;
                }
                uVar.e = null;
                return;
            default:
                ((zg.i0) this.f41086b).f49367x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41085a) {
            case 3:
                ((r0.m0) this.f41086b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.f41085a = 3;
        this.f41086b = m0Var;
    }
}
