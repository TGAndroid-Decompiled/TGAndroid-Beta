package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vd1 implements TextWatcher {
    public final wd1 f41714a;

    public vd1(wd1 wd1Var) {
        this.f41714a = wd1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        wd1 wd1Var = this.f41714a;
        if (wd1Var.I) {
            return;
        }
        if (wd1Var.f42070a.length() > 0) {
            String str = "https://" + wd1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) wd1Var.f42070a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, wd1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            wd1Var.d.setText(TextUtils.concat(wd1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        wd1Var.d.setText(wd1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        wd1 wd1Var = this.f41714a;
        if (wd1Var.G) {
            return;
        }
        wd1Var.Y(wd1Var.f42070a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
