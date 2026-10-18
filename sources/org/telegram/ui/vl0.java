package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class vl0 implements x9 {
    public final xm0 f42221a;

    public vl0(xm0 xm0Var) {
        this.f42221a = xm0Var;
    }

    @Override
    public final void F0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        xm0 xm0Var = this.f42221a;
        if (!isEmpty) {
            xm0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            xm0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            xm0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    xm0Var.f43194w = "female";
                    xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                xm0Var.f43194w = "male";
                xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            xm0Var.f43185s = str;
            String str2 = (String) xm0Var.Y0.get(str);
            if (str2 != null) {
                xm0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            xm0Var.v = str3;
            String str4 = (String) xm0Var.Y0.get(str3);
            if (str4 != null) {
                xm0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            xm0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean U0(String str, n9 n9Var) {
        return false;
    }

    @Override
    public final String p0() {
        return null;
    }

    @Override
    public final void E(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
