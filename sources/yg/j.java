package yg;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.g0;
import org.telegram.messenger.p2;
public final class j extends InputFilter.LengthFilter {
    public final l f59471a;

    public j(l lVar) {
        super(128);
        this.f59471a = lVar;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i7, i10, spanned, i11, i12);
        if (filter != null && filter.length() == 0) {
            g0.F3(this.f59471a.f59472a);
            p2.APP_ERROR.a();
        }
        return filter;
    }
}
