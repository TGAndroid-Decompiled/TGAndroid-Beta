package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class ul0 implements r9 {
    public final wm0 f43267a;

    public ul0(wm0 wm0Var) {
        this.f43267a = wm0Var;
    }

    @Override
    public final String C0() {
        return null;
    }

    @Override
    public final void T0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        wm0 wm0Var = this.f43267a;
        if (!isEmpty) {
            wm0Var.U[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            wm0Var.U[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            wm0Var.U[2].setText(result.lastName);
        }
        int i9 = result.gender;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    wm0Var.f44198w = "female";
                    wm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                wm0Var.f44198w = "male";
                wm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            wm0Var.f44189s = str;
            String str2 = (String) wm0Var.U0.get(str);
            if (str2 != null) {
                wm0Var.U[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            wm0Var.v = str3;
            String str4 = (String) wm0Var.U0.get(str3);
            if (str4 != null) {
                wm0Var.U[6].setText(str4);
            }
        }
        int i10 = result.birthDay;
        if (i10 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            wm0Var.U[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i10), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean i1(String str, j9 j9Var) {
        return false;
    }

    @Override
    public final void K(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
