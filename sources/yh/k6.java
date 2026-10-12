package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f53024a;
    public final Context f53025b;
    public final boolean f53026c;

    public k6(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, boolean z10) {
        this.f53024a = e3VarArr;
        this.f53025b = context;
        this.f53026c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f53024a[0].dismiss();
        if (this.f53026c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        of.f.s(this.f53025b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
