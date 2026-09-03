package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class i2 extends AnimatorListenerAdapter {
    public final int f45425a;
    public final Object f45426b;

    public i2(Object obj, int i10) {
        this.f45425a = i10;
        this.f45426b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45425a) {
            case 7:
                ((r0.n0) this.f45426b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45425a) {
            case 0:
                z2 z2Var = ((j2) this.f45426b).h;
                z2Var.C.setVisibility(8);
                z2Var.d.setVisibility(8);
                return;
            case 1:
                e3 e3Var = (e3) this.f45426b;
                e3Var.f45275l0 = 1.0f;
                e3Var.invalidate();
                return;
            case 2:
                super.onAnimationEnd(animator);
                y4 y4Var = (y4) this.f45426b;
                ImageView imageView = y4Var.f46367c;
                y4Var.f46367c = y4Var.d;
                y4Var.d = imageView;
                imageView.bringToFront();
                y4Var.d.setVisibility(8);
                y4Var.h = null;
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((c5) this.f45426b).f45178w = null;
                return;
            case 4:
                v5 v5Var = (v5) this.f45426b;
                if (v5Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) v5Var.getParent()).removeView(v5Var);
                    return;
                }
                return;
            case 5:
                ((w7) this.f45426b).K = false;
                return;
            case 6:
                u7 u7Var = (u7) this.f45426b;
                u7Var.setTranslationY(0.0f);
                u7Var.d = null;
                return;
            case 7:
                ((r0.n0) this.f45426b).c();
                return;
            case 8:
                sh.v vVar = (sh.v) this.f45426b;
                vVar.setVisibility(8);
                vVar.f47771a = null;
                return;
            case 9:
                ((sh.p2) this.f45426b).f47650y.setVisibility(8);
                return;
            case 10:
                ((sh.n3) this.f45426b).F.setVisibility(8);
                return;
            case 11:
                super.onAnimationEnd(animator);
                wf.g gVar = (wf.g) this.f45426b;
                if (!gVar.f49594f1) {
                    gVar.f49608r0 = false;
                    gVar.f49606q0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f49585c0 = false;
                return;
            case 12:
                ((yf.e) this.f45426b).h.setVisibility(8);
                return;
            default:
                ((CropAreaView) this.f45426b).W = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f45425a) {
            case 7:
                ((r0.n0) this.f45426b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public i2(r0.n0 n0Var, View view) {
        this.f45425a = 7;
        this.f45426b = n0Var;
    }
}
