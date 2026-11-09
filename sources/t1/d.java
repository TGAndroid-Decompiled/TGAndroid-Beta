package t1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;
public final class d implements InputFilter {
    public final TextView f55371a;
    public c f55372b;

    public d(TextView textView) {
        this.f55371a = textView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f55371a;
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
            if (this.f55372b == null) {
                this.f55372b = new c(textView, this);
            }
            a10.f(this.f55372b);
            return charSequence;
        }
        return charSequence;
    }
}
