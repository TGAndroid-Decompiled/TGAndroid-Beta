package org.telegram.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
public final class r0 extends ClickableSpan {
    public final int f37668a;
    public final Object f37669b;
    public final Object f37670c;
    public final Object d;

    public r0(Object obj, Object obj2, Object obj3, int i10) {
        this.f37668a = i10;
        this.f37669b = obj;
        this.f37670c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f37668a) {
            case 0:
                ((p70) this.f37669b).c((l4) this.f37670c, (org.telegram.ui.Components.o01) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.d2 d2Var = ((org.telegram.ui.ActionBar.d2[]) this.f37669b)[0];
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                ze.d.s((Context) this.f37670c, "https://t.me/" + ((String) this.d));
                return;
        }
    }

    @Override
    public void updateDrawState(TextPaint textPaint) {
        switch (this.f37668a) {
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
