package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.c51;
public final class b1 extends e5 {
    public final m2 f43806f = new m2(this, 18);
    public final c1 h;

    public b1(c1 c1Var) {
        this.h = c1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.l0.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.l0.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.l0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.l0.w(".", translitSafe2, translitSafe)) {
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
        int i9;
        c1 c1Var = this.h;
        c1Var.f43821n = null;
        c1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f43806f);
        c51 c51Var = c1Var.f27658a;
        if (c51Var != null) {
            c51Var.U2.N(true);
            c1Var.f27658a.T2.h1(0, 0);
        }
        dh.u uVar = c1Var.f43824w.d;
        if (TextUtils.isEmpty(c1Var.f43821n)) {
            i9 = R.string.WebNoHistory;
        } else {
            i9 = R.string.WebNoSearchedHistory;
        }
        uVar.setText(LocaleController.getString(i9));
    }

    @Override
    public final void q(EditText editText) {
        int i9;
        c1 c1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(c1Var.f43821n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(c1Var.f43821n, obj)) {
            c1Var.f43821n = obj;
            c1Var.h = true;
            m2 m2Var = this.f43806f;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
            AndroidUtilities.runOnUIThread(m2Var, 500L);
            dh.u uVar = c1Var.f43824w.d;
            if (TextUtils.isEmpty(obj)) {
                i9 = R.string.WebNoHistory;
            } else {
                i9 = R.string.WebNoSearchedHistory;
            }
            uVar.setText(LocaleController.getString(i9));
        }
        c51 c51Var = c1Var.f27658a;
        if (c51Var != null) {
            c51Var.U2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                c1Var.f27658a.T2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
