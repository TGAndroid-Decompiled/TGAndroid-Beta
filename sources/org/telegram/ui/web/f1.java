package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.Components.m61;
public final class f1 extends e5 {
    public final q0 f39057f = new q0(this, 2);
    public final g1 h;

    public f1(g1 g1Var) {
        this.h = g1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.f0.w(" ", lowerCase2, lowerCase) && !org.telegram.messenger.f0.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.f0.w(" ", translitSafe2, translitSafe) || org.telegram.messenger.f0.w(".", translitSafe2, translitSafe)) {
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
        g1Var.f39062n = null;
        g1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f39057f);
        m61 m61Var = g1Var.f26682a;
        if (m61Var != null) {
            m61Var.Y2.N(true);
            g1Var.f26682a.X2.h1(0, 0);
        }
        vh.n nVar = g1Var.f39065w.d;
        if (TextUtils.isEmpty(g1Var.f39062n)) {
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
        boolean z10 = !TextUtils.isEmpty(g1Var.f39062n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(g1Var.f39062n, obj)) {
            g1Var.f39062n = obj;
            g1Var.h = true;
            q0 q0Var = this.f39057f;
            AndroidUtilities.cancelRunOnUIThread(q0Var);
            AndroidUtilities.runOnUIThread(q0Var, 500L);
            vh.n nVar = g1Var.f39065w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        m61 m61Var = g1Var.f26682a;
        if (m61Var != null) {
            m61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                g1Var.f26682a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
