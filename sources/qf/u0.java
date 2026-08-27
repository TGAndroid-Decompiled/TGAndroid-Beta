package qf;

import android.text.InputFilter;
import android.text.Spanned;

public final class u0 implements InputFilter {
    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (charSequence == null) {
            return null;
        }
        String string = charSequence.toString();
        if (string.contains("\n")) {
            return string.replaceAll("\n", "");
        }
        return null;
    }
}
