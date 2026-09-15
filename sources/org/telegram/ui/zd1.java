package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zd1 implements TextWatcher {
    public final ae1 f40142a;

    public zd1(ae1 ae1Var) {
        this.f40142a = ae1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ae1 ae1Var = this.f40142a;
        if (ae1Var.I) {
            return;
        }
        if (ae1Var.f31793a.length() > 0) {
            String str = "https://" + ae1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) ae1Var.f31793a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, ae1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            ae1Var.d.setText(TextUtils.concat(ae1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        ae1Var.d.setText(ae1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ae1 ae1Var = this.f40142a;
        if (ae1Var.G) {
            return;
        }
        ae1Var.Z(ae1Var.f31793a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
