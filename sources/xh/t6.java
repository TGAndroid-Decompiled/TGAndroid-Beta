package xh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class t6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.h3[] f46065a;
    public final Context f46066b;
    public final boolean f46067c;

    public t6(org.telegram.ui.ActionBar.h3[] h3VarArr, Context context, boolean z10) {
        this.f46065a = h3VarArr;
        this.f46066b = context;
        this.f46067c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f46065a[0].dismiss();
        if (this.f46067c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f46066b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
