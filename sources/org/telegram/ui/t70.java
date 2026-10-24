package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t70 implements TextWatcher {
    public final u70 f41895a;

    public t70(u70 u70Var) {
        this.f41895a = u70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x70 x70Var = this.f41895a.f42341f;
        if (x70Var.d.d.length() != 0) {
            x70Var.E = true;
            x70Var.f43496y = true;
            s70 s70Var = x70Var.f43493s;
            if (!s70Var.h) {
                s70Var.h = true;
                s70Var.l();
            }
            x70Var.f43493s.E(x70Var.d.d.toString());
            x70Var.h.setFastScrollVisible(false);
            x70Var.h.setVerticalScrollBarEnabled(true);
            x70Var.f43492r.e(true, true);
            x70Var.f43492r.setStickerType(1);
            x70Var.f43492r.d.setText(LocaleController.getString(R.string.NoResult));
            x70Var.f43492r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        x70Var.E = false;
        x70Var.f43496y = false;
        s70 s70Var2 = x70Var.f43493s;
        if (s70Var2.h) {
            s70Var2.h = false;
            s70Var2.l();
        }
        x70Var.f43493s.E(null);
        x70Var.h.setFastScrollVisible(true);
        x70Var.h.setVerticalScrollBarEnabled(false);
        x70Var.f43492r.e(false, true);
        x70Var.f43492r.setStickerType(0);
        x70Var.f43492r.d.setText(LocaleController.getString(R.string.NoContacts));
        x70Var.f43492r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
