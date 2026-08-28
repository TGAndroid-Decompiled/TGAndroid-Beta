package pf;

import android.text.InputFilter;
import android.text.Spanned;
public final class u0 implements InputFilter {
    @Override
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence2.contains("\n")) {
                return charSequence2.replaceAll("\n", "");
            }
            return null;
        }
        return null;
    }
}
