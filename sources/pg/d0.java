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
import yh.r5;
public final class d0 extends AnimatorListenerAdapter {
    public final int f41073a;
    public final Object f41074b;

    public d0(Object obj, int i10) {
        this.f41073a = i10;
        this.f41074b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41073a) {
            case 3:
                ((r0.m0) this.f41074b).a();
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
        switch (this.f41073a) {
            case 0:
                e0 e0Var = (e0) this.f41074b;
                e0Var.f41085a.getPainting().c(null, e0Var.f41085a.getCurrentColor(), true, null);
                e0Var.f41099r = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                qg.m0 m0Var = (qg.m0) this.f41074b;
                ImageView imageView = m0Var.f41744c;
                m0Var.f41744c = m0Var.d;
                m0Var.d = imageView;
                imageView.bringToFront();
                m0Var.d.setVisibility(8);
                m0Var.h = null;
                return;
            case 2:
                qg.s1 s1Var = (qg.s1) this.f41074b;
                if (animator == s1Var.f41909r) {
                    s1Var.f41907f = s1Var.h;
                    s1Var.h = -1;
                    s1Var.f41909r = null;
                    return;
                }
                return;
            case 3:
                ((r0.m0) this.f41074b).c();
                return;
            case 4:
                rg.p0 p0Var = (rg.p0) this.f41074b;
                if (p0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p0Var.f42695n = f7;
                p0Var.e();
                return;
            case 5:
                z1 z1Var = (z1) ((ci.c0) this.f41074b).f4429b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 6:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((j6) this.f41074b).f1032b;
                eVar.f43211b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 7:
                tg.b bVar = (tg.b) this.f41074b;
                bVar.f43364b = 1.0f;
                bVar.invalidate();
                return;
            case 8:
                vh.g gVar = (vh.g) this.f41074b;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.f44672c.size() < gVar.d) {
                        gVar.f44672c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.f44683q;
                if (runnable != null) {
                    runnable.run();
                    gVar.f44683q = null;
                }
                gVar.f44684r = null;
                gVar.invalidateSelf();
                return;
            case 9:
                ((xh.h0) this.f41074b).f46147b.f46185w.setVisibility(8);
                return;
            case 10:
                p2 p2Var = (p2) this.f41074b;
                p2Var.E = 1.0f;
                p2Var.F = -1;
                o2 o2Var = p2Var.H;
                if (o2Var != null && (z10 = o2Var.f47797l) && z10) {
                    o2Var.f47797l = false;
                    o2Var.b();
                }
                p2Var.G = null;
                return;
            case 11:
                o00 o00Var = ((k7) this.f41074b).f47612c;
                o00Var.setScaleX(1.0f);
                o00Var.setScaleY(1.0f);
                return;
            case 12:
                ((r5) this.f41074b).run();
                return;
            case 13:
                zg.t tVar = (zg.t) this.f41074b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f49429b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f49429b = null;
                }
                tVar.e = null;
                return;
            default:
                ((zg.h0) this.f41074b).f49309x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41073a) {
            case 3:
                ((r0.m0) this.f41074b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public d0(r0.m0 m0Var, View view) {
        this.f41073a = 3;
        this.f41074b = m0Var;
    }
}
