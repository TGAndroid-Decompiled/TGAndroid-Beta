package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rh1 implements TextWatcher {
    public final UsersSelectActivity f37070a;

    public rh1(UsersSelectActivity usersSelectActivity) {
        this.f37070a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f37070a;
        if (usersSelectActivity.f31854c.length() != 0) {
            uh1 uh1Var = usersSelectActivity.h;
            boolean z10 = uh1Var.f38007n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    uh1Var.f38007n = true;
                    uh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f31855f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f31855f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f31854c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        uh1 uh1Var2 = usersSelectActivity.h;
        if (uh1Var2.f38007n) {
            uh1Var2.f38007n = false;
            uh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f31855f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
