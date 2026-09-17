package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wd implements TextView.OnEditorActionListener {
    public final int f41936a;
    public final Object f41937b;
    public final Object f41938c;

    public wd(int i10, Object obj, Object obj2) {
        this.f41936a = i10;
        this.f41937b = obj;
        this.f41938c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 T;
        int b10;
        s4.c1 T2;
        int b11;
        switch (this.f41936a) {
            case 0:
                ke keVar = (ke) this.f41937b;
                bb1 bb1Var = (bb1) this.f41938c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f34246b0 = sdVar;
                    keVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(keVar, bb1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f41937b;
                fi.u1 u1Var = (fi.u1) this.f41938c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !b2Var.isShowing()) {
                    return false;
                }
                u1Var.g(b2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.qn qnVar = (org.telegram.ui.Components.qn) this.f41938c;
                org.telegram.ui.Components.tn tnVar = ((org.telegram.ui.Components.rn) this.f41937b).d;
                ec1 ec1Var = tnVar.f30682s;
                if (i10 == 5) {
                    View F = ec1Var.F(qnVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = ec1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - tnVar.f30684t0;
                    int i12 = tnVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < tnVar.J) {
                        tnVar.P();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(qnVar.getTextView());
                        return true;
                    } else {
                        s4.c1 K = ec1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f45767a;
                        if (!(view instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                wv0 wv0Var = (wv0) this.f41938c;
                zv0 zv0Var = ((xv0) this.f41937b).d;
                if (i10 == 5) {
                    ec1 ec1Var2 = zv0Var.f43559c;
                    View F2 = ec1Var2.F(wv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = ec1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - zv0Var.f43573n0;
                    int i15 = zv0Var.f43588y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < zv0Var.f43572n) {
                        zv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(wv0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 K2 = zv0Var.f43559c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f45767a;
                        if (!(view2 instanceof org.telegram.ui.Cells.c6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
        }
    }
}
