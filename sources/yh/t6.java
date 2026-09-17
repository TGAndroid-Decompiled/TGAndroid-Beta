package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f47854a;
    public final Context f47855b;
    public final boolean f47856c;

    public t6(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, boolean z10) {
        this.f47854a = g3VarArr;
        this.f47855b = context;
        this.f47856c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47854a[0].dismiss();
        if (this.f47856c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f47855b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
