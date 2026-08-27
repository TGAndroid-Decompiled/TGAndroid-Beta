package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.e51;

public final class c1 extends e5 {

    public final nh.f0 f43793f = new nh.f0(this, 24);
    public final d1 h;

    public c1(d1 d1Var) {
        this.h = d1Var;
    }

    public static boolean t(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || org.telegram.messenger.y1.x(" ", lowerCase2, lowerCase) || org.telegram.messenger.y1.x(".", lowerCase2, lowerCase)) {
            return true;
        }
        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
        String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
        return strTranslitSafe.startsWith(strTranslitSafe2) || org.telegram.messenger.y1.x(" ", strTranslitSafe2, strTranslitSafe) || org.telegram.messenger.y1.x(".", strTranslitSafe2, strTranslitSafe);
    }

    @Override
    public final void m() {
        d1 d1Var = this.h;
        d1Var.f43808n = null;
        d1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f43793f);
        e51 e51Var = d1Var.f28261a;
        if (e51Var != null) {
            e51Var.U2.N(true);
            d1Var.f28261a.T2.h1(0, 0);
        }
        d1Var.f43811w.d.setText(LocaleController.getString(TextUtils.isEmpty(d1Var.f43808n) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
    }

    @Override
    public final void q(EditText editText) {
        d1 d1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(d1Var.f43808n);
        String string = editText.getText().toString();
        if (!TextUtils.equals(d1Var.f43808n, string)) {
            d1Var.f43808n = string;
            d1Var.h = true;
            nh.f0 f0Var = this.f43793f;
            AndroidUtilities.cancelRunOnUIThread(f0Var);
            AndroidUtilities.runOnUIThread(f0Var, 500L);
            d1Var.f43811w.d.setText(LocaleController.getString(TextUtils.isEmpty(string) ? R.string.WebNoHistory : R.string.WebNoSearchedHistory));
        }
        e51 e51Var = d1Var.f28261a;
        if (e51Var != null) {
            e51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(string))) {
                d1Var.f28261a.T2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
