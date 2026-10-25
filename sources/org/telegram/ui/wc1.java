package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class wc1 implements TextWatcher {
    public final xc1 f45099a;

    public wc1(xc1 xc1Var) {
        this.f45099a = xc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        xc1 xc1Var = this.f45099a;
        if (xc1Var.H) {
            return;
        }
        if (xc1Var.f45723a.length() > 0) {
            String str = "https://" + xc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) xc1Var.f45723a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, xc1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            xc1Var.d.setText(TextUtils.concat(xc1Var.G, "\n\n", spannableStringBuilder));
            return;
        }
        xc1Var.d.setText(xc1Var.G);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        xc1 xc1Var = this.f45099a;
        if (xc1Var.F) {
            return;
        }
        xc1Var.a0(xc1Var.f45723a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
