package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class j2 extends AnimatorListenerAdapter {
    public final int f41808a;
    public final Object f41809b;

    public j2(Object obj, int i10) {
        this.f41808a = i10;
        this.f41809b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41808a) {
            case 7:
                ((r0.n0) this.f41809b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41808a) {
            case 0:
                a3 a3Var = ((k2) this.f41809b).h;
                a3Var.C.setVisibility(8);
                a3Var.d.setVisibility(8);
                return;
            case 1:
                f3 f3Var = (f3) this.f41809b;
                f3Var.f41665l0 = 1.0f;
                f3Var.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                a5 a5Var = (a5) this.f41809b;
                ImageView imageView = a5Var.f41301c;
                a5Var.f41301c = a5Var.d;
                a5Var.d = imageView;
                imageView.bringToFront();
                a5Var.d.setVisibility(8);
                a5Var.h = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((e5) this.f41809b).f41612w = null;
                return;
            case 4:
                x5 x5Var = (x5) this.f41809b;
                if (x5Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) x5Var.getParent()).removeView(x5Var);
                    return;
                }
                return;
            case 5:
                ((y7) this.f41809b).K = false;
                return;
            case 6:
                w7 w7Var = (w7) this.f41809b;
                w7Var.setTranslationY(0.0f);
                w7Var.d = null;
                return;
            case 7:
                ((r0.n0) this.f41809b).c();
                return;
            case 8:
                rh.v vVar = (rh.v) this.f41809b;
                vVar.setVisibility(8);
                vVar.f43871a = null;
                return;
            case 9:
                ((rh.p2) this.f41809b).f43762y.setVisibility(8);
                return;
            case 10:
                ((rh.n3) this.f41809b).F.setVisibility(8);
                return;
            case 11:
                super.onAnimationEnd(animator);
                vf.g gVar = (vf.g) this.f41809b;
                if (!gVar.f45797f1) {
                    gVar.f45811r0 = false;
                    gVar.f45809q0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f45789c0 = false;
                return;
            case 12:
                ((xf.e) this.f41809b).h.setVisibility(8);
                return;
            default:
                ((CropAreaView) this.f41809b).W = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41808a) {
            case 7:
                ((r0.n0) this.f41809b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j2(r0.n0 n0Var, View view) {
        this.f41808a = 7;
        this.f41809b = n0Var;
    }
}
