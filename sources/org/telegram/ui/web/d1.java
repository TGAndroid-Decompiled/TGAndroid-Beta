package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.a61;
public final class d1 extends h5 {
    public final o0 f39470f = new o0(this, 2);
    public final e1 h;

    public d1(e1 e1Var) {
        this.h = e1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !y3.w(" ", lowerCase2, lowerCase) && !y3.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || y3.w(" ", translitSafe2, translitSafe) || y3.w(".", translitSafe2, translitSafe)) {
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
        e1 e1Var = this.h;
        e1Var.f39477n = null;
        e1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f39470f);
        a61 a61Var = e1Var.f23580a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            e1Var.f23580a.U2.h1(0, 0);
        }
        ih.s sVar = e1Var.f39480w.d;
        if (TextUtils.isEmpty(e1Var.f39477n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        sVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        e1 e1Var = this.h;
        boolean z4 = !TextUtils.isEmpty(e1Var.f39477n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(e1Var.f39477n, obj)) {
            e1Var.f39477n = obj;
            e1Var.h = true;
            o0 o0Var = this.f39470f;
            AndroidUtilities.cancelRunOnUIThread(o0Var);
            AndroidUtilities.runOnUIThread(o0Var, 500L);
            ih.s sVar = e1Var.f39480w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            sVar.setText(LocaleController.getString(i10));
        }
        a61 a61Var = e1Var.f23580a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            if (z4 != (!TextUtils.isEmpty(obj))) {
                e1Var.f23580a.U2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
