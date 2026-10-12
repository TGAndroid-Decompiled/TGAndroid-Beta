package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class yx extends AnimatorListenerAdapter {
    public final int f44564a;
    public final float f44565b;
    public final vy f44566c;

    public yx(vy vyVar, float f7, int i10) {
        this.f44564a = i10;
        this.f44566c = vyVar;
        this.f44565b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f44564a) {
            case 0:
                super.onAnimationEnd(animator);
                vy vyVar = this.f44566c;
                vyVar.f42986u3 = null;
                int i12 = 0;
                vyVar.O = false;
                vyVar.Q = true;
                vyVar.R = true;
                vyVar.fragmentView.invalidate();
                if (vyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                vyVar.f43002x3 = -(AndroidUtilities.dp(i10 + 48) - this.f44565b);
                vyVar.f42903e0[0].setTranslationY(0.0f);
                while (true) {
                    uy[] uyVarArr = vyVar.f42903e0;
                    if (i12 < uyVarArr.length) {
                        uy uyVar = uyVarArr[i12];
                        if (uyVar != null) {
                            uyVar.f42611a.requestLayout();
                        }
                        i12++;
                    } else {
                        vyVar.fragmentView.requestLayout();
                        ly lyVar = vyVar.X;
                        if (lyVar != null && vyVar.f42885b.f16088f) {
                            lyVar.f31362r.requestFocus();
                            AndroidUtilities.showKeyboard(vyVar.X.f31362r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                vy vyVar2 = this.f44566c;
                vyVar2.f42986u3 = null;
                vyVar2.P = 0;
                vyVar2.O = true;
                if (vyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                vyVar2.f43002x3 = AndroidUtilities.dp(i11 + 48) - this.f44565b;
                vyVar2.f42903e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    uy[] uyVarArr2 = vyVar2.f42903e0;
                    if (i13 < uyVarArr2.length) {
                        uy uyVar2 = uyVarArr2[i13];
                        if (uyVar2 != null) {
                            uyVar2.f42611a.requestLayout();
                        }
                        i13++;
                    } else {
                        vyVar2.E0.l(1.0f, false);
                        vyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
