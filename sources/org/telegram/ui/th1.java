package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class th1 implements TextWatcher {
    public final UsersSelectActivity f37764a;

    public th1(UsersSelectActivity usersSelectActivity) {
        this.f37764a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f37764a;
        if (usersSelectActivity.f31894c.length() != 0) {
            wh1 wh1Var = usersSelectActivity.h;
            boolean z10 = wh1Var.f39155n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    wh1Var.f39155n = true;
                    wh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f31895f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f31895f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f31894c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        wh1 wh1Var2 = usersSelectActivity.h;
        if (wh1Var2.f39155n) {
            wh1Var2.f39155n = false;
            wh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f31895f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
