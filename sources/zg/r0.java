package zg;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;
public final class r0 extends ci.d {
    public SpannableStringBuilder f49436h0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f49436h0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i10, new Object[0]));
        f(spannableStringBuilder, true);
    }
}
