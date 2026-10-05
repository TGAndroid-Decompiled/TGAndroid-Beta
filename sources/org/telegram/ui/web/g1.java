package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.Components.y61;
public final class g1 extends f5 {
    public final u0 f42205f = new u0(this, 1);
    public final h1 h;

    public g1(h1 h1Var) {
        this.h = h1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !bi.u(" ", lowerCase2, lowerCase) && !bi.u(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || bi.u(" ", translitSafe2, translitSafe) || bi.u(".", translitSafe2, translitSafe)) {
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
        h1Var.f42220r = null;
        h1Var.f42219n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f42205f);
        y61 y61Var = h1Var.f33438a;
        if (y61Var != null) {
            y61Var.f26034f3.N(true);
            h1Var.f33438a.f26033e3.h1(0, 0);
        }
        vh.n nVar = h1Var.f42223x.d;
        if (TextUtils.isEmpty(h1Var.f42220r)) {
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
        boolean z10 = !TextUtils.isEmpty(h1Var.f42220r);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(h1Var.f42220r, obj)) {
            h1Var.f42220r = obj;
            h1Var.f42219n = true;
            u0 u0Var = this.f42205f;
            AndroidUtilities.cancelRunOnUIThread(u0Var);
            AndroidUtilities.runOnUIThread(u0Var, 500L);
            vh.n nVar = h1Var.f42223x.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        y61 y61Var = h1Var.f33438a;
        if (y61Var != null) {
            y61Var.f26034f3.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                h1Var.f33438a.f26033e3.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
