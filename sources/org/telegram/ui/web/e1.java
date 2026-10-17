package org.telegram.ui.web;

import android.text.TextUtils;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.g5;
import org.telegram.ui.Components.u61;
public final class e1 extends g5 {
    public final ki.u f42578r = new ki.u(this, 26);
    public final f1 f42579s;

    public e1(f1 f1Var) {
        this.f42579s = f1Var;
    }

    public static boolean w(String str, String str2) {
        if (str != null && str2 != null) {
            String lowerCase = str.toLowerCase();
            String lowerCase2 = str2.toLowerCase();
            if (!lowerCase.startsWith(lowerCase2) && !wh.w(" ", lowerCase2, lowerCase) && !wh.w(".", lowerCase2, lowerCase)) {
                String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                if (translitSafe.startsWith(translitSafe2) || wh.w(" ", translitSafe2, translitSafe) || wh.w(".", translitSafe2, translitSafe)) {
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
        f1 f1Var = this.f42579s;
        f1Var.f42586n = null;
        f1Var.h = false;
        AndroidUtilities.cancelRunOnUIThread(this.f42578r);
        u61 u61Var = f1Var.f31190a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            f1Var.f31190a.V2.h1(0, 0);
        }
        wh.n nVar = f1Var.f42589w.d;
        if (TextUtils.isEmpty(f1Var.f42586n)) {
            i10 = R.string.WebNoHistory;
        } else {
            i10 = R.string.WebNoSearchedHistory;
        }
        nVar.setText(LocaleController.getString(i10));
    }

    @Override
    public final void q(EditText editText) {
        int i10;
        f1 f1Var = this.f42579s;
        boolean z10 = !TextUtils.isEmpty(f1Var.f42586n);
        String obj = editText.getText().toString();
        if (!TextUtils.equals(f1Var.f42586n, obj)) {
            f1Var.f42586n = obj;
            f1Var.h = true;
            ki.u uVar = this.f42578r;
            AndroidUtilities.cancelRunOnUIThread(uVar);
            AndroidUtilities.runOnUIThread(uVar, 500L);
            wh.n nVar = f1Var.f42589w.d;
            if (TextUtils.isEmpty(obj)) {
                i10 = R.string.WebNoHistory;
            } else {
                i10 = R.string.WebNoSearchedHistory;
            }
            nVar.setText(LocaleController.getString(i10));
        }
        u61 u61Var = f1Var.f31190a;
        if (u61Var != null) {
            u61Var.W2.N(true);
            if (z10 != (!TextUtils.isEmpty(obj))) {
                f1Var.f31190a.V2.h1(0, 0);
            }
        }
    }

    @Override
    public final void n() {
    }
}
