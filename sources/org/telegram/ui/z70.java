package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class z70 implements TextWatcher {
    public final a80 f40699a;

    public z70(a80 a80Var) {
        this.f40699a = a80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        c80 c80Var = this.f40699a.f32488f;
        if (c80Var.d.d.length() != 0) {
            c80Var.B = true;
            c80Var.f33225y = true;
            y70 y70Var = c80Var.f33222s;
            if (!y70Var.h) {
                y70Var.h = true;
                y70Var.l();
            }
            c80Var.f33222s.E(c80Var.d.d.toString());
            c80Var.h.setFastScrollVisible(false);
            c80Var.h.setVerticalScrollBarEnabled(true);
            c80Var.f33221r.e(true, true);
            c80Var.f33221r.setStickerType(1);
            c80Var.f33221r.d.setText(LocaleController.getString(R.string.NoResult));
            c80Var.f33221r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        c80Var.B = false;
        c80Var.f33225y = false;
        y70 y70Var2 = c80Var.f33222s;
        if (y70Var2.h) {
            y70Var2.h = false;
            y70Var2.l();
        }
        c80Var.f33222s.E(null);
        c80Var.h.setFastScrollVisible(true);
        c80Var.h.setVerticalScrollBarEnabled(false);
        c80Var.f33221r.e(false, true);
        c80Var.f33221r.setStickerType(0);
        c80Var.f33221r.d.setText(LocaleController.getString(R.string.NoContacts));
        c80Var.f33221r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
