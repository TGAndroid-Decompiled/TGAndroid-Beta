package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.o51;
public final class c1 extends e5 {
    public final m6 f43995f = new m6(this, 27);
    public final d1 h;

    public c1(d1 d1Var) {
        this.h = d1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !x3.w(" ", lowerCase2, lowerCase) && !x3.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || x3.w(" ", translitSafe2, translitSafe) || x3.w(".", translitSafe2, translitSafe)) {
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
        d1 d1Var = this.h;
        d1Var.f44001n = null;
        d1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f43995f);
        o51 o51Var = d1Var.f31601a;
        if (o51Var != null) {
            o51Var.U2.N(true);
            d1Var.f31601a.T2.h1(0, 0);
        }
        gh.s sVar = d1Var.f44004w.d;
        if (TextUtils.isEmpty(d1Var.f44001n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        sVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        d1 d1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(d1Var.f44001n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(d1Var.f44001n, obj)) {
            d1Var.f44001n = obj;
            d1Var.h = true;
            m6 m6Var = this.f43995f;
            AndroidUtilities.cancelRunOnUIThread(m6Var);
            AndroidUtilities.runOnUIThread(m6Var, 500L);
            gh.s sVar = d1Var.f44004w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            sVar.setText(LocaleController.getString(i10));
        }
        o51 o51Var = d1Var.f31601a;
        if (o51Var != null) {
            o51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                d1Var.f31601a.T2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
