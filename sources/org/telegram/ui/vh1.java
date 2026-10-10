package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vh1 implements TextWatcher {
    public final UsersSelectActivity f42909a;

    public vh1(UsersSelectActivity usersSelectActivity) {
        this.f42909a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f42909a;
        if (usersSelectActivity.f34632c.length() != 0) {
            yh1 yh1Var = usersSelectActivity.h;
            boolean z10 = yh1Var.f44395n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    yh1Var.f44395n = true;
                    yh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f34634f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f34634f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f34632c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        yh1 yh1Var2 = usersSelectActivity.h;
        if (yh1Var2.f44395n) {
            yh1Var2.f44395n = false;
            yh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f34634f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
