package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f47648a;
    public final Context f47649b;
    public final boolean f47650c;

    public r6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f47648a = f3VarArr;
        this.f47649b = context;
        this.f47650c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47648a[0].dismiss();
        if (this.f47650c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f47649b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
