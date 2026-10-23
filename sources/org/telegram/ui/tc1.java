package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tc1 implements TextWatcher {
    public final uc1 f41952a;

    public tc1(uc1 uc1Var) {
        this.f41952a = uc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        uc1 uc1Var = this.f41952a;
        if (uc1Var.H) {
            return;
        }
        if (uc1Var.f42374a.length() > 0) {
            String str = "https://" + uc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) uc1Var.f42374a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, uc1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            uc1Var.d.setText(TextUtils.concat(uc1Var.G, "\n\n", spannableStringBuilder));
            return;
        }
        uc1Var.d.setText(uc1Var.G);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        uc1 uc1Var = this.f41952a;
        if (uc1Var.F) {
            return;
        }
        uc1Var.Z(uc1Var.f42374a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
