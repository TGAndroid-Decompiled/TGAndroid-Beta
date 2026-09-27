package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.g3[] f47976a;
    public final Context f47977b;
    public final boolean f47978c;

    public q6(org.telegram.ui.ActionBar.g3[] g3VarArr, Context context, boolean z10) {
        this.f47976a = g3VarArr;
        this.f47977b = context;
        this.f47978c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47976a[0].dismiss();
        if (this.f47978c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f47977b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
