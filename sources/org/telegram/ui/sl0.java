package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class sl0 implements q9 {
    public final vm0 f42425a;

    public sl0(vm0 vm0Var) {
        this.f42425a = vm0Var;
    }

    @Override
    public final String E0() {
        return null;
    }

    @Override
    public final void S0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        vm0 vm0Var = this.f42425a;
        if (!isEmpty) {
            vm0Var.U[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            vm0Var.U[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            vm0Var.U[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    vm0Var.f43672w = "female";
                    vm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                vm0Var.f43672w = "male";
                vm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            vm0Var.f43663s = str;
            String str2 = (String) vm0Var.U0.get(str);
            if (str2 != null) {
                vm0Var.U[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            vm0Var.v = str3;
            String str4 = (String) vm0Var.U0.get(str3);
            if (str4 != null) {
                vm0Var.U[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            vm0Var.U[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean d1(String str, i9 i9Var) {
        return false;
    }

    @Override
    public final void J(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
