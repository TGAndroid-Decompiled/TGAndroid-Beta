package zh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.f3[] f52480a;
    public final Context f52481b;
    public final boolean f52482c;

    public q6(org.telegram.ui.ActionBar.f3[] f3VarArr, Context context, boolean z10) {
        this.f52480a = f3VarArr;
        this.f52481b = context;
        this.f52482c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f52480a[0].dismiss();
        if (this.f52482c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        of.f.s(this.f52481b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
