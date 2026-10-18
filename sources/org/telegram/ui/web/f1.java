package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.u61;
public final class f1 extends g5 {
    public final ki.u f42584r = new ki.u(this, 26);
    public final g1 f42585s;

    public f1(g1 g1Var) {
        this.f42585s = g1Var;
    }

    public static boolean w(String str, String str2) {
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
        g1 g1Var = this.f42585s;
        g1Var.f42592n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f42584r);
        u61 u61Var = g1Var.f31190a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            g1Var.f31190a.V2.h1(0, 0);
        }
        wh.n nVar = g1Var.f42595w.d;
        if (TextUtils.isEmpty(g1Var.f42592n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        nVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        g1 g1Var = this.f42585s;
        boolean z10 = !TextUtils.isEmpty(g1Var.f42592n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.f42592n, obj)) {
            g1Var.f42592n = obj;
            g1Var.h = true;
            ki.u uVar = this.f42584r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
            wh.n nVar = g1Var.f42595w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        u61 u61Var = g1Var.f31190a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                g1Var.f31190a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
