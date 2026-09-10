package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zh1 implements TextWatcher {
    public final UsersSelectActivity f39351a;

    public zh1(UsersSelectActivity usersSelectActivity) {
        this.f39351a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f39351a;
        if (usersSelectActivity.f30722c.length() != 0) {
            ci1 ci1Var = usersSelectActivity.h;
            boolean z10 = ci1Var.f31677n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    ci1Var.f31677n = true;
                    ci1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f30723f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f30723f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f30722c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        ci1 ci1Var2 = usersSelectActivity.h;
        if (ci1Var2.f31677n) {
            ci1Var2.f31677n = false;
            ci1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f30723f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
