package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zc1 implements TextWatcher {
    public final ad1 f46230a;

    public zc1(ad1 ad1Var) {
        this.f46230a = ad1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        ad1 ad1Var = this.f46230a;
        if (ad1Var.H) {
            return;
        }
        if (ad1Var.f37738a.length() > 0) {
            String str = "https://" + ad1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) ad1Var.f37738a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, ad1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            ad1Var.d.setText(TextUtils.concat(ad1Var.G, "\n\n", spannableStringBuilder));
            return;
        }
        ad1Var.d.setText(ad1Var.G);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        ad1 ad1Var = this.f46230a;
        if (ad1Var.F) {
            return;
        }
        ad1Var.a0(ad1Var.f37738a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
