package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sd1 implements TextWatcher {
    public final td1 f37716a;

    public sd1(td1 td1Var) {
        this.f37716a = td1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        td1 td1Var = this.f37716a;
        if (td1Var.I) {
            return;
        }
        if (td1Var.f38053a.length() > 0) {
            String str = "https://" + td1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) td1Var.f38053a.getText());
            String formatString = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
            int indexOf = formatString.indexOf(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, td1Var, 8), indexOf, str.length() + indexOf, 33);
            }
            td1Var.d.setText(TextUtils.concat(td1Var.H, "\n\n", spannableStringBuilder));
            return;
        }
        td1Var.d.setText(td1Var.H);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        td1 td1Var = this.f37716a;
        if (td1Var.G) {
            return;
        }
        td1Var.Z(td1Var.f38053a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
