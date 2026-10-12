package org.telegram.ui;

import android.text.TextUtils;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
public final class qm0 implements y9 {
    public final un0 f39496a;

    public qm0(un0 un0Var) {
        this.f39496a = un0Var;
    }

    @Override
    public final String I0() {
        return null;
    }

    @Override
    public final void W0(MrzRecognizer.Result result) {
        boolean isEmpty = TextUtils.isEmpty(result.firstName);
        un0 un0Var = this.f39496a;
        if (!isEmpty) {
            un0Var.Y[0].setText(result.firstName);
        }
        if (!TextUtils.isEmpty(result.middleName)) {
            un0Var.Y[1].setText(result.middleName);
        }
        if (!TextUtils.isEmpty(result.lastName)) {
            un0Var.Y[2].setText(result.lastName);
        }
        int i10 = result.gender;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    un0Var.f40768w = "female";
                    un0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                }
            } else {
                un0Var.f40768w = "male";
                un0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
            }
        }
        if (!TextUtils.isEmpty(result.nationality)) {
            String str = result.nationality;
            un0Var.f40759s = str;
            String str2 = (String) un0Var.Y0.get(str);
            if (str2 != null) {
                un0Var.Y[5].setText(str2);
            }
        }
        if (!TextUtils.isEmpty(result.issuingCountry)) {
            String str3 = result.issuingCountry;
            un0Var.v = str3;
            String str4 = (String) un0Var.Y0.get(str3);
            if (str4 != null) {
                un0Var.Y[6].setText(str4);
            }
        }
        int i11 = result.birthDay;
        if (i11 > 0 && result.birthMonth > 0 && result.birthYear > 0) {
            un0Var.Y[3].setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(i11), Integer.valueOf(result.birthMonth), Integer.valueOf(result.birthYear)));
        }
    }

    @Override
    public final boolean e1(String str, o9 o9Var) {
        return false;
    }

    @Override
    public final void K(String str) {
    }

    @Override
    public final void onDismiss() {
    }
}
