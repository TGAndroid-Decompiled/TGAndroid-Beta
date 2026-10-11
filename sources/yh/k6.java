package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f52875a;
    public final Context f52876b;
    public final boolean f52877c;

    public k6(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, boolean z10) {
        this.f52875a = e3VarArr;
        this.f52876b = context;
        this.f52877c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f52875a[0].dismiss();
        if (this.f52877c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        of.f.s(this.f52876b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
