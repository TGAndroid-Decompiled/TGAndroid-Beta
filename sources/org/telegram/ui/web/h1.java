package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.m61;
public final class h1 extends g5 {
    public final r0 f38917f = new r0(this, 2);
    public final i1 h;

    public h1(i1 i1Var) {
        this.h = i1Var;
    }

    public static boolean t(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !org.telegram.messenger.l0.v(" ", lowerCase2, lowerCase) && !org.telegram.messenger.l0.v(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || org.telegram.messenger.l0.v(" ", translitSafe2, translitSafe) || org.telegram.messenger.l0.v(".", translitSafe2, translitSafe)) {
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
        i1 i1Var = this.h;
        i1Var.f38936r = null;
        i1Var.f38935n = false;
        AndroidUtilities.cancelRunOnUIThread(this.f38917f);
        m61 m61Var = i1Var.f26598a;
        if (m61Var != null) {
            m61Var.Y2.N(true);
            i1Var.f26598a.X2.h1(0, 0);
        }
        vh.o oVar = i1Var.f38939x.d;
        if (TextUtils.isEmpty(i1Var.f38936r)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        oVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        i1 i1Var = this.h;
        boolean z10 = !TextUtils.isEmpty(i1Var.f38936r);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(i1Var.f38936r, obj)) {
            i1Var.f38936r = obj;
            i1Var.f38935n = true;
            r0 r0Var = this.f38917f;
            AndroidUtilities.cancelRunOnUIThread(r0Var);
            AndroidUtilities.runOnUIThread(r0Var, 500L);
            vh.o oVar = i1Var.f38939x.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            oVar.setText(LocaleController.getString(i10));
        }
        m61 m61Var = i1Var.f26598a;
        if (m61Var != null) {
            m61Var.Y2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                i1Var.f26598a.X2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
