package t1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;
public final class d implements InputFilter {
    public final TextView f57528a;
    public c f57529b;

    public d(TextView textView) {
        this.f57528a = textView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f57528a;
        if (!textView.isInEditMode()) {
            int b10 = l.a().b();
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 3) {
                        return charSequence;
                    }
                } else if ((i12 != 0 || i11 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                    if (i7 != 0 || i10 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i7, i10);
                    }
                    return l.a().e(0, charSequence.length(), charSequence);
                } else {
                    return charSequence;
                }
            }
            l a10 = l.a();
            if (this.f57529b == null) {
                this.f57529b = new c(textView, this);
            }
            a10.f(this.f57529b);
            return charSequence;
        }
        return charSequence;
    }
}
