package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tg1 extends org.telegram.ui.Components.kl0 {
    public final Context f40750c;
    public final TwoStepVerificationActivity d;

    public tg1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f40750c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (!twoStepVerificationActivity.G && twoStepVerificationActivity.I != null) {
            return twoStepVerificationActivity.T;
        }
        return 0;
    }

    @Override
    public final int j(int i10) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i10 != twoStepVerificationActivity.P && i10 != twoStepVerificationActivity.S) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13 = c1Var.f45742f;
        View view = c1Var.f45738a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 == 1) {
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                if (i10 == twoStepVerificationActivity.P) {
                    e9Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                    return;
                } else if (i10 == twoStepVerificationActivity.S) {
                    e9Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        eaVar.setTag(Integer.valueOf(i14));
        eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            eaVar.b(LocaleController.getString(R.string.ChangePassword), true);
        } else if (i10 != twoStepVerificationActivity.O) {
            i12 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i10 == i12) {
                eaVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
            } else if (i10 == twoStepVerificationActivity.R) {
                eaVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
            } else if (i10 == twoStepVerificationActivity.Q) {
                eaVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
            }
        } else {
            eaVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View eaVar;
        Context context = this.f40750c;
        if (i10 != 0) {
            eaVar = new org.telegram.ui.Cells.e9(context);
        } else {
            eaVar = new org.telegram.ui.Cells.ea(context);
            eaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false));
        }
        return new s4.c1(eaVar);
    }
}
