package q1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.k;
public final class d implements InputFilter {
    public final TextView f45902a;
    public c f45903b;

    public d(TextView textView) {
        this.f45902a = textView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f45902a;
        if (!textView.isInEditMode()) {
            int b10 = k.a().b();
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 3) {
                        return charSequence;
                    }
                } else if ((i12 != 0 || i11 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                    if (i9 != 0 || i10 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i9, i10);
                    }
                    return k.a().e(0, charSequence.length(), charSequence);
                } else {
                    return charSequence;
                }
            }
            k a2 = k.a();
            if (this.f45903b == null) {
                this.f45903b = new c(textView, this);
            }
            a2.f(this.f45903b);
            return charSequence;
        }
        return charSequence;
    }
}
