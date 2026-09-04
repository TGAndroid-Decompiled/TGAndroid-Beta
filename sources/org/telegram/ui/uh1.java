package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uh1 implements TextWatcher {
    public final UsersSelectActivity f41100a;

    public uh1(UsersSelectActivity usersSelectActivity) {
        this.f41100a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f41100a;
        if (usersSelectActivity.f34239c.length() != 0) {
            xh1 xh1Var = usersSelectActivity.h;
            boolean z10 = xh1Var.f42733n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    xh1Var.f42733n = true;
                    xh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f34241f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f34241f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f34239c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        xh1 xh1Var2 = usersSelectActivity.h;
        if (xh1Var2.f42733n) {
            xh1Var2.f42733n = false;
            xh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f34241f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
