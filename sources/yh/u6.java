package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52105a;
    public final Context f52106b;
    public final boolean f52107c;

    public u6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f52105a = f3VarArr;
        this.f52106b = context;
        this.f52107c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f52105a[0].dismiss();
        if (this.f52107c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f52106b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
