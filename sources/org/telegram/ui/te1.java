package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class te1 extends AnimatorListenerAdapter {
    public final int f42974a;
    public final Object f42975b;

    public te1(Object obj, int i9) {
        this.f42974a = i9;
        this.f42975b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42974a) {
            case 6:
                ((r0.n0) this.f42975b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f42974a) {
            case 0:
                super.onAnimationEnd(animator);
                ((ue1) this.f42975b).setScrollEnabled(true);
                return;
            case 1:
                zf1 zf1Var = (zf1) this.f42975b;
                if (animator.equals(zf1Var.f45137e.G)) {
                    zf1Var.f45137e.G = null;
                    return;
                }
                return;
            case 2:
                qg1 qg1Var = (qg1) this.f42975b;
                qg1Var.d = null;
                qg1Var.f41795a = null;
                qg1Var.f41796b = false;
                qg1Var.f41799f.f36287c.setAllowDrawCursor(true);
                return;
            case 3:
                org.telegram.ui.Components.ve0 ve0Var = (org.telegram.ui.Components.ve0) this.f42975b;
                ((ii1) ve0Var.f33356b).getClass();
                ((ii1) ve0Var.f33356b).f39169c.setVisibility(4);
                return;
            case 4:
                ((org.telegram.ui.web.y0) this.f42975b).f44094s.setVisibility(8);
                return;
            case 5:
                super.onAnimationEnd(animator);
                qf.g gVar = (qf.g) this.f42975b;
                if (!gVar.f46206e1) {
                    gVar.f46220q0 = false;
                    gVar.f46219p0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f46197b0 = false;
                return;
            case 6:
                ((r0.n0) this.f42975b).c();
                return;
            case 7:
                ((sf.e) this.f42975b).h.setVisibility(8);
                return;
            case 8:
                ((CropAreaView) this.f42975b).V = null;
                return;
            case 9:
                xf.d0 d0Var = (xf.d0) this.f42975b;
                d0Var.f49189a.getPainting().c(null, d0Var.f49189a.getCurrentColor(), true, null);
                d0Var.f49204r = null;
                return;
            case 10:
                super.onAnimationEnd(animator);
                yf.k0 k0Var = (yf.k0) this.f42975b;
                ImageView imageView = k0Var.f49899c;
                k0Var.f49899c = k0Var.d;
                k0Var.d = imageView;
                imageView.bringToFront();
                k0Var.d.setVisibility(8);
                k0Var.h = null;
                return;
            case 11:
                yf.r1 r1Var = (yf.r1) this.f42975b;
                if (animator == r1Var.f50095r) {
                    r1Var.f50093f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.f50095r = null;
                    return;
                }
                return;
            case 12:
                zf.p0 p0Var = (zf.p0) this.f42975b;
                if (p0Var.h) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                p0Var.f50650n = f10;
                p0Var.e();
                return;
            default:
                zf.z1 z1Var = (zf.z1) ((kh.d0) this.f42975b).f15078b;
                z1Var.B = true;
                z1Var.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42974a) {
            case 6:
                ((r0.n0) this.f42975b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public te1(r0.n0 n0Var, View view) {
        this.f42974a = 6;
        this.f42975b = n0Var;
    }
}
