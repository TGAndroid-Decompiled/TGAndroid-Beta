package uf;

import android.text.InputFilter;
import android.text.Spanned;
public final class t0 implements InputFilter {
    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
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
