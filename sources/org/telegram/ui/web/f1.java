package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.b71;
public final class f1 extends e5 {
    public final org.telegram.ui.Components.voip.m2 f41345f = new org.telegram.ui.Components.voip.m2(this, 7);
    public final g1 h;

    public f1(g1 g1Var) {
        this.h = g1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !yh.v(" ", lowerCase2, lowerCase) && !yh.v(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || yh.v(" ", translitSafe2, translitSafe) || yh.v(".", translitSafe2, translitSafe)) {
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
        g1Var.f41358n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f41345f);
        b71 b71Var = g1Var.f23964a;
        if (b71Var != null) {
            b71Var.W2.N(true);
            g1Var.f23964a.V2.h1(0, 0);
        }
        wh.n nVar = g1Var.f41361w.d;
        if (TextUtils.isEmpty(g1Var.f41358n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        nVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        g1 g1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(g1Var.f41358n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.f41358n, obj)) {
            g1Var.f41358n = obj;
            g1Var.h = true;
            org.telegram.ui.Components.voip.m2 m2Var = this.f41345f;
            AndroidUtilities.cancelRunOnUIThread(m2Var);
            AndroidUtilities.runOnUIThread(m2Var, 500L);
            wh.n nVar = g1Var.f41361w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        b71 b71Var = g1Var.f23964a;
        if (b71Var != null) {
            b71Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                g1Var.f23964a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
