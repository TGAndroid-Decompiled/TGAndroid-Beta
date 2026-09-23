package qg;

import ai.j6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.p00;
import yh.k7;
public final class n0 extends AnimatorListenerAdapter {
    public final int f41428a;
    public final Object f41429b;

    public n0(Object obj, int i10) {
        this.f41428a = i10;
        this.f41429b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41428a) {
            case 2:
                ((r0.m0) this.f41429b).a();
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
        switch (this.f41428a) {
            case 0:
                super.onAnimationEnd(animator);
                o0 o0Var = (o0) this.f41429b;
                ImageView imageView = o0Var.f41454c;
                o0Var.f41454c = o0Var.d;
                o0Var.d = imageView;
                imageView.bringToFront();
                o0Var.d.setVisibility(8);
                o0Var.h = null;
                return;
            case 1:
                u1 u1Var = (u1) this.f41429b;
                if (animator == u1Var.f41621r) {
                    u1Var.f41619f = u1Var.h;
                    u1Var.h = -1;
                    u1Var.f41621r = null;
                    return;
                }
                return;
            case 2:
                ((r0.m0) this.f41429b).c();
                return;
            case 3:
                rg.p0 p0Var = (rg.p0) this.f41429b;
                if (p0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p0Var.f42376n = f7;
                p0Var.e();
                return;
            case 4:
                rg.z1 z1Var = (rg.z1) ((ci.c0) this.f41429b).f4429b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 5:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((j6) this.f41429b).f1032b;
                eVar.f42889b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 6:
                tg.b bVar = (tg.b) this.f41429b;
                bVar.f43037b = 1.0f;
                bVar.invalidate();
                return;
            case 7:
                vh.h hVar = (vh.h) this.f41429b;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (hVar.f44356c.size() < hVar.d) {
                        hVar.f44356c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = hVar.f44367q;
                if (runnable != null) {
                    runnable.run();
                    hVar.f44367q = null;
                }
                hVar.f44368r = null;
                hVar.invalidateSelf();
                return;
            case 8:
                ((xh.h0) this.f41429b).f45833b.f45871w.setVisibility(8);
                return;
            case 9:
                yh.q2 q2Var = (yh.q2) this.f41429b;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                yh.p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.f47538l) && z10) {
                    p2Var.f47538l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                return;
            case 10:
                p00 p00Var = ((k7) this.f41429b).f47306c;
                p00Var.setScaleX(1.0f);
                p00Var.setScaleY(1.0f);
                return;
            case 11:
                ((zg.v) this.f41429b).run();
                return;
            case 12:
                zg.t tVar = (zg.t) this.f41429b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f49113b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f49113b = null;
                }
                tVar.e = null;
                return;
            default:
                ((zg.i0) this.f41429b).f48995x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41428a) {
            case 2:
                ((r0.m0) this.f41429b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public n0(r0.m0 m0Var, View view) {
        this.f41428a = 2;
        this.f41429b = m0Var;
    }
}
