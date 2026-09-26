package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f47969a;
    public final Context f47970b;
    public final boolean f47971c;

    public r6(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, boolean z10) {
        this.f47969a = e3VarArr;
        this.f47970b = context;
        this.f47971c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47969a[0].dismiss();
        if (this.f47971c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f47970b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
