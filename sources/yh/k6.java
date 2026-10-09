package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52788a;
    public final Context f52789b;
    public final boolean f52790c;

    public k6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f52788a = f3VarArr;
        this.f52789b = context;
        this.f52790c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f52788a[0].dismiss();
        if (this.f52790c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        of.f.s(this.f52789b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
