package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f47971a;
    public final Context f47972b;
    public final boolean f47973c;

    public r6(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, boolean z10) {
        this.f47971a = e3VarArr;
        this.f47972b = context;
        this.f47973c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47971a[0].dismiss();
        if (this.f47973c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f47972b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
