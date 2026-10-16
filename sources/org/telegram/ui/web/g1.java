package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.voip.r2;
public final class g1 extends e5 {
    public final r2 f41041f = new r2(this, 6);
    public final h1 h;

    public g1(h1 h1Var) {
        this.h = h1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.g0.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.g0.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.g0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.g0.w(".", translitSafe2, translitSafe)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void m() {
        int i10;
        h1 h1Var = this.h;
        h1Var.f41061n = null;
        h1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f41041f);
        c71 c71Var = h1Var.f24003a;
        if (c71Var != null) {
            c71Var.W2.N(true);
            h1Var.f24003a.V2.h1(0, 0);
        }
        wh.n nVar = h1Var.f41064w.d;
        if (TextUtils.isEmpty(h1Var.f41061n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        nVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        h1 h1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(h1Var.f41061n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.f41061n, obj)) {
            h1Var.f41061n = obj;
            h1Var.h = true;
            r2 r2Var = this.f41041f;
            AndroidUtilities.cancelRunOnUIThread(r2Var);
            AndroidUtilities.runOnUIThread(r2Var, 500L);
            wh.n nVar = h1Var.f41064w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        c71 c71Var = h1Var.f24003a;
        if (c71Var != null) {
            c71Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.f24003a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
