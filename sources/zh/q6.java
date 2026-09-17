package zh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52512a;
    public final Context f52513b;
    public final boolean f52514c;

    public q6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f52512a = f3VarArr;
        this.f52513b = context;
        this.f52514c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f52512a[0].dismiss();
        if (this.f52514c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        of.f.s(this.f52513b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
