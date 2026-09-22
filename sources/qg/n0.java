package qg;

import ai.k6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.s00;
import yh.l7;
public final class n0 extends AnimatorListenerAdapter {
    public final int f41472a;
    public final Object f41473b;

    public n0(Object obj, int i10) {
        this.f41472a = i10;
        this.f41473b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41472a) {
            case 2:
                ((r0.m0) this.f41473b).a();
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
        switch (this.f41472a) {
            case 0:
                super.onAnimationEnd(animator);
                o0 o0Var = (o0) this.f41473b;
                ImageView imageView = o0Var.f41498c;
                o0Var.f41498c = o0Var.d;
                o0Var.d = imageView;
                imageView.bringToFront();
                o0Var.d.setVisibility(8);
                o0Var.h = null;
                return;
            case 1:
                u1 u1Var = (u1) this.f41473b;
                if (animator == u1Var.f41665r) {
                    u1Var.f41663f = u1Var.h;
                    u1Var.h = -1;
                    u1Var.f41665r = null;
                    return;
                }
                return;
            case 2:
                ((r0.m0) this.f41473b).c();
                return;
            case 3:
                rg.p0 p0Var = (rg.p0) this.f41473b;
                if (p0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p0Var.f42421n = f7;
                p0Var.e();
                return;
            case 4:
                rg.z1 z1Var = (rg.z1) ((ci.c0) this.f41473b).f4420b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 5:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((k6) this.f41473b).f1133b;
                eVar.f42933b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 6:
                tg.b bVar = (tg.b) this.f41473b;
                bVar.f43082b = 1.0f;
                bVar.invalidate();
                return;
            case 7:
                vh.h hVar = (vh.h) this.f41473b;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (hVar.f44402c.size() < hVar.d) {
                        hVar.f44402c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = hVar.f44413q;
                if (runnable != null) {
                    runnable.run();
                    hVar.f44413q = null;
                }
                hVar.f44414r = null;
                hVar.invalidateSelf();
                return;
            case 8:
                ((xh.h0) this.f41473b).f45886b.f45934w.setVisibility(8);
                return;
            case 9:
                yh.r2 r2Var = (yh.r2) this.f41473b;
                r2Var.E = 1.0f;
                r2Var.F = -1;
                yh.q2 q2Var = r2Var.H;
                if (q2Var != null && (z10 = q2Var.f47608l) && z10) {
                    q2Var.f47608l = false;
                    q2Var.b();
                }
                r2Var.G = null;
                return;
            case 10:
                s00 s00Var = ((l7) this.f41473b).f47374c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                return;
            case 11:
                ((zg.v) this.f41473b).run();
                return;
            case 12:
                zg.t tVar = (zg.t) this.f41473b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f49162b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f49162b = null;
                }
                tVar.e = null;
                return;
            default:
                ((zg.i0) this.f41473b).f49044x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41472a) {
            case 2:
                ((r0.m0) this.f41473b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public n0(r0.m0 m0Var, View view) {
        this.f41472a = 2;
        this.f41473b = m0Var;
    }
}
