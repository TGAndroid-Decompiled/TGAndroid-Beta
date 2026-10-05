package yh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52175a;
    public final Context f52176b;
    public final boolean f52177c;

    public v6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f52175a = f3VarArr;
        this.f52176b = context;
        this.f52177c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f52175a[0].dismiss();
        if (this.f52177c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        nf.f.s(this.f52176b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
