package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t70 implements TextWatcher {
    public final u70 f41886a;

    public t70(u70 u70Var) {
        this.f41886a = u70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        x70 x70Var = this.f41886a.f42294f;
        if (x70Var.d.d.length() != 0) {
            x70Var.E = true;
            x70Var.f43530y = true;
            s70 s70Var = x70Var.f43527s;
            if (!s70Var.h) {
                s70Var.h = true;
                s70Var.l();
            }
            x70Var.f43527s.E(x70Var.d.d.toString());
            x70Var.h.setFastScrollVisible(false);
            x70Var.h.setVerticalScrollBarEnabled(true);
            x70Var.f43526r.e(true, true);
            x70Var.f43526r.setStickerType(1);
            x70Var.f43526r.d.setText(LocaleController.getString(R.string.NoResult));
            x70Var.f43526r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        x70Var.E = false;
        x70Var.f43530y = false;
        s70 s70Var2 = x70Var.f43527s;
        if (s70Var2.h) {
            s70Var2.h = false;
            s70Var2.l();
        }
        x70Var.f43527s.E(null);
        x70Var.h.setFastScrollVisible(true);
        x70Var.h.setVerticalScrollBarEnabled(false);
        x70Var.f43526r.e(false, true);
        x70Var.f43526r.setStickerType(0);
        x70Var.f43526r.d.setText(LocaleController.getString(R.string.NoContacts));
        x70Var.f43526r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
