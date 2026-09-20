package pg;

import ai.k6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.s00;
import rg.z1;
import yh.k7;
import yh.p2;
import yh.q2;
import yh.s5;
public final class d0 extends AnimatorListenerAdapter {
    public final int f41124a;
    public final Object f41125b;

    public d0(Object obj, int i10) {
        this.f41124a = i10;
        this.f41125b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41124a) {
            case 3:
                ((r0.m0) this.f41125b).a();
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
        switch (this.f41124a) {
            case 0:
                e0 e0Var = (e0) this.f41125b;
                e0Var.f41126a.getPainting().c(null, e0Var.f41126a.getCurrentColor(), true, null);
                e0Var.f41140r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                qg.m0 m0Var = (qg.m0) this.f41125b;
                ImageView imageView = m0Var.f41772c;
                m0Var.f41772c = m0Var.d;
                m0Var.d = imageView;
                imageView.bringToFront();
                m0Var.d.setVisibility(8);
                m0Var.h = null;
                return;
            case 2:
                qg.s1 s1Var = (qg.s1) this.f41125b;
                if (animator == s1Var.f41937r) {
                    s1Var.f41935f = s1Var.h;
                    s1Var.h = -1;
                    s1Var.f41937r = null;
                    return;
                }
                return;
            case 3:
                ((r0.m0) this.f41125b).c();
                return;
            case 4:
                rg.p0 p0Var = (rg.p0) this.f41125b;
                if (p0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p0Var.f42723n = f7;
                p0Var.e();
                return;
            case 5:
                z1 z1Var = (z1) ((ci.c0) this.f41125b).f4424b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((k6) this.f41125b).f1136b;
                eVar.f43239b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 7:
                tg.b bVar = (tg.b) this.f41125b;
                bVar.f43392b = 1.0f;
                bVar.invalidate();
                return;
            case 8:
                vh.h hVar = (vh.h) this.f41125b;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (hVar.f44703c.size() < hVar.d) {
                        hVar.f44703c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = hVar.f44714q;
                if (runnable != null) {
                    runnable.run();
                    hVar.f44714q = null;
                }
                hVar.f44715r = null;
                hVar.invalidateSelf();
                return;
            case 9:
                ((xh.h0) this.f41125b).f46181b.f46219w.setVisibility(8);
                return;
            case 10:
                q2 q2Var = (q2) this.f41125b;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.f47889l) && z10) {
                    p2Var.f47889l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                return;
            case 11:
                s00 s00Var = ((k7) this.f41125b).f47659c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 12:
                ((s5) this.f41125b).run();
                return;
            case 13:
                zg.t tVar = (zg.t) this.f41125b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f49467b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f49467b = null;
                }
                tVar.e = null;
                return;
            default:
                ((zg.h0) this.f41125b).f49347x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41124a) {
            case 3:
                ((r0.m0) this.f41125b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.f41124a = 3;
        this.f41125b = m0Var;
    }
}
