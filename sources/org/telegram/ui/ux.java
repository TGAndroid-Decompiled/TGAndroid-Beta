package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ux extends AnimatorListenerAdapter {
    public final int f38230a;
    public final float f38231b;
    public final ry f38232c;

    public ux(ry ryVar, float f7, int i10) {
        this.f38230a = i10;
        this.f38232c = ryVar;
        this.f38231b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f38230a) {
            case 0:
                super.onAnimationEnd(animator);
                ry ryVar = this.f38232c;
                ryVar.f37061u3 = null;
                int i12 = 0;
                ryVar.O = false;
                ryVar.Q = true;
                ryVar.R = true;
                ryVar.fragmentView.invalidate();
                if (ryVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                ryVar.f37077x3 = -(AndroidUtilities.dp(i10 + 48) - this.f38231b);
                ryVar.f36978e0[0].setTranslationY(0.0f);
                while (true) {
                    qy[] qyVarArr = ryVar.f36978e0;
                    if (i12 < qyVarArr.length) {
                        qy qyVar = qyVarArr[i12];
                        if (qyVar != null) {
                            qyVar.f36629a.requestLayout();
                        }
                        i12++;
                    } else {
                        ryVar.fragmentView.requestLayout();
                        hy hyVar = ryVar.X;
                        if (hyVar != null && ryVar.f36961b.f13963f) {
                            hyVar.f22890r.requestFocus();
                            AndroidUtilities.showKeyboard(ryVar.X.f22890r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                ry ryVar2 = this.f38232c;
                ryVar2.f37061u3 = null;
                ryVar2.P = 0;
                ryVar2.O = true;
                if (ryVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                ryVar2.f37077x3 = AndroidUtilities.dp(i11 + 48) - this.f38231b;
                ryVar2.f36978e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    qy[] qyVarArr2 = ryVar2.f36978e0;
                    if (i13 < qyVarArr2.length) {
                        qy qyVar2 = qyVarArr2[i13];
                        if (qyVar2 != null) {
                            qyVar2.f36629a.requestLayout();
                        }
                        i13++;
                    } else {
                        ryVar2.E0.l(1.0f, false);
                        ryVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
