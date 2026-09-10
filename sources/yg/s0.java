package yg;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
public final class s0 extends bi.d {
    public SpannableStringBuilder f47143h0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f47143h0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i10, new Object[0]));
        f(spannableStringBuilder, true);
    }
}
