package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class u6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52100a;
    public final Context f52101b;
    public final boolean f52102c;

    public u6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f52100a = f3VarArr;
        this.f52101b = context;
        this.f52102c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f52100a[0].dismiss();
        if (this.f52102c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f52101b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
