package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vx extends AnimatorListenerAdapter {
    public final int f41848a;
    public final float f41849b;
    public final uy f41850c;

    public vx(uy uyVar, float f7, int i10) {
        this.f41848a = i10;
        this.f41850c = uyVar;
        this.f41849b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f41848a) {
            case 0:
                super.onAnimationEnd(animator);
                uy uyVar = this.f41850c;
                uyVar.f41476u3 = null;
                int i12 = 0;
                uyVar.O = false;
                uyVar.Q = true;
                uyVar.R = true;
                uyVar.fragmentView.invalidate();
                if (uyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                uyVar.f41491x3 = -(AndroidUtilities.dp(i10 + 48) - this.f41849b);
                uyVar.f41393e0[0].setTranslationY(0.0f);
                while (true) {
                    ty[] tyVarArr = uyVar.f41393e0;
                    if (i12 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i12];
                        if (tyVar != null) {
                            tyVar.f40984a.requestLayout();
                        }
                        i12++;
                    } else {
                        uyVar.fragmentView.requestLayout();
                        iy iyVar = uyVar.X;
                        if (iyVar != null && uyVar.f41375b.f15436f) {
                            iyVar.f26247r.requestFocus();
                            AndroidUtilities.showKeyboard(uyVar.X.f26247r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uy uyVar2 = this.f41850c;
                uyVar2.f41476u3 = null;
                uyVar2.P = 0;
                uyVar2.O = true;
                if (uyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                uyVar2.f41491x3 = AndroidUtilities.dp(i11 + 48) - this.f41849b;
                uyVar2.f41393e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ty[] tyVarArr2 = uyVar2.f41393e0;
                    if (i13 < tyVarArr2.length) {
                        ty tyVar2 = tyVarArr2[i13];
                        if (tyVar2 != null) {
                            tyVar2.f40984a.requestLayout();
                        }
                        i13++;
                    } else {
                        uyVar2.E0.l(1.0f, false);
                        uyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
