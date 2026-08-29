package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class uc1 implements TextWatcher {
    public final vc1 f43229a;

    public uc1(vc1 vc1Var) {
        this.f43229a = vc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        vc1 vc1Var = this.f43229a;
        if (vc1Var.E) {
            return;
        }
        if (vc1Var.f43536a.length() > 0) {
            String str = "https://" + vc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) vc1Var.f43536a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, vc1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            vc1Var.d.setText(TextUtils.concat(vc1Var.D, "\n\n", spannableStringBuilder));
            return;
        }
        vc1Var.d.setText(vc1Var.D);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        vc1 vc1Var = this.f43229a;
        if (vc1Var.C) {
            return;
        }
        vc1Var.Z(vc1Var.f43536a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
