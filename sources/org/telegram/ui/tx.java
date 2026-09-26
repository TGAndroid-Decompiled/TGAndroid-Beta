package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class tx extends AnimatorListenerAdapter {
    public final int f38249a;
    public final float f38250b;
    public final qy f38251c;

    public tx(qy qyVar, float f7, int i10) {
        this.f38249a = i10;
        this.f38251c = qyVar;
        this.f38250b = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        int i11;
        switch (this.f38249a) {
            case 0:
                super.onAnimationEnd(animator);
                qy qyVar = this.f38251c;
                qyVar.f37116u3 = null;
                int i12 = 0;
                qyVar.O = false;
                qyVar.Q = true;
                qyVar.R = true;
                qyVar.fragmentView.invalidate();
                if (qyVar.K) {
                    i10 = 81;
                } else {
                    i10 = 0;
                }
                qyVar.f37132x3 = -(AndroidUtilities.dp(i10 + 48) - this.f38250b);
                qyVar.f37033e0[0].setTranslationY(0.0f);
                while (true) {
                    py[] pyVarArr = qyVar.f37033e0;
                    if (i12 < pyVarArr.length) {
                        py pyVar = pyVarArr[i12];
                        if (pyVar != null) {
                            pyVar.f36694a.requestLayout();
                        }
                        i12++;
                    } else {
                        qyVar.fragmentView.requestLayout();
                        gy gyVar = qyVar.X;
                        if (gyVar != null && qyVar.f37016b.f14201f) {
                            gyVar.f23160r.requestFocus();
                            AndroidUtilities.showKeyboard(qyVar.X.f23160r);
                            return;
                        }
                        return;
                    }
                }
                break;
            default:
                super.onAnimationEnd(animator);
                qy qyVar2 = this.f38251c;
                qyVar2.f37116u3 = null;
                qyVar2.P = 0;
                qyVar2.O = true;
                if (qyVar2.K) {
                    i11 = 81;
                } else {
                    i11 = 0;
                }
                qyVar2.f37132x3 = AndroidUtilities.dp(i11 + 48) - this.f38250b;
                qyVar2.f37033e0[0].setTranslationY(0.0f);
                int i13 = 0;
                while (true) {
                    py[] pyVarArr2 = qyVar2.f37033e0;
                    if (i13 < pyVarArr2.length) {
                        py pyVar2 = pyVarArr2[i13];
                        if (pyVar2 != null) {
                            pyVar2.f36694a.requestLayout();
                        }
                        i13++;
                    } else {
                        qyVar2.E0.l(1.0f, false);
                        qyVar2.fragmentView.requestLayout();
                        return;
                    }
                }
        }
    }
}
