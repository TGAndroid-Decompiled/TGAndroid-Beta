package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class xd implements TextView.OnEditorActionListener {
    public final int f38674a;
    public final Object f38675b;
    public final Object f38676c;

    public xd(int i10, Object obj, Object obj2) {
        this.f38674a = i10;
        this.f38675b = obj;
        this.f38676c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 T;
        int b10;
        s4.c1 T2;
        int b11;
        switch (this.f38674a) {
            case 0:
                le leVar = (le) this.f38675b;
                fb1 fb1Var = (fb1) this.f38676c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    td tdVar = new td(leVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f30703b0 = tdVar;
                    leVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new ud(leVar, fb1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f38675b;
                di.x1 x1Var = (di.x1) this.f38676c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !d2Var.isShowing()) {
                    return false;
                }
                x1Var.f(d2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.wn wnVar = (org.telegram.ui.Components.wn) this.f38676c;
                org.telegram.ui.Components.zn znVar = ((org.telegram.ui.Components.xn) this.f38675b).d;
                ic1 ic1Var = znVar.f29762s;
                if (i10 == 5) {
                    View F = ic1Var.F(wnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = ic1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - znVar.f29764t0;
                    int i12 = znVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < znVar.J) {
                        znVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(wnVar.getTextView());
                        return true;
                    } else {
                        s4.c1 K = ic1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f41610a;
                        if (!(view instanceof org.telegram.ui.Cells.e6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.e6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                yv0 yv0Var = (yv0) this.f38676c;
                bw0 bw0Var = ((zv0) this.f38675b).d;
                if (i10 == 5) {
                    ic1 ic1Var2 = bw0Var.f31428c;
                    View F2 = ic1Var2.F(yv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = ic1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - bw0Var.f31441n0;
                    int i15 = bw0Var.f31456y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < bw0Var.f31440n) {
                        bw0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(yv0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 K2 = bw0Var.f31428c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f41610a;
                        if (!(view2 instanceof org.telegram.ui.Cells.e6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.e6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
