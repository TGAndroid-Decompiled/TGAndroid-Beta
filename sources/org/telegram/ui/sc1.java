package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sc1 implements TextWatcher {
    public final tc1 f42664a;

    public sc1(tc1 tc1Var) {
        this.f42664a = tc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        tc1 tc1Var = this.f42664a;
        if (tc1Var.E) {
            return;
        }
        if (tc1Var.f42951a.length() > 0) {
            String str = "https://" + tc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) tc1Var.f42951a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, tc1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            tc1Var.d.setText(TextUtils.concat(tc1Var.D, "\n\n", spannableStringBuilder));
            return;
        }
        tc1Var.d.setText(tc1Var.D);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        tc1 tc1Var = this.f42664a;
        if (tc1Var.C) {
            return;
        }
        tc1Var.Y(tc1Var.f42951a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
