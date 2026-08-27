package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;

public final class vl0 implements s9 {

    public final xm0 f43484a;

    public vl0(xm0 xm0Var) {
        this.f43484a = xm0Var;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
        boolean zIsEmpty = TextUtils.isEmpty(result.firstName);
        xm0 xm0Var = this.f43484a;
        if (!zIsEmpty) {
            xm0Var.U[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            xm0Var.U[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            xm0Var.U[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 == 1) {
                xm0Var.f44529w = "male";
                xm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
            } else if (i10 == 2) {
                xm0Var.f44529w = "female";
                xm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            xm0Var.f44520s = str;
            String str2 = (String) xm0Var.U0.get(str);
            if (str2 != null) {
                xm0Var.U[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            xm0Var.v = str3;
            String str4 = (String) xm0Var.U0.get(str3);
            if (str4 != null) {
                xm0Var.U[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 <= 0 || result.birthMonth <= 0 || result.birthYear <= 0) {
            return;
        }
        xm0Var.U[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
    }

    @Override
    public final boolean i1(String str, k9 k9Var) {
        return false;
    }

    @Override
    public final String z0() {
        return null;
    }

    @Override
    public final void C(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
