package pg;

import ai.j6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.s00;
import rg.b2;
import yh.l7;
import yh.o2;
import yh.p2;
import yh.r5;
public final class d0 extends AnimatorListenerAdapter {
    public final int f44438a;
    public final Object f44439b;

    public d0(Object obj, int i10) {
        this.f44438a = i10;
        this.f44439b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44438a) {
            case 3:
                ((r0.m0) this.f44439b).a();
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
        switch (this.f44438a) {
            case 0:
                e0 e0Var = (e0) this.f44439b;
                e0Var.f44451a.getPainting().c(null, e0Var.f44451a.getCurrentColor(), true, null);
                e0Var.f44466r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) this.f44439b;
                ImageView imageView = l0Var.f45126c;
                l0Var.f45126c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 2:
                qg.r1 r1Var = (qg.r1) this.f44439b;
                if (animator == r1Var.f45315r) {
                    r1Var.f45313f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f45315r = null;
                    return;
                }
                return;
            case 3:
                ((r0.m0) this.f44439b).c();
                return;
            case 4:
                rg.q0 q0Var = (rg.q0) this.f44439b;
                if (q0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                q0Var.f46250n = f7;
                q0Var.e();
                return;
            case 5:
                b2 b2Var = (b2) ((ci.c0) this.f44439b).f4796b;
                b2Var.F = true;
                b2Var.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((j6) this.f44439b).f1117b;
                eVar.f46812b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 7:
                tg.b bVar = (tg.b) this.f44439b;
                bVar.f46977b = 1.0f;
                bVar.invalidate();
                return;
            case 8:
                vh.g gVar = (vh.g) this.f44439b;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f48384c.size() < gVar.d) {
                        gVar.f48384c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f48396q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f48396q = null;
                }
                gVar.f48397r = null;
                gVar.invalidateSelf();
                return;
            case 9:
                ((xh.h0) this.f44439b).f49967b.f50028w.setVisibility(8);
                return;
            case 10:
                p2 p2Var = (p2) this.f44439b;
                p2Var.E = 1.0f;
                p2Var.F = -1;
                o2 o2Var = p2Var.H;
                if (o2Var != null && (z10 = o2Var.f51741l) && z10) {
                    o2Var.f51741l = false;
                    o2Var.b();
                }
                p2Var.G = null;
                return;
            case 11:
                s00 s00Var = ((l7) this.f44439b).f51585c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 12:
                ((r5) this.f44439b).run();
                return;
            case 13:
                zg.t tVar = (zg.t) this.f44439b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f53525b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f53525b = null;
                }
                tVar.f53527e = null;
                return;
            default:
                ((zg.h0) this.f44439b).f53399x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44438a) {
            case 3:
                ((r0.m0) this.f44439b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.f44438a = 3;
        this.f44439b = m0Var;
    }
}
