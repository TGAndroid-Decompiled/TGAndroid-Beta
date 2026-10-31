package sg;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.cd;
public final class r0 extends vh.d {
    public SpannableStringBuilder f48464k0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f48464k0).append((CharSequence) cd.G(i10, "ReactionLevelRequiredBtn", new Object[0]));
        g(spannableStringBuilder, true);
    }
}
