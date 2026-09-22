package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vd implements TextView.OnEditorActionListener {
    public final int f38512a;
    public final Object f38513b;
    public final Object f38514c;

    public vd(int i10, Object obj, Object obj2) {
        this.f38512a = i10;
        this.f38513b = obj;
        this.f38514c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 T;
        int b10;
        s4.c1 T2;
        int b11;
        switch (this.f38512a) {
            case 0:
                je jeVar = (je) this.f38513b;
                za1 za1Var = (za1) this.f38514c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    rd rdVar = new rd(jeVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f31588b0 = rdVar;
                    jeVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new sd(jeVar, za1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f38513b;
                ei.u1 u1Var = (ei.u1) this.f38514c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !b2Var.isShowing()) {
                    return false;
                }
                u1Var.f(b2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.rn rnVar = (org.telegram.ui.Components.rn) this.f38514c;
                org.telegram.ui.Components.un unVar = ((org.telegram.ui.Components.sn) this.f38513b).d;
                ec1 ec1Var = unVar.f28460s;
                if (i10 == 5) {
                    View F = ec1Var.F(rnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = ec1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - unVar.f28462t0;
                    int i12 = unVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < unVar.J) {
                        unVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(rnVar.getTextView());
                        return true;
                    } else {
                        s4.c1 K = ec1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f42671a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                xv0 xv0Var = (xv0) this.f38514c;
                aw0 aw0Var = ((yv0) this.f38513b).d;
                if (i10 == 5) {
                    ec1 ec1Var2 = aw0Var.f31954c;
                    View F2 = ec1Var2.F(xv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = ec1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - aw0Var.f31967n0;
                    int i15 = aw0Var.f31982y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < aw0Var.f31966n) {
                        aw0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(xv0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 K2 = aw0Var.f31954c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f42671a;
                        if (!(view2 instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
