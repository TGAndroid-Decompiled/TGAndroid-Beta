package rh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.dd;
public final class h7 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.z2[] f47022a;
    public final Context f47023b;
    public final boolean f47024c;

    public h7(org.telegram.ui.ActionBar.z2[] z2VarArr, Context context, boolean z10) {
        this.f47022a = z2VarArr;
        this.f47023b = context;
        this.f47024c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47022a[0].dismiss();
        if (this.f47024c) {
            i10 = 2131744945;
        } else {
            i10 = 2131744942;
        }
        gf.f.r(this.f47023b, dd.L0(i10, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
