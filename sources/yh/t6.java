package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f47859a;
    public final Context f47860b;
    public final boolean f47861c;

    public t6(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, boolean z10) {
        this.f47859a = g3VarArr;
        this.f47860b = context;
        this.f47861c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47859a[0].dismiss();
        if (this.f47861c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f47860b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
