package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yd implements TextView.OnEditorActionListener {
    public final int f43130a;
    public final Object f43131b;
    public final Object f43132c;

    public yd(int i10, Object obj, Object obj2) {
        this.f43130a = i10;
        this.f43131b = obj;
        this.f43132c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        s4.c1 T;
        int b10;
        s4.c1 T2;
        int b11;
        switch (this.f43130a) {
            case 0:
                me meVar = (me) this.f43131b;
                va1 va1Var = (va1) this.f43132c;
                if (i10 == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    ud udVar = new ud(meVar, twoStepVerificationActivity, 1);
                    twoStepVerificationActivity.Z = 1;
                    twoStepVerificationActivity.f34564b0 = udVar;
                    meVar.J1.setLoading(true);
                    twoStepVerificationActivity.s0(new vd(meVar, va1Var, twoStepVerificationActivity, 1));
                    return true;
                }
                return false;
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f43131b;
                ei.v1 v1Var = (ei.v1) this.f43132c;
                if ((i10 != 6 && keyEvent.getKeyCode() != 66) || !b2Var.isShowing()) {
                    return false;
                }
                v1Var.g(b2Var, 0);
                return true;
            case 2:
                org.telegram.ui.Components.un unVar = (org.telegram.ui.Components.un) this.f43132c;
                org.telegram.ui.Components.xn xnVar = ((org.telegram.ui.Components.vn) this.f43131b).d;
                zb1 zb1Var = xnVar.f32937s;
                if (i10 == 5) {
                    View F = zb1Var.F(unVar);
                    if (F == null) {
                        T = null;
                    } else {
                        T = zb1Var.T(F);
                    }
                    if (T == null || (b10 = T.b()) == -1) {
                        return true;
                    }
                    int i11 = b10 - xnVar.f32939t0;
                    int i12 = xnVar.M;
                    int i13 = i12 - 1;
                    if (i11 == i13 && i12 < xnVar.J) {
                        xnVar.N();
                        return true;
                    } else if (i11 == i13) {
                        AndroidUtilities.hideKeyboard(unVar.getTextView());
                        return true;
                    } else {
                        s4.c1 K = zb1Var.K(b10 + 1);
                        if (K == null) {
                            return true;
                        }
                        View view = K.f46524a;
                        if (!(view instanceof org.telegram.ui.Cells.d6)) {
                            return true;
                        }
                        ((org.telegram.ui.Cells.d6) view).getTextView().requestFocus();
                        return true;
                    }
                }
                return false;
            default:
                rv0 rv0Var = (rv0) this.f43132c;
                uv0 uv0Var = ((sv0) this.f43131b).d;
                if (i10 == 5) {
                    zb1 zb1Var2 = uv0Var.f41328c;
                    View F2 = zb1Var2.F(rv0Var);
                    if (F2 == null) {
                        T2 = null;
                    } else {
                        T2 = zb1Var2.T(F2);
                    }
                    if (T2 == null || (b11 = T2.b()) == -1) {
                        return true;
                    }
                    int i14 = b11 - uv0Var.f41342n0;
                    int i15 = uv0Var.f41357y;
                    int i16 = i15 - 1;
                    if (i14 == i16 && i15 < uv0Var.f41341n) {
                        uv0Var.f0();
                        return true;
                    } else if (i14 == i16) {
                        AndroidUtilities.hideKeyboard(rv0Var.getTextView());
                        return true;
                    } else {
                        s4.c1 K2 = uv0Var.f41328c.K(b11 + 1);
                        if (K2 == null) {
                            return true;
                        }
                        View view2 = K2.f46524a;
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
