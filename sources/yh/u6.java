package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52099a;
    public final Context f52100b;
    public final boolean f52101c;

    public u6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f52099a = f3VarArr;
        this.f52100b = context;
        this.f52101c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f52099a[0].dismiss();
        if (this.f52101c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f52100b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
