package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class zf implements View.OnLongClickListener {
    public final int f43730a;
    public final Object f43731b;
    public final Object f43732c;
    public final Object d;
    public final Object e;

    public zf(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f43730a = i10;
        this.f43731b = obj;
        this.f43732c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f43730a) {
            case 0:
                qn qnVar = (qn) this.f43731b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f43732c;
                MessageObject messageObject = (MessageObject) this.d;
                ai.vd vdVar = (ai.vd) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (qnVar.getParentActivity() == null) {
                    return false;
                }
                if ((qnVar.O0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                qnVar.ea(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    vdVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ti.q((org.telegram.ui.Components.ti) this.f43731b, (Context) this.f43732c, (org.telegram.ui.ActionBar.d6) this.d, (org.telegram.ui.ActionBar.n2) this.e, view);
        }
    }
}
