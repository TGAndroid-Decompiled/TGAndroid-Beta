package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sc1 implements TextWatcher {
    public final tc1 f41344a;

    public sc1(tc1 tc1Var) {
        this.f41344a = tc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        tc1 tc1Var = this.f41344a;
        if (tc1Var.H) {
            return;
        }
        if (tc1Var.f41995a.length() > 0) {
            String str = "https://" + tc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) tc1Var.f41995a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, tc1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            tc1Var.d.setText(TextUtils.concat(tc1Var.G, "\n\n", spannableStringBuilder));
            return;
        }
        tc1Var.d.setText(tc1Var.G);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        tc1 tc1Var = this.f41344a;
        if (tc1Var.F) {
            return;
        }
        tc1Var.Z(tc1Var.f41995a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
