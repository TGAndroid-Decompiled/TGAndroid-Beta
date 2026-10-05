package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class vx extends AnimatorListenerAdapter {
    public final int f41853a;
    public final float f41854b;
    public final uy f41855c;

    public vx(uy uyVar, float f7, int i10) {
        this.f41853a = i10;
        this.f41855c = uyVar;
        this.f41854b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f41853a) {
            case 0:
                super.onAnimationEnd(animator);
                uy uyVar = this.f41855c;
                uyVar.f41518u3 = null;
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
                uyVar.f41533x3 = -(AndroidUtilities.dp(i10 + 48) - this.f41854b);
                uyVar.f41435e0[0].setTranslationY(0.0f);
                while (true) {
                    ty[] tyVarArr = uyVar.f41435e0;
                    if (i12 < tyVarArr.length) {
                        ty tyVar = tyVarArr[i12];
                        if (tyVar != null) {
                            tyVar.f41046a.requestLayout();
                        }
                        i12++;
                    } else {
                        uyVar.fragmentView.requestLayout();
                        iy iyVar = uyVar.X;
                        if (iyVar != null && uyVar.f41417b.f15437f) {
                            iyVar.f26295r.requestFocus();
                            AndroidUtilities.showKeyboard(uyVar.X.f26295r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                uy uyVar2 = this.f41855c;
                uyVar2.f41518u3 = null;
                uyVar2.P = 0;
                uyVar2.O = true;
                if (uyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                uyVar2.f41533x3 = AndroidUtilities.dp(i11 + 48) - this.f41854b;
                uyVar2.f41435e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    ty[] tyVarArr2 = uyVar2.f41435e0;
                    if (i13 < tyVarArr2.length) {
                        ty tyVar2 = tyVarArr2[i13];
                        if (tyVar2 != null) {
                            tyVar2.f41046a.requestLayout();
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
