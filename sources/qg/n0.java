package qg;

import ai.k6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.u00;
import yh.m7;
public final class n0 extends AnimatorListenerAdapter {
    public final int f41503a;
    public final Object f41504b;

    public n0(Object obj, int i10) {
        this.f41503a = i10;
        this.f41504b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41503a) {
            case 2:
                ((r0.m0) this.f41504b).a();
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
        switch (this.f41503a) {
            case 0:
                super.onAnimationEnd(animator);
                o0 o0Var = (o0) this.f41504b;
                ImageView imageView = o0Var.f41529c;
                o0Var.f41529c = o0Var.d;
                o0Var.d = imageView;
                imageView.bringToFront();
                o0Var.d.setVisibility(8);
                o0Var.h = null;
                return;
            case 1:
                u1 u1Var = (u1) this.f41504b;
                if (animator == u1Var.f41696r) {
                    u1Var.f41694f = u1Var.h;
                    u1Var.h = -1;
                    u1Var.f41696r = null;
                    return;
                }
                return;
            case 2:
                ((r0.m0) this.f41504b).c();
                return;
            case 3:
                rg.p0 p0Var = (rg.p0) this.f41504b;
                if (p0Var.h) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                p0Var.f42452n = f7;
                p0Var.e();
                return;
            case 4:
                rg.z1 z1Var = (rg.z1) ((ci.c0) this.f41504b).f4423b;
                z1Var.F = true;
                z1Var.invalidate();
                return;
            case 5:
                super.onAnimationEnd(animator);
                sg.e eVar = (sg.e) ((k6) this.f41504b).f1136b;
                eVar.f42964b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                return;
            case 6:
                tg.b bVar = (tg.b) this.f41504b;
                bVar.f43113b = 1.0f;
                bVar.invalidate();
                return;
            case 7:
                vh.h hVar = (vh.h) this.f41504b;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (hVar.f44434c.size() < hVar.d) {
                        hVar.f44434c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = hVar.f44445q;
                if (runnable != null) {
                    runnable.run();
                    hVar.f44445q = null;
                }
                hVar.f44446r = null;
                hVar.invalidateSelf();
                return;
            case 8:
                ((xh.h0) this.f41504b).f45918b.f45966w.setVisibility(8);
                return;
            case 9:
                yh.s2 s2Var = (yh.s2) this.f41504b;
                s2Var.E = 1.0f;
                s2Var.F = -1;
                yh.r2 r2Var = s2Var.H;
                if (r2Var != null && (z10 = r2Var.f47732l) && z10) {
                    r2Var.f47732l = false;
                    r2Var.b();
                }
                s2Var.G = null;
                return;
            case 10:
                u00 u00Var = ((m7) this.f41504b).f47498c;
                u00Var.setScaleX(1.0f);
                u00Var.setScaleY(1.0f);
                return;
            case 11:
                ((zg.v) this.f41504b).run();
                return;
            case 12:
                zg.t tVar = (zg.t) this.f41504b;
                tVar.setVisibility(8);
                zg.s sVar = tVar.f49197b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.f49197b = null;
                }
                tVar.e = null;
                return;
            default:
                ((zg.i0) this.f41504b).f49079x.c();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41503a) {
            case 2:
                ((r0.m0) this.f41504b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public n0(r0.m0 m0Var, View view) {
        this.f41503a = 2;
        this.f41504b = m0Var;
    }
}
