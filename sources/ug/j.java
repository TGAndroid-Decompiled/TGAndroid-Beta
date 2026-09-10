package ug;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
public final class j extends InputFilter.LengthFilter {
    public final l f42699a;

    public j(l lVar) {
        super(128);
        this.f42699a = lVar;
    }

    @Override
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && filter.length() == 0) {
            AndroidUtilities.shakeView(this.f42699a.f42700a);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        return filter;
    }
}
