package rh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.cd;
public final class h7 extends ClickableSpan {
    public final org.telegram.ui.ActionBar.z2[] f47008a;
    public final Context f47009b;
    public final boolean f47010c;

    public h7(org.telegram.ui.ActionBar.z2[] z2VarArr, Context context, boolean z10) {
        this.f47008a = z2VarArr;
        this.f47009b = context;
        this.f47010c = z10;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        this.f47008a[0].dismiss();
        if (this.f47010c) {
            i10 = 2131744945;
        } else {
            i10 = 2131744942;
        }
        gf.f.r(this.f47009b, cd.L0(i10, null));
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
