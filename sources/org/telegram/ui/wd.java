package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wd implements TextView.OnEditorActionListener {
    public final int f43187a;
    public final Object f43188b;
    public final Object f43189c;

    public wd(int i10, Object obj, Object obj2) {
        this.f43187a = i10;
        this.f43188b = obj;
        this.f43189c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.d1 T;
        int b10;
        s4.d1 T2;
        int b11;
        switch (this.f43187a) {
            case 0:
                ke keVar = (ke) this.f43188b;
                bb1 bb1Var = (bb1) this.f43189c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    sd sdVar = new sd(keVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f34573b0 = sdVar;
                    keVar.Q0.setLoading(true);
                    twoStepVerificationActivity.s0(new td(keVar, bb1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f43188b;
                ei.u1 u1Var = (ei.u1) this.f43189c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !b2Var.isShowing()) {
                    return false;
                }
                u1Var.f(b2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.io ioVar = (org.telegram.ui.Components.io) this.f43189c;
                org.telegram.ui.Components.lo loVar = ((org.telegram.ui.Components.jo) this.f43188b).d;
                fc1 fc1Var = loVar.f28525s;
                if (i10 == 5) {
                    View F = fc1Var.F(ioVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = fc1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - loVar.f28527t0;
                    int i12 = loVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < loVar.J) {
                        loVar.S();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(ioVar.getTextView());
                        return true;
                    } else {
                        s4.d1 K = fc1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f47656a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                xv0 xv0Var = (xv0) this.f43189c;
                aw0 aw0Var = ((yv0) this.f43188b).d;
                if (i10 == 5) {
                    fc1 fc1Var2 = aw0Var.f36036c;
                    View F2 = fc1Var2.F(xv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = fc1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - aw0Var.f36050n0;
                    int i15 = aw0Var.f36065y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < aw0Var.f36049n) {
                        aw0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(xv0Var.getTextView());
                        return true;
                    } else {
                        s4.d1 K2 = aw0Var.f36036c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f47656a;
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
