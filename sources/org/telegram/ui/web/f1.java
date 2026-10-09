package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.e71;
public final class f1 extends g5 {
    public final q0 f43300f = new q0(this, 2);
    public final g1 h;

    public f1(g1 g1Var) {
        this.h = g1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !bi.w(" ", lowerCase2, lowerCase) && !bi.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || bi.w(" ", translitSafe2, translitSafe) || bi.w(".", translitSafe2, translitSafe)) {
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
        g1Var.f43306n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f43300f);
        e71 e71Var = g1Var.f26290a;
        if (e71Var != null) {
            e71Var.W2.N(true);
            g1Var.f26290a.V2.h1(0, 0);
        }
        vh.n nVar = g1Var.f43309w.d;
        if (TextUtils.isEmpty(g1Var.f43306n)) {
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
        boolean z10 = !TextUtils.isEmpty(g1Var.f43306n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.f43306n, obj)) {
            g1Var.f43306n = obj;
            g1Var.h = true;
            q0 q0Var = this.f43300f;
            AndroidUtilities.cancelRunOnUIThread(q0Var);
            AndroidUtilities.runOnUIThread(q0Var, 500L);
            vh.n nVar = g1Var.f43309w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        e71 e71Var = g1Var.f26290a;
        if (e71Var != null) {
            e71Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                g1Var.f26290a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
