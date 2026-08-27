package org.telegram.ui;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class sc1 implements TextWatcher {

    public final tc1 f42576a;

    public sc1(tc1 tc1Var) {
        this.f42576a = tc1Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        tc1 tc1Var = this.f42576a;
        if (tc1Var.E) {
            return;
        }
        if (tc1Var.f42891a.length() <= 0) {
            tc1Var.d.setText(tc1Var.D);
            return;
        }
        String str = "https://" + tc1Var.getMessagesController().linkPrefix + "/addtheme/" + ((Object) tc1Var.f42891a.getText());
        String string = LocaleController.formatString("ThemeHelpLink", R.string.ThemeHelpLink, str);
        int iIndexOf = string.indexOf(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        if (iIndexOf >= 0) {
            spannableStringBuilder.setSpan(new org.telegram.ui.Cells.i(str, tc1Var, 8), iIndexOf, str.length() + iIndexOf, 33);
        }
        tc1Var.d.setText(TextUtils.concat(tc1Var.D, "\n\n", spannableStringBuilder));
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        tc1 tc1Var = this.f42576a;
        if (tc1Var.C) {
            return;
        }
        tc1Var.Z(tc1Var.f42891a.getText().toString(), false);
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
