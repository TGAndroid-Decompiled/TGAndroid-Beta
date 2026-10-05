package pg;

import ai.j6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.s00;
import rg.b2;
import yh.m7;
import yh.q2;
import yh.r2;
import yh.s5;
public final class d0 extends AnimatorListenerAdapter {
    public final int f44453a;
    public final Object f44454b;

    public d0(Object obj, int i10) {
        this.f44453a = i10;
        this.f44454b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f44453a) {
            case 3:
                ((r0.m0) this.f44454b).a();
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
        switch (this.f44453a) {
            case 0:
                e0 e0Var = (e0) this.f44454b;
                e0Var.f44466a.getPainting().c(null, e0Var.f44466a.getCurrentColor(), true, null);
                e0Var.f44481r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) this.f44454b;
                ImageView imageView = l0Var.f45141c;
                l0Var.f45141c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                return;
            case 2:
                qg.r1 r1Var = (qg.r1) this.f44454b;
                if (animator == r1Var.f45330r) {
                    r1Var.f45328f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f45330r = null;
                    return;
                }
                return;
            case 3:
                ((r0.m0) this.f44454b).c();
                return;
            case 4:
                rg.q0 q0Var = (rg.q0) this.f44454b;
                if (q0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                q0Var.f46265n = f7;
                q0Var.e();
                return;
            case 5:
                b2 b2Var = (b2) ((ci.c0) this.f44454b).f4797b;
                b2Var.F = true;
                b2Var.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((j6) this.f44454b).f1117b;
                eVar.f46827b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 7:
                tg.b bVar = (tg.b) this.f44454b;
                bVar.f46992b = 1.0f;
                bVar.invalidate();
                return;
            case 8:
                vh.g gVar = (vh.g) this.f44454b;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f48400c.size() < gVar.d) {
                        gVar.f48400c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f48412q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f48412q = null;
                }
                gVar.f48413r = null;
                gVar.invalidateSelf();
                return;
            case 9:
                ((xh.h0) this.f44454b).f49983b.f50044w.setVisibility(8);
                return;
            case 10:
                r2 r2Var = (r2) this.f44454b;
                r2Var.E = 1.0f;
                r2Var.F = -1;
                q2 q2Var = r2Var.H;
                if (q2Var != null && (z10 = q2Var.f51862l) && z10) {
                    q2Var.f51862l = false;
                    q2Var.b();
                }
                r2Var.G = null;
                return;
            case 11:
                s00 s00Var = ((m7) this.f44454b).f51658c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 12:
                ((s5) this.f44454b).run();
                return;
            case 13:
                ((zg.o) this.f44454b).v.setVisibility(4);
                return;
            case 14:
                zg.r rVar = (zg.r) this.f44454b;
                rVar.setVisibility(8);
                zg.q qVar = rVar.f53516b;
                if (qVar != null) {
                    rVar.removeView(qVar);
                    rVar.f53516b = null;
                }
                rVar.f53518e = null;
                return;
            default:
                ((zg.f0) this.f44454b).f53390x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f44453a) {
            case 3:
                ((r0.m0) this.f44454b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.f44453a = 3;
        this.f44454b = m0Var;
    }
}
