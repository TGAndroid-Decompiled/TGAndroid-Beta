package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class yg1 extends org.telegram.ui.Components.ul0 {
    public final Context f38998c;
    public final TwoStepVerificationActivity d;

    public yg1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f38998c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
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
        int i13 = c1Var.f41613f;
        View view = c1Var.f41610a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i13 != 0) {
            if (i13 == 1) {
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                if (i10 == twoStepVerificationActivity.P) {
                    f9Var.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                    return;
                } else if (i10 == twoStepVerificationActivity.S) {
                    f9Var.setText(LocaleController.getString(R.string.EnabledPasswordText));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        gaVar.setTag(Integer.valueOf(i14));
        gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            gaVar.b(LocaleController.getString(R.string.ChangePassword), true);
        } else if (i10 != twoStepVerificationActivity.O) {
            i12 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i10 == i12) {
                gaVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
            } else if (i10 == twoStepVerificationActivity.R) {
                gaVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
            } else if (i10 == twoStepVerificationActivity.Q) {
                gaVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
            }
        } else {
            gaVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View gaVar;
        Context context = this.f38998c;
        if (i10 != 0) {
            gaVar = new org.telegram.ui.Cells.f9(context);
        } else {
            gaVar = new org.telegram.ui.Cells.ga(context);
            gaVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        }
        return new s4.c1(gaVar);
    }
}
