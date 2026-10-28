package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s70 extends org.telegram.ui.ActionBar.s0 {
    public final y70 f43252a;

    public s70(y70 y70Var) {
        this.f43252a = y70Var;
    }

    @Override
    public final void h() {
        y70.Z(this.f43252a);
    }

    @Override
    public final void l(EditText editText) {
        int length = editText.length();
        y70 y70Var = this.f43252a;
        if (length != 0) {
            y70Var.f45874x = true;
            v70 v70Var = y70Var.f45872s;
            if (!v70Var.h) {
                v70Var.h = true;
                v70Var.l();
            }
            y70Var.f45872s.E(editText.getText().toString());
            y70Var.h.setFastScrollVisible(false);
            y70Var.h.setVerticalScrollBarEnabled(true);
            y70Var.f45871r.e(true, true);
            y70Var.f45871r.setStickerType(1);
            y70Var.f45871r.d.setText(LocaleController.getString(R.string.NoResult));
            y70Var.f45871r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        y70.Z(y70Var);
    }
}
