package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class j2 extends AnimatorListenerAdapter {
    public final int f45455a;
    public final Object f45456b;

    public j2(Object obj, int i10) {
        this.f45455a = i10;
        this.f45456b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45455a) {
            case 7:
                ((r0.n0) this.f45456b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45455a) {
            case 0:
                a3 a3Var = ((k2) this.f45456b).h;
                a3Var.C.setVisibility(8);
                a3Var.d.setVisibility(8);
                return;
            case 1:
                f3 f3Var = (f3) this.f45456b;
                f3Var.f45301l0 = 1.0f;
                f3Var.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                z4 z4Var = (z4) this.f45456b;
                ImageView imageView = z4Var.f46385c;
                z4Var.f46385c = z4Var.d;
                z4Var.d = imageView;
                imageView.bringToFront();
                z4Var.d.setVisibility(8);
                z4Var.h = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((d5) this.f45456b).f45212w = null;
                return;
            case 4:
                w5 w5Var = (w5) this.f45456b;
                if (w5Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) w5Var.getParent()).removeView(w5Var);
                    return;
                }
                return;
            case 5:
                ((x7) this.f45456b).K = false;
                return;
            case 6:
                v7 v7Var = (v7) this.f45456b;
                v7Var.setTranslationY(0.0f);
                v7Var.d = null;
                return;
            case 7:
                ((r0.n0) this.f45456b).c();
                return;
            case 8:
                sh.v vVar = (sh.v) this.f45456b;
                vVar.setVisibility(8);
                vVar.f47735a = null;
                return;
            case 9:
                ((sh.p2) this.f45456b).f47614y.setVisibility(8);
                return;
            case 10:
                ((sh.n3) this.f45456b).F.setVisibility(8);
                return;
            case 11:
                super.onAnimationEnd(animator);
                wf.g gVar = (wf.g) this.f45456b;
                if (!gVar.f49558f1) {
                    gVar.f49572r0 = false;
                    gVar.f49570q0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f49549c0 = false;
                return;
            case 12:
                ((yf.e) this.f45456b).h.setVisibility(8);
                return;
            default:
                ((CropAreaView) this.f45456b).W = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45455a) {
            case 7:
                ((r0.n0) this.f45456b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j2(r0.n0 n0Var, View view) {
        this.f45455a = 7;
        this.f45456b = n0Var;
    }
}
