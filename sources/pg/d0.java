package pg;

import ai.k6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.s00;
import rg.z1;
import yh.j7;
import yh.p2;
import yh.q2;
import yh.x7;
public final class d0 extends AnimatorListenerAdapter {
    public final int f41083a;
    public final Object f41084b;

    public d0(Object obj, int i10) {
        this.f41083a = i10;
        this.f41084b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41083a) {
            case 3:
                ((r0.m0) this.f41084b).a();
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
        switch (this.f41083a) {
            case 0:
                e0 e0Var = (e0) this.f41084b;
                e0Var.f41085a.getPainting().c(null, e0Var.f41085a.getCurrentColor(), true, null);
                e0Var.f41099r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) this.f41084b;
                ImageView imageView = l0Var.f41725c;
                l0Var.f41725c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 2:
                qg.r1 r1Var = (qg.r1) this.f41084b;
                if (animator == r1Var.f41889r) {
                    r1Var.f41887f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f41889r = null;
                    return;
                }
                return;
            case 3:
                ((r0.m0) this.f41084b).c();
                return;
            case 4:
                rg.p0 p0Var = (rg.p0) this.f41084b;
                if (p0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p0Var.f42679n = f7;
                p0Var.e();
                return;
            case 5:
                z1 z1Var = (z1) ((ci.c0) this.f41084b).f4423b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((k6) this.f41084b).f1136b;
                eVar.f43195b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 7:
                tg.b bVar = (tg.b) this.f41084b;
                bVar.f43348b = 1.0f;
                bVar.invalidate();
                return;
            case 8:
                vh.h hVar = (vh.h) this.f41084b;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (hVar.f44659c.size() < hVar.d) {
                        hVar.f44659c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = hVar.f44670q;
                if (runnable != null) {
                    runnable.run();
                    hVar.f44670q = null;
                }
                hVar.f44671r = null;
                hVar.invalidateSelf();
                return;
            case 9:
                ((xh.h0) this.f41084b).f46134b.f46172w.setVisibility(8);
                return;
            case 10:
                q2 q2Var = (q2) this.f41084b;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.f47846l) && z10) {
                    p2Var.f47846l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                return;
            case 11:
                s00 s00Var = ((j7) this.f41084b).f47571c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 12:
                ((x7) this.f41084b).run();
                return;
            case 13:
                zg.t tVar = (zg.t) this.f41084b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f49421b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f49421b = null;
                }
                tVar.e = null;
                return;
            default:
                ((zg.h0) this.f41084b).f49301x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41083a) {
            case 3:
                ((r0.m0) this.f41084b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.f41083a = 3;
        this.f41084b = m0Var;
    }
}
