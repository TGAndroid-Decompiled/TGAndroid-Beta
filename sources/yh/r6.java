package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f48078a;
    public final Context f48079b;
    public final boolean f48080c;

    public r6(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, boolean z10) {
        this.f48078a = e3VarArr;
        this.f48079b = context;
        this.f48080c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f48078a[0].dismiss();
        if (this.f48080c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f48079b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
