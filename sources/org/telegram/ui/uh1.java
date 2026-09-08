package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uh1 implements TextWatcher {
    public final UsersSelectActivity f41127a;

    public uh1(UsersSelectActivity usersSelectActivity) {
        this.f41127a = usersSelectActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        UsersSelectActivity usersSelectActivity = this.f41127a;
        if (usersSelectActivity.f34266c.length() != 0) {
            xh1 xh1Var = usersSelectActivity.h;
            boolean z10 = xh1Var.f42760n;
            if (!z10) {
                usersSelectActivity.M = true;
                usersSelectActivity.L = true;
                if (!z10) {
                    xh1Var.f42760n = true;
                    xh1Var.l();
                }
                usersSelectActivity.d.setFastScrollVisible(false);
                usersSelectActivity.d.setVerticalScrollBarEnabled(true);
                usersSelectActivity.f34268f.d.setText(LocaleController.getString(R.string.NoResult));
            }
            usersSelectActivity.f34268f.e(true, true);
            usersSelectActivity.h.L(usersSelectActivity.f34266c.getText().toString());
            return;
        }
        usersSelectActivity.M = false;
        usersSelectActivity.L = false;
        xh1 xh1Var2 = usersSelectActivity.h;
        if (xh1Var2.f42760n) {
            xh1Var2.f42760n = false;
            xh1Var2.l();
        }
        usersSelectActivity.h.L(null);
        usersSelectActivity.d.setFastScrollVisible(true);
        usersSelectActivity.d.setVerticalScrollBarEnabled(false);
        usersSelectActivity.f34268f.d.setText(LocaleController.getString(R.string.NoContacts));
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
