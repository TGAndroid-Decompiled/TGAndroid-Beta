package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.v61;
public final class e1 extends g5 {
    public final ki.u f42620r = new ki.u(this, 26);
    public final f1 f42621s;

    public e1(f1 f1Var) {
        this.f42621s = f1Var;
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
        f1 f1Var = this.f42621s;
        f1Var.f42628n = null;
        f1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f42620r);
        v61 v61Var = f1Var.f32025a;
        if (v61Var != null) {
            v61Var.W2.N(true);
            f1Var.f32025a.V2.h1(0, 0);
        }
        wh.n nVar = f1Var.f42631w.d;
        if (TextUtils.isEmpty(f1Var.f42628n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        nVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        f1 f1Var = this.f42621s;
        boolean z10 = !TextUtils.isEmpty(f1Var.f42628n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(f1Var.f42628n, obj)) {
            f1Var.f42628n = obj;
            f1Var.h = true;
            ki.u uVar = this.f42620r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
            wh.n nVar = f1Var.f42631w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        v61 v61Var = f1Var.f32025a;
        if (v61Var != null) {
            v61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                f1Var.f32025a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
