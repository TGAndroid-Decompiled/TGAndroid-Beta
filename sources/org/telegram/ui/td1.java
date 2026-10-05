package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class td1 implements TextWatcher {
    public final ud1 f40857a;

    public td1(ud1 ud1Var) {
        this.f40857a = ud1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ud1 ud1Var = this.f40857a;
        if (ud1Var.I) {
            return;
        }
        if (ud1Var.f41207a.length() > 0) {
            String str = "https://" + ud1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) ud1Var.f41207a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, ud1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            ud1Var.d.setText(TextUtils.concat(ud1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        ud1Var.d.setText(ud1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ud1 ud1Var = this.f40857a;
        if (ud1Var.G) {
            return;
        }
        ud1Var.Y(ud1Var.f41207a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
