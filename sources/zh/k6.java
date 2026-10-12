package zh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k6 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.e3[] f50767a;
    public final Context f50768b;
    public final boolean f50769c;

    public k6(org.telegram.ui.ActionBar.e3[] e3VarArr, Context context, boolean z10) {
        this.f50767a = e3VarArr;
        this.f50768b = context;
        this.f50769c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f50767a[0].dismiss();
        if (this.f50769c) {
            i10 = R.string.StarsTransactionTONFromFragmentLink;
        } else {
            i10 = R.string.StarsTransactionUnknownLink;
        }
        pf.d.s(this.f50768b, LocaleController.getString(i10));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
