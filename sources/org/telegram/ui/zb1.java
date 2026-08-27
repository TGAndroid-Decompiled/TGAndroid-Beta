package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;

public final class zb1 extends AnimatorListenerAdapter {

    public final int f45129a;

    public final Object f45130b;

    public zb1(Object obj, int i10) {
        this.f45129a = i10;
        this.f45130b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45129a) {
            case 7:
                ((r0.n0) this.f45130b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45129a) {
            case 0:
                nc1 nc1Var = ((bc1) this.f45130b).f36778a;
                if (!nc1Var.l1.a()) {
                    nc1Var.N1.setVisibility(8);
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((qd1) this.f45130b).f41638a = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((ue1) this.f45130b).setScrollEnabled(true);
                break;
            case 3:
                yf1 yf1Var = (yf1) this.f45130b;
                if (animator.equals(yf1Var.f44808e.G)) {
                    yf1Var.f44808e.G = null;
                }
                break;
            case 4:
                pg1 pg1Var = (pg1) this.f45130b;
                pg1Var.d = null;
                pg1Var.f41349a = null;
                pg1Var.f41350b = false;
                pg1Var.f41353f.f36290c.setAllowDrawCursor(true);
                break;
            case 5:
                org.telegram.ui.Components.ze0 ze0Var = (org.telegram.ui.Components.ze0) this.f45130b;
                ((hi1) ze0Var.f35231b).getClass();
                ((hi1) ze0Var.f35231b).f38843c.setVisibility(4);
                break;
            case 6:
                ((org.telegram.ui.web.z0) this.f45130b).f44081s.setVisibility(8);
                break;
            case 7:
                ((r0.n0) this.f45130b).c();
                break;
            case 8:
                super.onAnimationEnd(animator);
                rf.g gVar = (rf.g) this.f45130b;
                if (!gVar.f46965e1) {
                    gVar.f46979q0 = false;
                    gVar.f46978p0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f46956b0 = false;
                break;
            case 9:
                ((tf.e) this.f45130b).h.setVisibility(8);
                break;
            case 10:
                ((CropAreaView) this.f45130b).V = null;
                break;
            case 11:
                yf.d0 d0Var = (yf.d0) this.f45130b;
                d0Var.f49896a.getPainting().c(null, d0Var.f49896a.getCurrentColor(), true, null);
                d0Var.f49911r = null;
                break;
            case 12:
                super.onAnimationEnd(animator);
                zf.k0 k0Var = (zf.k0) this.f45130b;
                ImageView imageView = k0Var.f50478c;
                k0Var.f50478c = k0Var.d;
                k0Var.d = imageView;
                imageView.bringToFront();
                k0Var.d.setVisibility(8);
                k0Var.h = null;
                break;
            default:
                zf.r1 r1Var = (zf.r1) this.f45130b;
                if (animator == r1Var.f50690r) {
                    r1Var.f50688f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f50690r = null;
                }
                break;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45129a) {
            case 7:
                ((r0.n0) this.f45130b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public zb1(r0.n0 n0Var, View view) {
        this.f45129a = 7;
        this.f45130b = n0Var;
    }
}
