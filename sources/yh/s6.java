package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f47736a;
    public final Context f47737b;
    public final boolean f47738c;

    public s6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f47736a = f3VarArr;
        this.f47737b = context;
        this.f47738c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47736a[0].dismiss();
        if (this.f47738c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f47737b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
