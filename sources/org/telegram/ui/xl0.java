package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class xl0 implements v9 {
    public final an0 f43616a;

    public xl0(an0 an0Var) {
        this.f43616a = an0Var;
    }

    @Override
    public final void F0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        an0 an0Var = this.f43616a;
        if (!isEmpty) {
            an0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            an0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            an0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    an0Var.f35750w = "female";
                    an0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                an0Var.f35750w = "male";
                an0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            an0Var.f35741s = str;
            String str2 = (String) an0Var.Y0.get(str);
            if (str2 != null) {
                an0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            an0Var.v = str3;
            String str4 = (String) an0Var.Y0.get(str3);
            if (str4 != null) {
                an0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            an0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
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
