package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class r0 extends ClickableSpan {
    public final int f41827a;
    public final Object f41828b;
    public final Object f41829c;
    public final Object d;

    public r0(Object obj, Object obj2, Object obj3, int i10) {
        this.f41827a = i10;
        this.f41828b = obj;
        this.f41829c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41827a) {
            case 0:
                ((d70) this.f41828b).c((k4) this.f41829c, (org.telegram.ui.Components.d01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.c2 c2Var = ((org.telegram.ui.ActionBar.c2[]) this.f41828b)[0];
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                ye.d.s((Context) this.f41829c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f41827a) {
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
