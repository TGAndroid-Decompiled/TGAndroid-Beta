package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f47920a;
    public final Context f47921b;
    public final boolean f47922c;

    public q6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f47920a = f3VarArr;
        this.f47921b = context;
        this.f47922c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47920a[0].dismiss();
        if (this.f47922c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f47921b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
