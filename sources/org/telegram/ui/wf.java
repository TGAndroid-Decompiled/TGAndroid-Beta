package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;

public final class wf implements View.OnLongClickListener {

    public final int f44096a;

    public final Object f44097b;

    public final Object f44098c;
    public final Object d;

    public final Object f44099e;

    public wf(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f44096a = i10;
        this.f44097b = obj;
        this.f44098c = obj2;
        this.d = obj3;
        this.f44099e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f44096a) {
            case 0:
                rn rnVar = (rn) this.f44097b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f44098c;
                MessageObject messageObject = (MessageObject) this.d;
                cg.q qVar = (cg.q) this.f44099e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) hf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (rnVar.getParentActivity() == null) {
                    return false;
                }
                if ((rnVar.K0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !hf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                rnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    qVar.performHapticFeedback(0, 1);
                    break;
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.gi.r((org.telegram.ui.Components.gi) this.f44097b, (Context) this.f44098c, (org.telegram.ui.ActionBar.c6) this.d, (org.telegram.ui.ActionBar.n2) this.f44099e, view);
        }
    }
}
