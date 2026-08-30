package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class j2 extends AnimatorListenerAdapter {
    public final int f41775a;
    public final Object f41776b;

    public j2(Object obj, int i10) {
        this.f41775a = i10;
        this.f41776b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41775a) {
            case 7:
                ((r0.n0) this.f41776b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41775a) {
            case 0:
                a3 a3Var = ((k2) this.f41776b).h;
                a3Var.C.setVisibility(8);
                a3Var.d.setVisibility(8);
                return;
            case 1:
                f3 f3Var = (f3) this.f41776b;
                f3Var.f41620l0 = 1.0f;
                f3Var.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                a5 a5Var = (a5) this.f41776b;
                ImageView imageView = a5Var.f41274c;
                a5Var.f41274c = a5Var.d;
                a5Var.d = imageView;
                imageView.bringToFront();
                a5Var.d.setVisibility(8);
                a5Var.h = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((e5) this.f41776b).f41574w = null;
                return;
            case 4:
                y5 y5Var = (y5) this.f41776b;
                if (y5Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) y5Var.getParent()).removeView(y5Var);
                    return;
                }
                return;
            case 5:
                ((z7) this.f41776b).K = false;
                return;
            case 6:
                x7 x7Var = (x7) this.f41776b;
                x7Var.setTranslationY(0.0f);
                x7Var.d = null;
                return;
            case 7:
                ((r0.n0) this.f41776b).c();
                return;
            case 8:
                rh.w wVar = (rh.w) this.f41776b;
                wVar.setVisibility(8);
                wVar.f43819a = null;
                return;
            case 9:
                ((rh.q2) this.f41776b).f43710y.setVisibility(8);
                return;
            case 10:
                ((rh.o3) this.f41776b).F.setVisibility(8);
                return;
            case 11:
                super.onAnimationEnd(animator);
                vf.g gVar = (vf.g) this.f41776b;
                if (!gVar.f45719f1) {
                    gVar.f45733r0 = false;
                    gVar.f45731q0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f45711c0 = false;
                return;
            case 12:
                ((xf.e) this.f41776b).h.setVisibility(8);
                return;
            default:
                ((CropAreaView) this.f41776b).W = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41775a) {
            case 7:
                ((r0.n0) this.f41776b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public j2(r0.n0 n0Var, View view) {
        this.f41775a = 7;
        this.f41776b = n0Var;
    }
}
