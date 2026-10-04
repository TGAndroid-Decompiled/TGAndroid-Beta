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
import yh.p2;
import yh.q2;
import yh.r5;
public final class d0 extends AnimatorListenerAdapter {
    public final int f44446a;
    public final Object f44447b;

    public d0(Object obj, int i10) {
        this.f44446a = i10;
        this.f44447b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44446a) {
            case 3:
                ((r0.m0) this.f44447b).a();
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
        switch (this.f44446a) {
            case 0:
                e0 e0Var = (e0) this.f44447b;
                e0Var.f44459a.getPainting().c(null, e0Var.f44459a.getCurrentColor(), true, null);
                e0Var.f44474r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) this.f44447b;
                ImageView imageView = l0Var.f45134c;
                l0Var.f45134c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 2:
                qg.r1 r1Var = (qg.r1) this.f44447b;
                if (animator == r1Var.f45323r) {
                    r1Var.f45321f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f45323r = null;
                    return;
                }
                return;
            case 3:
                ((r0.m0) this.f44447b).c();
                return;
            case 4:
                rg.q0 q0Var = (rg.q0) this.f44447b;
                if (q0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                q0Var.f46258n = f7;
                q0Var.e();
                return;
            case 5:
                b2 b2Var = (b2) ((ci.c0) this.f44447b).f4797b;
                b2Var.F = true;
                b2Var.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((j6) this.f44447b).f1117b;
                eVar.f46820b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 7:
                tg.b bVar = (tg.b) this.f44447b;
                bVar.f46985b = 1.0f;
                bVar.invalidate();
                return;
            case 8:
                vh.g gVar = (vh.g) this.f44447b;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f48393c.size() < gVar.d) {
                        gVar.f48393c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f48405q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f48405q = null;
                }
                gVar.f48406r = null;
                gVar.invalidateSelf();
                return;
            case 9:
                ((xh.h0) this.f44447b).f49976b.f50037w.setVisibility(8);
                return;
            case 10:
                q2 q2Var = (q2) this.f44447b;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.f51798l) && z10) {
                    p2Var.f51798l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                return;
            case 11:
                s00 s00Var = ((l7) this.f44447b).f51591c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 12:
                ((r5) this.f44447b).run();
                return;
            case 13:
                zg.t tVar = (zg.t) this.f44447b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f53531b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f53531b = null;
                }
                tVar.f53533e = null;
                return;
            default:
                ((zg.h0) this.f44447b).f53405x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44446a) {
            case 3:
                ((r0.m0) this.f44447b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.f44446a = 3;
        this.f44447b = m0Var;
    }
}
