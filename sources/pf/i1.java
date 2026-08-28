package pf;

import android.text.InputFilter;
import android.text.Spanned;
public final class i1 implements InputFilter {
    @Override
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        return String.valueOf(charSequence).replaceAll("[^\\d_\\p{L}\\x{200c}\\x{00b7}\\x{0d80}-\\x{0dff}]", "");
    }
}
