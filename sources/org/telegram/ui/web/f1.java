package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.j71;
public final class f1 extends e5 {
    public final t0 f43242f = new t0(this, 1);
    public final g1 h;

    public f1(g1 g1Var) {
        this.h = g1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.v0.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.v0.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.v0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.v0.w(".", translitSafe2, translitSafe)) {
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
        g1Var.f43257n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f43242f);
        j71 j71Var = g1Var.f27773a;
        if (j71Var != null) {
            j71Var.W2.N(true);
            g1Var.f27773a.V2.h1(0, 0);
        }
        vh.n nVar = g1Var.f43260w.d;
        if (TextUtils.isEmpty(g1Var.f43257n)) {
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
        boolean z10 = !TextUtils.isEmpty(g1Var.f43257n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.f43257n, obj)) {
            g1Var.f43257n = obj;
            g1Var.h = true;
            t0 t0Var = this.f43242f;
            AndroidUtilities.cancelRunOnUIThread(t0Var);
            AndroidUtilities.runOnUIThread(t0Var, 500L);
            vh.n nVar = g1Var.f43260w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        j71 j71Var = g1Var.f27773a;
        if (j71Var != null) {
            j71Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                g1Var.f27773a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
