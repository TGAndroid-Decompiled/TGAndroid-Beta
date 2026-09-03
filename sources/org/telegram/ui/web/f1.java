package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.a61;
public final class f1 extends h5 {
    public final q0 f39437f = new q0(this, 2);
    public final g1 h;

    public f1(g1 g1Var) {
        this.h = g1Var;
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
        g1 g1Var = this.h;
        g1Var.f39450n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f39437f);
        a61 a61Var = g1Var.f23568a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            g1Var.f23568a.U2.h1(0, 0);
        }
        ih.s sVar = g1Var.f39453w.d;
        if (TextUtils.isEmpty(g1Var.f39450n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        sVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        g1 g1Var = this.h;
        boolean z4 = !TextUtils.isEmpty(g1Var.f39450n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.f39450n, obj)) {
            g1Var.f39450n = obj;
            g1Var.h = true;
            q0 q0Var = this.f39437f;
            AndroidUtilities.cancelRunOnUIThread(q0Var);
            AndroidUtilities.runOnUIThread(q0Var, 500L);
            ih.s sVar = g1Var.f39453w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            sVar.setText(LocaleController.getString(i10));
        }
        a61 a61Var = g1Var.f23568a;
        if (a61Var != null) {
            a61Var.V2.N(true);
            if (z4 != (!TextUtils.isEmpty(obj))) {
                g1Var.f23568a.U2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
