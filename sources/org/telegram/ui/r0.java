package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

public final class r0 extends ClickableSpan {

    public final int f41773a;

    public final Object f41774b;

    public final Object f41775c;
    public final Object d;

    public r0(Object obj, Object obj2, Object obj3, int i10) {
        this.f41773a = i10;
        this.f41774b = obj;
        this.f41775c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41773a) {
            case 0:
                ((d70) this.f41774b).c((k4) this.f41775c, (org.telegram.ui.Components.tz0) this.d);
                break;
            default:
                org.telegram.ui.ActionBar.b2 b2Var = ((org.telegram.ui.ActionBar.b2[]) this.f41774b)[0];
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                we.e.s((Context) this.f41775c, "https://t.me/" + ((String) this.d));
                break;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f41773a) {
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }
}
