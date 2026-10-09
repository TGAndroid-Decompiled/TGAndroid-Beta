package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ug1 extends org.telegram.ui.Components.pm0 {
    public final Context f42428c;
    public final TwoStepVerificationActivity d;

    public ug1(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.f42428c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47660f == 0) {
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
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        int i12;
        int i13 = d1Var.f47660f;
        View view = d1Var.f47656a;
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
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
        int i14 = org.telegram.ui.ActionBar.i6.G6;
        caVar.setTag(Integer.valueOf(i14));
        caVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i14, false));
        i11 = twoStepVerificationActivity.changePasswordRow;
        if (i10 == i11) {
            caVar.b(LocaleController.getString(R.string.ChangePassword), true);
        } else if (i10 != twoStepVerificationActivity.O) {
            i12 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i10 == i12) {
                caVar.b(LocaleController.getString(R.string.TurnPasswordOff), true);
            } else if (i10 == twoStepVerificationActivity.R) {
                caVar.b(LocaleController.getString(R.string.ChangeRecoveryEmail), false);
            } else if (i10 == twoStepVerificationActivity.Q) {
                caVar.b(LocaleController.getString(R.string.SetRecoveryEmail), false);
            }
        } else {
            caVar.b(LocaleController.getString(R.string.SetAdditionalPassword), true);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View caVar;
        Context context = this.f42428c;
        if (i10 != 0) {
            caVar = new org.telegram.ui.Cells.e9(context);
        } else {
            caVar = new org.telegram.ui.Cells.ca(context);
            caVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false));
        }
        return new s4.d1(caVar);
    }
}
