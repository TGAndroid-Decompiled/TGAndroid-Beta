package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class zf implements View.OnLongClickListener {
    public final int f44089a;
    public final Object f44090b;
    public final Object f44091c;
    public final Object d;
    public final Object e;

    public zf(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f44089a = i10;
        this.f44090b = obj;
        this.f44091c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f44089a) {
            case 0:
                sn snVar = (sn) this.f44090b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f44091c;
                MessageObject messageObject = (MessageObject) this.d;
                hn hnVar = (hn) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) ag.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (snVar.getParentActivity() == null) {
                    return false;
                }
                if ((snVar.f41446a1.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !ag.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                snVar.ea(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    hnVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ri.q((org.telegram.ui.Components.ri) this.f44090b, (Context) this.f44091c, (org.telegram.ui.ActionBar.g6) this.d, (org.telegram.ui.ActionBar.o2) this.e, view);
        }
    }
}
