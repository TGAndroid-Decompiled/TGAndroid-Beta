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
    public final int f41136a;
    public final Object f41137b;

    public d0(Object obj, int i10) {
        this.f41136a = i10;
        this.f41137b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41136a) {
            case 3:
                ((r0.m0) this.f41137b).a();
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
        switch (this.f41136a) {
            case 0:
                e0 e0Var = (e0) this.f41137b;
                e0Var.f41148a.getPainting().c(null, e0Var.f41148a.getCurrentColor(), true, null);
                e0Var.f41162r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                qg.m0 m0Var = (qg.m0) this.f41137b;
                ImageView imageView = m0Var.f41793c;
                m0Var.f41793c = m0Var.d;
                m0Var.d = imageView;
                imageView.bringToFront();
                m0Var.d.setVisibility(8);
                m0Var.h = null;
                return;
            case 2:
                qg.s1 s1Var = (qg.s1) this.f41137b;
                if (animator == s1Var.f41958r) {
                    s1Var.f41956f = s1Var.h;
                    s1Var.h = -1;
                    s1Var.f41958r = null;
                    return;
                }
                return;
            case 3:
                ((r0.m0) this.f41137b).c();
                return;
            case 4:
                rg.p0 p0Var = (rg.p0) this.f41137b;
                if (p0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p0Var.f42744n = f7;
                p0Var.e();
                return;
            case 5:
                z1 z1Var = (z1) ((ci.c0) this.f41137b).f4422b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((k6) this.f41137b).f1133b;
                eVar.f43260b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 7:
                tg.b bVar = (tg.b) this.f41137b;
                bVar.f43413b = 1.0f;
                bVar.invalidate();
                return;
            case 8:
                vh.g gVar = (vh.g) this.f41137b;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f44724c.size() < gVar.d) {
                        gVar.f44724c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f44735q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f44735q = null;
                }
                gVar.f44736r = null;
                gVar.invalidateSelf();
                return;
            case 9:
                ((xh.h0) this.f41137b).f46202b.f46240w.setVisibility(8);
                return;
            case 10:
                q2 q2Var = (q2) this.f41137b;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.f47910l) && z10) {
                    p2Var.f47910l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                return;
            case 11:
                s00 s00Var = ((k7) this.f41137b).f47680c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 12:
                ((s5) this.f41137b).run();
                return;
            case 13:
                zg.u uVar = (zg.u) this.f41137b;
                uVar.setVisibility(8);
                zg.s sVar = uVar.f49490b;
                if (sVar != null) {
                    uVar.removeView(sVar);
                    uVar.f49490b = null;
                }
                uVar.e = null;
                return;
            default:
                ((zg.i0) this.f41137b).f49371x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41136a) {
            case 3:
                ((r0.m0) this.f41137b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.f41136a = 3;
        this.f41137b = m0Var;
    }
}
