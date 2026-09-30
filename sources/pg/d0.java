package pg;

import ai.j6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.o00;
import rg.z1;
import yh.k7;
import yh.o2;
import yh.p2;
import yh.z5;
public final class d0 extends AnimatorListenerAdapter {
    public final int f41186a;
    public final Object f41187b;

    public d0(Object obj, int i10) {
        this.f41186a = i10;
        this.f41187b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41186a) {
            case 3:
                ((r0.m0) this.f41187b).a();
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
        switch (this.f41186a) {
            case 0:
                e0 e0Var = (e0) this.f41187b;
                e0Var.f41198a.getPainting().c(null, e0Var.f41198a.getCurrentColor(), true, null);
                e0Var.f41212r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                qg.m0 m0Var = (qg.m0) this.f41187b;
                ImageView imageView = m0Var.f41859c;
                m0Var.f41859c = m0Var.d;
                m0Var.d = imageView;
                imageView.bringToFront();
                m0Var.d.setVisibility(8);
                m0Var.h = null;
                return;
            case 2:
                qg.s1 s1Var = (qg.s1) this.f41187b;
                if (animator == s1Var.f42024r) {
                    s1Var.f42022f = s1Var.h;
                    s1Var.h = -1;
                    s1Var.f42024r = null;
                    return;
                }
                return;
            case 3:
                ((r0.m0) this.f41187b).c();
                return;
            case 4:
                rg.p0 p0Var = (rg.p0) this.f41187b;
                if (p0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p0Var.f42817n = f7;
                p0Var.e();
                return;
            case 5:
                z1 z1Var = (z1) ((ci.c0) this.f41187b).f4436b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((j6) this.f41187b).f1034b;
                eVar.f43333b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 7:
                tg.b bVar = (tg.b) this.f41187b;
                bVar.f43486b = 1.0f;
                bVar.invalidate();
                return;
            case 8:
                vh.g gVar = (vh.g) this.f41187b;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f44794c.size() < gVar.d) {
                        gVar.f44794c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f44805q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f44805q = null;
                }
                gVar.f44806r = null;
                gVar.invalidateSelf();
                return;
            case 9:
                ((xh.h0) this.f41187b).f46269b.f46307w.setVisibility(8);
                return;
            case 10:
                p2 p2Var = (p2) this.f41187b;
                p2Var.E = 1.0f;
                p2Var.F = -1;
                o2 o2Var = p2Var.H;
                if (o2Var != null && (z10 = o2Var.f47916l) && z10) {
                    o2Var.f47916l = false;
                    o2Var.b();
                }
                p2Var.G = null;
                return;
            case 11:
                o00 o00Var = ((k7) this.f41187b).f47731c;
                o00Var.setScaleX(1.0f);
                o00Var.setScaleY(1.0f);
                return;
            case 12:
                ((z5) this.f41187b).run();
                return;
            case 13:
                zg.t tVar = (zg.t) this.f41187b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f49548b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f49548b = null;
                }
                tVar.e = null;
                return;
            default:
                ((zg.h0) this.f41187b).f49428x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41186a) {
            case 3:
                ((r0.m0) this.f41187b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.f41186a = 3;
        this.f41187b = m0Var;
    }
}
