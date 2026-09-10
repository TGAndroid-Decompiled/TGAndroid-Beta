package q1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.l;
public final class d implements InputFilter {
    public final TextView f40461a;
    public c f40462b;

    public d(TextView textView) {
        this.f40461a = textView;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f40461a;
        if (!textView.isInEditMode()) {
            int b10 = l.a().b();
            if (b10 != 0) {
                if (b10 != 1) {
                    if (b10 != 3) {
                        return charSequence;
                    }
                } else if ((i13 != 0 || i12 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                    if (i10 != 0 || i11 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i10, i11);
                    }
                    return l.a().e(0, charSequence.length(), charSequence);
                } else {
                    return charSequence;
                }
            }
            l a2 = l.a();
            if (this.f40462b == null) {
                this.f40462b = new c(textView, this);
            }
            a2.f(this.f40462b);
            return charSequence;
        }
        return charSequence;
    }
}
