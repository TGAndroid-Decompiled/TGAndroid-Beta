package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vx extends AnimatorListenerAdapter {
    public final int f41847a;
    public final float f41848b;
    public final uy f41849c;

    public vx(uy uyVar, float f7, int i10) {
        this.f41847a = i10;
        this.f41849c = uyVar;
        this.f41848b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f41847a) {
            case 0:
                super.onAnimationEnd(animator);
                uy uyVar = this.f41849c;
                uyVar.f41475u3 = null;
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
                uyVar.f41490x3 = -(AndroidUtilities.dp(i10 + 48) - this.f41848b);
                uyVar.f41392e0[0].setTranslationY(0.0f);
                while (true) {
                    ty[] tyVarArr = uyVar.f41392e0;
                    if (i12 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i12];
                        if (tyVar != null) {
                            tyVar.f40983a.requestLayout();
                        }
                        i12++;
                    } else {
                        uyVar.fragmentView.requestLayout();
                        iy iyVar = uyVar.X;
                        if (iyVar != null && uyVar.f41374b.f15435f) {
                            iyVar.f26246r.requestFocus();
                            AndroidUtilities.showKeyboard(uyVar.X.f26246r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uy uyVar2 = this.f41849c;
                uyVar2.f41475u3 = null;
                uyVar2.P = 0;
                uyVar2.O = true;
                if (uyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                uyVar2.f41490x3 = AndroidUtilities.dp(i11 + 48) - this.f41848b;
                uyVar2.f41392e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ty[] tyVarArr2 = uyVar2.f41392e0;
                    if (i13 < tyVarArr2.length) {
                        ty tyVar2 = tyVarArr2[i13];
                        if (tyVar2 != null) {
                            tyVar2.f40983a.requestLayout();
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
