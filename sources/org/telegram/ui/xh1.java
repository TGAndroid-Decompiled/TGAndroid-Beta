package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xh1 implements TextWatcher {
    public final UsersSelectActivity f43981a;

    public xh1(UsersSelectActivity usersSelectActivity) {
        this.f43981a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f43981a;
        if (usersSelectActivity.f34433c.length() != 0) {
            ai1 ai1Var = usersSelectActivity.h;
            boolean z10 = ai1Var.f35848n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    ai1Var.f35848n = true;
                    ai1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f34435f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f34435f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f34433c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        ai1 ai1Var2 = usersSelectActivity.h;
        if (ai1Var2.f35848n) {
            ai1Var2.f35848n = false;
            ai1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f34435f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
